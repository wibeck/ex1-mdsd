/**
 */
package assembly;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Role</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see assembly.AssemblyPackage#getRequiredRole()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='requiredInterfaceFromServiceThatRequiresIt'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot requiredInterfaceFromServiceThatRequiresIt='self.assemblyContext.instantiates.interfaceServiceMap -&gt;exists(entry | entry.service -&gt; select(service| service.required \n\t\t-&gt; includes(self.interFace)))  -&gt; notEmpty() and not (self.assemblyContext.instantiates = null)'"
 * @generated
 */
public interface RequiredRole extends Role {
} // RequiredRole
