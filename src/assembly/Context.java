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
 *   <li>{@link assembly.Context#getName <em>Name</em>}</li>
 *   <li>{@link assembly.Context#getOutwardAssemblyConnectors <em>Outward Assembly Connectors</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getContext()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='contextIsPartOfOutwardAssemblyConnectors'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot contextIsPartOfOutwardAssemblyConnectors='\n\t\tself.outwardAssemblyConnectors -&gt; forAll(aCon | aCon.providedrole.assemblyContext = self xor aCon.requiredrole.assemblyContext = self )'"
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
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getRequiredInterfaces();

	/**
	 * Returns the value of the '<em><b>Delegation Connectors</b></em>' reference list.
	 * The list contents are of type {@link assembly.DelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Connectors</em>' reference list.
	 * @see assembly.AssemblyPackage#getContext_DelegationConnectors()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DelegationConnector> getDelegationConnectors();

	/**
	 * Returns the value of the '<em><b>Nested Assembly Connectors</b></em>' reference list.
	 * The list contents are of type {@link assembly.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Assembly Connectors</em>' reference list.
	 * @see assembly.AssemblyPackage#getContext_NestedAssemblyConnectors()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AssemblyConnector> getNestedAssemblyConnectors();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assembly.AssemblyPackage#getContext_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assembly.Context#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outward Assembly Connectors</b></em>' reference list.
	 * The list contents are of type {@link assembly.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outward Assembly Connectors</em>' reference list.
	 * @see assembly.AssemblyPackage#getContext_OutwardAssemblyConnectors()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AssemblyConnector> getOutwardAssemblyConnectors();

} // Context
