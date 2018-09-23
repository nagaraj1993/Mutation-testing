/*******************************************************************************
 * Copyright (c) 2010, 2016 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/

package org.eclipse.ocl.examples.test.xtext;

import org.eclipse.ocl.examples.pivot.tests.EvaluateBooleanOperationsTest4;
import org.eclipse.ocl.examples.pivot.tests.EvaluateCollectionOperationsTest4;
import org.eclipse.ocl.examples.pivot.tests.EvaluateConstructsTest4;
import org.eclipse.ocl.examples.pivot.tests.EvaluateNumericOperationsTest4;
import org.eclipse.ocl.examples.pivot.tests.EvaluateStringOperationsTest4;
import org.eclipse.ocl.examples.pivot.tests.EvaluateUMLTest4;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Tests for the Pivot Evaluation.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	EvaluateBooleanOperationsTest4.class,
	EvaluateCollectionOperationsTest4.class,
	EvaluateConstructsTest4.class,
	EvaluateNumericOperationsTest4.class,
	EvaluateStringOperationsTest4.class,
	EvaluateUMLTest4.class,
	})

public class AllEvaluationTests {}
