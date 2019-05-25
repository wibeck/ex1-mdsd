/**
 */
package assembly;

import componentModel.Interface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assembly.DelegationConnector#getInterFace <em>Inter Face</em>}</li>
 *   <li>{@link assembly.DelegationConnector#getRole <em>Role</em>}</li>
 *   <li>{@link assembly.DelegationConnector#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getDelegationConnector()
 * @model abstract="true"
 * @generated
 */
public interface DelegationConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Inter Face</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Face</em>' reference.
	 * @see #setInterFace(Interface)
	 * @see assembly.AssemblyPackage#getDelegationConnector_InterFace()
	 * @model required="true"
	 * @generated
	 */
	Interface getInterFace();

	/**
	 * Sets the value of the '{@link assembly.DelegationConnector#getInterFace <em>Inter Face</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Face</em>' reference.
	 * @see #getInterFace()
	 * @generated
	 */
	void setInterFace(Interface value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see assembly.AssemblyPackage#getDelegationConnector_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link assembly.DelegationConnector#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assembly.AssemblyPackage#getDelegationConnector_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assembly.DelegationConnector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DelegationConnector
