/**
 */
package componentModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentModel.ViewPoint#getViewtypes <em>Viewtypes</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getViewPoint()
 * @model abstract="true"
 * @generated
 */
public interface ViewPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Viewtypes</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.ViewType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewtypes</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getViewPoint_Viewtypes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ViewType> getViewtypes();

} // ViewPoint
