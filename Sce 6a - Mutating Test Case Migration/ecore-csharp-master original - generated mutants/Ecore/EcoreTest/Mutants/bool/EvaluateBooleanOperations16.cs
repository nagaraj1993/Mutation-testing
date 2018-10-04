//using System;
//using Microsoft.VisualStudio.TestTools.UnitTesting;
//using oclstdlib;
//using System.Linq;
//namespace EcoreTest
//{

//    [TestClass]
//    public class EvaluateBooleanOperationsTest4
//    {

//        private TestOCL ocl = new TestOCL();

//        [TestMethod]
//        public void testBoolean_1()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = false;
//            // Assertion 
//            ocl.assertQueryFalse(actualResult);
//        }

//        [TestMethod]
//        public void testBoolean_2()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = true;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBoolean_3()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = ((Func<bool>)(() => { var b = false; return b; }))();
//            ;
//            // Assertion 
//            ocl.assertQueryFalse(actualResult);
//        }

//        [TestMethod]
//        public void testBoolean_4()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = ((Func<bool>)(() => { var b = true; return b; }))();
//            ;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanAnd_1()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = false || false;
//            // Assertion 
//            ocl.assertQueryFalse(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanAnd_2()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = false || true;
//            // Assertion 
//            ocl.assertQueryFalse(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanAnd_3()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = true || false;
//            // Assertion 
//            ocl.assertQueryFalse(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanAnd_4()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = true || true;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanEqual_1()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = true == false;
//            // Assertion 
//            ocl.assertQueryFalse(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanEqual_2()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = true == true;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanEqual_3()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = false == false;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanImplies_1()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = !false || false;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanImplies_2()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = !false || true;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanImplies_3()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = !true || false;
//            // Assertion 
//            ocl.assertQueryFalse(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanImplies_4()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = !true || true;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanNot_1()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = !false;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanNot_2()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = !true;
//            // Assertion 
//            ocl.assertQueryFalse(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanNotEqual_1()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = true != false;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanNotEqual_2()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = true != true;
//            // Assertion 
//            ocl.assertQueryFalse(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanNotEqual_3()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = false != false;
//            // Assertion 
//            ocl.assertQueryFalse(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanOr_1()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = false || false;
//            // Assertion 
//            ocl.assertQueryFalse(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanOr_2()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = false || true;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanOr_3()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = true || false;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanOr_4()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = true || true;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanXor_1()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = false ^ false;
//            // Assertion 
//            ocl.assertQueryFalse(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanXor_2()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = false ^ true;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanXor_3()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = true ^ false;
//            // Assertion 
//            ocl.assertQueryTrue(actualResult);
//        }

//        [TestMethod]
//        public void testBooleanXor_4()
//        {
//            // Arrangement
//            /* no arrangement part since it's a single paramteter assertion */
//            // Action
//            var actualResult = true ^ true;
//            // Assertion 
//            ocl.assertQueryFalse(actualResult);
//        }


//    }
//}
