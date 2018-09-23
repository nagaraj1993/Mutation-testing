//using System;
//using Microsoft.VisualStudio.TestTools.UnitTesting;
//using oclstdlib;
//using System.Linq;
//namespace EcoreTest {
	
//	[TestClass]
//	public class EvaluateCollectionOperationsTest4 {
		
//		private TestOCL ocl = new TestOCL();
		
//		[TestMethod]
//		public void testCollectionAppend_1(){
//		// Arrangement
//		    var expectedResult = new Sequence<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .append("c");
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_2(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .append("c");
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_3(){
//		// Arrangement
//		    var expectedResult = new Sequence<int>{
//		    	1,2,3,4, 
		    	
		    	
		    	
//		    0
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .append(0);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_4(){
//		// Arrangement
//		    var expectedResult = new Sequence<int>{
//		    	1,2,3,4, 
		    	
		    	
		    	
//		    4
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .append(4);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_5(){
//		// Arrangement
//		    var expectedResult = new Sequence<int>{
//		    	1,2,3,4,5
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .append(5);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_6(){
//		// Arrangement
//		    var expectedResult = new Sequence<int>{
//		    	1,2,3,4, 
		    	
		    	
		    	
//		    6
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .append(6);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_7(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<int>{
//		    	1,2,3,4, 
		    	
		    	
		    	
//		    0
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .append(0);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_8(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<int>{
//		    1, 
		    	
		    	
		    	
//		    3, 
		    	
		    	
		    	
//		    4, 
		    	
		    	
		    	
//		    2
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .append(2);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_9(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<int>{
//		    	1,2,3,4,5
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .append(5);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_10(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<int>{
//		    	1,2,3,4, 
		    	
		    	
		    	
//		    6
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .append(6);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_11(){
//		// Arrangement
//		    var expectedResult = new Sequence<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    null
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .append(null);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_12(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    null
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .append(null);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_13(){
//		// Arrangement
//		    var expectedResult = new Sequence<string>{
//		    "a", 
		    	
		    	
		    	
//		    null, 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    null
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<string>{
//		    "a", 
		    	
		    	
		    	
//		    null, 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .append(null);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_14(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    null
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    null, 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .append(null);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_15(){
//		// Arrangement
//		    var expectedResult = new Sequence<string>{
//		    "1..2", 
		    	
		    	
		    	
//		    null
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<string>{
//		    "1..2"
		    	
		    	
		    	
//		    }
//		    .append(null);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAppend_16(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    "1..2", 
		    	
		    	
		    	
//		    null
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<string>{
//		    "1..2"
		    	
		    	
		    	
//		    }
//		    .append(null);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsBag_1(){
//		// Arrangement
//		    var expectedResult = new Bag<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asBag();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsBag_2(){
//		// Arrangement
//		    var expectedResult = new Bag<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Bag<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asBag();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsBag_3(){
//		// Arrangement
//		    var expectedResult = new Bag<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Set<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asBag();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsBag_4(){
//		// Arrangement
//		    var expectedResult = new Bag<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asBag();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsOrderedSet_1(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asOrderedSet();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsOrderedSet_2(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asOrderedSet();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsOrderedSet_3(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Set<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asOrderedSet();
//		// Assertion 
//		    ocl.assertResultContainsAll(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsOrderedSet_4(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Bag<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asOrderedSet();
//		// Assertion 
//		    ocl.assertResultContainsAll(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsOrderedSet_5(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .asOrderedSet();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsOrderedSet_6(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .asOrderedSet();
//		// Assertion 
//		    ocl.assertResultContainsAll(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsOrderedSet_7(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .asOrderedSet();
//		// Assertion 
//		    ocl.assertResultContainsAll(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsOrderedSet_8(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .asOrderedSet();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsSequence_1(){
//		// Arrangement
//		    var expectedResult = new Sequence<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asSequence();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsSequence_2(){
//		// Arrangement
//		    var expectedResult = new Sequence<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asSequence();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsSequence_3(){
//		// Arrangement
//		    var expectedResult = new Sequence<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Bag<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asSequence();
//		// Assertion 
//		    ocl.assertResultContainsAll(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsSequence_4(){
//		// Arrangement
//		    var expectedResult = new Sequence<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Set<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asSequence();
//		// Assertion 
//		    ocl.assertResultContainsAll(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsSet_1(){
//		// Arrangement
//		    var expectedResult = new Set<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asSet();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsSet_2(){
//		// Arrangement
//		    var expectedResult = new Set<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Bag<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asSet();
//		// Assertion 
//		    ocl.assertResultContainsAll(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsSet_3(){
//		// Arrangement
//		    var expectedResult = new Set<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Set<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asSet();
//		// Assertion 
//		    ocl.assertResultContainsAll(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsSet_4(){
//		// Arrangement
//		    var expectedResult = new Set<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .asSet();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsSet_5(){
//		// Arrangement
//		    var expectedResult = new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .asSet();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsSet_6(){
//		// Arrangement
//		    var expectedResult = new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .asSet();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsSet_7(){
//		// Arrangement
//		    var expectedResult = new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .asSet();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionAsSet_8(){
//		// Arrangement
//		    var expectedResult = new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .asSet();
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXOrdered_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test"
				
				
				
//			}
//			.equals(new OrderedSet<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXOrdered_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			.equals(new Sequence<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXOrdered_3(){
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            //Original
//            //var actualResult = new Sequence<object>{4, 5, "test"}.Equals(new Sequence<object>{4, "test", 5});
//            //Mutant23
//            var actualResult = new Sequence<object>{4, 5, "test"}.notEquals(new Sequence<object>{4, "test", 5});
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXOrdered_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			.equals(new Sequence<object>{
//			5, 
				
				
				
//			4, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXOrdered_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			.equals(new OrderedSet<object>{
//			4, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXOrdered_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test"
				
				
				
//			}
//			.equals(new OrderedSet<object>{
//			5, 
				
				
				
//			4, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXOrdered_7(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			.equals(new Sequence<object>{
//			5, 
				
				
				
//			4, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXOrdered_8(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			.equals(new Sequence<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXOrdered_9(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			.equals(new OrderedSet<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXOrdered_10(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			.equals(new Sequence<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXUnordered_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test"
				
				
				
//			}
//			.equals(new Set<object>{
//			4, 
				
				
				
//			"test", 
				
				
				
//			5, 
				
				
				
//			4
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXUnordered_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			4
				
				
				
//			}
//			.equals(new Bag<object>{
//			4, 
				
				
				
//			"test", 
				
				
				
//			5, 
				
				
				
//			4
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXUnordered_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			4
				
				
				
//			}
//			.equals(new Set<object>{
//			4, 
				
				
				
//			"test", 
				
				
				
//			5, 
				
				
				
//			4
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXUnordered_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			4
				
				
				
//			}
//			.equals(new Bag<object>{
//			4, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXUnordered_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			4
				
				
				
//			}
//			.equals(new Set<object>{
//			4, 
				
				
				
//			"test", 
				
				
				
//			5, 
				
				
				
//			4
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXUnordered_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test"
				
				
				
//			}
//			.equals(new Bag<object>{
//			4, 
				
				
				
//			"test", 
				
				
				
//			5, 
				
				
				
//			4
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualOrderedXUnordered_7(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			4
				
				
				
//			}
//			.equals(new Bag<object>{
//			4, 
				
				
				
//			"test", 
				
				
				
//			5, 
				
				
				
//			4
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualUnorderedXUnordered_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test"
				
				
				
//			}
//			.equals(new Set<object>{
//			4, 
				
				
				
//			"test", 
				
				
				
//			5, 
				
				
				
//			4
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualUnorderedXUnordered_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			4
				
				
				
//			}
//			.equals(new Bag<object>{
//			4, 
				
				
				
//			"test", 
				
				
				
//			5
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualUnorderedXUnordered_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			4
				
				
				
//			}
//			.equals(new Set<object>{
//			4, 
				
				
				
//			"test", 
				
				
				
//			5, 
				
				
				
//			4
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualUnorderedXUnordered_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test"
				
				
				
//			}
//			.equals(new Bag<object>{
//			4, 
				
				
				
//			"test", 
				
				
				
//			5, 
				
				
				
//			4
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionEqualUnorderedXUnordered_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			4, 
				
				
				
//			5, 
				
				
				
//			"test", 
				
				
				
//			4
				
				
				
//			}
//			.equals(new Bag<object>{
//			4, 
				
				
				
//			"test", 
				
				
				
//			5, 
				
				
				
//			4
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludes_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludes(3);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludes_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludes("test");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludes_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludes(3);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludes_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludes("test");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludes_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludes(3);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludes_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludes("test");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludes_7(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludes(3);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludes_8(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludes("test");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludes_9(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludes(3.5);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludes_10(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludes(3.5);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludes_11(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludes(3.5);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludes_12(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludes(3.5);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Sequence<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Bag<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Set<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new OrderedSet<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Sequence<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Bag<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_7(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Set<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_8(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new OrderedSet<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_9(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Sequence<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_10(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Bag<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_11(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Set<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_12(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new OrderedSet<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_13(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Sequence<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_14(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Bag<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_15(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Set<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_16(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new OrderedSet<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_17(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Sequence<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_18(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Bag<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_19(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Set<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_20(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new OrderedSet<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_21(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Sequence<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_22(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Bag<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_23(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Set<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_24(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new OrderedSet<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_25(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Sequence<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_26(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Bag<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_27(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Set<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_28(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new OrderedSet<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_29(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Sequence<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_30(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Bag<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_31(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new Set<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcludesAll_32(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.excludesAll(new OrderedSet<object>{
//			3.5, 
				
				
				
//			"TEST"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcluding_1(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    .excluding("b");
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcluding_2(){
//		// Arrangement
//		    var expectedResult = new Sequence<int>{
//		    1, 
		    	
		    	
		    	
//		    3, 
		    	
		    	
		    	
//		    4
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .excluding(2);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcluding_3(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<int>{
//		    1, 
		    	
		    	
		    	
//		    3, 
		    	
		    	
		    	
//		    4
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .excluding(2);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcluding_4(){
//		// Arrangement
//		    var expectedResult = new Sequence<int>{
//		    	1,2,3, 
		    	
		    	
		    	
//		    	6,7,8,9
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<int>{
//		    	1,2,3,4, 
		    	
		    	
		    	
//		    6, 
		    	
		    	
		    	
//		    	7,8,9
		    	
		    	
		    	
//		    }
//		    .excluding(4);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcluding_5(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<int>{
//		    	1,2,3, 
		    	
		    	
		    	
//		    	6,7,8,9
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<int>{
//		    	1,2,3,4, 
		    	
		    	
		    	
//		    6, 
		    	
		    	
		    	
//		    	7,8,9
		    	
		    	
		    	
//		    }
//		    .excluding(4);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionExcluding_6(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    null, 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .excluding(null);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionFirst_1(){
//		// Arrangement
//		    var expectedResult = 1;
//		// Action
//		    var actualResult = new Sequence<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .first();
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionFirst_2(){
//		// Arrangement
//		    var expectedResult = 1;
//		// Action
//		    var actualResult = new OrderedSet<object>{
//		    1, 
		    	
		    	
		    	
//		    2.0, 
		    	
		    	
		    	
//		    "3"
		    	
		    	
		    	
//		    }
//		    .first();
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludes_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includes(3);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludes_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includes("test");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludes_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includes(3);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludes_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includes("test");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludes_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includes(3);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludes_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includes("test");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludes_7(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includes(3);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludes_8(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includes("test");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludes_9(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includes(3.5);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludes_10(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includes(3.5);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludes_11(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includes(3.5);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludes_12(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includes(3.5);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Sequence<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Bag<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Set<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new OrderedSet<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Sequence<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Bag<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_7(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Set<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_8(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new OrderedSet<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_9(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Sequence<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_10(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Bag<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_11(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Set<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_12(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new OrderedSet<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_13(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Sequence<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_14(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Bag<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_15(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Set<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_16(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new OrderedSet<object>{
//			3, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_17(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Sequence<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_18(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Bag<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_19(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Set<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_20(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new OrderedSet<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_21(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Sequence<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_22(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Bag<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_23(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Set<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_24(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new OrderedSet<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_25(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Sequence<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_26(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Bag<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_27(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Set<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_28(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new OrderedSet<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_29(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Sequence<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_30(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Bag<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_31(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new Set<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncludesAll_32(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			3, 
				
				
				
//			4.0, 
				
				
				
//			"test"
				
				
				
//			}
//			.includesAll(new OrderedSet<object>{
//			3.5, 
				
				
				
//			"test"
				
				
				
//			}
//			);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncluding_1(){
//		// Arrangement
//		    var expectedResult = new Sequence<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .including("c");
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncluding_2(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .including("c");
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncluding_3(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<int>{
//		    	1,2, 
		    	
		    	
		    	
//		    	3,4
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .including(4);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncluding_4(){
//		// Arrangement
//		    var expectedResult = new Sequence<int>{
//		    	1,2, 
		    	
		    	
		    	
//		    	3,4, 
		    	
		    	
		    	
//		    4
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .including(4);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncluding_5(){
//		// Arrangement
//		    var expectedResult = new Sequence<int>{
//		    	1,2,3,4,5
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .including(5);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncluding_6(){
//		// Arrangement
//		    var expectedResult = new Sequence<int>{
//		    	1,2,3, 
		    	
		    	
		    	
//		    4, 
		    	
		    	
		    	
//		    6
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .including(6);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIncluding_7(){
//		// Arrangement
//		    var expectedResult = new Sequence<int>{
//		    	1,2,3,4, 
		    	
		    	
		    	
//		    0
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<int>{
//		    	1,2,3,4
		    	
		    	
		    	
//		    }
//		    .including(0);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIntersection_1(){
//		// Arrangement
//		    var expectedResult = new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "a"
		    	
		    	
		    	
//		    }
//		    .intersection(new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    );
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIntersection_2(){
//		// Arrangement
//		    var expectedResult = new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "a"
		    	
		    	
		    	
//		    }
//		    .intersection(new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    );
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIntersection_3(){
//		// Arrangement
//		    var expectedResult = new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "a"
		    	
		    	
		    	
//		    }
//		    .intersection(new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    );
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIntersection_4(){
//		// Arrangement
//		    var expectedResult = new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "a"
		    	
		    	
		    	
//		    }
//		    .intersection(new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    );
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIntersection_5(){
//		// Arrangement
//		    var expectedResult = new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .intersection(new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "a"
		    	
		    	
		    	
//		    }
//		    );
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIntersection_6(){
//		// Arrangement
//		    var expectedResult = new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "a"
		    	
		    	
		    	
//		    }
//		    .intersection(new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    );
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionIntersection_7(){
//		// Arrangement
//		    var expectedResult = new Bag<string>{
//		    "a"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "a", 
		    	
		    	
		    	
//		    "a", 
		    	
		    	
		    	
//		    "a"
		    	
		    	
		    	
//		    }
//		    .intersection(new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    );
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionMinus_1(){
//		// Arrangement
//		    var expectedResult = new Set<string>{
//		    "b"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    .minus(new Set<string>{
//		    "c", 
		    	
		    	
		    	
//		    "a"
		    	
		    	
		    	
//		    }
//		    );
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionMinus_2(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    "b"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    "c"
		    	
		    	
		    	
//		    }
//		    .minus(new Set<string>{
//		    "c", 
		    	
		    	
		    	
//		    "a"
		    	
		    	
		    	
//		    }
//		    );
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionMinus_3(){
//		// Arrangement
//		    var expectedResult = new Set<string>{
//		    "a"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Set<string>{
//		    "a", 
		    	
		    	
		    	
//		    null
		    	
		    	
		    	
//		    }
//		    .minus(new Set<string>{
//		    "c", 
		    	
		    	
		    	
//		    null
		    	
		    	
		    	
//		    }
//		    );
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionNotEmpty_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Sequence<object>{
//			4, 
				
				
				
//			4, 
				
				
				
//			"test"
				
				
				
//			}
//			.notEmpty();
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionNotEmpty_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Bag<object>{
//			4, 
				
				
				
//			4, 
				
				
				
//			"test"
				
				
				
//			}
//			.notEmpty();
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionNotEmpty_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<object>{
//			4, 
				
				
				
//			4, 
				
				
				
//			"test"
				
				
				
//			}
//			.notEmpty();
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionNotEmpty_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new OrderedSet<object>{
//			4, 
				
				
				
//			4, 
				
				
				
//			"test"
				
				
				
//			}
//			.notEmpty();
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionNotEmpty_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<string>{
//			"test"
				
				
				
//			}
//			.notEmpty();
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionNotEmpty_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = new Set<string>{
//			""
				
				
				
//			}
//			.notEmpty();
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionPrepend_1(){
//		// Arrangement
//		    var expectedResult = new Sequence<string>{
//		    "c", 
		    	
		    	
		    	
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .prepend("c");
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionPrepend_2(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    "c", 
		    	
		    	
		    	
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .prepend("c");
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionPrepend_3(){
//		// Arrangement
//		    var expectedResult = new Sequence<string>{
//		    null, 
		    	
		    	
		    	
//		    "a", 
		    	
		    	
		    	
//		    null, 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new Sequence<string>{
//		    "a", 
		    	
		    	
		    	
//		    null, 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .prepend(null);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionPrepend_4(){
//		// Arrangement
//		    var expectedResult = new OrderedSet<string>{
//		    null, 
		    	
		    	
		    	
//		    "a", 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    ;
//		// Action
//		    var actualResult = new OrderedSet<string>{
//		    "a", 
		    	
		    	
		    	
//		    null, 
		    	
		    	
		    	
//		    "b"
		    	
		    	
		    	
//		    }
//		    .prepend(null);
//		// Assertion 
//		    ocl.assertQueryResults(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionSize_1(){
//		// Arrangement
//		    var expectedResult = 4;
//		// Action
//		    var actualResult = new Sequence<object>{
//		    4, 
		    	
		    	
		    	
//		    4, 
		    	
		    	
		    	
//		    5, 
		    	
		    	
		    	
//		    "test"
		    	
		    	
		    	
//		    }
//		    .size();
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionSize_2(){
//		// Arrangement
//		    var expectedResult = 4;
//		// Action
//		    var actualResult = new Bag<object>{
//		    4, 
		    	
		    	
		    	
//		    4, 
		    	
		    	
		    	
//		    5, 
		    	
		    	
		    	
//		    "test"
		    	
		    	
		    	
//		    }
//		    .size();
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionSize_3(){
//		// Arrangement
//		    var expectedResult = 4;
//		// Action
//		    var actualResult = new Sequence<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    null, 
		    	
		    	
		    	
//		    null
		    	
		    	
		    	
//		    }
//		    .size();
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testCollectionSize_4(){
//		// Arrangement
//		    var expectedResult = 4;
//		// Action
//		    var actualResult = new Bag<string>{
//		    "a", 
		    	
		    	
		    	
//		    "b", 
		    	
		    	
		    	
//		    null, 
		    	
		    	
		    	
//		    null
		    	
		    	
		    	
//		    }
//		    .size();
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
		
//		}
//	}
