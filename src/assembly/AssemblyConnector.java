/**
 */
package assembly;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assembly.AssemblyConnector#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link assembly.AssemblyConnector#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link assembly.AssemblyConnector#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getAssemblyConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='assemblyContextsNotEqual providedRoleHasRequiredInterface'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot assemblyContextsNotEqual='(not (self.providedRole.assemblyContext = self.requiredRole.assemblyContext)) = true' providedRoleHasRequiredInterface='self.providedRole.interFace = self.requiredRole.interFace'"
 * @generated
 */
public interface AssemblyConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role</em>' reference.
	 * @see #setProvidedRole(ProvidedRole)
	 * @see assembly.AssemblyPackage#getAssemblyConnector_ProvidedRole()
	 * @model required="true"
	 * @generated
	 */
	ProvidedRole getProvidedRole();

	/**
	 * Sets the value of the '{@link assembly.AssemblyConnector#getProvidedRole <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role</em>' reference.
	 * @see #getProvidedRole()
	 * @generated
	 */
	void setProvidedRole(ProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role</em>' reference.
	 * @see #setRequiredRole(RequiredRole)
	 * @see assembly.AssemblyPackage#getAssemblyConnector_RequiredRole()
	 * @model required="true"
	 * @generated
	 */
	RequiredRole getRequiredRole();

	/**
	 * Sets the value of the '{@link assembly.AssemblyConnector#getRequiredRole <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role</em>' reference.
	 * @see #getRequiredRole()
	 * @generated
	 */
	void setRequiredRole(RequiredRole value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assembly.AssemblyPackage#getAssemblyConnector_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assembly.AssemblyConnector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AssemblyConnector
