/**
 */
package componentModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentModel.Branch#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends Action {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getBranch_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Branch
