/*******************************************************************************
 * Copyright (c) 2016 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.ocl.examples.xtext.tests.bug477283.a.asub.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.examples.xtext.tests.bug477283.a.Bug477283APackage;
import org.eclipse.ocl.examples.xtext.tests.bug477283.a.asub.ASub;
import org.eclipse.ocl.examples.xtext.tests.bug477283.a.asub.Bug477283subFactory;
import org.eclipse.ocl.examples.xtext.tests.bug477283.a.asub.Bug477283subPackage;
import org.eclipse.ocl.examples.xtext.tests.bug477283.a.asub.asubsub.Bug477283AsubsubPackage;
import org.eclipse.ocl.examples.xtext.tests.bug477283.a.asub.asubsub.impl.Bug477283AsubsubPackageImpl;
import org.eclipse.ocl.examples.xtext.tests.bug477283.a.impl.Bug477283APackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bug477283subPackageImpl extends EPackageImpl implements Bug477283subPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aSubEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.ocl.examples.xtext.tests.bug477283.a.asub.Bug477283subPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bug477283subPackageImpl() {
		super(eNS_URI, Bug477283subFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Bug477283subPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bug477283subPackage init() {
		if (isInited) return (Bug477283subPackage)EPackage.Registry.INSTANCE.getEPackage(Bug477283subPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBug477283subPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Bug477283subPackageImpl theBug477283subPackage = registeredBug477283subPackage instanceof Bug477283subPackageImpl ? (Bug477283subPackageImpl)registeredBug477283subPackage : new Bug477283subPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Bug477283APackage.eNS_URI);
		Bug477283APackageImpl theBug477283APackage = (Bug477283APackageImpl)(registeredPackage instanceof Bug477283APackageImpl ? registeredPackage : Bug477283APackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Bug477283AsubsubPackage.eNS_URI);
		Bug477283AsubsubPackageImpl theBug477283AsubsubPackage = (Bug477283AsubsubPackageImpl)(registeredPackage instanceof Bug477283AsubsubPackageImpl ? registeredPackage : Bug477283AsubsubPackage.eINSTANCE);

		// Create package meta-data objects
		theBug477283subPackage.createPackageContents();
		theBug477283APackage.createPackageContents();
		theBug477283AsubsubPackage.createPackageContents();

		// Initialize created meta-data
		theBug477283subPackage.initializePackageContents();
		theBug477283APackage.initializePackageContents();
		theBug477283AsubsubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBug477283subPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bug477283subPackage.eNS_URI, theBug477283subPackage);
		return theBug477283subPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASub() {
		return aSubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bug477283subFactory getBug477283subFactory() {
		return (Bug477283subFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aSubEClass = createEClass(ASUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Bug477283AsubsubPackage theBug477283AsubsubPackage = (Bug477283AsubsubPackage)EPackage.Registry.INSTANCE.getEPackage(Bug477283AsubsubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theBug477283AsubsubPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(aSubEClass, ASub.class, "ASub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //Bug477283subPackageImpl
