/**
 */
package assembly;

import componentModel.Interface;

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
 *   <li>{@link assembly.System#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link assembly.System#getEncapsulatedAssemblyContexts <em>Encapsulated Assembly Contexts</em>}</li>
 *   <li>{@link assembly.System#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='providedRoleForProvidedInterfaceExists requiredRoleForRequiredInterfaceExists'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot providedRoleForProvidedInterfaceExists='\n\t\tself.encapsulatedAssemblyContexts -&gt; collect(providedRoles) -&gt; forAll(role | providedInterfaces -&gt; includes(role.interFace))' requiredRoleForRequiredInterfaceExists='\n\t\tself.encapsulatedAssemblyContexts -&gt; collect(requiredRoles) -&gt; forAll(role | requiredInterfaces -&gt; includes(role.interFace))'"
 * @generated
 */
public interface System extends Context {
	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' reference list.
	 * The list contents are of type {@link componentModel.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' reference list.
	 * @see assembly.AssemblyPackage#getSystem_ProvidedInterfaces()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Encapsulated Assembly Contexts</b></em>' reference list.
	 * The list contents are of type {@link assembly.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated Assembly Contexts</em>' reference list.
	 * @see assembly.AssemblyPackage#getSystem_EncapsulatedAssemblyContexts()
	 * @model ordered="false"
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
	 * @model
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
