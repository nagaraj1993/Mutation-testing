package de.upb.is.TestModel2TestCase;

import com.google.common.base.Objects;
import de.upb.is.TestModel2TestCase.CSharpTypeTranslator;
import de.upb.is.TestModel2TestCase.TypeTranslator;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.ecore.CollectionItem;
import org.eclipse.ocl.ecore.CollectionType;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain;
import org.eclipse.ocl.ecore.impl.CollectionLiteralExpImpl;
import org.eclipse.ocl.ecore.utilities.AbstractVisitor;
import org.eclipse.ocl.expressions.BooleanLiteralExp;
import org.eclipse.ocl.expressions.CollectionKind;
import org.eclipse.ocl.expressions.CollectionLiteralExp;
import org.eclipse.ocl.expressions.CollectionLiteralPart;
import org.eclipse.ocl.expressions.CollectionRange;
import org.eclipse.ocl.expressions.IfExp;
import org.eclipse.ocl.expressions.IntegerLiteralExp;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.expressions.LetExp;
import org.eclipse.ocl.expressions.NullLiteralExp;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.RealLiteralExp;
import org.eclipse.ocl.expressions.StringLiteralExp;
import org.eclipse.ocl.expressions.TupleLiteralExp;
import org.eclipse.ocl.expressions.TupleLiteralPart;
import org.eclipse.ocl.expressions.TypeExp;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class CSharpOCLVisitor extends AbstractVisitor<CharSequence> {
  private TypeTranslator t = CSharpTypeTranslator.INSTANCE;
  
  public String translate(final String expression, final EClassifier context) {
    try {
      ResourceSetImpl rs = new ResourceSetImpl();
      OCL.initialize(rs);
      OCLDelegateDomain.initialize(rs);
      OCL ocl = OCL.newInstance();
      OCL.Helper helper = ocl.createOCLHelper();
      helper.setContext(context);
      OCLExpression oclExp = helper.createQuery(expression);
      return oclExp.<CharSequence, CSharpOCLVisitor>accept(this).toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public CharSequence handleCollectionRange(final CollectionRange<EClassifier> range, final CharSequence firstResult, final CharSequence lastResult) {
    StringBuffer buffer = new StringBuffer();
    if (((range.getFirst() instanceof IntegerLiteralExp) && (range.getLast() instanceof IntegerLiteralExp))) {
      String _plus = (firstResult + "");
      int lower = Integer.parseInt(_plus);
      String _plus_1 = (lastResult + "");
      int upper = Integer.parseInt(_plus_1);
      if ((lower <= upper)) {
        for (int i = lower; (i <= upper); i++) {
          {
            buffer.append(i);
            if (((i + 1) <= upper)) {
              buffer.append(",");
            }
          }
        }
      }
    }
    return buffer.toString();
  }
  
  @Override
  public CharSequence handleTupleLiteralExp(final TupleLiteralExp<EClassifier, EStructuralFeature> literalExp, final List<CharSequence> partResults) {
    TupleLiteralPart<EClassifier, EStructuralFeature> _get = literalExp.getPart().get(0);
    ETypedElement firstPart = ((ETypedElement) _get);
    TupleLiteralPart<EClassifier, EStructuralFeature> _get_1 = literalExp.getPart().get(1);
    ETypedElement secondPart = ((ETypedElement) _get_1);
    TupleLiteralPart<EClassifier, EStructuralFeature> _get_2 = literalExp.getPart().get(0);
    TupleLiteralPart<EClassifier, EStructuralFeature> firstPart2 = ((TupleLiteralPart<EClassifier, EStructuralFeature>) _get_2);
    TupleLiteralPart<EClassifier, EStructuralFeature> _get_3 = literalExp.getPart().get(1);
    TupleLiteralPart<EClassifier, EStructuralFeature> secondPart2 = ((TupleLiteralPart<EClassifier, EStructuralFeature>) _get_3);
    String firstType = this.t.translateType(firstPart.getEGenericType());
    String secondType = this.t.translateType(secondPart.getEGenericType());
    CharSequence firstValue = firstPart2.getValue().<CharSequence, CSharpOCLVisitor>accept(this);
    CharSequence secondValue = secondPart2.getValue().<CharSequence, CSharpOCLVisitor>accept(this);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new Tuple<");
    _builder.append(firstType);
    _builder.append(", ");
    _builder.append(secondType);
    _builder.append(">(");
    _builder.append(firstValue);
    _builder.append(", ");
    _builder.append(secondValue);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence visitTypeExp(final TypeExp<EClassifier> type) {
    EClassifier _referredType = type.getReferredType();
    if ((_referredType instanceof EDataType)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("typeof(");
      EClassifier _referredType_1 = type.getReferredType();
      String _mapPrimitiveType = this.t.mapPrimitiveType(((EDataType) _referredType_1));
      _builder.append(_mapPrimitiveType);
      _builder.append(")");
      return _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("typeof(");
      String _translateType = this.t.translateType(type.getReferredType());
      _builder_1.append(_translateType);
      _builder_1.append(")");
      return _builder_1;
    }
  }
  
  @Override
  public CharSequence visitUnlimitedNaturalLiteralExp(final UnlimitedNaturalLiteralExp<EClassifier> literalExp) {
    return "UnlimitedNatural.UNLIMITED";
  }
  
  @Override
  public CharSequence handleCollectionLiteralExp(final CollectionLiteralExp<EClassifier> literalExp, final List<CharSequence> partResults) {
    CollectionLiteralExpImpl collectionLiteral = ((CollectionLiteralExpImpl) literalExp);
    CollectionKind kind = literalExp.getKind();
    EClassifier _eClassifier = collectionLiteral.getEGenericType().getEClassifier();
    CollectionType collectionType = ((CollectionType) _eClassifier);
    EClassifier elementType = collectionType.getElementType();
    String type = "";
    type = this.t.translateType(collectionLiteral.getEGenericType());
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new ");
    _builder.append(type);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<CollectionLiteralPart<EClassifier>> _part = literalExp.getPart();
      boolean _hasElements = false;
      for(final CollectionLiteralPart<EClassifier> part : _part) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        {
          if ((part instanceof CollectionItem)) {
            CharSequence _accept = ((CollectionItem) part).getItem().<CharSequence, CSharpOCLVisitor>accept(this);
            _builder.append(_accept);
            _builder.newLineIfNotEmpty();
          } else {
            if ((part instanceof CollectionRange)) {
              _builder.append("\t");
              CharSequence _visitCollectionRange = this.visitCollectionRange(((CollectionRange) part));
              _builder.append(_visitCollectionRange, "\t");
              _builder.newLineIfNotEmpty();
            }
          }
        }
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence handleLetExp(final LetExp<EClassifier, EParameter> letExp, final CharSequence variableResult, final CharSequence inResult) {
    if ((((letExp.eContainer() instanceof LetExp) == false) && ((letExp.getIn() instanceof LetExp) == false))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("((Func<");
      EClassifier _type = letExp.getType();
      String _mapDataType = this.t.mapDataType(((EDataType) _type));
      _builder.append(_mapDataType);
      _builder.append(">)(() => { var ");
      String _name = letExp.getVariable().getName();
      _builder.append(_name);
      _builder.append(" = ");
      CharSequence _accept = letExp.getVariable().getInitExpression().<CharSequence, CSharpOCLVisitor>accept(this);
      _builder.append(_accept);
      _builder.append("; return ");
      _builder.append(inResult);
      _builder.append("; }))();");
      _builder.newLineIfNotEmpty();
      return _builder;
    } else {
      if ((((letExp.eContainer() instanceof LetExp) == false) && (letExp.getIn() instanceof LetExp))) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("((Func<");
        EClassifier _type_1 = letExp.getType();
        String _mapDataType_1 = this.t.mapDataType(((EDataType) _type_1));
        _builder_1.append(_mapDataType_1);
        _builder_1.append(">)(() => { var ");
        String _name_1 = letExp.getVariable().getName();
        _builder_1.append(_name_1);
        _builder_1.append(" = ");
        CharSequence _accept_1 = letExp.getVariable().getInitExpression().<CharSequence, CSharpOCLVisitor>accept(this);
        _builder_1.append(_accept_1);
        _builder_1.append("; ");
        CharSequence _accept_2 = letExp.getIn().<CharSequence, CSharpOCLVisitor>accept(this);
        _builder_1.append(_accept_2);
        _builder_1.append("}))();");
        _builder_1.newLineIfNotEmpty();
        return _builder_1;
      } else {
        org.eclipse.ocl.expressions.OCLExpression<EClassifier> _in = letExp.getIn();
        if ((_in instanceof LetExp)) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("var ");
          String _name_2 = letExp.getVariable().getName();
          _builder_2.append(_name_2);
          _builder_2.append(" = ");
          CharSequence _accept_3 = letExp.getVariable().getInitExpression().<CharSequence, CSharpOCLVisitor>accept(this);
          _builder_2.append(_accept_3);
          _builder_2.append(";");
          String _string = letExp.getIn().<CharSequence, CSharpOCLVisitor>accept(this).toString();
          return (_builder_2.toString() + _string);
        } else {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("var ");
          String _name_3 = letExp.getVariable().getName();
          _builder_3.append(_name_3);
          _builder_3.append(" = ");
          CharSequence _accept_4 = letExp.getVariable().getInitExpression().<CharSequence, CSharpOCLVisitor>accept(this);
          _builder_3.append(_accept_4);
          _builder_3.append("; return ");
          _builder_3.append(inResult);
          _builder_3.append(";");
          return _builder_3;
        }
      }
    }
  }
  
  @Override
  public CharSequence handleIfExp(final IfExp<EClassifier> ifExp, final CharSequence conditionResult, final CharSequence thenResult, final CharSequence elseResult) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(conditionResult);
    _builder.append(" ? ");
    _builder.append(thenResult);
    _builder.append(" : ");
    _builder.append(elseResult);
    return _builder;
  }
  
  @Override
  public CharSequence handleOperationCallExp(final OperationCallExp<EClassifier, EOperation> callExp, final CharSequence sourceResult, final List<CharSequence> argumentResults) {
    EOperation operation = callExp.getReferredOperation();
    boolean isOclstdlib = false;
    if ((((((!Objects.equal(operation, null)) && 
      (!Objects.equal(operation.eContainer(), null))) && 
      (!Objects.equal(operation.eContainer().eContainer(), null))) && 
      (operation.eContainer().eContainer() instanceof EPackage)) && 
      ((EPackage) operation.eContainer().eContainer()).getNsURI().equals("http://www.eclipse.org/ocl/1.1.0/oclstdlib.ecore"))) {
      isOclstdlib = true;
    }
    if (isOclstdlib) {
      EOperation op = callExp.getReferredOperation();
      EClass c = op.getEContainingClass();
      String n = c.getName();
      boolean _equals = callExp.getReferredOperation().getEContainingClass().getName().equals("Boolean_Class");
      if (_equals) {
        boolean _equals_1 = callExp.getReferredOperation().getName().equals("<>");
        if (_equals_1) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(sourceResult);
          _builder.append(" != ");
          CharSequence _get = argumentResults.get(0);
          _builder.append(_get);
          return _builder;
        } else {
          boolean _equals_2 = callExp.getReferredOperation().getName().equals("=");
          if (_equals_2) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append(sourceResult);
            _builder_1.append(" == ");
            CharSequence _get_1 = argumentResults.get(0);
            _builder_1.append(_get_1);
            return _builder_1;
          } else {
            boolean _equals_3 = callExp.getReferredOperation().getName().equals("and");
            if (_equals_3) {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append(sourceResult);
              _builder_2.append(" && ");
              CharSequence _get_2 = argumentResults.get(0);
              _builder_2.append(_get_2);
              return _builder_2;
            } else {
              boolean _equals_4 = callExp.getReferredOperation().getName().equals("implies");
              if (_equals_4) {
                StringConcatenation _builder_3 = new StringConcatenation();
                _builder_3.append("! ");
                _builder_3.append(sourceResult);
                _builder_3.append(" || ");
                CharSequence _get_3 = argumentResults.get(0);
                _builder_3.append(_get_3);
                return _builder_3;
              } else {
                boolean _equals_5 = callExp.getReferredOperation().getName().equals("not");
                if (_equals_5) {
                  StringConcatenation _builder_4 = new StringConcatenation();
                  _builder_4.append("! ");
                  _builder_4.append(sourceResult);
                  return _builder_4;
                } else {
                  boolean _equals_6 = callExp.getReferredOperation().getName().equals("or");
                  if (_equals_6) {
                    StringConcatenation _builder_5 = new StringConcatenation();
                    _builder_5.append(sourceResult);
                    _builder_5.append(" || ");
                    CharSequence _get_4 = argumentResults.get(0);
                    _builder_5.append(_get_4);
                    return _builder_5;
                  } else {
                    boolean _equals_7 = callExp.getReferredOperation().getName().equals("xor");
                    if (_equals_7) {
                      StringConcatenation _builder_6 = new StringConcatenation();
                      _builder_6.append(sourceResult);
                      _builder_6.append(" ^ ");
                      CharSequence _get_5 = argumentResults.get(0);
                      _builder_6.append(_get_5);
                      return _builder_6;
                    } else {
                      boolean _equals_8 = callExp.getReferredOperation().getName().equals("toString");
                      if (_equals_8) {
                        StringConcatenation _builder_7 = new StringConcatenation();
                        _builder_7.append(sourceResult);
                        _builder_7.append(".ToString()");
                        return _builder_7;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      } else {
        boolean _equals_9 = callExp.getReferredOperation().getEContainingClass().getName().equals("Integer_Class");
        if (_equals_9) {
          boolean _equals_10 = callExp.getReferredOperation().getName().equals("*");
          if (_equals_10) {
            StringConcatenation _builder_8 = new StringConcatenation();
            _builder_8.append(sourceResult);
            _builder_8.append(" * ");
            CharSequence _get_6 = argumentResults.get(0);
            _builder_8.append(_get_6);
            return _builder_8;
          } else {
            boolean _equals_11 = callExp.getReferredOperation().getName().equals("+");
            if (_equals_11) {
              StringConcatenation _builder_9 = new StringConcatenation();
              _builder_9.append(sourceResult);
              _builder_9.append(" + ");
              CharSequence _get_7 = argumentResults.get(0);
              _builder_9.append(_get_7);
              return _builder_9;
            } else {
              boolean _equals_12 = callExp.getReferredOperation().getName().equals("-");
              if (_equals_12) {
                StringConcatenation _builder_10 = new StringConcatenation();
                _builder_10.append(sourceResult);
                _builder_10.append(" - ");
                CharSequence _get_8 = argumentResults.get(0);
                _builder_10.append(_get_8);
                return _builder_10;
              } else {
                boolean _equals_13 = callExp.getReferredOperation().getName().equals("<");
                if (_equals_13) {
                  StringConcatenation _builder_11 = new StringConcatenation();
                  _builder_11.append(sourceResult);
                  _builder_11.append(" < ");
                  CharSequence _get_9 = argumentResults.get(0);
                  _builder_11.append(_get_9);
                  return _builder_11;
                } else {
                  boolean _equals_14 = callExp.getReferredOperation().getName().equals(">");
                  if (_equals_14) {
                    StringConcatenation _builder_12 = new StringConcatenation();
                    _builder_12.append(sourceResult);
                    _builder_12.append(" > ");
                    CharSequence _get_10 = argumentResults.get(0);
                    _builder_12.append(_get_10);
                    return _builder_12;
                  } else {
                    boolean _equals_15 = callExp.getReferredOperation().getName().equals(">=");
                    if (_equals_15) {
                      StringConcatenation _builder_13 = new StringConcatenation();
                      _builder_13.append(sourceResult);
                      _builder_13.append(" >= ");
                      CharSequence _get_11 = argumentResults.get(0);
                      _builder_13.append(_get_11);
                      return _builder_13;
                    } else {
                      boolean _equals_16 = callExp.getReferredOperation().getName().equals("<=");
                      if (_equals_16) {
                        StringConcatenation _builder_14 = new StringConcatenation();
                        _builder_14.append(sourceResult);
                        _builder_14.append(" <= ");
                        CharSequence _get_12 = argumentResults.get(0);
                        _builder_14.append(_get_12);
                        return _builder_14;
                      } else {
                        boolean _equals_17 = callExp.getReferredOperation().getName().equals("/");
                        if (_equals_17) {
                          StringConcatenation _builder_15 = new StringConcatenation();
                          _builder_15.append("Convert.ToDouble(");
                          _builder_15.append(sourceResult);
                          _builder_15.append(")/ Convert.ToDouble(");
                          CharSequence _get_13 = argumentResults.get(0);
                          _builder_15.append(_get_13);
                          _builder_15.append(")");
                          return _builder_15;
                        } else {
                          boolean _equals_18 = callExp.getReferredOperation().getName().equals("abs");
                          if (_equals_18) {
                            StringConcatenation _builder_16 = new StringConcatenation();
                            _builder_16.append("Math.Abs(");
                            _builder_16.append(sourceResult);
                            _builder_16.append(")");
                            return _builder_16;
                          } else {
                            boolean _equals_19 = callExp.getReferredOperation().getName().equals("div");
                            if (_equals_19) {
                              StringConcatenation _builder_17 = new StringConcatenation();
                              _builder_17.append(sourceResult);
                              _builder_17.append(" / ");
                              CharSequence _get_14 = argumentResults.get(0);
                              _builder_17.append(_get_14);
                              return _builder_17;
                            } else {
                              boolean _equals_20 = callExp.getReferredOperation().getName().equals("max");
                              if (_equals_20) {
                                StringConcatenation _builder_18 = new StringConcatenation();
                                _builder_18.append("Math.Max(");
                                _builder_18.append(sourceResult);
                                _builder_18.append(", ");
                                CharSequence _get_15 = argumentResults.get(0);
                                _builder_18.append(_get_15);
                                _builder_18.append(")");
                                return _builder_18;
                              } else {
                                boolean _equals_21 = callExp.getReferredOperation().getName().equals("min");
                                if (_equals_21) {
                                  StringConcatenation _builder_19 = new StringConcatenation();
                                  _builder_19.append("Math.Min(");
                                  _builder_19.append(sourceResult);
                                  _builder_19.append(", ");
                                  CharSequence _get_16 = argumentResults.get(0);
                                  _builder_19.append(_get_16);
                                  _builder_19.append(")");
                                  return _builder_19;
                                } else {
                                  boolean _equals_22 = callExp.getReferredOperation().getName().equals("mod");
                                  if (_equals_22) {
                                    StringConcatenation _builder_20 = new StringConcatenation();
                                    _builder_20.append(sourceResult);
                                    _builder_20.append(" % ");
                                    CharSequence _get_17 = argumentResults.get(0);
                                    _builder_20.append(_get_17);
                                    return _builder_20;
                                  } else {
                                    boolean _equals_23 = callExp.getReferredOperation().getName().equals("toString");
                                    if (_equals_23) {
                                      StringConcatenation _builder_21 = new StringConcatenation();
                                      _builder_21.append(sourceResult);
                                      _builder_21.append(".ToString()");
                                      return _builder_21;
                                    } else {
                                      boolean _equals_24 = callExp.getReferredOperation().getName().equals("toUnlimitedNatural");
                                      if (_equals_24) {
                                        throw new UnsupportedOperationException();
                                      } else {
                                        boolean _equals_25 = callExp.getReferredOperation().getName().equals("=");
                                        if (_equals_25) {
                                          StringConcatenation _builder_22 = new StringConcatenation();
                                          _builder_22.append(sourceResult);
                                          _builder_22.append(".Equals(");
                                          CharSequence _get_18 = argumentResults.get(0);
                                          _builder_22.append(_get_18);
                                          _builder_22.append(")");
                                          return _builder_22;
                                        } else {
                                          boolean _equals_26 = callExp.getReferredOperation().getName().equals("floor");
                                          if (_equals_26) {
                                            StringConcatenation _builder_23 = new StringConcatenation();
                                            _builder_23.append("Math.Floor(");
                                            CharSequence _get_19 = argumentResults.get(0);
                                            _builder_23.append(_get_19);
                                            _builder_23.append(")");
                                            return _builder_23;
                                          } else {
                                            boolean _equals_27 = callExp.getReferredOperation().getName().equals("<>");
                                            if (_equals_27) {
                                              StringConcatenation _builder_24 = new StringConcatenation();
                                              _builder_24.append(sourceResult);
                                              _builder_24.append(" != ");
                                              CharSequence _get_20 = argumentResults.get(0);
                                              _builder_24.append(_get_20);
                                              return _builder_24;
                                            } else {
                                              boolean _equals_28 = callExp.getReferredOperation().getName().equals("round");
                                              if (_equals_28) {
                                                StringConcatenation _builder_25 = new StringConcatenation();
                                                _builder_25.append("Math.Round(");
                                                CharSequence _get_21 = argumentResults.get(0);
                                                _builder_25.append(_get_21);
                                                _builder_25.append(")");
                                                return _builder_25;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          boolean _equals_29 = callExp.getReferredOperation().getEContainingClass().getName().equals("Real_Class");
          if (_equals_29) {
            boolean _equals_30 = callExp.getReferredOperation().getName().equals("*");
            if (_equals_30) {
              StringConcatenation _builder_26 = new StringConcatenation();
              _builder_26.append(sourceResult);
              _builder_26.append(" * ");
              CharSequence _get_22 = argumentResults.get(0);
              _builder_26.append(_get_22);
              return _builder_26;
            } else {
              boolean _equals_31 = callExp.getReferredOperation().getName().equals("+");
              if (_equals_31) {
                StringConcatenation _builder_27 = new StringConcatenation();
                _builder_27.append(sourceResult);
                _builder_27.append(" + ");
                CharSequence _get_23 = argumentResults.get(0);
                _builder_27.append(_get_23);
                return _builder_27;
              } else {
                boolean _equals_32 = callExp.getReferredOperation().getName().equals("-");
                if (_equals_32) {
                  StringConcatenation _builder_28 = new StringConcatenation();
                  _builder_28.append(sourceResult);
                  _builder_28.append(" - ");
                  CharSequence _get_24 = argumentResults.get(0);
                  _builder_28.append(_get_24);
                  return _builder_28;
                } else {
                  boolean _equals_33 = callExp.getReferredOperation().getName().equals("/");
                  if (_equals_33) {
                    StringConcatenation _builder_29 = new StringConcatenation();
                    _builder_29.append(sourceResult);
                    _builder_29.append(" / ");
                    CharSequence _get_25 = argumentResults.get(0);
                    _builder_29.append(_get_25);
                    return _builder_29;
                  } else {
                    boolean _equals_34 = callExp.getReferredOperation().getName().equals("<>");
                    if (_equals_34) {
                      StringConcatenation _builder_30 = new StringConcatenation();
                      _builder_30.append(sourceResult);
                      _builder_30.append(" != ");
                      CharSequence _get_26 = argumentResults.get(0);
                      _builder_30.append(_get_26);
                      return _builder_30;
                    } else {
                      boolean _equals_35 = callExp.getReferredOperation().getName().equals("=");
                      if (_equals_35) {
                        StringConcatenation _builder_31 = new StringConcatenation();
                        _builder_31.append(sourceResult);
                        _builder_31.append(".Equals(");
                        CharSequence _get_27 = argumentResults.get(0);
                        _builder_31.append(_get_27);
                        _builder_31.append(")");
                        return _builder_31;
                      } else {
                        boolean _equals_36 = callExp.getReferredOperation().getName().equals("<");
                        if (_equals_36) {
                          StringConcatenation _builder_32 = new StringConcatenation();
                          _builder_32.append(sourceResult);
                          _builder_32.append(" < ");
                          CharSequence _get_28 = argumentResults.get(0);
                          _builder_32.append(_get_28);
                          return _builder_32;
                        } else {
                          boolean _equals_37 = callExp.getReferredOperation().getName().equals(">");
                          if (_equals_37) {
                            StringConcatenation _builder_33 = new StringConcatenation();
                            _builder_33.append(sourceResult);
                            _builder_33.append(" > ");
                            CharSequence _get_29 = argumentResults.get(0);
                            _builder_33.append(_get_29);
                            return _builder_33;
                          } else {
                            boolean _equals_38 = callExp.getReferredOperation().getName().equals(">=");
                            if (_equals_38) {
                              StringConcatenation _builder_34 = new StringConcatenation();
                              _builder_34.append(sourceResult);
                              _builder_34.append(" >= ");
                              CharSequence _get_30 = argumentResults.get(0);
                              _builder_34.append(_get_30);
                              return _builder_34;
                            } else {
                              boolean _equals_39 = callExp.getReferredOperation().getName().equals("<=");
                              if (_equals_39) {
                                StringConcatenation _builder_35 = new StringConcatenation();
                                _builder_35.append(sourceResult);
                                _builder_35.append(" <= ");
                                CharSequence _get_31 = argumentResults.get(0);
                                _builder_35.append(_get_31);
                                return _builder_35;
                              } else {
                                boolean _equals_40 = callExp.getReferredOperation().getName().equals("abs");
                                if (_equals_40) {
                                  StringConcatenation _builder_36 = new StringConcatenation();
                                  _builder_36.append("Math.Abs(");
                                  _builder_36.append(sourceResult);
                                  _builder_36.append(")");
                                  return _builder_36;
                                } else {
                                  boolean _equals_41 = callExp.getReferredOperation().getName().equals("floor");
                                  if (_equals_41) {
                                    StringConcatenation _builder_37 = new StringConcatenation();
                                    _builder_37.append("Math.Floor(");
                                    _builder_37.append(sourceResult);
                                    _builder_37.append(")");
                                    return _builder_37;
                                  } else {
                                    boolean _equals_42 = callExp.getReferredOperation().getName().equals("max");
                                    if (_equals_42) {
                                      StringConcatenation _builder_38 = new StringConcatenation();
                                      _builder_38.append("Math.Max(");
                                      _builder_38.append(sourceResult);
                                      _builder_38.append(", ");
                                      CharSequence _get_32 = argumentResults.get(0);
                                      _builder_38.append(_get_32);
                                      _builder_38.append(")");
                                      return _builder_38;
                                    } else {
                                      boolean _equals_43 = callExp.getReferredOperation().getName().equals("min");
                                      if (_equals_43) {
                                        StringConcatenation _builder_39 = new StringConcatenation();
                                        _builder_39.append("Math.Min(");
                                        _builder_39.append(sourceResult);
                                        _builder_39.append(", ");
                                        CharSequence _get_33 = argumentResults.get(0);
                                        _builder_39.append(_get_33);
                                        _builder_39.append(")");
                                        return _builder_39;
                                      } else {
                                        boolean _equals_44 = callExp.getReferredOperation().getName().equals("round");
                                        if (_equals_44) {
                                          StringConcatenation _builder_40 = new StringConcatenation();
                                          _builder_40.append("Math.Round(");
                                          _builder_40.append(sourceResult);
                                          _builder_40.append(", ");
                                          CharSequence _get_34 = argumentResults.get(0);
                                          _builder_40.append(_get_34);
                                          _builder_40.append(")");
                                          return _builder_40;
                                        } else {
                                          boolean _equals_45 = callExp.getReferredOperation().getName().equals("toString");
                                          if (_equals_45) {
                                            StringConcatenation _builder_41 = new StringConcatenation();
                                            _builder_41.append(sourceResult);
                                            _builder_41.append(".ToString()");
                                            return _builder_41;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            boolean _equals_46 = callExp.getReferredOperation().getEContainingClass().getName().equals("String_Class");
            if (_equals_46) {
              boolean _equals_47 = callExp.getReferredOperation().getName().equals("+");
              if (_equals_47) {
                StringConcatenation _builder_42 = new StringConcatenation();
                _builder_42.append(sourceResult);
                _builder_42.append(" + ");
                CharSequence _get_35 = argumentResults.get(0);
                _builder_42.append(_get_35);
                return _builder_42;
              } else {
                boolean _equals_48 = callExp.getReferredOperation().getName().equals("<");
                if (_equals_48) {
                  StringConcatenation _builder_43 = new StringConcatenation();
                  _builder_43.append(sourceResult);
                  _builder_43.append(".CompareTo(");
                  CharSequence _get_36 = argumentResults.get(0);
                  _builder_43.append(_get_36);
                  _builder_43.append(") < 0");
                  return _builder_43;
                } else {
                  boolean _equals_49 = callExp.getReferredOperation().getName().equals("<=");
                  if (_equals_49) {
                    StringConcatenation _builder_44 = new StringConcatenation();
                    _builder_44.append(sourceResult);
                    _builder_44.append(".CompareTo(");
                    CharSequence _get_37 = argumentResults.get(0);
                    _builder_44.append(_get_37);
                    _builder_44.append(") <= 0");
                    return _builder_44;
                  } else {
                    boolean _equals_50 = callExp.getReferredOperation().getName().equals("<>");
                    if (_equals_50) {
                      StringConcatenation _builder_45 = new StringConcatenation();
                      _builder_45.append(sourceResult);
                      _builder_45.append(" != ");
                      CharSequence _get_38 = argumentResults.get(0);
                      _builder_45.append(_get_38);
                      return _builder_45;
                    } else {
                      boolean _equals_51 = callExp.getReferredOperation().getName().equals("=");
                      if (_equals_51) {
                        StringConcatenation _builder_46 = new StringConcatenation();
                        _builder_46.append(sourceResult);
                        _builder_46.append(" == ");
                        CharSequence _get_39 = argumentResults.get(0);
                        _builder_46.append(_get_39);
                        return _builder_46;
                      } else {
                        boolean _equals_52 = callExp.getReferredOperation().getName().equals(">");
                        if (_equals_52) {
                          StringConcatenation _builder_47 = new StringConcatenation();
                          _builder_47.append(sourceResult);
                          _builder_47.append(".CompareTo(");
                          CharSequence _get_40 = argumentResults.get(0);
                          _builder_47.append(_get_40);
                          _builder_47.append(") > 0");
                          return _builder_47;
                        } else {
                          boolean _equals_53 = callExp.getReferredOperation().getName().equals(">=");
                          if (_equals_53) {
                            StringConcatenation _builder_48 = new StringConcatenation();
                            _builder_48.append(sourceResult);
                            _builder_48.append(".CompareTo(");
                            CharSequence _get_41 = argumentResults.get(0);
                            _builder_48.append(_get_41);
                            _builder_48.append(") >= 0");
                            return _builder_48;
                          } else {
                            boolean _equals_54 = callExp.getReferredOperation().getName().equals("at");
                            if (_equals_54) {
                              StringConcatenation _builder_49 = new StringConcatenation();
                              _builder_49.append(sourceResult);
                              _builder_49.append("[");
                              CharSequence _get_42 = argumentResults.get(0);
                              _builder_49.append(_get_42);
                              _builder_49.append("]+\"\"");
                              return _builder_49;
                            } else {
                              boolean _equals_55 = callExp.getReferredOperation().getName().equals("characters");
                              if (_equals_55) {
                                throw new UnsupportedOperationException();
                              } else {
                                boolean _equals_56 = callExp.getReferredOperation().getName().equals("compareTo");
                                if (_equals_56) {
                                  StringConcatenation _builder_50 = new StringConcatenation();
                                  _builder_50.append(sourceResult);
                                  _builder_50.append(".Compare(");
                                  CharSequence _get_43 = argumentResults.get(0);
                                  _builder_50.append(_get_43);
                                  _builder_50.append(")");
                                  return _builder_50;
                                } else {
                                  boolean _equals_57 = callExp.getReferredOperation().getName().equals("concat");
                                  if (_equals_57) {
                                    StringConcatenation _builder_51 = new StringConcatenation();
                                    _builder_51.append(sourceResult);
                                    _builder_51.append(" + ");
                                    CharSequence _get_44 = argumentResults.get(0);
                                    _builder_51.append(_get_44);
                                    return _builder_51;
                                  } else {
                                    boolean _equals_58 = callExp.getReferredOperation().getName().equals("equalsIgnoreCase");
                                    if (_equals_58) {
                                      StringConcatenation _builder_52 = new StringConcatenation();
                                      _builder_52.append("String.Equals(");
                                      _builder_52.append(sourceResult);
                                      _builder_52.append(", ");
                                      CharSequence _get_45 = argumentResults.get(0);
                                      _builder_52.append(_get_45);
                                      _builder_52.append(", StringComparison.OrdinalIgnoreCase)");
                                      return _builder_52;
                                    } else {
                                      boolean _equals_59 = callExp.getReferredOperation().getName().equals("indexOf");
                                      if (_equals_59) {
                                        StringConcatenation _builder_53 = new StringConcatenation();
                                        _builder_53.append(sourceResult);
                                        _builder_53.append(".IndexOf(");
                                        CharSequence _get_46 = argumentResults.get(0);
                                        _builder_53.append(_get_46);
                                        _builder_53.append(")");
                                        return _builder_53;
                                      } else {
                                        boolean _equals_60 = callExp.getReferredOperation().getName().equals("lastIndexOf");
                                        if (_equals_60) {
                                          StringConcatenation _builder_54 = new StringConcatenation();
                                          _builder_54.append(sourceResult);
                                          _builder_54.append(".LastIndexOf(");
                                          CharSequence _get_47 = argumentResults.get(0);
                                          _builder_54.append(_get_47);
                                          _builder_54.append(")");
                                          return _builder_54;
                                        } else {
                                          boolean _equals_61 = callExp.getReferredOperation().getName().equals("matches");
                                          if (_equals_61) {
                                            throw new UnsupportedOperationException();
                                          } else {
                                            boolean _equals_62 = callExp.getReferredOperation().getName().equals("replaceAll");
                                            if (_equals_62) {
                                              StringConcatenation _builder_55 = new StringConcatenation();
                                              _builder_55.append(sourceResult);
                                              _builder_55.append(".Replace(");
                                              CharSequence _get_48 = argumentResults.get(0);
                                              _builder_55.append(_get_48);
                                              _builder_55.append(", ");
                                              CharSequence _get_49 = argumentResults.get(1);
                                              _builder_55.append(_get_49);
                                              _builder_55.append(")");
                                              return _builder_55;
                                            } else {
                                              boolean _equals_63 = callExp.getReferredOperation().getName().equals("replaceFirst");
                                              if (_equals_63) {
                                                throw new UnsupportedOperationException();
                                              } else {
                                                boolean _equals_64 = callExp.getReferredOperation().getName().equals("size");
                                                if (_equals_64) {
                                                  StringConcatenation _builder_56 = new StringConcatenation();
                                                  _builder_56.append(sourceResult);
                                                  _builder_56.append(".Count()");
                                                  return _builder_56;
                                                } else {
                                                  boolean _equals_65 = callExp.getReferredOperation().getName().equals("endsWith");
                                                  if (_equals_65) {
                                                    StringConcatenation _builder_57 = new StringConcatenation();
                                                    _builder_57.append(sourceResult);
                                                    _builder_57.append(".EndsWith(");
                                                    CharSequence _get_50 = argumentResults.get(0);
                                                    _builder_57.append(_get_50);
                                                    _builder_57.append(")");
                                                    return _builder_57;
                                                  } else {
                                                    boolean _equals_66 = callExp.getReferredOperation().getName().equals("startsWith");
                                                    if (_equals_66) {
                                                      StringConcatenation _builder_58 = new StringConcatenation();
                                                      _builder_58.append(sourceResult);
                                                      _builder_58.append(".StartsWith(");
                                                      CharSequence _get_51 = argumentResults.get(0);
                                                      _builder_58.append(_get_51);
                                                      _builder_58.append(")");
                                                      return _builder_58;
                                                    } else {
                                                      boolean _equals_67 = callExp.getReferredOperation().getName().equals("substituteAll");
                                                      if (_equals_67) {
                                                        throw new UnsupportedOperationException();
                                                      } else {
                                                        boolean _equals_68 = callExp.getReferredOperation().getName().equals("substituteFirst");
                                                        if (_equals_68) {
                                                          throw new UnsupportedOperationException();
                                                        } else {
                                                          boolean _equals_69 = callExp.getReferredOperation().getName().equals("substring");
                                                          if (_equals_69) {
                                                            StringConcatenation _builder_59 = new StringConcatenation();
                                                            _builder_59.append(sourceResult);
                                                            _builder_59.append(".Substring(");
                                                            CharSequence _get_52 = argumentResults.get(0);
                                                            _builder_59.append(_get_52);
                                                            _builder_59.append(", ");
                                                            CharSequence _get_53 = argumentResults.get(1);
                                                            _builder_59.append(_get_53);
                                                            _builder_59.append(")");
                                                            return _builder_59;
                                                          } else {
                                                            boolean _equals_70 = callExp.getReferredOperation().getName().equals("toBoolean");
                                                            if (_equals_70) {
                                                              throw new UnsupportedOperationException();
                                                            } else {
                                                              boolean _equals_71 = callExp.getReferredOperation().getName().equals("toInteger");
                                                              if (_equals_71) {
                                                                throw new UnsupportedOperationException();
                                                              } else {
                                                                boolean _equals_72 = callExp.getReferredOperation().getName().equals("toLowerCase");
                                                                if (_equals_72) {
                                                                  StringConcatenation _builder_60 = new StringConcatenation();
                                                                  _builder_60.append(sourceResult);
                                                                  _builder_60.append(".ToLower()");
                                                                  return _builder_60;
                                                                } else {
                                                                  boolean _equals_73 = callExp.getReferredOperation().getName().equals("toReal");
                                                                  if (_equals_73) {
                                                                    throw new UnsupportedOperationException();
                                                                  } else {
                                                                    boolean _equals_74 = callExp.getReferredOperation().getName().equals("toString");
                                                                    if (_equals_74) {
                                                                      throw new UnsupportedOperationException();
                                                                    } else {
                                                                      boolean _equals_75 = callExp.getReferredOperation().getName().equals("toUpperCase");
                                                                      if (_equals_75) {
                                                                        StringConcatenation _builder_61 = new StringConcatenation();
                                                                        _builder_61.append(sourceResult);
                                                                        _builder_61.append(".ToUpper()");
                                                                        return _builder_61;
                                                                      } else {
                                                                        boolean _equals_76 = callExp.getReferredOperation().getName().equals("toUpperCase");
                                                                        if (_equals_76) {
                                                                          throw new UnsupportedOperationException();
                                                                        } else {
                                                                          boolean _equals_77 = callExp.getReferredOperation().getName().equals("tokenize");
                                                                          if (_equals_77) {
                                                                            throw new UnsupportedOperationException();
                                                                          } else {
                                                                            boolean _equals_78 = callExp.getReferredOperation().getName().equals("trim");
                                                                            if (_equals_78) {
                                                                              throw new UnsupportedOperationException();
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              boolean _equals_79 = callExp.getReferredOperation().getEContainingClass().getName().equals("OclAny_Class");
              if (_equals_79) {
                boolean _equals_80 = callExp.getReferredOperation().getName().equals("<>");
                if (_equals_80) {
                  StringConcatenation _builder_62 = new StringConcatenation();
                  _builder_62.append(sourceResult);
                  _builder_62.append(" != ");
                  CharSequence _get_54 = argumentResults.get(0);
                  _builder_62.append(_get_54);
                  return _builder_62;
                } else {
                  boolean _equals_81 = callExp.getReferredOperation().getName().equals("=");
                  if (_equals_81) {
                    StringConcatenation _builder_63 = new StringConcatenation();
                    _builder_63.append(sourceResult);
                    _builder_63.append(" == ");
                    CharSequence _get_55 = argumentResults.get(0);
                    _builder_63.append(_get_55);
                    return _builder_63;
                  }
                }
              } else {
                if ((Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("selectByKind", "selectByType")).contains(callExp.getReferredOperation().getName()) && Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("Sequence(T)_Class", "OrderedSet(T)_Class", "Set(T)_Class", "Bag(T)_Class")).contains(callExp.getReferredOperation().getEContainingClass().getName()))) {
                  ETypedElement typedelement = ((ETypedElement) callExp);
                  EGenericType generictype = typedelement.getEGenericType();
                  EClassifier _eRawType = generictype.getERawType();
                  EClassifier elementtype = ((CollectionType) _eRawType).getElementType();
                  String primitiveType = this.t.mapPrimitiveType(((EDataType) elementtype));
                  StringConcatenation _builder_64 = new StringConcatenation();
                  _builder_64.append(sourceResult);
                  _builder_64.append(".");
                  String _name = callExp.getReferredOperation().getName();
                  _builder_64.append(_name);
                  _builder_64.append("<");
                  _builder_64.append(primitiveType);
                  _builder_64.append(">()");
                  return _builder_64;
                }
              }
            }
          }
        }
      }
    }
    StringConcatenation _builder_65 = new StringConcatenation();
    _builder_65.append(sourceResult);
    _builder_65.append(".");
    String _name_1 = callExp.getReferredOperation().getName();
    _builder_65.append(_name_1);
    _builder_65.append("(");
    {
      boolean _hasElements = false;
      for(final CharSequence arg : argumentResults) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder_65.appendImmediate(",", "");
        }
        _builder_65.append(arg);
      }
    }
    _builder_65.append(")");
    return _builder_65;
  }
  
  @Override
  public CharSequence handleIteratorExp(final IteratorExp<EClassifier, EParameter> callExp, final CharSequence sourceResult, final List<CharSequence> variableResults, final CharSequence bodyResult) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(sourceResult);
    _builder.append(".");
    String _name = callExp.getName();
    _builder.append(_name);
    _builder.append("(");
    CharSequence _get = variableResults.get(0);
    _builder.append(_get);
    _builder.append(" => ");
    _builder.append(bodyResult);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence handlePropertyCallExp(final PropertyCallExp<EClassifier, EStructuralFeature> callExp, final CharSequence sourceResult, final List<CharSequence> qualifierResults) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(sourceResult);
    _builder.append(".");
    String _name = callExp.getReferredProperty().getName();
    _builder.append(_name);
    return _builder;
  }
  
  @Override
  public CharSequence handleVariable(final Variable<EClassifier, EParameter> variable, final CharSequence initResult) {
    return variable.getName();
  }
  
  @Override
  public CharSequence visitVariableExp(final VariableExp<EClassifier, EParameter> v) {
    boolean _equals = v.getName().equals("self");
    if (_equals) {
      return "this";
    }
    return v.getName();
  }
  
  @Override
  public CharSequence visitStringLiteralExp(final StringLiteralExp<EClassifier> literalExp) {
    String _stringSymbol = literalExp.getStringSymbol();
    String _plus = ("\"" + _stringSymbol);
    return (_plus + "\"");
  }
  
  @Override
  public CharSequence visitBooleanLiteralExp(final BooleanLiteralExp<EClassifier> literalExp) {
    String _xifexpression = null;
    Boolean _booleanSymbol = literalExp.getBooleanSymbol();
    if ((_booleanSymbol).booleanValue()) {
      _xifexpression = "true";
    } else {
      _xifexpression = "false";
    }
    return _xifexpression;
  }
  
  @Override
  public CharSequence visitIntegerLiteralExp(final IntegerLiteralExp<EClassifier> literalExp) {
    Integer _integerSymbol = literalExp.getIntegerSymbol();
    return (_integerSymbol + "");
  }
  
  @Override
  public CharSequence visitRealLiteralExp(final RealLiteralExp<EClassifier> literalExp) {
    Double _realSymbol = literalExp.getRealSymbol();
    return (_realSymbol + "");
  }
  
  @Override
  public CharSequence visitNullLiteralExp(final NullLiteralExp<EClassifier> literalExp) {
    return "null";
  }
}
