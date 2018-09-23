package de.upb.is.TestModel2TestCase;

import com.google.common.base.Objects;
import de.upb.is.TestModel2TestCase.IdentifierProvider;
import de.upb.is.TestModel2TestCase.UtilsCrossecore;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.ecore.AnyType;
import org.eclipse.ocl.ecore.BagType;
import org.eclipse.ocl.ecore.CollectionType;
import org.eclipse.ocl.ecore.OrderedSetType;
import org.eclipse.ocl.ecore.PrimitiveType;
import org.eclipse.ocl.ecore.SequenceType;
import org.eclipse.ocl.ecore.SetType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class TypeTranslator {
  private IdentifierProvider id;
  
  public TypeTranslator(final IdentifierProvider _id) {
    this.id = _id;
  }
  
  public String translateType(final EClassifier eClassifier) {
    StringBuffer result = new StringBuffer();
    boolean _equals = eClassifier.getName().equals(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY.getName());
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("java.util.Map.Entry<String, String>");
      result.append(_builder);
    } else {
      if ((eClassifier instanceof EDataType)) {
        result.append(this.mapDataType(((EDataType) eClassifier)));
      } else {
        result.append(eClassifier.getName());
      }
    }
    return result.toString();
  }
  
  /**
   * Case 1: type is null => void
   * Case 2: type is EClass from EPackage => Use classifier name omitting namespace
   * Case 3: type is OCL collection => Use collection implementation from ocllib package
   * Case 4: type.EClassifier is EJava_Class
   */
  public String translateType(final EGenericType type) {
    if ((type == null)) {
      return this.voidType(type);
    }
    if (((type.getEClassifier() != null) && Objects.equal(type.getEClassifier().getName(), EcorePackage.Literals.EJAVA_CLASS.getName()))) {
      return this.classType(type);
    }
    StringBuffer result = new StringBuffer();
    EClassifier _eClassifier = type.getEClassifier();
    boolean _tripleNotEquals = (_eClassifier != null);
    if (_tripleNotEquals) {
      EClassifier _eRawType = type.getERawType();
      if ((_eRawType instanceof CollectionType)) {
        EClassifier _eRawType_1 = type.getERawType();
        if ((_eRawType_1 instanceof SequenceType)) {
          result.append("Sequence");
        } else {
          EClassifier _eRawType_2 = type.getERawType();
          if ((_eRawType_2 instanceof BagType)) {
            result.append("Bag");
          } else {
            EClassifier _eRawType_3 = type.getERawType();
            if ((_eRawType_3 instanceof OrderedSetType)) {
              result.append("OrderedSet");
            } else {
              EClassifier _eRawType_4 = type.getERawType();
              if ((_eRawType_4 instanceof SetType)) {
                result.append("Set");
              }
            }
          }
        }
        EClassifier _eRawType_5 = type.getERawType();
        EClassifier elementtype = ((CollectionType) _eRawType_5).getElementType();
        if ((elementtype instanceof AnyType)) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("<object>");
          result.append(_builder);
        } else {
          if ((elementtype instanceof PrimitiveType)) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("<");
            String _mapPrimitiveType = this.mapPrimitiveType(((EDataType)elementtype));
            _builder_1.append(_mapPrimitiveType);
            _builder_1.append(">");
            result.append(_builder_1);
          }
        }
      } else {
        boolean _equals = type.getEClassifier().getName().equals(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY.getName());
        if (_equals) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("Map.Entry<String, String>");
          result.append(_builder_2);
        } else {
          EClassifier _eClassifier_1 = type.getEClassifier();
          if ((_eClassifier_1 instanceof EDataType)) {
            EClassifier _eClassifier_2 = type.getEClassifier();
            result.append(this.mapDataType(((EDataType) _eClassifier_2)));
          } else {
            result.append(type.getEClassifier().getName());
          }
        }
      }
      StringConcatenation _builder_3 = new StringConcatenation();
      {
        EList<EGenericType> _eTypeArguments = type.getETypeArguments();
        boolean _hasElements = false;
        for(final EGenericType argument : _eTypeArguments) {
          if (!_hasElements) {
            _hasElements = true;
            _builder_3.append("<");
          } else {
            _builder_3.appendImmediate(",", "");
          }
          String _xifexpression = null;
          EClassifier _eClassifier_3 = argument.getEClassifier();
          boolean _equals_1 = Objects.equal(_eClassifier_3, null);
          if (_equals_1) {
            _xifexpression = this.wildCardGenerics(argument);
          } else {
            _xifexpression = this.translateType(argument);
          }
          _builder_3.append(_xifexpression);
        }
        if (_hasElements) {
          _builder_3.append(">");
        }
      }
      result.append(_builder_3);
    } else {
      ETypeParameter _eTypeParameter = type.getETypeParameter();
      boolean _tripleNotEquals_1 = (_eTypeParameter != null);
      if (_tripleNotEquals_1) {
        result.append(type.getETypeParameter().getName());
      }
    }
    return result.toString();
  }
  
  public abstract String voidType(final EGenericType type);
  
  public abstract String wildCardGenerics(final EGenericType type);
  
  public abstract String classType(final EGenericType type);
  
  public String mapDataType(final EDataType type) {
    String result = this.mapPrimitiveType(type);
    if ((result == null)) {
      result = this.mapComplexType(type);
    }
    if ((result == null)) {
      return this.id.doSwitch(type);
    }
    return result;
  }
  
  public boolean isPrimitiveType(final EClassifier eclassifier) {
    if (((eclassifier instanceof EDataType) == false)) {
      return false;
    }
    boolean _isEcoreEPackage = UtilsCrossecore.isEcoreEPackage(eclassifier.getEPackage());
    boolean _not = (!_isEcoreEPackage);
    if (_not) {
      return false;
    }
    String _name = eclassifier.getName();
    boolean _matched = false;
    String _name_1 = EcorePackage.Literals.EBOOLEAN.getName();
    if (Objects.equal(_name, _name_1)) {
      _matched=true;
      return true;
    }
    if (!_matched) {
      String _name_2 = EcorePackage.Literals.EINT.getName();
      if (Objects.equal(_name, _name_2)) {
        _matched=true;
        return true;
      }
    }
    if (!_matched) {
      String _name_3 = EcorePackage.Literals.EDOUBLE.getName();
      if (Objects.equal(_name, _name_3)) {
        _matched=true;
        return true;
      }
    }
    if (!_matched) {
      String _name_4 = EcorePackage.Literals.EFLOAT.getName();
      if (Objects.equal(_name, _name_4)) {
        _matched=true;
        return true;
      }
    }
    if (!_matched) {
      String _name_5 = EcorePackage.Literals.ESTRING.getName();
      if (Objects.equal(_name, _name_5)) {
        _matched=true;
        return true;
      }
    }
    if (!_matched) {
      String _name_6 = EcorePackage.Literals.ECHAR.getName();
      if (Objects.equal(_name, _name_6)) {
        _matched=true;
        return true;
      }
    }
    if (!_matched) {
      String _name_7 = EcorePackage.Literals.EJAVA_OBJECT.getName();
      if (Objects.equal(_name, _name_7)) {
        _matched=true;
        return true;
      }
    }
    return false;
  }
  
  /**
   * Dependency required
   */
  public abstract String mapComplexType(final EDataType type);
  
  /**
   * No dependencies required
   */
  public abstract String mapPrimitiveType(final EDataType type);
  
  public String listType(final boolean unique, final boolean ordered) {
    if (((!unique) && (!ordered))) {
      return "Bag";
    } else {
      if (((!unique) && ordered)) {
        return "Sequence";
      } else {
        if ((unique && (!ordered))) {
          return "Set";
        } else {
          if ((unique && ordered)) {
            return "OrderedSet";
          }
        }
      }
    }
    return null;
  }
  
  public String defaultValue(final EClassifier type) {
    Object x = type.getDefaultValue();
    Object _defaultValue = type.getDefaultValue();
    boolean _tripleNotEquals = (_defaultValue != null);
    if (_tripleNotEquals) {
      boolean _isPrimitiveType = this.isPrimitiveType(type);
      if (_isPrimitiveType) {
        return type.getDefaultValue().toString();
      } else {
        if ((type instanceof EEnum)) {
          Object _defaultValue_1 = ((EEnum)type).getDefaultValue();
          EEnumLiteral literal = ((EEnumLiteral) _defaultValue_1);
          String _name = ((EEnum)type).getName();
          String _plus = (_name + ".");
          String _upperCase = literal.getName().toUpperCase();
          return (_plus + _upperCase);
        } else {
          String _name_1 = type.getName();
          String _plus_1 = (_name_1 + ".");
          String _string = type.getDefaultValue().toString();
          return (_plus_1 + _string);
        }
      }
    }
    String result = "";
    String _name_2 = type.getName();
    boolean _matched = false;
    String _name_3 = EcorePackage.Literals.EBOOLEAN.getName();
    if (Objects.equal(_name_2, _name_3)) {
      _matched=true;
      result = "false";
    }
    if (!_matched) {
      String _name_4 = EcorePackage.Literals.EINT.getName();
      if (Objects.equal(_name_2, _name_4)) {
        _matched=true;
        result = "0";
      }
    }
    if (!_matched) {
      String _name_5 = EcorePackage.Literals.EDOUBLE.getName();
      if (Objects.equal(_name_2, _name_5)) {
        _matched=true;
        result = "0.0";
      }
    }
    if (!_matched) {
      String _name_6 = EcorePackage.Literals.EFLOAT.getName();
      if (Objects.equal(_name_2, _name_6)) {
        _matched=true;
        result = "0.0";
      }
    }
    if (!_matched) {
      String _name_7 = EcorePackage.Literals.ESTRING.getName();
      if (Objects.equal(_name_2, _name_7)) {
        _matched=true;
        result = "\"\"";
      }
    }
    if (!_matched) {
      String _name_8 = EcorePackage.Literals.ECHAR.getName();
      if (Objects.equal(_name_2, _name_8)) {
        _matched=true;
        result = "\'\'";
      }
    }
    if (!_matched) {
      String _name_9 = EcorePackage.Literals.EJAVA_OBJECT.getName();
      if (Objects.equal(_name_2, _name_9)) {
        _matched=true;
        result = "null";
      }
    }
    if (!_matched) {
      result = "null";
    }
    return result;
  }
}
