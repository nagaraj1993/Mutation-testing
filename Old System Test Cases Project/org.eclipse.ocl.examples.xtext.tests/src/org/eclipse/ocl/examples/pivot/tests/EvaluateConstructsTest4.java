/*******************************************************************************
 * Copyright (c) 2012, 2018 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/

package org.eclipse.ocl.examples.pivot.tests;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.pivot.tests.EvaluateUMLTest4.MyOCL;
import org.eclipse.ocl.pivot.PivotTables;
import org.eclipse.ocl.pivot.internal.messages.PivotMessagesInternal;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.osgi.util.NLS;
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
public class EvaluateConstructsTest4 extends PivotTestSuite
{
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{false}};
		return Arrays.asList(data);
	}

	public EvaluateConstructsTest4(boolean useCodeGen) {
		super(useCodeGen);
	}

	@Override
	protected @NonNull MyOCL createOCL() {
		return new MyOCL(getTestFileSystem(), getTestPackageName(), getName());
	}

	@Override
	protected @NonNull String getTestPackageName() {
		return "EvaluateConstructs";
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

	@Test public void testConstruct_let() {
		TestOCL ocl = createOCL();
		ocl.assertQueryEquals(null, 3, "let a : Integer = 1 in a + 2");
		ocl.assertQueryEquals(null, 7, "1 + let a : Integer = 2 in a * 3");
		ocl.assertQueryEquals(null, 4/2+5*3, "4/2 + let a : Integer = 5 in a * 3");
		ocl.assertQueryEquals(null, 4/2+3*5*7, "4/2 + (let a : Integer = 5 in 3 * (let b : Integer = 7 in a * b))");
		ocl.dispose();
	}
}
