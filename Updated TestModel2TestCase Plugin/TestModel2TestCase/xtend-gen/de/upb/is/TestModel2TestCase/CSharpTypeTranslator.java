package de.upb.is.TestModel2TestCase;

import com.google.common.base.Objects;
import de.upb.is.TestModel2TestCase.IdentifierProvider;
import de.upb.is.TestModel2TestCase.TypeTranslator;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

@SuppressWarnings("all")
public class CSharpTypeTranslator extends TypeTranslator {
  public static CSharpTypeTranslator INSTANCE = new CSharpTypeTranslator(new IdentifierProvider());
  
  public CSharpTypeTranslator(final IdentifierProvider _id) {
    super(_id);
  }
  
  @Override
  public String voidType(final EGenericType type) {
    return "void";
  }
  
  @Override
  public String wildCardGenerics(final EGenericType type) {
    return "object";
  }
  
  @Override
  public String mapComplexType(final EDataType type) {
    String _name = type.getName();
    boolean _matched = false;
    String _name_1 = EcorePackage.Literals.EENUMERATOR.getName();
    if (Objects.equal(_name, _name_1)) {
      _matched=true;
      return "EEnumerator";
    }
    if (!_matched) {
      String _name_2 = EcorePackage.Literals.ERESOURCE.getName();
      if (Objects.equal(_name, _name_2)) {
        _matched=true;
        return "Resource";
      }
    }
    if (!_matched) {
      String _name_3 = EcorePackage.Literals.ETREE_ITERATOR.getName();
      if (Objects.equal(_name, _name_3)) {
        _matched=true;
        return "TreeIterator";
      }
    }
    if (!_matched) {
      String _name_4 = EcorePackage.Literals.EE_LIST.getName();
      if (Objects.equal(_name, _name_4)) {
        _matched=true;
        return "List";
      }
    }
    return null;
  }
  
  @Override
  public String mapPrimitiveType(final EDataType type) {
    if ((((type.eContainer() instanceof EPackage) && (!Objects.equal(((EPackage) type.eContainer()).getNsURI(), null))) && 
      ((EPackage) type.eContainer()).getNsURI().equals("http://www.eclipse.org/ocl/1.1.0/oclstdlib.ecore"))) {
      String _name = type.getName();
      if (_name != null) {
        switch (_name) {
          case "Integer":
            return "int";
          case "String":
            return "string";
          case "Real":
            return "float";
          case "Boolean":
            return "bool";
        }
      }
    }
    String _name_1 = type.getName();
    boolean _matched = false;
    String _name_2 = EcorePackage.Literals.EBIG_DECIMAL.getName();
    if (Objects.equal(_name_1, _name_2)) {
      _matched=true;
      return "System.Numerics.BigInteger";
    }
    if (!_matched) {
      String _name_3 = EcorePackage.Literals.EBIG_INTEGER.getName();
      if (Objects.equal(_name_1, _name_3)) {
        _matched=true;
        return "System.Numerics.BigInteger";
      }
    }
    if (!_matched) {
      String _name_4 = EcorePackage.Literals.EBOOLEAN.getName();
      if (Objects.equal(_name_1, _name_4)) {
        _matched=true;
        return "bool";
      }
    }
    if (!_matched) {
      String _name_5 = EcorePackage.Literals.EBOOLEAN_OBJECT.getName();
      if (Objects.equal(_name_1, _name_5)) {
        _matched=true;
        return "System.Boolean";
      }
    }
    if (!_matched) {
      String _name_6 = EcorePackage.Literals.EBYTE.getName();
      if (Objects.equal(_name_1, _name_6)) {
        _matched=true;
        return "byte";
      }
    }
    if (!_matched) {
      String _name_7 = EcorePackage.Literals.EBYTE_ARRAY.getName();
      if (Objects.equal(_name_1, _name_7)) {
        _matched=true;
        return "byte[]";
      }
    }
    if (!_matched) {
      String _name_8 = EcorePackage.Literals.EBYTE_OBJECT.getName();
      if (Objects.equal(_name_1, _name_8)) {
        _matched=true;
        return "System.Byte";
      }
    }
    if (!_matched) {
      String _name_9 = EcorePackage.Literals.ECHAR.getName();
      if (Objects.equal(_name_1, _name_9)) {
        _matched=true;
        return "char";
      }
    }
    if (!_matched) {
      String _name_10 = EcorePackage.Literals.ECHARACTER_OBJECT.getName();
      if (Objects.equal(_name_1, _name_10)) {
        _matched=true;
        return "System.Char";
      }
    }
    if (!_matched) {
      String _name_11 = EcorePackage.Literals.EDATE.getName();
      if (Objects.equal(_name_1, _name_11)) {
        _matched=true;
        return "System.DateTime";
      }
    }
    if (!_matched) {
      String _name_12 = EcorePackage.Literals.EDOUBLE.getName();
      if (Objects.equal(_name_1, _name_12)) {
        _matched=true;
        return "double";
      }
    }
    if (!_matched) {
      String _name_13 = EcorePackage.Literals.EDOUBLE_OBJECT.getName();
      if (Objects.equal(_name_1, _name_13)) {
        _matched=true;
        return "System.Double";
      }
    }
    if (!_matched) {
      String _name_14 = EcorePackage.Literals.EE_LIST.getName();
      if (Objects.equal(_name_1, _name_14)) {
        _matched=true;
        return "List";
      }
    }
    if (!_matched) {
      String _name_15 = EcorePackage.Literals.ELONG.getName();
      if (Objects.equal(_name_1, _name_15)) {
        _matched=true;
        return "long";
      }
    }
    if (!_matched) {
      String _name_16 = EcorePackage.Literals.ELONG_OBJECT.getName();
      if (Objects.equal(_name_1, _name_16)) {
        _matched=true;
        return "System.Int64";
      }
    }
    if (!_matched) {
      String _name_17 = EcorePackage.Literals.EFLOAT.getName();
      if (Objects.equal(_name_1, _name_17)) {
        _matched=true;
        return "float";
      }
    }
    if (!_matched) {
      String _name_18 = EcorePackage.Literals.EFLOAT_OBJECT.getName();
      if (Objects.equal(_name_1, _name_18)) {
        _matched=true;
        return "System.Single";
      }
    }
    if (!_matched) {
      String _name_19 = EcorePackage.Literals.EINT.getName();
      if (Objects.equal(_name_1, _name_19)) {
        _matched=true;
        return "int";
      }
    }
    if (!_matched) {
      String _name_20 = EcorePackage.Literals.EINTEGER_OBJECT.getName();
      if (Objects.equal(_name_1, _name_20)) {
        _matched=true;
        return "System.Int32";
      }
    }
    if (!_matched) {
      String _name_21 = EcorePackage.Literals.EJAVA_OBJECT.getName();
      if (Objects.equal(_name_1, _name_21)) {
        _matched=true;
        return "object";
      }
    }
    if (!_matched) {
      String _name_22 = EcorePackage.Literals.EJAVA_CLASS.getName();
      if (Objects.equal(_name_1, _name_22)) {
        _matched=true;
        return "System.Type";
      }
    }
    if (!_matched) {
      String _name_23 = EcorePackage.Literals.ESHORT.getName();
      if (Objects.equal(_name_1, _name_23)) {
        _matched=true;
        return "short";
      }
    }
    if (!_matched) {
      String _name_24 = EcorePackage.Literals.ESHORT_OBJECT.getName();
      if (Objects.equal(_name_1, _name_24)) {
        _matched=true;
        return "System.Single";
      }
    }
    if (!_matched) {
      String _name_25 = EcorePackage.Literals.ESTRING.getName();
      if (Objects.equal(_name_1, _name_25)) {
        _matched=true;
        return "string";
      }
    }
    return null;
  }
  
  @Override
  public String classType(final EGenericType type) {
    return "Type";
  }
}
