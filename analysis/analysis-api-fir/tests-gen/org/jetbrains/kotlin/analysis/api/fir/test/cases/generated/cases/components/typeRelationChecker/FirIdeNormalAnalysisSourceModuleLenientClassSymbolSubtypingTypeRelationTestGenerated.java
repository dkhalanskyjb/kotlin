/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.typeRelationChecker;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.typeRelationChecker.AbstractLenientClassSymbolSubtypingTypeRelationTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleLenientClassSymbolSubtypingTypeRelationTestGenerated extends AbstractLenientClassSymbolSubtypingTypeRelationTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Ide
      )
    );
  }

  @Test
  @TestMetadata("ActualizedSuperclass.kt")
  public void testActualizedSuperclass() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ActualizedSuperclass.kt");
  }

  @Test
  public void testAllFilesPresentInClassSubtyping() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("ComplexHierarchy_O_A.kt")
  public void testComplexHierarchy_O_A() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ComplexHierarchy_O_A.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_O_D.kt")
  public void testComplexHierarchy_O_D() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ComplexHierarchy_O_D.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_O_F.kt")
  public void testComplexHierarchy_O_F() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ComplexHierarchy_O_F.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_O_NestedA.kt")
  public void testComplexHierarchy_O_NestedA() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ComplexHierarchy_O_NestedA.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Y_A.kt")
  public void testComplexHierarchy_Y_A() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ComplexHierarchy_Y_A.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Y_D.kt")
  public void testComplexHierarchy_Y_D() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ComplexHierarchy_Y_D.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Y_F.kt")
  public void testComplexHierarchy_Y_F() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ComplexHierarchy_Y_F.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Y_NestedA.kt")
  public void testComplexHierarchy_Y_NestedA() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ComplexHierarchy_Y_NestedA.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Z_A.kt")
  public void testComplexHierarchy_Z_A() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ComplexHierarchy_Z_A.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Z_D.kt")
  public void testComplexHierarchy_Z_D() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ComplexHierarchy_Z_D.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Z_F.kt")
  public void testComplexHierarchy_Z_F() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ComplexHierarchy_Z_F.kt");
  }

  @Test
  @TestMetadata("ComplexHierarchy_Z_NestedA.kt")
  public void testComplexHierarchy_Z_NestedA() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ComplexHierarchy_Z_NestedA.kt");
  }

  @Test
  @TestMetadata("FunctionType_Function.kt")
  public void testFunctionType_Function() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/FunctionType_Function.kt");
  }

  @Test
  @TestMetadata("Iterable_List.kt")
  public void testIterable_List() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/Iterable_List.kt");
  }

  @Test
  @TestMetadata("ListAlias_Iterable.kt")
  public void testListAlias_Iterable() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/ListAlias_Iterable.kt");
  }

  @Test
  @TestMetadata("List_ActualIterableAlias.kt")
  public void testList_ActualIterableAlias() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/List_ActualIterableAlias.kt");
  }

  @Test
  @TestMetadata("List_Iterable.kt")
  public void testList_Iterable() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/List_Iterable.kt");
  }

  @Test
  @TestMetadata("List_IterableAlias.kt")
  public void testList_IterableAlias() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/List_IterableAlias.kt");
  }

  @Test
  @TestMetadata("List_List.kt")
  public void testList_List() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/List_List.kt");
  }

  @Test
  @TestMetadata("List_NestedIterableAlias.kt")
  public void testList_NestedIterableAlias() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/List_NestedIterableAlias.kt");
  }

  @Test
  @TestMetadata("List_Unknown.kt")
  public void testList_Unknown() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/List_Unknown.kt");
  }

  @Test
  @TestMetadata("List_UnknownExpansion.kt")
  public void testList_UnknownExpansion() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/List_UnknownExpansion.kt");
  }

  @Test
  @TestMetadata("NestedListAlias_Iterable.kt")
  public void testNestedListAlias_Iterable() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/NestedListAlias_Iterable.kt");
  }

  @Test
  @TestMetadata("TypeArguments_O_Bar.kt")
  public void testTypeArguments_O_Bar() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/TypeArguments_O_Bar.kt");
  }

  @Test
  @TestMetadata("TypeArguments_O_Baz.kt")
  public void testTypeArguments_O_Baz() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/TypeArguments_O_Baz.kt");
  }

  @Test
  @TestMetadata("TypeArguments_O_Foo.kt")
  public void testTypeArguments_O_Foo() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/TypeArguments_O_Foo.kt");
  }

  @Test
  @TestMetadata("TypeArguments_O_Thing.kt")
  public void testTypeArguments_O_Thing() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/TypeArguments_O_Thing.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Y_Bar.kt")
  public void testTypeArguments_Y_Bar() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/TypeArguments_Y_Bar.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Y_Baz.kt")
  public void testTypeArguments_Y_Baz() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/TypeArguments_Y_Baz.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Y_Foo.kt")
  public void testTypeArguments_Y_Foo() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/TypeArguments_Y_Foo.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Y_Thing.kt")
  public void testTypeArguments_Y_Thing() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/TypeArguments_Y_Thing.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Z_Bar.kt")
  public void testTypeArguments_Z_Bar() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/TypeArguments_Z_Bar.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Z_Baz.kt")
  public void testTypeArguments_Z_Baz() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/TypeArguments_Z_Baz.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Z_Foo.kt")
  public void testTypeArguments_Z_Foo() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/TypeArguments_Z_Foo.kt");
  }

  @Test
  @TestMetadata("TypeArguments_Z_Thing.kt")
  public void testTypeArguments_Z_Thing() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/TypeArguments_Z_Thing.kt");
  }

  @Test
  @TestMetadata("Unknown_List.kt")
  public void testUnknown_List() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/Unknown_List.kt");
  }

  @Test
  @TestMetadata("Unknown_ListAlias.kt")
  public void testUnknown_ListAlias() {
    runTest("analysis/analysis-api/testData/components/typeRelationChecker/classSubtyping/Unknown_ListAlias.kt");
  }
}
