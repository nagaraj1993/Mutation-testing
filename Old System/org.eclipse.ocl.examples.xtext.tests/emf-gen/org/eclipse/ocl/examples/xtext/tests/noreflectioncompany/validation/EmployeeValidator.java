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
 *
 * $Id$
 */
package org.eclipse.ocl.examples.xtext.tests.noreflectioncompany.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.examples.xtext.tests.noreflectioncompany.Company;
import org.eclipse.ocl.examples.xtext.tests.noreflectioncompany.Employee;

/**
 * A sample validator interface for {@link org.eclipse.ocl.examples.xtext.tests.noreflectioncompany.Employee}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EmployeeValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateManager(Employee value);
	boolean validateCompany(Company value);
	boolean validateDirectReports(EList<Employee> value);
	boolean validateAllReports(EList<Employee> value);
	boolean validateReportingChain(EList<Employee> value);
	boolean validateHasNameAsAttribute(boolean value);
}
