package de.upb.is.TestModel2TestCase.csharp.nunit;

import de.upb.is.TestModel2TestCase.CSharpOCLVisitor
import xunit.Assertion
import xunit.TestCase
import xunit.TestSuite

class TestSuiteGenerator /*implements IGenerator*/ {

	private CSharpOCLVisitor ocl2csharp = new CSharpOCLVisitor();

	public def imports() {
		'''
			using System;
			using Microsoft.VisualStudio.TestTools.UnitTesting;
			using oclstdlib;
			using System.Linq;
		'''
	}

	public def generateTestSuite(TestSuite ts) {
		'''
			«imports()»
			namespace EcoreTest {
				
				[TestClass]
				public class «ts.name» {
					
					private TestOCL ocl = new TestOCL();
					
					«FOR testcase : ts.testCase»
						«generateTestCases(testcase)»
					«ENDFOR»
					
					}
				}
		'''
	}

	public def generateTestCases(TestCase tc) {
		var index = 1;
		'''
			«FOR assertion : tc.assertion»
				[TestMethod]
				public void «tc.name»_«index++»(){
				«IF assertion.expectedValue==null»			
					// Arrangement
						/* no arrangement part since it's a single paramteter assertion */
					// Action
						«generateActualResult(assertion)»
					// Assertion 
						ocl.«assertion.type»(actualResult);
				«ENDIF»	
				«IF assertion.expectedValue!=null»
					// Arrangement
					    «generateExpectedResult(assertion)»
					// Action
					    «generateActualResult(assertion)»
					// Assertion 
					    ocl.«assertion.type»(expectedResult, actualResult);
				«ENDIF»
				}
				
				«ENDFOR»			
		'''
	}

	public def generateExpectedResult(Assertion assertion) {
		var result = ""
		var exceptionClass = ""
		var exceptionMessage = ""
		try {
			result = ocl2csharp.translate(assertion.expectedValue.value.toString.replace('"', ''), assertion.eClass);
		} catch (Exception ex) {
			result = assertion.expectedValue.value;
			if (!(ex.class.getName.contains("SemanticException") && ex.message.toString.contains("Unrecognized variable"))) {
				exceptionClass = ex.class.getName
				exceptionMessage = ex.message;
			}
		}
		'''	
			var expectedResult = «result»;
			«IF exceptionClass != ""»
				/*	EXCEPTION: «exceptionClass» 
					«exceptionMessage»  */
			«ENDIF»	
		'''
	}

	public def generateActualResult(Assertion assertion) {
		var result = ""
		var exceptionClass = ""
		var exceptionMessage = ""
		try {
			result = ocl2csharp.translate(assertion.action.desc.toString.replace('"', ''), assertion.eClass);
		} catch (Exception ex) {
			result = assertion.action.desc
			if (!(ex.class.getName.contains("SemanticException") && ex.message.toString.contains("Unrecognized variable"))) {
				exceptionClass = ex.class.getName
				exceptionMessage = ex.message;
			}
		}
		'''	
			var actualResult = «result»;
			«IF exceptionClass != ""»
				/*	EXCEPTION: «exceptionClass» 
					«exceptionMessage»  */
			«ENDIF»	
		'''
	}

}
