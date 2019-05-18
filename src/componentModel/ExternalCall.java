/**
 */
package componentModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentModel.ExternalCall#getRequiredService <em>Required Service</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getExternalCall()
 * @model
 * @generated
 */
public interface ExternalCall extends Action {
	/**
	 * Returns the value of the '<em><b>Required Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Service</em>' reference.
	 * @see #setRequiredService(Service)
	 * @see componentModel.ComponentModelPackage#getExternalCall_RequiredService()
	 * @model required="true"
	 * @generated
	 */
	Service getRequiredService();

	/**
	 * Sets the value of the '{@link componentModel.ExternalCall#getRequiredService <em>Required Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Service</em>' reference.
	 * @see #getRequiredService()
	 * @generated
	 */
	void setRequiredService(Service value);

} // ExternalCall
