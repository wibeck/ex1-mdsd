/**
 */
package assembly;

import componentModel.AssemblyViewType;
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
 * </ul>
 *
 * @see assembly.AssemblyPackage#getAssemblyContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='reqInterfacesFromRequiredRoles providedInterfacesFromProvidedRoles onlyDelegationConnectorsIfComposite providedRoleForProvidedInterfaceExistsAndIsConnected requiredRoleForRequiredInterfaceExistsAndIsConnected'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot reqInterfacesFromRequiredRoles='self.requiredInterfaces = self.requiredRoles -&gt; collect(interFace)' providedInterfacesFromProvidedRoles='self.providedInterfaces = self.providedRoles -&gt; collect(interFace)' onlyDelegationConnectorsIfComposite='if self.instantiates.oclIsKindOf(CompositeComponent) \n\t\tthen self.delegationConnectors -&gt; size() &gt; 0 else self.delegationConnectors -&gt; size() = 0 endif' providedRoleForProvidedInterfaceExistsAndIsConnected='\n\t\t\tif self.instantiates.oclIsKindOf(CompositeComponent) then \n\t\t\tself.providedInterfaces -&gt; forAll(interFace | self.instantiates.oclAsType(CompositeComponent).encapsulatedAssemblyContexts \n\t\t\t\t-&gt; collect(providedRoles) -&gt; exists(role | role.interFace = interFace and self.delegationConnectors -&gt; exists(connector | \n\t\t\t\t\tconnector.role = role and connector.interFace = interFace and connector.oclIsKindOf(assembly::ProvidedDelegationConnector)\n\t\t\t\t))) else true endif' requiredRoleForRequiredInterfaceExistsAndIsConnected='if self.instantiates.oclIsKindOf(CompositeComponent) then \n\t\tself.requiredInterfaces -&gt; forAll(interFace | self.instantiates.oclAsType(CompositeComponent).encapsulatedAssemblyContexts \n\t\t\t\t-&gt; collect(requiredRoles) -&gt; exists(role | role.interFace = interFace and self.delegationConnectors -&gt; exists(connector | \n\t\t\t\t\tconnector.role = role and connector.interFace = interFace and connector.oclIsKindOf(assembly::RequiredDelegationConnector)\n\t\t\t\t))) else true endif'"
 * @generated
 */
public interface AssemblyContext extends Context, AssemblyViewType {
	/**
	 * Returns the value of the '<em><b>Instantiates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates</em>' reference.
	 * @see #setInstantiates(Component)
	 * @see assembly.AssemblyPackage#getAssemblyContext_Instantiates()
	 * @model required="true" ordered="false"
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
	 * @model ordered="false"
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

} // AssemblyContext
