//using System;
//using Microsoft.VisualStudio.TestTools.UnitTesting;
//using oclstdlib;
//using System.Linq;
//namespace EcoreTest {
	
//	[TestClass]
//	public class EvaluateNumericOperationsTest4 {
		
//		private TestOCL ocl = new TestOCL();
		
//		[TestMethod]
//		public void testNumber_1(){
//		// Arrangement
//		    var expectedResult = 0;
//		// Action
//		    var actualResult = 0;
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testNumber_2(){
//		// Arrangement
//		    var expectedResult = 3;
//		// Action
//		    var actualResult = 3;
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testNumber_3(){
//		// Arrangement
//		    var expectedResult = 3.1;
//		// Action
//		    var actualResult = 3.1;
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberAbs_1(){
//		// Arrangement
//		    var expectedResult = 3;
//		// Action
//		    var actualResult = Math.Abs(3);
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberAbs_2(){
//		// Arrangement
//		    var expectedResult = 2147483647;
//		// Action
//		    var actualResult = Math.Abs(2147483647);
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberDiv_1(){
//		// Arrangement
//		    var expectedResult = 1;
//		// Action
//		    var actualResult = 3 / 2;
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberDiv_2(){
//		// Arrangement
//		    var expectedResult = 2;
//		// Action
//		    var actualResult = 5 / 2;
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberEqual_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 4.Equals(5);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberEqual_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 1.Equals(4.0);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberEqual_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 1.0.Equals(4);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberEqual_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 1.0.Equals(4.0);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberEqual_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 4.Equals(4);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberEqual_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 1.0.Equals(1);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberEqual_7(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 1.0.Equals(1.0);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberGreaterThan_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 3 > 2;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberGreaterThan_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 3.0 > 2.0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberGreaterThan_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 3.0 > 3;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberGreaterThan_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 3 > 3.0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberGreaterThanOrEqual_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 3 >= 2;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberGreaterThanOrEqual_2(){
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            //Original
//            //var actualResult = 3.0 >= 3;
//            //Mutant29
//            var actualResult = 3.0 < 3;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberLessThan_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 3 < 2;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberLessThan_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 3.0 < 2.0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberLessThan_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 3 < 3.0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberLessThanOrEqual_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 3 <= 2;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberMax_1(){
//		// Arrangement
//		    var expectedResult = 3;
//		// Action
//		    var actualResult = Math.Max(3, 2);
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberMin_1(){
//		// Arrangement
//		    var expectedResult = 2;
//		// Action
//		    var actualResult = Math.Min(3, 2);
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberMinus_1(){
//		// Arrangement
//		    var expectedResult = 0;
//		// Action
//		    var actualResult = 1 - 1;
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberMod_1(){
//		// Arrangement
//		    var expectedResult = 1;
//		// Action
//		    var actualResult = 3 % 2;
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberNotEqual_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 4 != 5;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberNotEqual_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 1 != 4.0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberNotEqual_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 1.0 != 4;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberNotEqual_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 1.0 != 4.0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberNotEqual_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 4 != 4;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberNotEqual_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 1 != 1.0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberNotEqual_7(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = 1.0 != 1;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberPlus_1(){
//		// Arrangement
//		    var expectedResult = 2;
//		// Action
//		    var actualResult = 1 + 1;
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testNumberTimes_1(){
//		// Arrangement
//		    var expectedResult = 1;
//		// Action
//		    var actualResult = 1 * 1;
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
		
//		}
//	}
