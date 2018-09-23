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
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.internal.messages.PivotMessagesInternal;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


/**
 * Tests for collection operations.
 */
@RunWith(value = Parameterized.class)
public class EvaluateCollectionOperationsTest4 extends PivotTestSuite
{
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{false}};
		return Arrays.asList(data);
	}

	public EvaluateCollectionOperationsTest4(boolean useCodeGen) {
		super(useCodeGen);
	}

	@Override
	protected @NonNull TestOCL createOCL() {
		return new TestOCL(getTestFileSystem(), getTestPackageName(), getName(), useCodeGen ? getProjectMap() : OCL.NO_PROJECTS);
	}

	@Override
	protected @NonNull String getTestPackageName() {
		return "EvaluateCollectionOperations";
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

	@Test public void testCollectionAppend() {
		TestOCL ocl = createOCL();
		ocl.assertQueryResults(null, "Sequence{'a', 'b', 'c'}", "Sequence{'a', 'b'}->append('c')");
		ocl.assertQueryResults(null, "OrderedSet{'a', 'b', 'c'}", "OrderedSet{'a', 'b'}->append('c')");
		ocl.assertQueryResults(null, "Sequence{1..4,0}", "Sequence{1..4}->append(0)");
		ocl.assertQueryResults(null, "Sequence{1..4,4}", "Sequence{1..4}->append(4)");
		ocl.assertQueryResults(null, "Sequence{1..5}", "Sequence{1..4}->append(5)");
		ocl.assertQueryResults(null, "Sequence{1..4,6}", "Sequence{1..4}->append(6)");
		ocl.assertQueryResults(null, "OrderedSet{1..4,0}", "OrderedSet{1..4}->append(0)");
		ocl.assertQueryResults(null, "OrderedSet{1,3,4,2}", "OrderedSet{1..4}->append(2)");
		ocl.assertQueryResults(null, "OrderedSet{1..5}", "OrderedSet{1..4}->append(5)");
		ocl.assertQueryResults(null, "OrderedSet{1..4,6}", "OrderedSet{1..4}->append(6)");
		ocl.assertQueryResults(null, "Sequence{'a', 'b', null}", "Sequence{'a', 'b'}->append(null)");
		ocl.assertQueryResults(null, "OrderedSet{'a', 'b', null}", "OrderedSet{'a', 'b'}->append(null)");
		ocl.assertQueryResults(null, "Sequence{'a', null, 'b', null}", "Sequence{'a', null, 'b'}->append(null)");
		ocl.assertQueryResults(null, "OrderedSet{'a', 'b', null}", "OrderedSet{'a', null, 'b'}->append(null)");
		ocl.assertQueryResults(null, "Sequence{'1..2', null}", "Sequence{'1..2'}->append(null)");
		ocl.assertQueryResults(null, "OrderedSet{'1..2', null}", "OrderedSet{'1..2'}->append(null)");
		ocl.dispose();
	}

	@Test public void testCollectionAsBag() {
		TestOCL ocl = createOCL();
		//Original
		//ocl.assertQueryResults(null, "Bag{1, 2.0, '3'}", "Sequence{1, 2.0, '3'}->asBag()");
		//Mutant2
		ocl.assertQueryResults(null, "Bag{1, 2.0, '3'}", "Sequence{1, 2.0, '3'}->asSequence()");
		ocl.assertQueryResults(null, "Bag{1, 2.0, '3'}", "Bag{1, 2.0, '3'}->asBag()");
		ocl.assertQueryResults(null, "Bag{1, 2.0, '3'}", "Set{1, 2.0, '3'}->asBag()");
		ocl.assertQueryResults(null, "Bag{1, 2.0, '3'}", "OrderedSet{1, 2.0, '3'}->asBag()");
		ocl.dispose();
	}

	@Test public void testCollectionAsOrderedSet() {
		TestOCL ocl = createOCL();

		ocl.assertQueryResults(null, "OrderedSet{1, 2.0, '3'}", "Sequence{1, 2.0, '3'}->asOrderedSet()");
		ocl.assertQueryResults(null, "OrderedSet{1, 2.0, '3'}", "OrderedSet{1, 2.0, '3'}->asOrderedSet()");

		/*
		 * Bag and Set are not ordered, simply check that the result is an
		 * OrderedSet and it contains all needed values.
		 */
		ocl.assertResultContainsAll(null, "OrderedSet{1, 2.0, '3'}", "Set{1, 2.0, '3'}->asOrderedSet()");
		ocl.assertResultContainsAll(null, "OrderedSet{1, 2.0, '3'}", "Bag{1, 2.0, '3'}->asOrderedSet()");

		ocl.assertQueryResults(null, "OrderedSet{'a', 'b', 'c'}", "Sequence{'a', 'b', 'c', 'b'}->asOrderedSet()");
		ocl.assertResultContainsAll(null, "OrderedSet{'a', 'b', 'c'}", "Bag{'a', 'b', 'c', 'b'}->asOrderedSet()");
		ocl.assertResultContainsAll(null, "OrderedSet{'a', 'b', 'c'}", "Set{'a', 'b', 'c', 'b'}->asOrderedSet()");
		ocl.assertQueryResults(null, "OrderedSet{'a', 'b', 'c'}", "OrderedSet{'a', 'b', 'c', 'b'}->asOrderedSet()");
		ocl.dispose();
	}

	@Test public void testCollectionAsSequence() {
		TestOCL ocl = createOCL();

		ocl.assertQueryResults(null, "Sequence{1, 2.0, '3'}", "Sequence{1, 2.0, '3'}->asSequence()");
		ocl.assertQueryResults(null, "Sequence{1, 2.0, '3'}", "OrderedSet{1, 2.0, '3'}->asSequence()");

		/*
		 * Bag and Set are not ordered, simply check that the result is a
		 * Sequence and it contains all needed values.
		 */
		ocl.assertResultContainsAll(null, "Sequence{1, 2.0, '3'}", "Bag{1, 2.0, '3'}->asSequence()");
		ocl.assertResultContainsAll(null, "Sequence{1, 2.0, '3'}", "Set{1, 2.0, '3'}->asSequence()");
		ocl.dispose();
	}

	@Test public void testCollectionAsSet() {
		TestOCL ocl = createOCL();

		ocl.assertQueryResults(null, "Set{1, 2.0, '3'}", "Sequence{1, 2.0, '3'}->asSet()");
		ocl.assertResultContainsAll(null, "Set{1, 2.0, '3'}", "Bag{1, 2.0, '3'}->asSet()");
		ocl.assertResultContainsAll(null, "Set{1, 2.0, '3'}", "Set{1, 2.0, '3'}->asSet()");
		ocl.assertQueryResults(null, "Set{1, 2.0, '3'}", "OrderedSet{1, 2.0, '3'}->asSet()");

		ocl.assertQueryResults(null, "Set{'a', 'b', 'c'}", "Sequence{'a', 'b', 'c', 'b'}->asSet()");
		ocl.assertQueryResults(null, "Set{'a', 'b', 'c'}", "Bag{'a', 'b', 'c', 'b'}->asSet()");
		ocl.assertQueryResults(null, "Set{'a', 'b', 'c'}", "Set{'a', 'b', 'c', 'b'}->asSet()");
		ocl.assertQueryResults(null, "Set{'a', 'b', 'c'}", "OrderedSet{'a', 'b', 'c', 'b'}->asSet()");
		ocl.dispose();
	}

	@Test public void testCollectionEqualOrderedXOrdered() {
		TestOCL ocl = createOCL();
		// same order, same quantities
		ocl.assertQueryFalse(null, "Sequence{4, 5, 'test'} = OrderedSet{4, 5, 'test', 5}");
		ocl.assertQueryFalse(null, "OrderedSet{4, 5, 'test', 5} = Sequence{4, 5, 'test'}");

		// distinct order, same quantities
		ocl.assertQueryFalse(null, "Sequence{4, 5, 'test'} = Sequence{4, 'test', 5}");
		ocl.assertQueryFalse(null, "Sequence{4, 5, 'test', 5} = Sequence{5, 4, 'test', 5}");
		ocl.assertQueryFalse(null, "OrderedSet{4, 5, 'test', 5} = OrderedSet{4, 'test', 5}");
		ocl.assertQueryFalse(null, "Sequence{4, 5, 'test'} = OrderedSet{5, 4, 'test', 5}");
		ocl.assertQueryFalse(null, "OrderedSet{4, 5, 'test', 5} = Sequence{5, 4, 'test'}");

		// distinct quantities
		ocl.assertQueryFalse(null, "Sequence{4, 5, 'test', 5} = Sequence{4, 5, 'test'}");
		ocl.assertQueryFalse(null, "Sequence{4, 5, 'test', 5} = OrderedSet{4, 5, 'test', 5}");
		ocl.assertQueryFalse(null, "OrderedSet{4, 5, 'test', 5} = Sequence{4, 5, 'test', 5}");
		ocl.dispose();
	}

	@Test public void testCollectionEqualOrderedXUnordered() {
		TestOCL ocl = createOCL();
		// same quantities
		ocl.assertQueryFalse(null, "Sequence{4, 5, 'test'} = Set{4, 'test', 5, 4}");
		ocl.assertQueryFalse(null, "Sequence{4, 5, 'test', 4} = Bag{4, 'test', 5, 4}");
		ocl.assertQueryFalse(null, "OrderedSet{4, 5, 'test', 4} = Set{4, 'test', 5, 4}");
		ocl.assertQueryFalse(null, "OrderedSet{4, 5, 'test', 4} = Bag{4, 'test', 5}");

		// distinct quantities
		ocl.assertQueryFalse(null, "Sequence{4, 5, 'test', 4} = Set{4, 'test', 5, 4}");
		ocl.assertQueryFalse(null, "Sequence{4, 5, 'test'} = Bag{4, 'test', 5, 4}");
		ocl.assertQueryFalse(null, "OrderedSet{4, 5, 'test', 4} = Bag{4, 'test', 5, 4}");
		ocl.dispose();
	}

	@Test public void testCollectionEqualUnorderedXUnordered() {
		TestOCL ocl = createOCL();
		// same quantities
		ocl.assertQueryFalse(null, "Bag{4, 5, 'test'} = Set{4, 'test', 5, 4}");
		ocl.assertQueryFalse(null, "Set{4, 5, 'test', 4} = Bag{4, 'test', 5}");

		// distinct quantities
		ocl.assertQueryFalse(null, "Bag{4, 5, 'test', 4} = Set{4, 'test', 5, 4}");
		ocl.assertQueryFalse(null, "Bag{4, 5, 'test'} = Bag{4, 'test', 5, 4}");
		ocl.assertQueryFalse(null, "Set{4, 5, 'test', 4} = Bag{4, 'test', 5, 4}");
		ocl.dispose();
	}

	@Test public void testCollectionExcludes() {
		TestOCL ocl = createOCL();
		ocl.assertQueryFalse(null, "Sequence{3, 4.0, 'test'}->excludes(3)");
		ocl.assertQueryFalse(null, "Sequence{3, 4.0, 'test'}->excludes('test')");
		ocl.assertQueryFalse(null, "Bag{3, 4.0, 'test'}->excludes(3)");
		ocl.assertQueryFalse(null, "Bag{3, 4.0, 'test'}->excludes('test')");
		ocl.assertQueryFalse(null, "Set{3, 4.0, 'test'}->excludes(3)");
		ocl.assertQueryFalse(null, "Set{3, 4.0, 'test'}->excludes('test')");
		ocl.assertQueryFalse(null, "OrderedSet{3, 4.0, 'test'}->excludes(3)");
		ocl.assertQueryFalse(null, "OrderedSet{3, 4.0, 'test'}->excludes('test')");

		ocl.assertQueryTrue(null, "Sequence{3, 4.0, 'test'}->excludes(3.5)");
		ocl.assertQueryTrue(null, "Bag{3, 4.0, 'test'}->excludes(3.5)");
		ocl.assertQueryTrue(null, "Set{3, 4.0, 'test'}->excludes(3.5)");
		ocl.assertQueryTrue(null, "OrderedSet{3, 4.0, 'test'}->excludes(3.5)");
		ocl.dispose();
	}

	@Test public void testCollectionExcludesAll() {
		TestOCL ocl = createOCL();
		ocl.assertQueryFalse(null, "Sequence{3, 4.0, 'test'}->excludesAll(Sequence{3, 'test'})");
		ocl.assertQueryFalse(null, "Sequence{3, 4.0, 'test'}->excludesAll(Bag{3, 'test'})");
		ocl.assertQueryFalse(null, "Sequence{3, 4.0, 'test'}->excludesAll(Set{3, 'test'})");
		ocl.assertQueryFalse(null, "Sequence{3, 4.0, 'test'}->excludesAll(OrderedSet{3, 'test'})");
		ocl.assertQueryFalse(null, "Bag{3, 4.0, 'test'}->excludesAll(Sequence{3, 'test'})");
		ocl.assertQueryFalse(null, "Bag{3, 4.0, 'test'}->excludesAll(Bag{3, 'test'})");
		ocl.assertQueryFalse(null, "Bag{3, 4.0, 'test'}->excludesAll(Set{3, 'test'})");
		ocl.assertQueryFalse(null, "Bag{3, 4.0, 'test'}->excludesAll(OrderedSet{3, 'test'})");
		ocl.assertQueryFalse(null, "Set{3, 4.0, 'test'}->excludesAll(Sequence{3, 'test'})");
		ocl.assertQueryFalse(null, "Set{3, 4.0, 'test'}->excludesAll(Bag{3, 'test'})");
		ocl.assertQueryFalse(null, "Set{3, 4.0, 'test'}->excludesAll(Set{3, 'test'})");
		ocl.assertQueryFalse(null, "Set{3, 4.0, 'test'}->excludesAll(OrderedSet{3, 'test'})");
		ocl.assertQueryFalse(null, "OrderedSet{3, 4.0, 'test'}->excludesAll(Sequence{3, 'test'})");
		ocl.assertQueryFalse(null, "OrderedSet{3, 4.0, 'test'}->excludesAll(Bag{3, 'test'})");
		ocl.assertQueryFalse(null, "OrderedSet{3, 4.0, 'test'}->excludesAll(Set{3, 'test'})");
		ocl.assertQueryFalse(null, "OrderedSet{3, 4.0, 'test'}->excludesAll(OrderedSet{3, 'test'})");

		ocl.assertQueryTrue(null, "Sequence{3, 4.0, 'test'}->excludesAll(Sequence{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "Sequence{3, 4.0, 'test'}->excludesAll(Bag{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "Sequence{3, 4.0, 'test'}->excludesAll(Set{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "Sequence{3, 4.0, 'test'}->excludesAll(OrderedSet{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "Bag{3, 4.0, 'test'}->excludesAll(Sequence{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "Bag{3, 4.0, 'test'}->excludesAll(Bag{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "Bag{3, 4.0, 'test'}->excludesAll(Set{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "Bag{3, 4.0, 'test'}->excludesAll(OrderedSet{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "Set{3, 4.0, 'test'}->excludesAll(Sequence{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "Set{3, 4.0, 'test'}->excludesAll(Bag{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "Set{3, 4.0, 'test'}->excludesAll(Set{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "Set{3, 4.0, 'test'}->excludesAll(OrderedSet{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "OrderedSet{3, 4.0, 'test'}->excludesAll(Sequence{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "OrderedSet{3, 4.0, 'test'}->excludesAll(Bag{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "OrderedSet{3, 4.0, 'test'}->excludesAll(Set{3.5, 'TEST'})");
		ocl.assertQueryTrue(null, "OrderedSet{3, 4.0, 'test'}->excludesAll(OrderedSet{3.5, 'TEST'})");
		ocl.dispose();
	}

	@Test public void testCollectionExcluding() {
		TestOCL ocl = createOCL();
		/*
		 * FIXME OMG-issue to add OrderedSet::excluding
		 * since it's defined in oclstdlib.ecore. However the defined
		 * "OrderedSet::excluding(T) : Set" should be
		 * "OrderedSet::excluding(T) : OrderedSet"
		 */

		ocl.assertQueryResults(null, "OrderedSet{'a', 'c'}", "OrderedSet{'a', 'b', 'c'}->excluding('b')");
		ocl.assertQueryResults(null, "Sequence{1,3,4}", "Sequence{1..4}->excluding(2)");
		ocl.assertQueryResults(null, "OrderedSet{1,3,4}", "OrderedSet{1..4}->excluding(2)");
		ocl.assertQueryResults(null, "Sequence{1..3,6..9}", "Sequence{1..4,6,7..9}->excluding(4)");
		ocl.assertQueryResults(null, "OrderedSet{1..3,6..9}", "OrderedSet{1..4,6,7..9}->excluding(4)");
		ocl.assertQueryResults(null, "OrderedSet{'a', 'b'}", "OrderedSet{'a', null, 'b'}->excluding(null)");
		ocl.dispose();
	}

	@Test public void testCollectionFirst() {
		TestOCL ocl = createOCL();
		ocl.assertQueryEquals(null, 1, "Sequence{1, 2.0, '3'}->first()");
		ocl.assertQueryEquals(null, 1, "OrderedSet{1, 2.0, '3'}->first()");
		ocl.dispose();
	}

	@Test public void testCollectionIncludes() {
		TestOCL ocl = createOCL();
		ocl.assertQueryTrue(null, "Sequence{3, 4.0, 'test'}->includes(3)");
		ocl.assertQueryTrue(null, "Sequence{3, 4.0, 'test'}->includes('test')");
		ocl.assertQueryTrue(null, "Bag{3, 4.0, 'test'}->includes(3)");
		ocl.assertQueryTrue(null, "Bag{3, 4.0, 'test'}->includes('test')");
		ocl.assertQueryTrue(null, "Set{3, 4.0, 'test'}->includes(3)");
		ocl.assertQueryTrue(null, "Set{3, 4.0, 'test'}->includes('test')");
		ocl.assertQueryTrue(null, "OrderedSet{3, 4.0, 'test'}->includes(3)");
		ocl.assertQueryTrue(null, "OrderedSet{3, 4.0, 'test'}->includes('test')");

		ocl.assertQueryFalse(null, "Sequence{3, 4.0, 'test'}->includes(3.5)");
		ocl.assertQueryFalse(null, "Bag{3, 4.0, 'test'}->includes(3.5)");
		ocl.assertQueryFalse(null, "Set{3, 4.0, 'test'}->includes(3.5)");
		ocl.assertQueryFalse(null, "OrderedSet{3, 4.0, 'test'}->includes(3.5)");
		ocl.dispose();
	}

	@Test public void testCollectionIncludesAll() {
		TestOCL ocl = createOCL();
		ocl.assertQueryTrue(null, "Sequence{3, 4.0, 'test'}->includesAll(Sequence{3, 'test'})");
		ocl.assertQueryTrue(null, "Sequence{3, 4.0, 'test'}->includesAll(Bag{3, 'test'})");
		ocl.assertQueryTrue(null, "Sequence{3, 4.0, 'test'}->includesAll(Set{3, 'test'})");
		ocl.assertQueryTrue(null, "Sequence{3, 4.0, 'test'}->includesAll(OrderedSet{3, 'test'})");
		ocl.assertQueryTrue(null, "Bag{3, 4.0, 'test'}->includesAll(Sequence{3, 'test'})");
		ocl.assertQueryTrue(null, "Bag{3, 4.0, 'test'}->includesAll(Bag{3, 'test'})");
		ocl.assertQueryTrue(null, "Bag{3, 4.0, 'test'}->includesAll(Set{3, 'test'})");
		ocl.assertQueryTrue(null, "Bag{3, 4.0, 'test'}->includesAll(OrderedSet{3, 'test'})");
		ocl.assertQueryTrue(null, "Set{3, 4.0, 'test'}->includesAll(Sequence{3, 'test'})");
		ocl.assertQueryTrue(null, "Set{3, 4.0, 'test'}->includesAll(Bag{3, 'test'})");
		ocl.assertQueryTrue(null, "Set{3, 4.0, 'test'}->includesAll(Set{3, 'test'})");
		ocl.assertQueryTrue(null, "Set{3, 4.0, 'test'}->includesAll(OrderedSet{3, 'test'})");
		ocl.assertQueryTrue(null, "OrderedSet{3, 4.0, 'test'}->includesAll(Sequence{3, 'test'})");
		ocl.assertQueryTrue(null, "OrderedSet{3, 4.0, 'test'}->includesAll(Bag{3, 'test'})");
		ocl.assertQueryTrue(null, "OrderedSet{3, 4.0, 'test'}->includesAll(Set{3, 'test'})");
		ocl.assertQueryTrue(null, "OrderedSet{3, 4.0, 'test'}->includesAll(OrderedSet{3, 'test'})");

		ocl.assertQueryFalse(null, "Sequence{3, 4.0, 'test'}->includesAll(Sequence{3.5, 'test'})");
		ocl.assertQueryFalse(null, "Sequence{3, 4.0, 'test'}->includesAll(Bag{3.5, 'test'})");
		ocl.assertQueryFalse(null, "Sequence{3, 4.0, 'test'}->includesAll(Set{3.5, 'test'})");
		ocl.assertQueryFalse(null, "Sequence{3, 4.0, 'test'}->includesAll(OrderedSet{3.5, 'test'})");
		ocl.assertQueryFalse(null, "Bag{3, 4.0, 'test'}->includesAll(Sequence{3.5, 'test'})");
		ocl.assertQueryFalse(null, "Bag{3, 4.0, 'test'}->includesAll(Bag{3.5, 'test'})");
		ocl.assertQueryFalse(null, "Bag{3, 4.0, 'test'}->includesAll(Set{3.5, 'test'})");
		ocl.assertQueryFalse(null, "Bag{3, 4.0, 'test'}->includesAll(OrderedSet{3.5, 'test'})");
		ocl.assertQueryFalse(null, "Set{3, 4.0, 'test'}->includesAll(Sequence{3.5, 'test'})");
		ocl.assertQueryFalse(null, "Set{3, 4.0, 'test'}->includesAll(Bag{3.5, 'test'})");
		ocl.assertQueryFalse(null, "Set{3, 4.0, 'test'}->includesAll(Set{3.5, 'test'})");
		ocl.assertQueryFalse(null, "Set{3, 4.0, 'test'}->includesAll(OrderedSet{3.5, 'test'})");
		ocl.assertQueryFalse(null, "OrderedSet{3, 4.0, 'test'}->includesAll(Sequence{3.5, 'test'})");
		ocl.assertQueryFalse(null, "OrderedSet{3, 4.0, 'test'}->includesAll(Bag{3.5, 'test'})");
		ocl.assertQueryFalse(null, "OrderedSet{3, 4.0, 'test'}->includesAll(Set{3.5, 'test'})");
		ocl.assertQueryFalse(null, "OrderedSet{3, 4.0, 'test'}->includesAll(OrderedSet{3.5, 'test'})");
		ocl.dispose();
	}

	@Test public void testCollectionIncluding() {
		TestOCL ocl = createOCL();
		/*
		 * FIXME OMG-issue to add OrderedSet::including
		 * since it's defined in oclstdlib.ecore. However the defined
		 * "OrderedSet::including(T) : Set" should be
		 * "OrderedSet::including(T) : OrderedSet"
		 */
		ocl.assertQueryResults(null, "Sequence{'a', 'b', 'c'}", "Sequence{'a', 'b'}->including('c')");
		ocl.assertQueryResults(null, "OrderedSet{'a', 'b', 'c'}", "OrderedSet{'a', 'b'}->including('c')");
		ocl.assertQueryResults(null, "OrderedSet{1..2,3..4}", "OrderedSet{1..4}->including(4)");
		ocl.assertQueryResults(null, "Sequence{1..2,3..4,4}", "Sequence{1..4}->including(4)");
		ocl.assertQueryResults(null, "Sequence{1..5}", "Sequence{1..4}->including(5)");
		ocl.assertQueryResults(null, "Sequence{1..3,4,6}", "Sequence{1..4}->including(6)");
		ocl.assertQueryResults(null, "Sequence{1..4,0}", "Sequence{1..4}->including(0)");
		ocl.dispose();
	}

	@Test public void testCollectionIntersection() {
		TestOCL ocl = createOCL();
		// Duplicates
		ocl.assertQueryResults(null, "Set{'a', 'b'}", "Set{'a', 'b', 'a'}->intersection(Set{'a', 'b', 'c'})");
		ocl.assertQueryResults(null, "Set{'a', 'b'}", "Set{'a', 'b', 'a'}->intersection(Bag{'a', 'b', 'c'})");
		ocl.assertQueryResults(null, "Set{'a', 'b'}", "Bag{'a', 'b', 'a'}->intersection(Set{'a', 'b', 'c'})");

		ocl.assertQueryResults(null, "Bag{'a', 'b'}", "Bag{'a', 'b', 'a'}->intersection(Bag{'a', 'b'})");
		ocl.assertQueryResults(null, "Bag{'a', 'b'}", "Bag{'a', 'b'}->intersection(Bag{'a', 'b', 'a'})");
		ocl.assertQueryResults(null, "Bag{'a', 'b'}", "Bag{'a', 'b', 'a'}->intersection(Bag{'a', 'b', 'c'})");

		ocl.assertQueryResults(null, "Bag{'a'}", "Bag{'a', 'a', 'a', 'a'}->intersection(Bag{'a', 'b', 'b'})");
		ocl.dispose();
	}

	@Test public void testCollectionMinus() {
		TestOCL ocl = createOCL();
		ocl.assertQueryResults(null, "Set{'b'}", "Set{'a', 'b', 'c'} - Set{'c', 'a'}");
		ocl.assertQueryResults(null, "OrderedSet{'b'}", "OrderedSet{'a', 'b', 'c'} - Set{'c', 'a'}");
		// null collection element
		ocl.assertQueryResults(null, "Set{'a'}", "Set{'a', null} - Set{'c', null}");
		ocl.dispose();
	}

	@Test public void testCollectionNotEmpty() {
		TestOCL ocl = createOCL();
		ocl.assertQueryTrue(null, "Sequence{4, 4, 'test'}->notEmpty()");
		ocl.assertQueryTrue(null, "Bag{4, 4, 'test'}->notEmpty()");
		ocl.assertQueryTrue(null, "Set{4, 4, 'test'}->notEmpty()");
		ocl.assertQueryTrue(null, "OrderedSet{4, 4, 'test'}->notEmpty()");

		ocl.assertQueryTrue(null, "'test'->notEmpty()");
		ocl.assertQueryTrue(null, "''->notEmpty()");
		ocl.dispose();
	}

	@Test public void testCollectionPrepend() {
		TestOCL ocl = createOCL();
		ocl.assertQueryResults(null, "Sequence{'c', 'a', 'b'}", "Sequence{'a', 'b'}->prepend('c')");
		ocl.assertQueryResults(null, "OrderedSet{'c', 'a', 'b'}", "OrderedSet{'a', 'b'}->prepend('c')");
		// null collection element
		ocl.assertQueryResults(null, "Sequence{null, 'a', null, 'b'}", "Sequence{'a', null, 'b'}->prepend(null)");
		ocl.assertQueryResults(null, "OrderedSet{null, 'a', 'b'}", "OrderedSet{'a', null, 'b'}->prepend(null)");
		ocl.dispose();
	}

	@Test public void testCollectionSize() {
		TestOCL ocl = createOCL();
		ocl.assertQueryEquals(null, 4, "Sequence{4, 4, 5, 'test'}->size()");
		ocl.assertQueryEquals(null, 4, "Bag{4, 4, 5, 'test'}->size()");
		// null collection element
		ocl.assertQueryEquals(null, 4, "Sequence{'a', 'b', null, null}->size()");
		ocl.assertQueryEquals(null, 4, "Bag{'a', 'b', null, null}->size()");
		ocl.dispose();
	}
}
