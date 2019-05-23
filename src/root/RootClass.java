/**
 */
package root;

import assembly.ContextEnvironment;
import componentModel.ViewPoint;
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
 *   <li>{@link root.RootClass#getViewPoints <em>View Points</em>}</li>
 *   <li>{@link root.RootClass#getContextEnvironments <em>Context Environments</em>}</li>
 * </ul>
 *
 * @see root.RootPackage#getRootClass()
 * @model
 * @generated
 */
public interface RootClass extends EObject {
	/**
	 * Returns the value of the '<em><b>View Points</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.ViewPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Points</em>' containment reference list.
	 * @see root.RootPackage#getRootClass_ViewPoints()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ViewPoint> getViewPoints();

	/**
	 * Returns the value of the '<em><b>Context Environments</b></em>' containment reference list.
	 * The list contents are of type {@link assembly.ContextEnvironment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Environments</em>' containment reference list.
	 * @see root.RootPackage#getRootClass_ContextEnvironments()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ContextEnvironment> getContextEnvironments();

} // RootClass
