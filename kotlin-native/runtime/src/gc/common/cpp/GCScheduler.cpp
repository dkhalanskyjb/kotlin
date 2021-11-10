/*
 * Copyright 2010-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

#include "GCScheduler.hpp"

#include "CompilerConstants.hpp"
#include "GlobalData.hpp"
#include "KAssert.h"
#include "Porting.h"
#include "RepeatedTimer.hpp"
#include "ThreadRegistry.hpp"
#include "ThreadData.hpp"

using namespace kotlin;

namespace {

class GCEmptySchedulerData : public gc::GCSchedulerData {
    void UpdateFromThreadData(gc::GCSchedulerThreadData& threadData) noexcept override {}
    void OnPerformFullGC() noexcept override {}
    void UpdateAliveSetBytes(size_t bytes) noexcept override {}
};

template <bool WithTimer>
class GCSchedulerDataImpl : public gc::GCSchedulerData {
public:
    explicit GCSchedulerDataImpl(gc::GCSchedulerConfig& config, std::function<void()> scheduleGC) noexcept :
        config_(config), scheduleGC_(std::move(scheduleGC)) {
        if constexpr (WithTimer) {
            timer_ = ::make_unique<RepeatedTimer>(std::chrono::microseconds(config_.regularGcIntervalUs), [this]() {
                ScheduleGCIfNeeded();
                return std::chrono::microseconds(config_.regularGcIntervalUs);
            });
        }
    }

    void UpdateFromThreadData(gc::GCSchedulerThreadData& threadData) noexcept override {
        allocatedBytes_ += threadData.allocatedBytes();
        size_t currentHeap = allocatedBytes_.load() + lastAliveSetBytes_.load();
        if (currentHeap < config_.targetHeapBytes) {
            return;
        }
        ScheduleGCIfNeeded();
    }

    void OnPerformFullGC() noexcept override {
        allocatedBytes_ = 0;
        gcScheduled_ = false;
    }

    void UpdateAliveSetBytes(size_t bytes) noexcept override {
        lastAliveSetBytes_ = bytes;
        config_.tuneTargetHeapUtilization(bytes);
    }

private:
    // This may be called from all sorts of threads: both mutators and GC timer.
    void ScheduleGCIfNeeded() noexcept {
        bool expectedScheduled = false;
        if (gcScheduled_.compare_exchange_strong(expectedScheduled, true)) {
            scheduleGC_();
        }
    }

    gc::GCSchedulerConfig& config_;
    // TODO: Use futures from scheduleGC_ to know if GC is scheduled or not.
    std::atomic<bool> gcScheduled_ = false;
    std::atomic<size_t> allocatedBytes_ = 0;
    std::atomic<size_t> lastAliveSetBytes_ = 0;
    std::function<void()> scheduleGC_;
    KStdUniquePtr<RepeatedTimer> timer_;
};

class GCSchedulerDataAggressive : public gc::GCSchedulerData {
public:
    GCSchedulerDataAggressive(gc::GCSchedulerConfig& config, std::function<void()> scheduleGC) noexcept :
        scheduleGC_(std::move(scheduleGC)) {
        RuntimeLogInfo({kTagGC}, "Initialize GC scheduler config in the aggressive mode");
        // TODO: Make it even more aggressive and run on a subset of backend.native tests.
        config.threshold = 1000;
        config.allocationThresholdBytes = 10000;
    }

    void UpdateFromThreadData(gc::GCSchedulerThreadData& threadData) noexcept override { scheduleGC_(); }

    void OnPerformFullGC() noexcept override {}
    void UpdateAliveSetBytes(size_t bytes) noexcept override {}

private:
    std::function<void()> scheduleGC_;
};

KStdUniquePtr<gc::GCSchedulerData> MakeEmptyGCSchedulerData() noexcept {
    return ::make_unique<GCEmptySchedulerData>();
}

KStdUniquePtr<gc::GCSchedulerData> MakeGCSchedulerDataWithTimer(
        gc::GCSchedulerConfig& config, std::function<void()> scheduleGC) noexcept {
    return ::make_unique<GCSchedulerDataImpl<true>>(config, std::move(scheduleGC));
}

KStdUniquePtr<gc::GCSchedulerData> MakeGCSchedulerDataWithoutTimer(
        gc::GCSchedulerConfig& config, std::function<void()> scheduleGC) noexcept {
    return ::make_unique<GCSchedulerDataImpl<false>>(config, std::move(scheduleGC));
}

KStdUniquePtr<gc::GCSchedulerData> MakeGCSchedulerDataAggressive(gc::GCSchedulerConfig& config, std::function<void()> scheduleGC) noexcept {
    return ::make_unique<GCSchedulerDataAggressive>(config, std::move(scheduleGC));
}

} // namespace

KStdUniquePtr<gc::GCSchedulerData> kotlin::gc::MakeGCSchedulerData(SchedulerType type, gc::GCSchedulerConfig& config, std::function<void()> scheduleGC) noexcept {
    switch (type) {
        case SchedulerType::kDisabled:
            return MakeEmptyGCSchedulerData();
        case SchedulerType::kWithTimer:
            return MakeGCSchedulerDataWithTimer(config, std::move(scheduleGC));
        case SchedulerType::kOnSafepoints:
            return MakeGCSchedulerDataWithoutTimer(config, std::move(scheduleGC));
        case SchedulerType::kAggressive:
            return MakeGCSchedulerDataAggressive(config, std::move(scheduleGC));
    }
}

void gc::GCScheduler::SetScheduleGC(std::function<void()> scheduleGC) noexcept {
    RuntimeAssert(static_cast<bool>(scheduleGC), "scheduleGC cannot be empty");
    RuntimeAssert(!static_cast<bool>(scheduleGC_), "scheduleGC must not have been set");
    scheduleGC_ = std::move(scheduleGC);
    RuntimeAssert(gcData_ == nullptr, "gcData_ must not be set prior to scheduleGC call");
    gcData_ = MakeGCSchedulerData(compiler::getGCSchedulerType(), config_, scheduleGC_);
}
