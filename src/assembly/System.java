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
 *   <li>{@link assembly.System#getEncapsulated <em>Encapsulated</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='providedRoleForProvidedInterfaceExists requiredRoleForRequiredInterfaceExists'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot providedRoleForProvidedInterfaceExists='\n\t\tself.encapsulated -&gt; collect(providedRoles) -&gt; exists(role | providedInterfaces -&gt; includes(role.interFace))' requiredRoleForRequiredInterfaceExists='\n\t\tself.encapsulated -&gt; collect(requiredRoles) -&gt; exists(role | requiredInterfaces -&gt; includes(role.interFace))'"
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
	 * Returns the value of the '<em><b>Encapsulated</b></em>' reference list.
	 * The list contents are of type {@link assembly.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated</em>' reference list.
	 * @see assembly.AssemblyPackage#getSystem_Encapsulated()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AssemblyContext> getEncapsulated();

} // System
