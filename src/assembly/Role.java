/**
 */
package assembly;

import componentModel.Interface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assembly.Role#getAssemblyContext <em>Assembly Context</em>}</li>
 *   <li>{@link assembly.Role#getName <em>Name</em>}</li>
 *   <li>{@link assembly.Role#getInterFace <em>Inter Face</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getRole()
 * @model abstract="true"
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' reference.
	 * @see #setAssemblyContext(AssemblyContext)
	 * @see assembly.AssemblyPackage#getRole_AssemblyContext()
	 * @model
	 * @generated
	 */
	AssemblyContext getAssemblyContext();

	/**
	 * Sets the value of the '{@link assembly.Role#getAssemblyContext <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context</em>' reference.
	 * @see #getAssemblyContext()
	 * @generated
	 */
	void setAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assembly.AssemblyPackage#getRole_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assembly.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Inter Face</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Face</em>' reference.
	 * @see #setInterFace(Interface)
	 * @see assembly.AssemblyPackage#getRole_InterFace()
	 * @model required="true"
	 * @generated
	 */
	Interface getInterFace();

	/**
	 * Sets the value of the '{@link assembly.Role#getInterFace <em>Inter Face</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Face</em>' reference.
	 * @see #getInterFace()
	 * @generated
	 */
	void setInterFace(Interface value);

} // Role
