/**
 */
package root;

import assembly.ContextEnvironment;

import componentModel.Repository;

import environment.Environment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link root.RootClass#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link root.RootClass#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link root.RootClass#getContextEnvironment <em>Context Environment</em>}</li>
 * </ul>
 *
 * @see root.RootPackage#getRootClass()
 * @model
 * @generated
 */
public interface RootClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link environment.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see root.RootPackage#getRootClass_Environments()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Environment> getEnvironments();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see root.RootPackage#getRootClass_Repositories()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Repository> getRepositories();

	/**
	 * Returns the value of the '<em><b>Context Environment</b></em>' containment reference list.
	 * The list contents are of type {@link assembly.ContextEnvironment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Environment</em>' containment reference list.
	 * @see root.RootPackage#getRootClass_ContextEnvironment()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ContextEnvironment> getContextEnvironment();

} // RootClass
