package de.upb.is.TestModel2TestCase;

import com.google.common.base.Objects;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

@SuppressWarnings("all")
public class UtilsCrossecore {
  public static boolean isEClassifierForEObject(final EClassifier eclassifier) {
    if ((((!Objects.equal(eclassifier.getName(), null)) && Objects.equal(eclassifier.getName(), "EObject")) && UtilsCrossecore.isEcoreEPackage(eclassifier.getEPackage()))) {
      return true;
    }
    return false;
  }
  
  public static boolean isEcoreEPackage(final EPackage epackage) {
    if (((!Objects.equal(epackage, null)) && Objects.equal(epackage.getNsURI(), "http://www.eclipse.org/emf/2002/Ecore"))) {
      return true;
    }
    return false;
  }
  
  /**
   * Removes all EOperations that an EObject inherits from the EObject-Class
   */
  public static HashSet<EOperation> nonEObjectEOperations(final List<EOperation> operations) {
    EList<EOperation> _eOperations = EcorePackage.Literals.EOBJECT.getEOperations();
    HashSet<EOperation> eobjectOperations = new HashSet<EOperation>(_eOperations);
    HashSet<EOperation> result = new HashSet<EOperation>(operations);
    result.removeAll(eobjectOperations);
    return result;
  }
  
  /**
   * Removes all EAttributes that an EObject inherits from the EObject-Class
   */
  public static HashSet<EAttribute> nonEObjectEAttributes(final List<EAttribute> operations) {
    EList<EAttribute> _eAttributes = EcorePackage.Literals.EOBJECT.getEAttributes();
    HashSet<EAttribute> eobjectOperations = new HashSet<EAttribute>(_eAttributes);
    HashSet<EAttribute> result = new HashSet<EAttribute>(operations);
    result.removeAll(eobjectOperations);
    return result;
  }
  
  /**
   * Removes all EReferences that an EObject inherits from the EObject-Class
   */
  public static HashSet<EReference> nonEObjectEReferences(final List<EReference> operations) {
    EList<EReference> _eReferences = EcorePackage.Literals.EOBJECT.getEReferences();
    HashSet<EReference> eobjectOperations = new HashSet<EReference>(_eReferences);
    HashSet<EReference> result = new HashSet<EReference>(operations);
    result.removeAll(eobjectOperations);
    return result;
  }
}
