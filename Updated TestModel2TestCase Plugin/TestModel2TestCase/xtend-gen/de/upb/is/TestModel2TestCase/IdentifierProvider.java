package de.upb.is.TestModel2TestCase;

import com.google.common.base.Objects;
import java.util.Iterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class IdentifierProvider extends EcoreSwitch<String> {
  public String escapeKeyword(final String id) {
    return id;
  }
  
  @Override
  public String caseENamedElement(final ENamedElement element) {
    return element.getName();
  }
  
  private String _caseEPackage(final EPackage epackage) {
    String name = StringExtensions.toFirstUpper(epackage.getName());
    return name;
  }
  
  @Override
  public String caseEPackage(final EPackage package_) {
    return this._caseEPackage(package_);
  }
  
  @Override
  public String doSwitch(final EObject eobject) {
    return this.escapeKeyword(super.doSwitch(eobject));
  }
  
  public String privateEStructuralFeature(final EStructuralFeature feature) {
    String name = feature.getName();
    String first = Character.valueOf(name.charAt(0)).toString().toLowerCase();
    String _substring = name.substring(1);
    String result = (("_" + first) + _substring);
    return this.escapeKeyword(result);
  }
  
  public String literal(final EClassifier eclass) {
    return eclass.getName().toUpperCase();
  }
  
  public String literal(final EOperation eoperation) {
    EClass eclass = eoperation.getEContainingClass();
    StringBuffer parameters = new StringBuffer();
    for (Iterator<EParameter> iter = eoperation.getEParameters().iterator(); iter.hasNext();) {
      {
        parameters.append("__");
        parameters.append(iter.next().getName().toUpperCase());
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    String _upperCase = eclass.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("___");
    String _upperCase_1 = eoperation.getName().toUpperCase();
    _builder.append(_upperCase_1);
    _builder.append(parameters);
    return _builder.toString();
  }
  
  public String literal(final EEnum eenum) {
    return eenum.getName().toUpperCase();
  }
  
  public String literal(final EDataType edatatype) {
    return edatatype.getName().toUpperCase();
  }
  
  public String EClassifier_FEATURE_COUNT(final EClassifier eclassifier) {
    String name = eclassifier.getName().toUpperCase();
    return (name + "_FEATURE_COUNT");
  }
  
  public String EClassifier_OPERATION_COUNT(final EClassifier eclassifier) {
    String name = eclassifier.getName().toUpperCase();
    return (name + "_OPERATION_COUNT");
  }
  
  public String literalRef(final EClassifier eclass) {
    StringConcatenation _builder = new StringConcatenation();
    String __caseEPackage = this._caseEPackage(eclass.getEPackage());
    _builder.append(__caseEPackage);
    _builder.append("PackageImpl.Literals.");
    String _literal = this.literal(eclass);
    _builder.append(_literal);
    return _builder.toString();
  }
  
  public String literal(final EClass eclass, final EStructuralFeature feature) {
    String eclassname = eclass.getName().toUpperCase();
    String efeaturename = feature.getName().toUpperCase();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(eclassname);
    _builder.append("_");
    _builder.append(efeaturename);
    return _builder.toString();
  }
  
  public String literal(final EClass eclass, final EOperation feature) {
    String eclassname = eclass.getName().toUpperCase();
    String efeaturename = feature.getName().toUpperCase();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(eclassname);
    _builder.append("_");
    _builder.append(efeaturename);
    return _builder.toString();
  }
  
  public String literalRef(final EClass eclass, final EStructuralFeature feature) {
    String epackagename = this._caseEPackage(feature.getEContainingClass().getEPackage());
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(epackagename);
    _builder.append("PackageImpl.");
    String _literal = this.literal(eclass, feature);
    _builder.append(_literal);
    return _builder.toString();
  }
  
  public String literal(final EStructuralFeature feature) {
    return this.literal(feature.getEContainingClass(), feature);
  }
  
  public String literalRef(final EStructuralFeature feature) {
    return this.literalRef(feature.getEContainingClass(), feature);
  }
  
  /**
   * public def String basicSetEClassifier(EClassifier classifier) {
   * return "basicSet"+classifier.name
   * }
   */
  public String basicSetEReference(final EReference ereference) {
    String name = StringExtensions.toFirstUpper(ereference.getName());
    return ("basicSet" + name);
  }
  
  public String EPackageFactory(final EPackage epackage) {
    String name = StringExtensions.toFirstUpper(epackage.getName());
    return (name + "Factory");
  }
  
  public String EPackageFactoryImpl(final EPackage epackage) {
    String name = StringExtensions.toFirstUpper(epackage.getName());
    return (name + "FactoryImpl");
  }
  
  public String createEClass(final EClass eclass) {
    String name = StringExtensions.toFirstUpper(eclass.getName());
    return ("create" + name);
  }
  
  public String EClassImpl(final EClass eclass) {
    String name = StringExtensions.toFirstUpper(eclass.getName());
    return (name + "Impl");
  }
  
  public String EClassBase(final EClass eclass) {
    String name = StringExtensions.toFirstUpper(eclass.getName());
    return (name + "Base");
  }
  
  public String variable(final EClass eclass) {
    String name = StringExtensions.toFirstUpper(eclass.getName());
    return ("the" + name);
  }
  
  public String EPackagePackage(final EPackage epackage) {
    String name = StringExtensions.toFirstUpper(epackage.getName());
    return (name + "Package");
  }
  
  public String EPackagePackageImpl(final EPackage epackage) {
    String name = StringExtensions.toFirstUpper(epackage.getName());
    return (name + "PackageImpl");
  }
  
  public String EPackageSwitch(final EPackage ePackage) {
    String name = StringExtensions.toFirstUpper(ePackage.getName());
    return (name + "Switch");
  }
  
  public String getEClassifier(final EClassifier e) {
    if ((e instanceof EEnum)) {
      return this.getEEnum(((EEnum) e));
    } else {
      if ((e instanceof EDataType)) {
        return this.getEDataType(((EDataType) e));
      } else {
        if ((e instanceof EClass)) {
          return this.getEClass(((EClass) e));
        }
      }
    }
    return null;
  }
  
  public String getEClass(final EClass eclass) {
    String name = StringExtensions.toFirstUpper(eclass.getName());
    return ("get" + name);
  }
  
  public String getEEnum(final EEnum e) {
    String name = StringExtensions.toFirstUpper(e.getName());
    return ("get" + name);
  }
  
  public String getEDataType(final EDataType e) {
    String name = StringExtensions.toFirstUpper(e.getName());
    return ("get" + name);
  }
  
  public String getEAttribute(final EAttribute e) {
    String classname = StringExtensions.toFirstUpper(e.getEContainingClass().getName());
    String attributename = StringExtensions.toFirstUpper(e.getName());
    return ((("get" + classname) + "_") + attributename);
  }
  
  public String getEOperation(final EOperation e) {
    String classname = StringExtensions.toFirstUpper(e.getEContainingClass().getName());
    String attributename = StringExtensions.toFirstUpper(e.getName());
    StringBuffer parameters = new StringBuffer();
    for (Iterator<EParameter> iter = e.getEParameters().iterator(); iter.hasNext();) {
      {
        parameters.append(StringExtensions.toFirstUpper(iter.next().getName()));
        boolean _hasNext = iter.hasNext();
        if (_hasNext) {
          parameters.append("__");
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("get");
    _builder.append(classname);
    _builder.append("__");
    _builder.append(attributename);
    _builder.append("__");
    _builder.append(parameters);
    return _builder.toString();
  }
  
  public String getEReference(final EReference e) {
    String classname = StringExtensions.toFirstUpper(e.getEContainingClass().getName());
    String attributename = StringExtensions.toFirstUpper(e.getName());
    return ((("get" + classname) + "_") + attributename);
  }
  
  public String EClassEClass(final EClass e) {
    String name = StringExtensions.toFirstUpper(e.getName());
    return (name + "EClass");
  }
  
  public String EEnumEEnum(final EEnum e) {
    String name = StringExtensions.toFirstUpper(e.getName());
    return (name + "EEnum");
  }
  
  public String EDataTypeEDataType(final EDataType e) {
    String name = StringExtensions.toFirstUpper(e.getName());
    return (name + "EDataType");
  }
  
  public String EOperationEOperation(final EOperation e) {
    String name = StringExtensions.toFirstUpper(e.getName());
    return (name + "EOperation");
  }
  
  public String EObject(final EObject eobject) {
    EAttribute idfeature = eobject.eClass().getEIDAttribute();
    String id = "";
    boolean _notEquals = (!Objects.equal(idfeature, null));
    if (_notEquals) {
      id = eobject.eGet(idfeature).toString();
    } else {
      id = Integer.valueOf(eobject.hashCode()).toString();
    }
    String classname = StringExtensions.toFirstLower(eobject.eClass().getName());
    String identifier = ((classname + "_") + id);
    return identifier;
  }
  
  public String validate(final EClassifier eclassifier) {
    String name = StringExtensions.toFirstUpper(eclassifier.getName());
    return ("validate" + name);
  }
  
  public String validate(final EClassifier eclassifier, final String invariant) {
    String name = StringExtensions.toFirstUpper(eclassifier.getName());
    return ((("validate" + name) + "_") + invariant);
  }
  
  public String getEStructuralFeature(final EStructuralFeature eStructuralFeature) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("get");
    String _firstUpper = StringExtensions.toFirstUpper(eStructuralFeature.getName());
    _builder.append(_firstUpper);
    return _builder.toString();
  }
  
  public String isSetEStructuralFeature(final EStructuralFeature eStructuralFeature) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("isSet");
    String _firstUpper = StringExtensions.toFirstUpper(eStructuralFeature.getName());
    _builder.append(_firstUpper);
    return _builder.toString();
  }
  
  public String setEStructuralFeature(final EStructuralFeature eStructuralFeature) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("set");
    String _firstUpper = StringExtensions.toFirstUpper(eStructuralFeature.getName());
    _builder.append(_firstUpper);
    return _builder.toString();
  }
  
  public String edefault(final EAttribute eAttribute) {
    StringConcatenation _builder = new StringConcatenation();
    String _upperCase = eAttribute.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("_EDEFAULT");
    return _builder.toString();
  }
  
  public String getEPackage(final EPackage ePackage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("get");
    String _firstUpper = StringExtensions.toFirstUpper(ePackage.getName());
    _builder.append(_firstUpper);
    return _builder.toString();
  }
  
  public String createEDataTypeFromString(final EDataType eAttribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("create");
    String _firstUpper = StringExtensions.toFirstUpper(eAttribute.getName());
    _builder.append(_firstUpper);
    _builder.append("FromString");
    return _builder.toString();
  }
  
  public String convertEDataTypeToString(final EDataType eAttribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("convert");
    String _firstUpper = StringExtensions.toFirstUpper(eAttribute.getName());
    _builder.append(_firstUpper);
    _builder.append("ToString");
    return _builder.toString();
  }
}
