/**
 */
package assembly;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assembly.ContextEnvironment#getCompositeComponents <em>Composite Components</em>}</li>
 *   <li>{@link assembly.ContextEnvironment#getDelegationConnectors <em>Delegation Connectors</em>}</li>
 *   <li>{@link assembly.ContextEnvironment#getRoles <em>Roles</em>}</li>
 *   <li>{@link assembly.ContextEnvironment#getName <em>Name</em>}</li>
 *   <li>{@link assembly.ContextEnvironment#getContexts <em>Contexts</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getContextEnvironment()
 * @model
 * @generated
 */
public interface ContextEnvironment extends EObject {
	/**
	 * Returns the value of the '<em><b>Composite Components</b></em>' containment reference list.
	 * The list contents are of type {@link assembly.CompositeComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Components</em>' containment reference list.
	 * @see assembly.AssemblyPackage#getContextEnvironment_CompositeComponents()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<CompositeComponent> getCompositeComponents();

	/**
	 * Returns the value of the '<em><b>Delegation Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link assembly.DelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Connectors</em>' containment reference list.
	 * @see assembly.AssemblyPackage#getContextEnvironment_DelegationConnectors()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<DelegationConnector> getDelegationConnectors();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link assembly.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see assembly.AssemblyPackage#getContextEnvironment_Roles()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assembly.AssemblyPackage#getContextEnvironment_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assembly.ContextEnvironment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link assembly.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see assembly.AssemblyPackage#getContextEnvironment_Contexts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Context> getContexts();

} // ContextEnvironment
