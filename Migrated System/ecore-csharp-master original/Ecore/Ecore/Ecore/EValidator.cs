﻿/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ecore
{
    public interface EValidator
    {

        bool validate(EObject eObject, DiagnosticChain diagnostics, Dictionary<object, object> context);

        bool validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Dictionary<object, object> context);

        bool validate(EDataType eDataType, Object value, DiagnosticChain diagnostics, Dictionary<object, object> context);
    }
}
