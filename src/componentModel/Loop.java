/**
 */
package componentModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentModel.Loop#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Action {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getLoop_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Loop
