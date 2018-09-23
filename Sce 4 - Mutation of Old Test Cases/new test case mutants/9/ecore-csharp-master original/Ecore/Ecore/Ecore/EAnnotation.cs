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
	
	public interface EAnnotation 
	: EModelElement
	{
		string source
		{
			get;
		set;
		}
		EMap<string, string> details
		{
			get;
		
		}
		EModelElement eModelElement
		{
			get;
			set;
		}
		OrderedSet<EObject> contents
		{
			get;
		
		}
		OrderedSet<EObject> references
		{
			get;
		
		}
	}
}
