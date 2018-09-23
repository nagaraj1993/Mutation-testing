//using System;
//using Microsoft.VisualStudio.TestTools.UnitTesting;
//using oclstdlib;
//using System.Linq;
//namespace EcoreTest {
	
//	[TestClass]
//	public class EvaluateStringOperationsTest4 {
		
//		private TestOCL ocl = new TestOCL();
		
//		[TestMethod]
//		public void testStringConcat_1(){
//		// Arrangement
//		    var expectedResult = "concatenationTest";
//		// Action
//		    var actualResult = "concatenation" + "Test";
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testStringConcat_2(){
//		// Arrangement
//		    var expectedResult = "concatenation\n";
//		    /*	EXCEPTION: org.eclipse.ocl.SyntaxException 
//		    	2:13 "\" unexpected character ignored  */
//		// Action
//		    var actualResult = "concatenation" + "\n";
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEndsWith_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".EndsWith("aabcdef");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEndsWith_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".EndsWith("abcdef");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEndsWith_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".EndsWith("cdef");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEndsWith_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".EndsWith("f");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEndsWith_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".EndsWith("");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEndsWith_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "".EndsWith("");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEndsWith_7(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "".EndsWith("a");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEndsWith_8(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".EndsWith("");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEndsWith_9(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".EndsWith("bcd");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEndsWith_10(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".EndsWith("ab");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEndsWith_11(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".EndsWith("a");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEqual_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "test" == "se";
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEqual_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "test" == "test";
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEqual_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "tESt" == "TesT";
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEqualIgnoresCase_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = String.Equals("test", "se", StringComparison.OrdinalIgnoreCase);
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEqualIgnoresCase_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = String.Equals("test", "test", StringComparison.OrdinalIgnoreCase);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEqualIgnoresCase_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = String.Equals("Test", "tEst", StringComparison.OrdinalIgnoreCase);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEqualIgnoresCase_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = String.Equals("tesT", "teSt", StringComparison.OrdinalIgnoreCase);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEqualIgnoresCase_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = String.Equals("TEST", "test", StringComparison.OrdinalIgnoreCase);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringEqualIgnoresCase_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = String.Equals("test", "TEST", StringComparison.OrdinalIgnoreCase);
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThan_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "3".CompareTo("4") > 0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThan_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "a".CompareTo("b") > 0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThan_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "aardvark".CompareTo("aardvarks") > 0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThan_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "3.2".CompareTo("3.1") > 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThan_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "3".CompareTo("3") > 0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThan_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "a".CompareTo("a") > 0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThan_7(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "aardvark".CompareTo("aardvark") > 0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThanOrEqual_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "3".CompareTo("4") >= 0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThanOrEqual_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "a".CompareTo("b") >= 0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThanOrEqual_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "aardvark".CompareTo("aardvarks") >= 0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThanOrEqual_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "3.2".CompareTo("3.1") >= 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThanOrEqual_5(){
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            //Original
//            //var actualResult = "3".CompareTo("3") >= 0;
//            //Mutant10
//            var actualResult = "3".CompareTo("3") > 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThanOrEqual_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "a".CompareTo("a") >= 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringGreaterThanOrEqual_7(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "aardvark".CompareTo("aardvark") >= 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringLessThan_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "3".CompareTo("4") < 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringLessThan_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "a".CompareTo("b") < 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringLessThan_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "aardvark".CompareTo("aardvarks") < 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringLessThan_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "3".CompareTo("3") < 0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringLessThan_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "a".CompareTo("a") < 0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringLessThan_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "aardvark".CompareTo("aardvark") < 0;
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringLessThanOrEqual_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "3".CompareTo("4") <= 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringLessThanOrEqual_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "a".CompareTo("b") <= 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringLessThanOrEqual_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "aardvark".CompareTo("aardvarks") <= 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringLessThanOrEqual_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "3".CompareTo("3") <= 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringLessThanOrEqual_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "a".CompareTo("a") <= 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringLessThanOrEqual_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "aardvark".CompareTo("aardvark") <= 0;
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringNotEqual_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "test" != "se";
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringNotEqual_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "test" != "test";
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringPlus_1(){
//		// Arrangement
//		    var expectedResult = "concatenationTest";
//		// Action
//		    var actualResult = "concatenation" + "Test";
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testStringPlus_2(){
//		// Arrangement
//		    var expectedResult = "concatenation\n";
//		    /*	EXCEPTION: org.eclipse.ocl.SyntaxException 
//		    	2:13 "\" unexpected character ignored  */
//		// Action
//		    var actualResult = "concatenation" + "\n";
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testStringReplaceAll_1(){
//		// Arrangement
//		    var expectedResult = "rePlaceAll oPeration";
//		    /*	EXCEPTION: org.eclipse.ocl.SyntaxException 
//		    	2:12:2:20 "oPeration" unexpected token(s)  */
//		// Action
//		    var actualResult = "replaceAll operation".Replace("p", "P");
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testStringStartsWith_1(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".StartsWith("abcdefg");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringStartsWith_2(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".StartsWith("abcdef");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringStartsWith_3(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".StartsWith("abcd");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringStartsWith_4(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".StartsWith("a");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringStartsWith_5(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".StartsWith("");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringStartsWith_6(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "".StartsWith("");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringStartsWith_7(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "".StartsWith("a");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringStartsWith_8(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".StartsWith("");
//		// Assertion 
//			ocl.assertQueryTrue(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringStartsWith_9(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".StartsWith("bcd");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringStartsWith_10(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".StartsWith("ef");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringStartsWith_11(){
//		// Arrangement
//			/* no arrangement part since it's a single paramteter assertion */
//		// Action
//			var actualResult = "abcdef".StartsWith("f");
//		// Assertion 
//			ocl.assertQueryFalse(actualResult);
//		}
		
//		[TestMethod]
//		public void testStringToLowerCase_1(){
//		// Arrangement
//		    var expectedResult = "mixed";
//		// Action
//		    var actualResult = "MiXeD".ToLower();
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testStringToLowerCase_2(){
//		// Arrangement
//		    var expectedResult = "upper";
//		// Action
//		    var actualResult = "UPPER".ToLower();
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testStringToUpperCase_1(){
//		// Arrangement
//		    var expectedResult = "MIXED";
//		// Action
//		    var actualResult = "MiXeD".ToUpper();
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
//		[TestMethod]
//		public void testStringToUpperCase_2(){
//		// Arrangement
//		    var expectedResult = "LOWER";
//		// Action
//		    var actualResult = "lower".ToUpper();
//		// Assertion 
//		    ocl.assertQueryEquals(expectedResult, actualResult);
//		}
		
		
//		}
//	}
