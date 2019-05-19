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
 *   <li>{@link assembly.AssemblyConnector#getProvidedrole <em>Providedrole</em>}</li>
 *   <li>{@link assembly.AssemblyConnector#getRequiredrole <em>Requiredrole</em>}</li>
 *   <li>{@link assembly.AssemblyConnector#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getAssemblyConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='assemblyContextsNotEqual providedRoleHasRequiredInterface'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot assemblyContextsNotEqual='(not (self.providedrole.assemblyContext = self.requiredrole.assemblyContext)) = true' providedRoleHasRequiredInterface='self.providedrole.interFace = self.requiredrole.interFace'"
 * @generated
 */
public interface AssemblyConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Providedrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedrole</em>' containment reference.
	 * @see #setProvidedrole(ProvidedRole)
	 * @see assembly.AssemblyPackage#getAssemblyConnector_Providedrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProvidedRole getProvidedrole();

	/**
	 * Sets the value of the '{@link assembly.AssemblyConnector#getProvidedrole <em>Providedrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providedrole</em>' containment reference.
	 * @see #getProvidedrole()
	 * @generated
	 */
	void setProvidedrole(ProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Requiredrole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiredrole</em>' containment reference.
	 * @see #setRequiredrole(RequiredRole)
	 * @see assembly.AssemblyPackage#getAssemblyConnector_Requiredrole()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RequiredRole getRequiredrole();

	/**
	 * Sets the value of the '{@link assembly.AssemblyConnector#getRequiredrole <em>Requiredrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requiredrole</em>' containment reference.
	 * @see #getRequiredrole()
	 * @generated
	 */
	void setRequiredrole(RequiredRole value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assembly.AssemblyPackage#getAssemblyConnector_Name()
	 * @model
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
