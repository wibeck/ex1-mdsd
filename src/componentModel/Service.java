/**
 */
package componentModel;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentModel.Service#getName <em>Name</em>}</li>
 *   <li>{@link componentModel.Service#getCorrespondence <em>Correspondence</em>}</li>
 *   <li>{@link componentModel.Service#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see componentModel.ComponentModelPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentModel.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Correspondence</b></em>' reference list.
	 * The list contents are of type {@link componentModel.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspondence</em>' reference list.
	 * @see componentModel.ComponentModelPackage#getService_Correspondence()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Signature> getCorrespondence();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link componentModel.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see componentModel.ComponentModelPackage#getService_Required()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getRequired();

} // Service
