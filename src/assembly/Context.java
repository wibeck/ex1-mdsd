/**
 */
package assembly;

import componentModel.Interface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assembly.Context#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link assembly.Context#getDelegationConnectors <em>Delegation Connectors</em>}</li>
 *   <li>{@link assembly.Context#getNestedAssemblyConnectors <em>Nested Assembly Connectors</em>}</li>
 *   <li>{@link assembly.Context#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getContext()
 * @model abstract="true"
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' reference list.
	 * The list contents are of type {@link componentModel.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' reference list.
	 * @see assembly.AssemblyPackage#getContext_RequiredInterfaces()
	 * @model keys="name" ordered="false"
	 * @generated
	 */
	EList<Interface> getRequiredInterfaces();

	/**
	 * Returns the value of the '<em><b>Delegation Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link assembly.DelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Connectors</em>' containment reference list.
	 * @see assembly.AssemblyPackage#getContext_DelegationConnectors()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<DelegationConnector> getDelegationConnectors();

	/**
	 * Returns the value of the '<em><b>Nested Assembly Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link assembly.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Assembly Connectors</em>' containment reference list.
	 * @see assembly.AssemblyPackage#getContext_NestedAssemblyConnectors()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<AssemblyConnector> getNestedAssemblyConnectors();

	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' reference list.
	 * The list contents are of type {@link componentModel.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' reference list.
	 * @see assembly.AssemblyPackage#getContext_ProvidedInterfaces()
	 * @model keys="name" required="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getProvidedInterfaces();

} // Context
