/**
 */
package assembly;

import componentModel.AssemblyViewType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assembly.ContextEnvironment#getContexts <em>Contexts</em>}</li>
 *   <li>{@link assembly.ContextEnvironment#getAssemblyConnectors <em>Assembly Connectors</em>}</li>
 *   <li>{@link assembly.ContextEnvironment#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getContextEnvironment()
 * @model
 * @generated
 */
public interface ContextEnvironment extends AssemblyViewType {
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

	/**
	 * Returns the value of the '<em><b>Assembly Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link assembly.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Connectors</em>' containment reference list.
	 * @see assembly.AssemblyPackage#getContextEnvironment_AssemblyConnectors()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<AssemblyConnector> getAssemblyConnectors();

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

} // ContextEnvironment
