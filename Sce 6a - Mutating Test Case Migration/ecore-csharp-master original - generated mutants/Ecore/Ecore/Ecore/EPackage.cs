/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */
 
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using oclstdlib;
namespace Ecore{
	
	public interface EPackage 
	: ENamedElement
	{
		string nsURI
		{
			get;
		set;
		}
		string nsPrefix
		{
			get;
		set;
		}
		EFactory eFactoryInstance
		{
			get;
			set;
		}
		OrderedSet<EClassifier> eClassifiers
		{
			get;
		
		}
		OrderedSet<EPackage> eSubpackages
		{
			get;
		
		}
		EPackage eSuperPackage
		{
			get;
		}
		EClassifier getEClassifier(string name);
	}
}
