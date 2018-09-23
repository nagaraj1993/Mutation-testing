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

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Tests for Boolean operations.
 */
@RunWith(value = Parameterized.class)
public class EvaluateBooleanOperationsTest4 extends PivotTestSuite
{
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{false}};
		return Arrays.asList(data);
	}

	public EvaluateBooleanOperationsTest4(boolean useCodeGen) {
		super(useCodeGen);
	}

	@Override
	protected @NonNull TestOCL createOCL() {
		return new TestOCL(getTestFileSystem(), getTestPackageName(), getTestName(), useCodeGen ? getProjectMap() : OCL.NO_PROJECTS);
	}

	@Override
	protected @NonNull String getTestPackageName() {
		return "EvaluateBooleanOperations";
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

	@Test public void testBoolean() {
		TestOCL ocl = createOCL();
		ocl.assertQueryFalse(null, "false");
		ocl.assertQueryTrue(null, "true");
		// invalid
		ocl.assertQueryFalse(null, "let b : Boolean = false in b");
		ocl.assertQueryTrue(null, "let b : Boolean = true in b");
		ocl.dispose();
	}

	@Test public void testBooleanAnd() {
		TestOCL ocl = createOCL();
		ocl.assertQueryFalse(null, "false and false");
		ocl.assertQueryFalse(null, "false and true");
		ocl.assertQueryFalse(null, "true and false");
		ocl.assertQueryTrue(null, "true and true");
		ocl.dispose();
	}

	@Test public void testBooleanEqual() {
		TestOCL ocl = createOCL();
		ocl.assertQueryFalse(null, "true = false");

		ocl.assertQueryTrue(null, "true = true");
		ocl.assertQueryTrue(null, "false = false");
		ocl.dispose();
	}

	@Test public void testBooleanImplies() {
		TestOCL ocl = createOCL();
		ocl.assertQueryTrue(null, "false implies false");
		ocl.assertQueryTrue(null, "false implies true");
		ocl.assertQueryFalse(null, "true implies false");
		ocl.assertQueryTrue(null, "true implies true");
		ocl.dispose();
	}

	@Test public void testBooleanNot() {
		TestOCL ocl = createOCL();
		ocl.assertQueryTrue(null, "not false");
		ocl.assertQueryFalse(null, "not true");
		ocl.dispose();
	}

	@Test public void testBooleanNotEqual() {
		TestOCL ocl = createOCL();
		ocl.assertQueryTrue(null, "true <> false");

		ocl.assertQueryFalse(null, "true <> true");
		ocl.assertQueryFalse(null, "false <> false");
		ocl.dispose();
	}

	@Test public void testBooleanOr() {
		TestOCL ocl = createOCL();
		ocl.assertQueryFalse(null, "false or false");
		ocl.assertQueryTrue(null, "false or true");
		ocl.assertQueryTrue(null, "true or false");
		ocl.assertQueryTrue(null, "true or true");
		ocl.dispose();
	}

	@Test public void testBooleanXor() {
		TestOCL ocl = createOCL();
		ocl.assertQueryFalse(null, "false xor false");
		ocl.assertQueryTrue(null, "false xor true");
		ocl.assertQueryTrue(null, "true xor false");
		//Original
		//ocl.assertQueryFalse(null, "true xor true");
		//Mutant23
		ocl.assertQueryFalse(null, "true or true");
		ocl.dispose();
	}
}
