/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.jps.incremental;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class JsProtoComparisonTestGenerated extends AbstractJsProtoComparisonTest {
    @TestMetadata("jps-plugin/testData/comparison/classSignatureChange")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ClassSignatureChange extends AbstractJsProtoComparisonTest {
        public void testAllFilesPresentInClassSignatureChange() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/comparison/classSignatureChange"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("classAnnotationListChanged")
        public void testClassAnnotationListChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classSignatureChange/classAnnotationListChanged/");
            doTest(fileName);
        }

        @TestMetadata("classFlagsAndMembersChanged")
        public void testClassFlagsAndMembersChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classSignatureChange/classFlagsAndMembersChanged/");
            doTest(fileName);
        }

        @TestMetadata("classFlagsChanged")
        public void testClassFlagsChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classSignatureChange/classFlagsChanged/");
            doTest(fileName);
        }

        @TestMetadata("classTypeParameterListChanged")
        public void testClassTypeParameterListChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classSignatureChange/classTypeParameterListChanged/");
            doTest(fileName);
        }

        @TestMetadata("classWithSuperTypeListChanged")
        public void testClassWithSuperTypeListChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classSignatureChange/classWithSuperTypeListChanged/");
            doTest(fileName);
        }

        @TestMetadata("nestedClassSignatureChanged")
        public void testNestedClassSignatureChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classSignatureChange/nestedClassSignatureChanged/");
            doTest(fileName);
        }

        @TestMetadata("sealedClassImplAdded")
        public void testSealedClassImplAdded() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classSignatureChange/sealedClassImplAdded/");
            doTest(fileName);
        }

        @TestMetadata("sealedClassImplRemoved")
        public void testSealedClassImplRemoved() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classSignatureChange/sealedClassImplRemoved/");
            doTest(fileName);
        }

        @TestMetadata("sealedClassNestedImplAdded")
        public void testSealedClassNestedImplAdded() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classSignatureChange/sealedClassNestedImplAdded/");
            doTest(fileName);
        }

        @TestMetadata("sealedClassNestedImplAddedDeep")
        public void testSealedClassNestedImplAddedDeep() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classSignatureChange/sealedClassNestedImplAddedDeep/");
            doTest(fileName);
        }

        @TestMetadata("sealedClassNestedImplRemoved")
        public void testSealedClassNestedImplRemoved() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classSignatureChange/sealedClassNestedImplRemoved/");
            doTest(fileName);
        }
    }

    @TestMetadata("jps-plugin/testData/comparison/classPrivateOnlyChange")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ClassPrivateOnlyChange extends AbstractJsProtoComparisonTest {
        public void testAllFilesPresentInClassPrivateOnlyChange() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/comparison/classPrivateOnlyChange"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("classWithPrivateFunChanged")
        public void testClassWithPrivateFunChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classPrivateOnlyChange/classWithPrivateFunChanged/");
            doTest(fileName);
        }

        @TestMetadata("classWithPrivatePrimaryConstructorChanged")
        public void testClassWithPrivatePrimaryConstructorChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classPrivateOnlyChange/classWithPrivatePrimaryConstructorChanged/");
            doTest(fileName);
        }

        @TestMetadata("classWithPrivateSecondaryConstructorChanged")
        public void testClassWithPrivateSecondaryConstructorChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classPrivateOnlyChange/classWithPrivateSecondaryConstructorChanged/");
            doTest(fileName);
        }

        @TestMetadata("classWithPrivateValChanged")
        public void testClassWithPrivateValChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classPrivateOnlyChange/classWithPrivateValChanged/");
            doTest(fileName);
        }

        @TestMetadata("classWithPrivateVarChanged")
        public void testClassWithPrivateVarChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classPrivateOnlyChange/classWithPrivateVarChanged/");
            doTest(fileName);
        }
    }

    @TestMetadata("jps-plugin/testData/comparison/classMembersOnlyChanged")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ClassMembersOnlyChanged extends AbstractJsProtoComparisonTest {
        public void testAllFilesPresentInClassMembersOnlyChanged() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/comparison/classMembersOnlyChanged"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("classWithCompanionObjectChanged")
        public void testClassWithCompanionObjectChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classMembersOnlyChanged/classWithCompanionObjectChanged/");
            doTest(fileName);
        }

        @TestMetadata("classWithConstructorChanged")
        public void testClassWithConstructorChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classMembersOnlyChanged/classWithConstructorChanged/");
            doTest(fileName);
        }

        @TestMetadata("classWithFunAndValChanged")
        public void testClassWithFunAndValChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classMembersOnlyChanged/classWithFunAndValChanged/");
            doTest(fileName);
        }

        @TestMetadata("classWithNestedClassesChanged")
        public void testClassWithNestedClassesChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classMembersOnlyChanged/classWithNestedClassesChanged/");
            doTest(fileName);
        }

        @TestMetadata("classWitnEnumChanged")
        public void testClassWitnEnumChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classMembersOnlyChanged/classWitnEnumChanged/");
            doTest(fileName);
        }

        @TestMetadata("defaultValues")
        public void testDefaultValues() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classMembersOnlyChanged/defaultValues/");
            doTest(fileName);
        }

        @TestMetadata("membersAnnotationListChanged")
        public void testMembersAnnotationListChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classMembersOnlyChanged/membersAnnotationListChanged/");
            doTest(fileName);
        }

        @TestMetadata("membersFlagsChanged")
        public void testMembersFlagsChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classMembersOnlyChanged/membersFlagsChanged/");
            doTest(fileName);
        }

        @TestMetadata("nestedClassMembersChanged")
        public void testNestedClassMembersChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classMembersOnlyChanged/nestedClassMembersChanged/");
            doTest(fileName);
        }

        @TestMetadata("sealedClassImplAdded")
        public void testSealedClassImplAdded() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/classMembersOnlyChanged/sealedClassImplAdded/");
            doTest(fileName);
        }
    }

    @TestMetadata("jps-plugin/testData/comparison/packageMembers")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class PackageMembers extends AbstractJsProtoComparisonTest {
        public void testAllFilesPresentInPackageMembers() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/comparison/packageMembers"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("defaultValues")
        public void testDefaultValues() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/packageMembers/defaultValues/");
            doTest(fileName);
        }

        @TestMetadata("membersAnnotationListChanged")
        public void testMembersAnnotationListChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/packageMembers/membersAnnotationListChanged/");
            doTest(fileName);
        }

        @TestMetadata("membersFlagsChanged")
        public void testMembersFlagsChanged() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/packageMembers/membersFlagsChanged/");
            doTest(fileName);
        }

        @TestMetadata("packageFacadePrivateOnlyChanges")
        public void testPackageFacadePrivateOnlyChanges() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/packageMembers/packageFacadePrivateOnlyChanges/");
            doTest(fileName);
        }

        @TestMetadata("packageFacadePublicChanges")
        public void testPackageFacadePublicChanges() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/packageMembers/packageFacadePublicChanges/");
            doTest(fileName);
        }
    }

    @TestMetadata("jps-plugin/testData/comparison/unchanged")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Unchanged extends AbstractJsProtoComparisonTest {
        public void testAllFilesPresentInUnchanged() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/comparison/unchanged"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("unchangedClass")
        public void testUnchangedClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/unchanged/unchangedClass/");
            doTest(fileName);
        }

        @TestMetadata("unchangedPackageFacade")
        public void testUnchangedPackageFacade() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/comparison/unchanged/unchangedPackageFacade/");
            doTest(fileName);
        }
    }
}
