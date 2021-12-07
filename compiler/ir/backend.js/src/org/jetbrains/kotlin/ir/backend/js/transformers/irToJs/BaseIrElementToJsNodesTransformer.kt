/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.backend.js.transformers.irToJs

import org.jetbrains.kotlin.ir.IrElement
import org.jetbrains.kotlin.ir.visitors.IrElementVisitor
import org.jetbrains.kotlin.js.backend.ast.JsNode

interface BaseIrElementToJsNodesTransformer<out R : Collection<JsNode>, in D> : IrElementVisitor<R, D> {
    override fun visitElement(element: IrElement, data: D): R {
        org.jetbrains.kotlin.ir.backend.js.utils.TODO(element)
    }
}
