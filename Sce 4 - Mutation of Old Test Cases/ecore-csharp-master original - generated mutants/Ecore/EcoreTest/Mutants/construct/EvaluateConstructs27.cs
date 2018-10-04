//using System;
//using Microsoft.VisualStudio.TestTools.UnitTesting;
//using oclstdlib;
//using System.Linq;
//namespace EcoreTest
//{

//    [TestClass]
//    public class EvaluateConstructsTest4
//    {

//        private TestOCL ocl = new TestOCL();

//        [TestMethod]
//        public void testConstruct_let_1()
//        {
//            // Arrangement
//            var expectedResult = 3;
//            // Action
//            var actualResult = ((Func<int>)(() => { var a = 1; return a + 2; }))();
//            ;
//            // Assertion 
//            ocl.assertQueryEquals(expectedResult, actualResult);
//        }

//        [TestMethod]
//        public void testConstruct_let_2()
//        {
//            // Arrangement
//            var expectedResult = null;
//            // Action
//            var actualResult = 1 + ((Func<int>)(() => { var a = 2; return a * 3; }))();
//            ;
//            // Assertion 
//            ocl.assertQueryEquals(expectedResult, actualResult);
//        }

//        [TestMethod]
//        public void testConstruct_let_3()
//        {
//            // Arrangement
//            var expectedResult = Convert.ToDouble(4) / Convert.ToDouble(2) + 5 * 3;
//            // Action
//            var actualResult = Convert.ToDouble(4) / Convert.ToDouble(2) + ((Func<int>)(() => { var a = 5; return a * 3; }))();
//            ;
//            // Assertion 
//            ocl.assertQueryEquals(expectedResult, actualResult);
//        }

//        [TestMethod]
//        public void testConstruct_let_4()
//        {
//            // Arrangement
//            var expectedResult = Convert.ToDouble(4) / Convert.ToDouble(2) + 3 * 5 * 7;
//            // Action
//            var actualResult = Convert.ToDouble(4) / Convert.ToDouble(2) + ((Func<int>)(() => {
//                var a = 5; return 3 * ((Func<int>)(() => { var b = 7; return a * b; }))();
//                ;
//            }))();
//            ;
//            // Assertion 
//            ocl.assertQueryEquals(expectedResult, actualResult);
//        }


//    }
//}
