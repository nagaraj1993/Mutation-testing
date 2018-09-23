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
import java.util.regex.PatternSyntaxException;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.internal.messages.PivotMessagesInternal;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.StringUtil;
import org.eclipse.osgi.util.NLS;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Tests for String operations.
 */
@RunWith(value = Parameterized.class)
public class EvaluateStringOperationsTest4 extends PivotTestSuite
{
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{false}};
		return Arrays.asList(data);
	}

	public EvaluateStringOperationsTest4(boolean useCodeGen) {
		super(useCodeGen);
	}

	@Override
	protected @NonNull TestOCL createOCL() {
		return new TestOCL(getTestFileSystem(), getTestPackageName(), getName(), useCodeGen ? getProjectMap() : OCL.NO_PROJECTS);
	}

	@Override
	protected @NonNull String getTestPackageName() {
		return "EvaluateStringOperations";
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

	@Test public void testStringConcat() {
		TestOCL ocl = createOCL();
		ocl.assertQueryEquals(null, "concatenationTest", "'concatenation'.concat('Test')");
		ocl.assertQueryEquals(null, "concatenation\n", "'concatenation'.concat('\\n')");
		ocl.dispose();
	}

	@Test public void testStringEndsWith() {
		TestOCL ocl = createOCL();
		ocl.assertQueryFalse(null, "'abcdef'.endsWith('aabcdef')");
		ocl.assertQueryTrue(null, "'abcdef'.endsWith('abcdef')");
		ocl.assertQueryTrue(null, "'abcdef'.endsWith('cdef')");
		ocl.assertQueryTrue(null, "'abcdef'.endsWith('f')");
		ocl.assertQueryTrue(null, "'abcdef'.endsWith('')");
		ocl.assertQueryTrue(null, "''.endsWith('')");
		ocl.assertQueryFalse(null, "''.endsWith('a')");
		ocl.assertQueryTrue(null, "'abcdef'.endsWith('')");
		ocl.assertQueryFalse(null, "'abcdef'.endsWith('bcd')");
		ocl.assertQueryFalse(null, "'abcdef'.endsWith('ab')");
		ocl.assertQueryFalse(null, "'abcdef'.endsWith('a')");
		ocl.dispose();
	}

	@Test public void testStringEqual() {
		TestOCL ocl = createOCL();
		ocl.assertQueryFalse(null, "'test' = 'se'");
		ocl.assertQueryTrue(null, "'test' = 'test'");
		ocl.assertQueryFalse(null, "'tESt' = 'TesT'");
		ocl.dispose();
	}

	@Test public void testStringEqualIgnoresCase() {
		TestOCL ocl = createOCL();
		ocl.assertQueryFalse(null, "'test'.equalsIgnoreCase('se')");
		ocl.assertQueryTrue(null, "'test'.equalsIgnoreCase('test')");
		ocl.assertQueryTrue(null, "'Test'.equalsIgnoreCase('tEst')");
		ocl.assertQueryTrue(null, "'tesT'.equalsIgnoreCase('teSt')");
		ocl.assertQueryTrue(null, "'TEST'.equalsIgnoreCase('test')");
		ocl.assertQueryTrue(null, "'test'.equalsIgnoreCase('TEST')");
		ocl.dispose();
	}

	@Test public void testStringGreaterThan() {
		TestOCL ocl = createOCL();
		// FIXME Analyzer-extraOperation String::> should not be defined
		ocl.assertQueryFalse(null, "'3' > '4'");
		ocl.assertQueryFalse(null, "'a' > 'b'");
		ocl.assertQueryFalse(null, "'aardvark' > 'aardvarks'");

		ocl.assertQueryTrue(null, "'3.2' > '3.1'");
		ocl.assertQueryFalse(null, "'3' > '3'");
		ocl.assertQueryFalse(null, "'a' > 'a'");
		ocl.assertQueryFalse(null, "'aardvark' > 'aardvark'");
		ocl.dispose();
	}

	@Test public void testStringGreaterThanOrEqual() {
		TestOCL ocl = createOCL();
		// FIXME Analyzer-extraOperation String::>= should not be defined
		ocl.assertQueryFalse(null, "'3' >= '4'");
		ocl.assertQueryFalse(null, "'a' >= 'b'");
		ocl.assertQueryFalse(null, "'aardvark' >= 'aardvarks'");

		ocl.assertQueryTrue(null, "'3.2' >= '3.1'");

		ocl.assertQueryTrue(null, "'3' >= '3'");
		ocl.assertQueryTrue(null, "'a' >= 'a'");
		ocl.assertQueryTrue(null, "'aardvark' >= 'aardvark'");
		ocl.dispose();
	}

	@Test public void testStringLessThan() {
		TestOCL ocl = createOCL();
		// FIXME Analyzer-extraOperation String::< should not be defined
		ocl.assertQueryTrue(null, "'3' < '4'");
		ocl.assertQueryTrue(null, "'a' < 'b'");
		ocl.assertQueryTrue(null, "'aardvark' < 'aardvarks'");

		ocl.assertQueryFalse(null, "'3' < '3'");
		ocl.assertQueryFalse(null, "'a' < 'a'");
		ocl.assertQueryFalse(null, "'aardvark' < 'aardvark'");
		ocl.dispose();
	}

	@Test public void testStringLessThanOrEqual() {
		TestOCL ocl = createOCL();
		// FIXME Analyzer-extraOperation String::<= should not be defined
		ocl.assertQueryTrue(null, "'3' <= '4'");
		ocl.assertQueryTrue(null, "'a' <= 'b'");
		ocl.assertQueryTrue(null, "'aardvark' <= 'aardvarks'");

		ocl.assertQueryTrue(null, "'3' <= '3'");
		ocl.assertQueryTrue(null, "'a' <= 'a'");
		ocl.assertQueryTrue(null, "'aardvark' <= 'aardvark'");
		ocl.dispose();
	}

	@Test public void testStringNotEqual() {
		TestOCL ocl = createOCL();
		ocl.assertQueryTrue(null, "'test' <> 'se'");
		ocl.assertQueryFalse(null, "'test' <> 'test'");
		ocl.dispose();
	}
	
	@Test public void testStringPlus() {
		TestOCL ocl = createOCL();
		ocl.assertQueryEquals(null, "concatenationTest", "'concatenation' + 'Test'");
		ocl.assertQueryEquals(null, "concatenation\n", "'concatenation' + '\\n'");
		ocl.dispose();
	}

	@Test public void testStringReplaceAll() {
		TestOCL ocl = createOCL();
		ocl.assertQueryEquals(null, "rePlaceAll oPeration", "'replaceAll operation'.replaceAll('p', 'P')");
		ocl.assertQueryInvalid(null, "'repla ce operation'.replaceAll('a[b-', '$1')", null, PatternSyntaxException.class);
		ocl.assertQueryInvalid(null, "'repla ce operation'.replaceAll('', '$1')", "No group 1", IndexOutOfBoundsException.class);
		ocl.dispose();
	}

	@Test public void testStringStartsWith() {
		TestOCL ocl = createOCL();
		ocl.assertQueryFalse(null, "'abcdef'.startsWith('abcdefg')");
		ocl.assertQueryTrue(null, "'abcdef'.startsWith('abcdef')");
		ocl.assertQueryTrue(null, "'abcdef'.startsWith('abcd')");
		ocl.assertQueryTrue(null, "'abcdef'.startsWith('a')");
		ocl.assertQueryTrue(null, "'abcdef'.startsWith('')");
		ocl.assertQueryTrue(null, "''.startsWith('')");
		ocl.assertQueryFalse(null, "''.startsWith('a')");
		ocl.assertQueryTrue(null, "'abcdef'.startsWith('')");
		ocl.assertQueryFalse(null, "'abcdef'.startsWith('bcd')");
		ocl.assertQueryFalse(null, "'abcdef'.startsWith('ef')");
		ocl.assertQueryFalse(null, "'abcdef'.startsWith('f')");
		ocl.dispose();
	}

	@Test public void testStringToLowerCase() {
		TestOCL ocl = createOCL();
		ocl.assertQueryEquals(null, "mixed", "'MiXeD'.toLowerCase()"); //$NON-NLS-2$
		ocl.assertQueryEquals(null, "upper", "'UPPER'.toLowerCase()"); //$NON-NLS-2$
		ocl.dispose();
	}

	@Test public void testStringToUpperCase() {
		TestOCL ocl = createOCL();
		ocl.assertQueryEquals(null, "MIXED", "'MiXeD'.toUpperCase()");
		ocl.assertQueryEquals(null, "LOWER", "'lower'.toUpperCase()");
		ocl.dispose();
	}
}
