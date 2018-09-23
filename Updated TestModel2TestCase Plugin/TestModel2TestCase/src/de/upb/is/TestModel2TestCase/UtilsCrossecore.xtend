package de.upb.is.TestModel2TestCase

import java.util.HashSet
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage

class UtilsCrossecore {
	
	
	public static def isEClassifierForEObject(EClassifier eclassifier){
		
		if(eclassifier.name!=null && eclassifier.name=="EObject" && isEcoreEPackage(eclassifier.EPackage)){
			return true;
		}
		return false;
	}
	
	public static def isEcoreEPackage(EPackage epackage){
		if(epackage !=null && epackage.nsURI=="http://www.eclipse.org/emf/2002/Ecore"){
			return true;
		}
		return false;
	}
	
	/**
	 * Removes all EOperations that an EObject inherits from the EObject-Class
	 */
	public static def nonEObjectEOperations(List<EOperation> operations){
		
		var eobjectOperations = new HashSet<EOperation>(EcorePackage.Literals.EOBJECT.EOperations);
		var result = new HashSet<EOperation>(operations);
		result.removeAll(eobjectOperations);
		return result;
	}
	
	/**
	 * Removes all EAttributes that an EObject inherits from the EObject-Class
	 */
	public static def nonEObjectEAttributes(List<EAttribute> operations){
		
		var eobjectOperations = new HashSet<EAttribute>(EcorePackage.Literals.EOBJECT.EAttributes);
		var result = new HashSet<EAttribute>(operations);
		result.removeAll(eobjectOperations);
		return result;
	}
	
	/**
	 * Removes all EReferences that an EObject inherits from the EObject-Class
	 */
	public static def nonEObjectEReferences(List<EReference> operations){
		
		var eobjectOperations = new HashSet<EReference>(EcorePackage.Literals.EOBJECT.EReferences);
		var result = new HashSet<EReference>(operations);
		result.removeAll(eobjectOperations);
		return result;
	}
	



}