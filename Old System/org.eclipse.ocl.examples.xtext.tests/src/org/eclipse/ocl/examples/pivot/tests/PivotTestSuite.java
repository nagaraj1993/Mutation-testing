/*******************************************************************************
 * Copyright (c) 2011, 2018 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bugs 243079, 244948, 244886, 245619
 *   E.D.Willink - Bug 191689, 254919, 296409, 298634
 *   Obeo - Bug 291310
 *   E.D.Willink (CEA LIST) - Bug 388529
 *******************************************************************************/

package org.eclipse.ocl.examples.pivot.tests;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.ListIterator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.xtext.tests.TestCaseAppender;
import org.eclipse.ocl.examples.xtext.tests.TestUtil;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.resource.StandaloneProjectMap;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.ocl.pivot.util.Visitable;
import org.eclipse.ocl.pivot.utilities.NameUtil;
import org.eclipse.ocl.pivot.utilities.OCL;

import junit.framework.TestSuite;

/**
 * Default test framework.
 */
public abstract class PivotTestSuite extends PivotTestCaseWithAutoTearDown
{
	// set this variable true when testing for memory leaks
	private static boolean DISPOSE_RESOURCE_SET = false;
	//	protected static int testCounter = 0;

	public static final @NonNull String ORG_ECLIPSE_OCL_EXAMPLES_XTEXT_TESTRESULTS = "org.eclipse.ocl.examples.xtext.tests";

	public static final class CheckedTestSuite extends TestSuite {

		public CheckedTestSuite(String name) {
			super(name);
		}

		public void createTestSuite(Class<? extends PivotTestSuite> testClass, String testName) {
			addTest(new TestSuite(testClass, testName));
		}

		public void addTestSuite(CheckedTestSuite suite) {
			addTest(suite);
		}
	}
	/*	private static final class TestCaseAppender extends ConsoleAppender {

		public TestCaseAppender() {
			super(new SimpleLayout(), SYSTEM_OUT);
			setName("TestHarness");
		}

		@Override
		public void append(LoggingEvent event) {
			if (event.getLevel().isGreaterOrEqual(Level.INFO)) {
				String renderedMessage = event.getRenderedMessage();
				ThrowableInformation throwableInformation = event.getThrowableInformation();
				Throwable throwable = throwableInformation != null ? throwableInformation.getThrowable() : null;
				throw new Error(renderedMessage, throwable);
			}
//			super.append(event);
		}
	} */

	//	protected static Logger rootLogger = Logger.getRootLogger();
	//	protected static TestCaseAppender testCaseAppender = new TestCaseAppender();
	//	{
	//		rootLogger.addAppender(testCaseAppender);
	//	}

	protected static boolean noDebug = false;
	protected static ResourceSet resourceSet;
	private static ArrayList<Resource> standardResources;
	protected static int testCounter = 0;

	private static boolean initialized = false;

	public static void debugPrintln(String string) {
		if (!noDebug) {
			System.out.println(string);
		}
	}

	public static boolean eclipseIsRunning() {
		try {
			Class<?> platformClass = Class.forName("org.eclipse.core.runtime.Platform");
			Method isRunningMethod = platformClass.getDeclaredMethod("isRunning");
			return Boolean.TRUE.equals(isRunningMethod.invoke(null));
		} catch (Exception e) {
		}
		return false;
	}

	public static void initializeStandalone() {
		if (initialized)
			return;
		initialized = true;
	}

	protected static boolean useCodeGen;

	protected PivotTestSuite() {
		PivotTestSuite.useCodeGen = false;
	}

	protected PivotTestSuite(boolean useCodeGen) {
		PivotTestSuite.useCodeGen = useCodeGen;
	}

	/**
	 * Asserts that the <code>toString</code> representation of an AST node as
	 * generated by the toString visitor does not throw a run-time exception
	 * and is not <code>null</code>.
	 *
	 * @param node a visitable AST node
	 */
	protected void assertValidToString(@NonNull Visitable node) {
		try {
			String toString = node.toString();
			assertNotNull("ToStringVisitorImpl returned null", toString);
		} catch (RuntimeException e) {
			e.printStackTrace();
			fail("ToStringVisitorImpl threw an exception: " + e.getLocalizedMessage());
		}
	}

	/**
	 * This can be called by subclasses to provide a meaningful error message
	 * when the tests are run with an encoding distinct from UTF-8.
	 */
	protected void checkForUTF8Encoding() {
		String testCharacter = "´";
		int length = testCharacter.length();
		if ((length != 1) || (testCharacter.charAt(0) != 0xB4)) {
			StringBuilder s = new StringBuilder();
			s.append("The Resource text file encoding should be set to UTF-8: test character was");
			for (int i = 0; i < length; i++){
				s.append(" ");
				s.append(Integer.toHexString(testCharacter.charAt(i)));
			}
			s.append(" rather than B4");
			fail(s.toString());
		}
	}

	protected @NonNull TestOCL createOCL() throws Exception {
		return new TestOCL(getTestFileSystem(), getTestPackageName(), getName(), useCodeGen ? getProjectMap() : OCL.NO_PROJECTS);
	}

	public @NonNull ResourceSet createResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			"ecore", new EcoreResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(PivotPackage.eINSTANCE.getNsURI(), PivotPackage.eINSTANCE);
		return resourceSet;
	}

	protected void disposeResourceSet() {
		ResourceSet resourceSet2 = resourceSet;
		if (resourceSet2 != null) {
			StandaloneProjectMap projectMap = basicGetProjectMap();
			if (projectMap != null) {
				projectMap.unload(resourceSet2);
			}
			for (Resource res : resourceSet2.getResources()) {
				res.unload();
				res.eAdapters().clear();
			}
			resourceSet2.getResources().clear();
			resourceSet2.eAdapters().clear();
			resourceSet = null;
		}
		standardResources = null;
	}

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Attribute</b></em>' reference list.
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 */
	protected Property getAttribute(org.eclipse.ocl.pivot.@NonNull Class classifier, @NonNull String name, @NonNull Type type) {
		Property feature = NameUtil.getNameable(classifier.getOwnedProperties(), name);
		if (feature == null)
			return null;
		// check type
		return feature;
	}

	protected void initializeResourceSet() {
		resourceSet = createResourceSet();
		standardResources = new ArrayList<Resource>(resourceSet.getResources());
	}

	public static void resetCounter() throws Exception {
		testCounter = 0;
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		TestCaseAppender.INSTANCE.install();
		OCLstdlib.install();
		TestUtil.doEssentialOCLSetup();
		if ((resourceSet != null) && DISPOSE_RESOURCE_SET) {
			disposeResourceSet();
		}
		if (!initialized) {
			noDebug = System.getProperty(PLUGIN_ID + ".nodebug") != null;
			if (!eclipseIsRunning()) {
				initializeStandalone();
			}
		}
		if (resourceSet == null) {
			initializeResourceSet();
		}
	}

	@Override
	protected void tearDown() throws Exception {
		//
		//	Unload any resources that a test may have loaded.
		//
		for (ListIterator<Resource> i = resourceSet.getResources().listIterator(); i.hasNext(); ) {
			Resource res = i.next();
			if (!standardResources.contains(res)) {
				i.remove();
				res.unload();
				res.eAdapters().clear();
			}
		}
		autoTearDown();
		disposeResourceSet();
		//		unloadResourceSet(resourceSet);
		//		resourceSet = null;
		super.tearDown();
	}
}
