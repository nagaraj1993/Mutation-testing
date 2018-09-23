package de.upb.is.TestModel2TestCase;

import xunit.TestCase
import xunit.TestSuite

class TestSuiteGenerator /*implements IGenerator*/ {
	
	private CSharpOCLVisitor ocl2csharp = new CSharpOCLVisitor();
	
	//@Inject extension IQualifiedNameProvider
	/*	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
        for (ts : resource.allContents.toIterable.filter(TestSuite)) {
            fsa.generateFile(
                ts.fullyQualifiedName.toString("/") + ".cs",
                ts.generateTestClass)
        }        
    }
    */




	public def imports() {
		'''
		using System;
		using Microsoft.VisualStudio.TestTools.UnitTesting;
		using oclstdlib;
		using System.Linq;
		'''
	}

	public def generateTestSuite(TestSuite ts){'''
		«imports()»
		namespace EcoreTest {
			
			[TestClass]
			public class «ts.name» {
				
				private TestOCL ocl = new TestOCL();
				
				«FOR testcase : ts.testCase»
					«generateTestCase(testcase)»
			    «ENDFOR»
			    
			}
		}
    '''
	}
	
	public def generateTestCase(TestCase tc){'''
		«FOR assertion : tc.assertion»
			[TestMethod]
			public void «tc.name»(){
			«IF assertion.expectedValue!=null»	
			// Initialisation
			    var expected = «assertion.expectedValue.value»;
			// Action
			    var actual = «assertion.action.desc»;
			// Assertion
			    ocl.«assertion.type»(expected, actual);
			«ENDIF»
			}
	    «ENDFOR»
    '''
	}
	
	
	
	
	/*
	public def generateTestSuiteOclCsharp(TestSuite ts){
	'''
		«imports()»
		namespace EcoreTest {
			
			[TestClass]
			public class «ts.name» {
				
				private TestOCL ocl = new TestOCL();
				
				«FOR testcase : ts.testCases»
				[TestMethod]
				public void «testcase.name»(){
				«FOR assertion : testcase.assertions»
					«IF assertion.expectedValue!=null»	
					// Initialisation
					  var expected = «ocl2csharp.translate(assertion.expectedValue.value, assertion.eClass)»;
					// Action
					  var actual = «assertion.action.desc»;
					// Assertion
					  ocl.«assertion.type»(expected, actual);
					«ENDIF»
			    «ENDFOR»
				}
		        «ENDFOR»            
			}
			
		}
    '''
	} 
	*/
	/*
	public def generateTestClassHardcoded(TestSuite ts){
		'''
		using System;
		using System.Collections.Generic;
		using System.Linq;
		using System.Text;
		using oclstdlib;
		namespace EcoreTest {
			[TestClass]
			public class EvaluateCollectionOperationsTest {
				
			}
		}
		'''
	}
	*/
	
}