/**
 */
package assembly;

import componentModel.Component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assembly.AssemblyContext#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link assembly.AssemblyContext#getRequiredRoles <em>Required Roles</em>}</li>
 *   <li>{@link assembly.AssemblyContext#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link assembly.AssemblyContext#getOwnerComponent <em>Owner Component</em>}</li>
 *   <li>{@link assembly.AssemblyContext#getOutwardAssemblyConnectors <em>Outward Assembly Connectors</em>}</li>
 *   <li>{@link assembly.AssemblyContext#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getAssemblyContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='reqInterfacesFromRequiredRoles providedInterfacesFromProvidedRoles onlyDelegationConnectorsIfComposite providedRoleForProvidedInterfaceExistsAndIsConnected requiredRoleForRequiredInterfaceExistsAndIsConnected assemblyContextIsPartOfOutwardAssemblyConnectors'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot reqInterfacesFromRequiredRoles='self.requiredInterfaces = self.requiredRoles -&gt; collect(interFace)' providedInterfacesFromProvidedRoles='self.providedInterfaces = self.providedRoles -&gt; collect(interFace)' onlyDelegationConnectorsIfComposite='if self.instantiates.oclIsKindOf(CompositeComponent) \n\t\tthen self.delegationConnectors -&gt; size() &gt; 0 else self.delegationConnectors -&gt; size() = 0 endif' providedRoleForProvidedInterfaceExistsAndIsConnected='\n\t\t\tif self.instantiates.oclIsKindOf(CompositeComponent) then \n\t\t\tself.providedInterfaces -&gt; forAll(interFace | self.instantiates.oclAsType(CompositeComponent).encapsulatedAssemblyContexts \n\t\t\t\t-&gt; collect(providedRoles) -&gt; exists(role | role.interFace = interFace and self.delegationConnectors -&gt; exists(connector | \n\t\t\t\t\tconnector.role = role and connector.interFace = interFace and connector.oclIsKindOf(assembly::ProvidedDelegationConnector)\n\t\t\t\t))) else true endif' requiredRoleForRequiredInterfaceExistsAndIsConnected='if self.instantiates.oclIsKindOf(CompositeComponent) then \n\t\tself.requiredInterfaces -&gt; forAll(interFace | self.instantiates.oclAsType(CompositeComponent).encapsulatedAssemblyContexts \n\t\t\t\t-&gt; collect(requiredRoles) -&gt; exists(role | role.interFace = interFace and self.delegationConnectors -&gt; exists(connector | \n\t\t\t\t\tconnector.role = role and connector.interFace = interFace and connector.oclIsKindOf(assembly::RequiredDelegationConnector)\n\t\t\t\t))) else true endif' assemblyContextIsPartOfOutwardAssemblyConnectors='\n\t\tself.outwardAssemblyConnectors -&gt; forAll(aCon | aCon.providedRole.assemblyContext = self xor aCon.requiredRole.assemblyContext = self )'"
 * @generated
 */
public interface AssemblyContext extends Context {
	/**
	 * Returns the value of the '<em><b>Instantiates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates</em>' reference.
	 * @see #setInstantiates(Component)
	 * @see assembly.AssemblyPackage#getAssemblyContext_Instantiates()
	 * @model required="true"
	 * @generated
	 */
	Component getInstantiates();

	/**
	 * Sets the value of the '{@link assembly.AssemblyContext#getInstantiates <em>Instantiates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates</em>' reference.
	 * @see #getInstantiates()
	 * @generated
	 */
	void setInstantiates(Component value);

	/**
	 * Returns the value of the '<em><b>Required Roles</b></em>' containment reference list.
	 * The list contents are of type {@link assembly.RequiredRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Roles</em>' containment reference list.
	 * @see assembly.AssemblyPackage#getAssemblyContext_RequiredRoles()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<RequiredRole> getRequiredRoles();

	/**
	 * Returns the value of the '<em><b>Provided Roles</b></em>' containment reference list.
	 * The list contents are of type {@link assembly.ProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Roles</em>' containment reference list.
	 * @see assembly.AssemblyPackage#getAssemblyContext_ProvidedRoles()
	 * @model containment="true" keys="name" required="true" ordered="false"
	 * @generated
	 */
	EList<ProvidedRole> getProvidedRoles();

	/**
	 * Returns the value of the '<em><b>Owner Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Component</em>' reference.
	 * @see #setOwnerComponent(CompositeComponent)
	 * @see assembly.AssemblyPackage#getAssemblyContext_OwnerComponent()
	 * @model
	 * @generated
	 */
	CompositeComponent getOwnerComponent();

	/**
	 * Sets the value of the '{@link assembly.AssemblyContext#getOwnerComponent <em>Owner Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Component</em>' reference.
	 * @see #getOwnerComponent()
	 * @generated
	 */
	void setOwnerComponent(CompositeComponent value);

	/**
	 * Returns the value of the '<em><b>Outward Assembly Connectors</b></em>' reference list.
	 * The list contents are of type {@link assembly.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outward Assembly Connectors</em>' reference list.
	 * @see assembly.AssemblyPackage#getAssemblyContext_OutwardAssemblyConnectors()
	 * @model keys="name" ordered="false"
	 * @generated
	 */
	EList<AssemblyConnector> getOutwardAssemblyConnectors();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assembly.AssemblyPackage#getAssemblyContext_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assembly.AssemblyContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AssemblyContext
