/*******************************************************************************
 * Copyright (c) 2010, 2018 Eclipse Modeling Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   L.Goubet, E.D.Willink - Initial API and implementation
 *******************************************************************************/

package org.eclipse.ocl.examples.pivot.tests;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.internal.messages.PivotMessagesInternal;
import org.eclipse.ocl.pivot.internal.values.BigIntegerValueImpl;
import org.eclipse.ocl.pivot.internal.values.IntIntegerValueImpl;
import org.eclipse.ocl.pivot.internal.values.LongIntegerValueImpl;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Tests for numeric operations.
 */
@RunWith(value = Parameterized.class)
public class EvaluateNumericOperationsTest4 extends PivotTestSuite
{
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{false}};
		return Arrays.asList(data);
	}

	//protected double doubleEpsilon = Math.pow(0.5, Double.SIZE - 12);

	public EvaluateNumericOperationsTest4(boolean useCodeGen) {
		super(useCodeGen);
	}

	@Override
	protected @NonNull TestOCL createOCL() {
		return new TestOCL(getTestFileSystem(), getTestPackageName(), getName(), useCodeGen ? getProjectMap() : OCL.NO_PROJECTS);
	}

	@Override
	protected @NonNull String getTestPackageName() {
		return "EvaluateNumericOperations";
	}

	@BeforeClass public static void resetCounter() throws Exception {
		PivotTestSuite.resetCounter();
	}

	@Override
	@Before public void setUp() throws Exception {
		super.setUp();
	}

	@Override
	@After public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test public void testIntValue() {
		TestOCL ocl = createOCL();
		assert ValueUtil.integerValueOf(Integer.MAX_VALUE) instanceof IntIntegerValueImpl;
		assert ValueUtil.integerValueOf((long)Integer.MAX_VALUE) instanceof IntIntegerValueImpl;
		assert ValueUtil.integerValueOf(BigInteger.valueOf(Integer.MAX_VALUE)) instanceof IntIntegerValueImpl;
		assert ValueUtil.integerValueOf(BigInteger.valueOf(Integer.MAX_VALUE + 1L)) instanceof LongIntegerValueImpl;

		assert ValueUtil.integerValueOf(Long.MAX_VALUE) instanceof LongIntegerValueImpl;
		assert ValueUtil.integerValueOf(BigInteger.valueOf(Long.MAX_VALUE)) instanceof LongIntegerValueImpl;
		assert ValueUtil.integerValueOf(BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE)) instanceof BigIntegerValueImpl;

		assert ValueUtil.integerValueOf(Integer.MIN_VALUE) instanceof IntIntegerValueImpl;
		assert ValueUtil.integerValueOf((long)Integer.MIN_VALUE) instanceof IntIntegerValueImpl;
		assert ValueUtil.integerValueOf(BigInteger.valueOf(Integer.MIN_VALUE)) instanceof IntIntegerValueImpl;
		assert ValueUtil.integerValueOf(BigInteger.valueOf(Integer.MIN_VALUE - 1L)) instanceof LongIntegerValueImpl;

		assert ValueUtil.integerValueOf(Long.MIN_VALUE) instanceof LongIntegerValueImpl;
		assert ValueUtil.integerValueOf(BigInteger.valueOf(Long.MIN_VALUE)) instanceof LongIntegerValueImpl;
		assert ValueUtil.integerValueOf(BigInteger.valueOf(Long.MIN_VALUE).subtract(BigInteger.ONE)) instanceof BigIntegerValueImpl;
		ocl.dispose();
	}

	@Test public void testIntPlus() {
		// hashCode, equals
	}

	@Test public void testIntMinus() {
		// hashCode, equals
	}

	@Test public void testNumber() {
		TestOCL ocl = createOCL();
		ocl.assertQueryEquals(null, 0, "0");
		ocl.assertQueryEquals(null, 3, "3");
		ocl.assertQueryEquals(null, 3.1, "3.1");
		ocl.dispose();
	}

	@Test public void testNumberAbs() {
		TestOCL ocl = createOCL();
		// Integer::abs()
		ocl.assertQueryEquals(null, 3, "3.abs()");

		ocl.assertQueryEquals(null, 2147483647, "2147483647.abs()");
		ocl.dispose();
	}

	@Test public void testNumberDiv() {
		TestOCL ocl = createOCL();
		ocl.assertQueryEquals(null, 1, "3.div(2)");
		ocl.assertQueryEquals(null, 2, "5.div(2)");
		ocl.dispose();
	}

	@Test public void testNumberEqual() {
		TestOCL ocl = createOCL();
		ocl.assertQueryFalse(null, "4 = 5");
		ocl.assertQueryFalse(null, "1 = 4.0");
		ocl.assertQueryFalse(null, "1.0 = 4");
		ocl.assertQueryFalse(null, "1.0 = 4.0");

		ocl.assertQueryTrue(null, "4 = 4");
		ocl.assertQueryTrue(null, "1.0 = 1");
		ocl.assertQueryTrue(null, "1.0 = 1.0");
		ocl.dispose();
	}

	@Test public void testNumberGreaterThan() {
		TestOCL ocl = createOCL();
		// Integer::greaterThan(Integer)
		ocl.assertQueryTrue(null, "3 > 2");
		ocl.assertQueryTrue(null, "3.0 > 2.0");
		// Real::greaterThan(Integer)
		ocl.assertQueryFalse(null, "3.0 > 3");
		
		ocl.assertQueryFalse(null, "3 > 3.0");
		ocl.dispose();
	}

	@Test public void testNumberGreaterThanOrEqual() {
		TestOCL ocl = createOCL();
		// Integer::greaterThanOrEqual(Integer)
		ocl.assertQueryTrue(null, "3 >= 2");

		// Real::greaterThanOrEqual(Integer)
		ocl.assertQueryTrue(null, "3.0 >= 3");
		ocl.dispose();
	}

	@Test public void testNumberLessThan() {
		TestOCL ocl = createOCL();
		// Integer::lessThan(Integer)
		ocl.assertQueryFalse(null, "3 < 2");
		// Real::lessThan(Real)
		ocl.assertQueryFalse(null, "3.0 < 2.0");
		// Integer::lessThan(Real)
		ocl.assertQueryFalse(null, "3 < 3.0");
		ocl.dispose();
	}

	@Test public void testNumberLessThanOrEqual() {
		TestOCL ocl = createOCL();
		// Integer::lessThanOrEqual(Integer)
		ocl.assertQueryFalse(null, "3 <= 2");
		ocl.dispose();
	}

	@Test public void testNumberMax() {
		TestOCL ocl = createOCL();
		// Integer::max(Integer)
		ocl.assertQueryEquals(null, 3, "3.max(2)");
		ocl.dispose();
	}

	@Test public void testNumberMin() {
		TestOCL ocl = createOCL();
		// Integer::min(Integer)
		ocl.assertQueryEquals(null, 2, "3.min(2)");
		ocl.dispose();
	}

	@Test public void testNumberMinus() {
		TestOCL ocl = createOCL();
		// Integer::-(Integer)
		ocl.assertQueryEquals(null, 0, "1 - 1");
		ocl.dispose();
	}

	@Test public void testNumberMod() {
		TestOCL ocl = createOCL();
		ocl.assertQueryEquals(null, 1, "3.mod(2)");
		ocl.dispose();
	}


	@Test public void testNumberNotEqual() {
		TestOCL ocl = createOCL();
		ocl.assertQueryTrue(null, "4 <> 5");
		ocl.assertQueryTrue(null, "1 <> 4.0");
		ocl.assertQueryTrue(null, "1.0 <> 4");
		ocl.assertQueryTrue(null, "1.0 <> 4.0");

		ocl.assertQueryFalse(null, "4 <> 4");
		ocl.assertQueryFalse(null, "1 <> 1.0");
		ocl.assertQueryFalse(null, "1.0 <> 1");
		ocl.dispose();
	}

	@Test public void testNumberPlus() {
		TestOCL ocl = createOCL();
		// Integer::+(Integer)
		ocl.assertQueryEquals(null, 2, "1 + 1");
		ocl.dispose();
	}

	@Test public void testNumberTimes() {
		TestOCL ocl = createOCL();
		// Integer::*(Integer)
		ocl.assertQueryEquals(null, 1, "1 * 1");
		ocl.dispose();
	}
}
