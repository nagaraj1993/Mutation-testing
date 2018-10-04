/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2015, 2018 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.eclipse.ocl.examples.xtext.tests/models/genModel/Company.ecore
 * using:
 *   /org.eclipse.ocl.examples.xtext.tests/models/genModel/CodeGenCompanySrc.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.ocl.examples.xtext.tests.codegen.company;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * CodegencompanyTables provides the dispatch tables for the company for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class CodegencompanyTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final @NonNull EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(CodegencompanyPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final @NonNull ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_test_s_Pivot_s_Company_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/test/Pivot/Company.ecore", null, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Class = org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Company = org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_test_s_Pivot_s_Company_ecore.getClassId("Company", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Employee = org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_test_s_Pivot_s_Company_ecore.getClassId("Employee", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull DataTypeId DATAid_EInt = org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull EnumerationId ENUMid_CompanySizeKind = org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_test_s_Pivot_s_Company_ecore.getEnumerationId("CompanySizeKind");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue INT_100 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("100");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue INT_1000 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("1000");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue INT_1000000 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("1000000");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue INT_49 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("49");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue INT_50 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("50");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue INT_999 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("999");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_NULLid = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.ocl.pivot.ids.TypeId.OCL_VOID);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull TuplePartId PARTid__1 = org.eclipse.ocl.pivot.ids.IdManager.getTuplePartId(0, "message", org.eclipse.ocl.pivot.ids.TypeId.STRING);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull TuplePartId PARTid__2 = org.eclipse.ocl.pivot.ids.IdManager.getTuplePartId(1, "status", org.eclipse.ocl.pivot.ids.TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_PRIMid_Integer = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.ocl.pivot.ids.TypeId.INTEGER);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_PRIMid_String = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.eclipse.ocl.pivot.ids.TypeId.STRING);
	public static final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull String STR_Employee_32_must_32_have_32_a_32_name = "Employee must have a name";
	public static final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull String STR_Employee_c_c_mustHaveName = "Employee::mustHaveName";
	public static final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull String STR_Employee_c_c_mustHaveNonEmptyName = "Employee::mustHaveNonEmptyName";
	public static final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull String STR_Employee_c_c_noManagerImpliesDirectReports = "Employee::noManagerImpliesDirectReports";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId BAG_CLSSid_Employee = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.CLSSid_Employee);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull EnumerationLiteralId ELITid_large = org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.ENUMid_CompanySizeKind.getEnumerationLiteralId("large");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull EnumerationLiteralId ELITid_medium = org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.ENUMid_CompanySizeKind.getEnumerationLiteralId("medium");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull EnumerationLiteralId ELITid_small = org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.ENUMid_CompanySizeKind.getEnumerationLiteralId("small");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Employee = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.CLSSid_Employee);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue OrderedSet = org.eclipse.ocl.pivot.utilities.ValueUtil.createOrderedSetOfEach(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.ORD_NULLid);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull TuplePartId PARTid_ = org.eclipse.ocl.pivot.ids.IdManager.getTuplePartId(0, "range", org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.SEQ_PRIMid_Integer);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull TuplePartId PARTid__0 = org.eclipse.ocl.pivot.ids.IdManager.getTuplePartId(1, "size", org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.ENUMid_CompanySizeKind);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_Employee = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.CLSSid_Employee);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull TupleTypeId TUPLid__0 = org.eclipse.ocl.pivot.ids.IdManager.getTupleTypeId("Tuple", org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.PARTid__1, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.PARTid__2);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerRange symbol_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.createRange(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.INT_0, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.INT_49);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerRange symbol_4 = org.eclipse.ocl.pivot.utilities.ValueUtil.createRange(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.INT_1000, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.INT_1000000);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerRange symbol_2 = org.eclipse.ocl.pivot.utilities.ValueUtil.createRange(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.INT_50, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.INT_999);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue Sequence = org.eclipse.ocl.pivot.utilities.ValueUtil.createSequenceRange(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.SEQ_PRIMid_Integer, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.symbol_0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue Sequence_1 = org.eclipse.ocl.pivot.utilities.ValueUtil.createSequenceRange(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.SEQ_PRIMid_Integer, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.symbol_4);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue Sequence_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.createSequenceRange(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.SEQ_PRIMid_Integer, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.symbol_2);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull TupleTypeId TUPLid_ = org.eclipse.ocl.pivot.ids.IdManager.getTupleTypeId("Tuple", org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.PARTid_, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.PARTid__0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_TUPLid_ = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.TUPLid_);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull TupleValue symbol_1 = org.eclipse.ocl.pivot.utilities.ValueUtil.createTupleOfEach(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.TUPLid_, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.Sequence, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.ELITid_small);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull TupleValue symbol_5 = org.eclipse.ocl.pivot.utilities.ValueUtil.createTupleOfEach(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.TUPLid_, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.Sequence_1, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.ELITid_large);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull TupleValue symbol_3 = org.eclipse.ocl.pivot.utilities.ValueUtil.createTupleOfEach(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.TUPLid_, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.Sequence_0, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.ELITid_medium);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue table = org.eclipse.ocl.pivot.utilities.ValueUtil.createSetOfEach(org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.SET_TUPLid_, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.symbol_1, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.symbol_3, org.eclipse.ocl.examples.xtext.tests.codegen.company.CodegencompanyTables.symbol_5);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			CodegencompanyTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CodegencompanyTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final @NonNull EcoreExecutorType _Bug418716 = new EcoreExecutorType(CodegencompanyPackage.Literals.BUG418716, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Company = new EcoreExecutorType(CodegencompanyPackage.Literals.COMPANY, PACKAGE, 0);
		public static final @NonNull EcoreExecutorEnumeration _CompanySizeKind = new EcoreExecutorEnumeration(CodegencompanyPackage.Literals.COMPANY_SIZE_KIND, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Employee = new EcoreExecutorType(CodegencompanyPackage.Literals.EMPLOYEE, PACKAGE, 0);

		private static final @NonNull EcoreExecutorType @NonNull [] types = {
			_Bug418716,
			_Company,
			_CompanySizeKind,
			_Employee
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CodegencompanyTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final @NonNull ExecutorFragment _Bug418716__Bug418716 = new ExecutorFragment(Types._Bug418716, CodegencompanyTables.Types._Bug418716);
		private static final @NonNull ExecutorFragment _Bug418716__OclAny = new ExecutorFragment(Types._Bug418716, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Bug418716__OclElement = new ExecutorFragment(Types._Bug418716, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _Company__Company = new ExecutorFragment(Types._Company, CodegencompanyTables.Types._Company);
		private static final @NonNull ExecutorFragment _Company__OclAny = new ExecutorFragment(Types._Company, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Company__OclElement = new ExecutorFragment(Types._Company, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _CompanySizeKind__CompanySizeKind = new ExecutorFragment(Types._CompanySizeKind, CodegencompanyTables.Types._CompanySizeKind);
		private static final @NonNull ExecutorFragment _CompanySizeKind__OclAny = new ExecutorFragment(Types._CompanySizeKind, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _CompanySizeKind__OclElement = new ExecutorFragment(Types._CompanySizeKind, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _CompanySizeKind__OclEnumeration = new ExecutorFragment(Types._CompanySizeKind, OCLstdlibTables.Types._OclEnumeration);
		private static final @NonNull ExecutorFragment _CompanySizeKind__OclType = new ExecutorFragment(Types._CompanySizeKind, OCLstdlibTables.Types._OclType);

		private static final @NonNull ExecutorFragment _Employee__Employee = new ExecutorFragment(Types._Employee, CodegencompanyTables.Types._Employee);
		private static final @NonNull ExecutorFragment _Employee__OclAny = new ExecutorFragment(Types._Employee, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Employee__OclElement = new ExecutorFragment(Types._Employee, OCLstdlibTables.Types._OclElement);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CodegencompanyTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final @NonNull ParameterTypes _Employee = TypeUtil.createParameterTypes(CodegencompanyTables.Types._Employee);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CodegencompanyTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final @NonNull ExecutorOperation _Employee__hasNameAsOperation = new ExecutorOperation("hasNameAsOperation", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Employee,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final @NonNull ExecutorOperation _Employee__reportsTo = new ExecutorOperation("reportsTo", Parameters._Employee, Types._Employee,
			1, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CodegencompanyTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final @NonNull ExecutorProperty _Bug418716__AttributeWithInitital = new EcoreExecutorProperty(CodegencompanyPackage.Literals.BUG418716__ATTRIBUTE_WITH_INITITAL, Types._Bug418716, 0);
		public static final @NonNull ExecutorProperty _Bug418716__AttributeWithoutInitital = new EcoreExecutorProperty(CodegencompanyPackage.Literals.BUG418716__ATTRIBUTE_WITHOUT_INITITAL, Types._Bug418716, 1);

		public static final @NonNull ExecutorProperty _Company__employees = new EcoreExecutorProperty(CodegencompanyPackage.Literals.COMPANY__EMPLOYEES, Types._Company, 0);
		public static final @NonNull ExecutorProperty _Company__name = new EcoreExecutorProperty(CodegencompanyPackage.Literals.COMPANY__NAME, Types._Company, 1);
		public static final @NonNull ExecutorProperty _Company__size = new EcoreExecutorProperty(CodegencompanyPackage.Literals.COMPANY__SIZE, Types._Company, 2);

		public static final @NonNull ExecutorProperty _Employee__allReports = new EcoreExecutorProperty(CodegencompanyPackage.Literals.EMPLOYEE__ALL_REPORTS, Types._Employee, 0);
		public static final @NonNull ExecutorProperty _Employee__company = new EcoreExecutorProperty(CodegencompanyPackage.Literals.EMPLOYEE__COMPANY, Types._Employee, 1);
		public static final @NonNull ExecutorProperty _Employee__directReports = new EcoreExecutorProperty(CodegencompanyPackage.Literals.EMPLOYEE__DIRECT_REPORTS, Types._Employee, 2);
		public static final @NonNull ExecutorProperty _Employee__hasNameAsAttribute = new EcoreExecutorProperty(CodegencompanyPackage.Literals.EMPLOYEE__HAS_NAME_AS_ATTRIBUTE, Types._Employee, 3);
		public static final @NonNull ExecutorProperty _Employee__manager = new EcoreExecutorProperty(CodegencompanyPackage.Literals.EMPLOYEE__MANAGER, Types._Employee, 4);
		public static final @NonNull ExecutorProperty _Employee__name = new EcoreExecutorProperty(CodegencompanyPackage.Literals.EMPLOYEE__NAME, Types._Employee, 5);
		public static final @NonNull ExecutorProperty _Employee__reportingChain = new EcoreExecutorProperty(CodegencompanyPackage.Literals.EMPLOYEE__REPORTING_CHAIN, Types._Employee, 6);
		public static final @NonNull ExecutorProperty _Employee__Employee__allReports = new ExecutorPropertyWithImplementation("Employee", Types._Employee, 7, new EcoreLibraryOppositeProperty(CodegencompanyPackage.Literals.EMPLOYEE__ALL_REPORTS));
		public static final @NonNull ExecutorProperty _Employee__Employee__directReports = new ExecutorPropertyWithImplementation("Employee", Types._Employee, 8, new EcoreLibraryOppositeProperty(CodegencompanyPackage.Literals.EMPLOYEE__DIRECT_REPORTS));
		public static final @NonNull ExecutorProperty _Employee__Employee__manager = new ExecutorPropertyWithImplementation("Employee", Types._Employee, 9, new EcoreLibraryOppositeProperty(CodegencompanyPackage.Literals.EMPLOYEE__MANAGER));
		public static final @NonNull ExecutorProperty _Employee__Employee__reportingChain = new ExecutorPropertyWithImplementation("Employee", Types._Employee, 10, new EcoreLibraryOppositeProperty(CodegencompanyPackage.Literals.EMPLOYEE__REPORTING_CHAIN));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CodegencompanyTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final @NonNull ExecutorFragment @NonNull [] _Bug418716 =
			{
				Fragments._Bug418716__OclAny /* 0 */,
				Fragments._Bug418716__OclElement /* 1 */,
				Fragments._Bug418716__Bug418716 /* 2 */
			};
		private static final int @NonNull [] __Bug418716 = { 1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Company =
			{
				Fragments._Company__OclAny /* 0 */,
				Fragments._Company__OclElement /* 1 */,
				Fragments._Company__Company /* 2 */
			};
		private static final int @NonNull [] __Company = { 1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _CompanySizeKind =
			{
				Fragments._CompanySizeKind__OclAny /* 0 */,
				Fragments._CompanySizeKind__OclElement /* 1 */,
				Fragments._CompanySizeKind__OclType /* 2 */,
				Fragments._CompanySizeKind__OclEnumeration /* 3 */,
				Fragments._CompanySizeKind__CompanySizeKind /* 4 */
			};
		private static final int @NonNull [] __CompanySizeKind = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Employee =
			{
				Fragments._Employee__OclAny /* 0 */,
				Fragments._Employee__OclElement /* 1 */,
				Fragments._Employee__Employee /* 2 */
			};
		private static final int @NonNull [] __Employee = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Bug418716.initFragments(_Bug418716, __Bug418716);
			Types._Company.initFragments(_Company, __Company);
			Types._CompanySizeKind.initFragments(_CompanySizeKind, __CompanySizeKind);
			Types._Employee.initFragments(_Employee, __Employee);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CodegencompanyTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final @NonNull ExecutorOperation @NonNull [] _Bug418716__Bug418716 = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Bug418716__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Bug418716__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Company__Company = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Company__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Company__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _CompanySizeKind__CompanySizeKind = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CompanySizeKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CompanySizeKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CompanySizeKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CompanySizeKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Employee__Employee = {
			CodegencompanyTables.Operations._Employee__hasNameAsOperation /* hasNameAsOperation() */,
			CodegencompanyTables.Operations._Employee__reportsTo /* reportsTo(Employee[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Employee__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Employee__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Bug418716__Bug418716.initOperations(_Bug418716__Bug418716);
			Fragments._Bug418716__OclAny.initOperations(_Bug418716__OclAny);
			Fragments._Bug418716__OclElement.initOperations(_Bug418716__OclElement);

			Fragments._Company__Company.initOperations(_Company__Company);
			Fragments._Company__OclAny.initOperations(_Company__OclAny);
			Fragments._Company__OclElement.initOperations(_Company__OclElement);

			Fragments._CompanySizeKind__CompanySizeKind.initOperations(_CompanySizeKind__CompanySizeKind);
			Fragments._CompanySizeKind__OclAny.initOperations(_CompanySizeKind__OclAny);
			Fragments._CompanySizeKind__OclElement.initOperations(_CompanySizeKind__OclElement);
			Fragments._CompanySizeKind__OclEnumeration.initOperations(_CompanySizeKind__OclEnumeration);
			Fragments._CompanySizeKind__OclType.initOperations(_CompanySizeKind__OclType);

			Fragments._Employee__Employee.initOperations(_Employee__Employee);
			Fragments._Employee__OclAny.initOperations(_Employee__OclAny);
			Fragments._Employee__OclElement.initOperations(_Employee__OclElement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CodegencompanyTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final @NonNull ExecutorProperty @NonNull [] _Bug418716 = {
			CodegencompanyTables.Properties._Bug418716__AttributeWithInitital,
			CodegencompanyTables.Properties._Bug418716__AttributeWithoutInitital
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Company = {
			CodegencompanyTables.Properties._Company__employees,
			CodegencompanyTables.Properties._Company__name,
			CodegencompanyTables.Properties._Company__size
		};

		private static final @NonNull ExecutorProperty @NonNull [] _CompanySizeKind = {};

		private static final @NonNull ExecutorProperty @NonNull [] _Employee = {
			CodegencompanyTables.Properties._Employee__allReports,
			CodegencompanyTables.Properties._Employee__company,
			CodegencompanyTables.Properties._Employee__directReports,
			CodegencompanyTables.Properties._Employee__hasNameAsAttribute,
			CodegencompanyTables.Properties._Employee__manager,
			CodegencompanyTables.Properties._Employee__name,
			CodegencompanyTables.Properties._Employee__reportingChain
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Bug418716__Bug418716.initProperties(_Bug418716);
			Fragments._Company__Company.initProperties(_Company);
			Fragments._CompanySizeKind__CompanySizeKind.initProperties(_CompanySizeKind);
			Fragments._Employee__Employee.initProperties(_Employee);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CodegencompanyTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final @NonNull EcoreExecutorEnumerationLiteral _CompanySizeKind__small = new EcoreExecutorEnumerationLiteral(CodegencompanyPackage.Literals.COMPANY_SIZE_KIND.getEEnumLiteral("small"), Types._CompanySizeKind, 0);
		public static final @NonNull EcoreExecutorEnumerationLiteral _CompanySizeKind__medium = new EcoreExecutorEnumerationLiteral(CodegencompanyPackage.Literals.COMPANY_SIZE_KIND.getEEnumLiteral("medium"), Types._CompanySizeKind, 1);
		public static final @NonNull EcoreExecutorEnumerationLiteral _CompanySizeKind__large = new EcoreExecutorEnumerationLiteral(CodegencompanyPackage.Literals.COMPANY_SIZE_KIND.getEEnumLiteral("large"), Types._CompanySizeKind, 2);
		private static final @NonNull EcoreExecutorEnumerationLiteral @NonNull [] _CompanySizeKind = {
			_CompanySizeKind__small,
			_CompanySizeKind__medium,
			_CompanySizeKind__large
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._CompanySizeKind.initLiterals(_CompanySizeKind);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CodegencompanyTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
