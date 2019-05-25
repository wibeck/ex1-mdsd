/**
 */
package assembly;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assembly.System#getEncapsulatedAssemblyContexts <em>Encapsulated Assembly Contexts</em>}</li>
 *   <li>{@link assembly.System#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='providedRoleForProvidedInterfaceExistsAndIsConnected requiredRoleForRequiredInterfaceExistsAndIsConnected'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot providedRoleForProvidedInterfaceExistsAndIsConnected='\n\t\tself.providedInterfaces -&gt; forAll(interFace | self.encapsulatedAssemblyContexts -&gt; collect(providedRoles) \n\t\t\t-&gt; exists(role | role.interFace = interFace and self.delegationConnectors -&gt; exists(connector | connector.role = role \n\t\t\t\tand connector.interFace = interFace and connector.oclIsKindOf(assembly::ProvidedDelegationConnector)) ))' requiredRoleForRequiredInterfaceExistsAndIsConnected='\n\t\tself.requiredInterfaces -&gt; forAll(interFace | self.encapsulatedAssemblyContexts -&gt; collect(requiredRoles) \n\t\t\t-&gt; exists(role | role.interFace = interFace and self.delegationConnectors -&gt; exists(connector | connector.role = role \n\t\t\t\tand connector.interFace = interFace and connector.oclIsKindOf(assembly::RequiredDelegationConnector)) ))'"
 * @generated
 */
public interface System extends Context {
	/**
	 * Returns the value of the '<em><b>Encapsulated Assembly Contexts</b></em>' reference list.
	 * The list contents are of type {@link assembly.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated Assembly Contexts</em>' reference list.
	 * @see assembly.AssemblyPackage#getSystem_EncapsulatedAssemblyContexts()
	 * @model keys="name" ordered="false"
	 * @generated
	 */
	EList<AssemblyContext> getEncapsulatedAssemblyContexts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assembly.AssemblyPackage#getSystem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assembly.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // System
