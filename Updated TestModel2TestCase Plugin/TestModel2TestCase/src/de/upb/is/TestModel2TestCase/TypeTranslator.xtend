package de.upb.is.TestModel2TestCase

import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EGenericType
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.ocl.ecore.AnyType
import org.eclipse.ocl.ecore.BagType
import org.eclipse.ocl.ecore.CollectionType
import org.eclipse.ocl.ecore.OrderedSetType
import org.eclipse.ocl.ecore.PrimitiveType
import org.eclipse.ocl.ecore.SequenceType
import org.eclipse.ocl.ecore.SetType

abstract class TypeTranslator {
	
	private IdentifierProvider id;
	
	
	new(IdentifierProvider _id){
		id= _id;
	}
	
	
	public def String translateType(EClassifier eClassifier){
		
		var result = new StringBuffer();
		
		if(eClassifier.name.equals(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY.name)){
			//FIXME java.util.Map.Entry does not belong here
			result.append('''java.util.Map.Entry<String, String>''');
		}
		else if(eClassifier instanceof EDataType){
			
			result.append(mapDataType(eClassifier as EDataType));
		}		
		else{
			result.append(eClassifier.name)	
		}
		return result.toString;	
	}
	
	/**
	 * Case 1: type is null => void
	 * Case 2: type is EClass from EPackage => Use classifier name omitting namespace
	 * Case 3: type is OCL collection => Use collection implementation from ocllib package
	 * Case 4: type.EClassifier is EJava_Class
	 * 
	 */
	public def String translateType(EGenericType type){
		
		
		if(type===null){
			return voidType(type);
		}
		//TODO check if eclassifier is in ecore package
		if(type.EClassifier!== null && type.EClassifier.name == EcorePackage.Literals.EJAVA_CLASS.name){
			return classType(type);
		}
		
		var result = new StringBuffer();
		
		if(type.EClassifier !== null){
			
			if(type.ERawType instanceof CollectionType){
				
				if(type.ERawType instanceof SequenceType){
					result.append("Sequence");
				}
				else if(type.ERawType instanceof BagType){
					result.append("Bag");
				}
				else if(type.ERawType instanceof OrderedSetType){
					result.append("OrderedSet");
				}
				else if(type.ERawType instanceof SetType){
					result.append("Set");	
				}
				
				//FIXME elementType can be a complex EClassifier
				//TODO < > characters for generics are platform dependent and should be moved to the platform specific type translator or these character should be configurable
				var elementtype = (type.ERawType as CollectionType).elementType;
				
				if(elementtype instanceof AnyType){
					result.append('''<object>''');	
				}
				else if(elementtype instanceof PrimitiveType){
					result.append('''<�mapPrimitiveType(elementtype)�>''');
				}
				
			}
//			else if(type.ERawType.instanceClassName!==null){
//				result.append('''Map.Entry<String, String>''');
//			}
			else if(type.EClassifier.name.equals(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY.name)){
				result.append('''Map.Entry<String, String>''');
			}
			else if(type.EClassifier instanceof EDataType){
				
				result.append(mapDataType(type.EClassifier as EDataType));
			}		
			else{
				result.append(type.EClassifier.name)	
			}
			//TODO < > characters for generics are platform dependent and should be moved to the platform specific type translator or these character should be configurable
			//TODO test this:
			result.append('''�FOR EGenericType argument: type.ETypeArguments BEFORE '<' SEPARATOR ',' AFTER '>'��if (argument.EClassifier==null) wildCardGenerics(argument) else translateType(argument)��ENDFOR�''');

		}
		else if(type.ETypeParameter !== null){
			result.append(type.ETypeParameter.name)	
		}
	
		return result.toString;

	}
	
	public abstract def String voidType(EGenericType type);
	public abstract def String wildCardGenerics(EGenericType type);
	public abstract def String classType(EGenericType type);
	
	
	public def String mapDataType(EDataType type){
		
		var result = mapPrimitiveType(type);
				
		if(result===null){
			result = mapComplexType(type);
		}
		
		if(result===null){
			return id.doSwitch(type);
		}
		
		return result;

	}
	
	public def boolean isPrimitiveType(EClassifier eclassifier){
		
		if(eclassifier instanceof EDataType == false){
			return false;
		}
		
		if(!UtilsCrossecore.isEcoreEPackage(eclassifier.EPackage)){
			return false;
			
		}
		
		switch eclassifier.name{
			case EcorePackage.Literals.EBOOLEAN.name: return true
			case EcorePackage.Literals.EINT.name: return true
			case EcorePackage.Literals.EDOUBLE.name: return true
			case EcorePackage.Literals.EFLOAT.name: return true
			case EcorePackage.Literals.ESTRING.name: return true
			case EcorePackage.Literals.ECHAR.name: return true
			case EcorePackage.Literals.EJAVA_OBJECT.name: return true
		}
		
		return false;
	}
	

	
	/**
	 * Dependency required
	 */
	public abstract def String mapComplexType(EDataType type);

	/**
	 * No dependencies required
	 */
	public abstract def String mapPrimitiveType(EDataType type);
	
	
	public def listType(boolean unique, boolean ordered){
		
		//return "oclstdlib."+super.listType(unique, ordered);
		if(!unique && !ordered){
			return "Bag"	
		}
		else if(!unique && ordered){
			return "Sequence"
		}
		else if(unique && !ordered){
			return "Set"
		}
		else if(unique && ordered){
			return "OrderedSet"
		}
		
	}
	
	
	def String defaultValue(EClassifier type){
		
		var x = type.defaultValue;
		
		if(type.defaultValue!==null){
			
			if(isPrimitiveType(type)){
				return type.defaultValue.toString
			}
			
			else if(type instanceof EEnum){
				
				var literal = type.defaultValue as EEnumLiteral;
				return type.name+"."+literal.name.toUpperCase;
			}
			else{
				return type.name+"."+type.defaultValue.toString;	
			}
			
		}
		
		var result = "";
		
						
		switch type.name{
				case EcorePackage.Literals.EBOOLEAN.name: result = "false"
				case EcorePackage.Literals.EINT.name: result="0"
				case EcorePackage.Literals.EDOUBLE.name: result = "0.0"
				case EcorePackage.Literals.EFLOAT.name: result = "0.0"
				case EcorePackage.Literals.ESTRING.name: result = '""'
				case EcorePackage.Literals.ECHAR.name: result = "''"
				case EcorePackage.Literals.EJAVA_OBJECT.name: result = "null"
				default: result = "null"			
			}
		
		return result;
	}
	
	
	
}