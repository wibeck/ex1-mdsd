/**
 */
package componentModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentModel.Repository#getComponents <em>Components</em>}</li>
 *   <li>{@link componentModel.Repository#getInterFaces <em>Inter Faces</em>}</li>
 *   <li>{@link componentModel.Repository#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link componentModel.Repository#getServices <em>Services</em>}</li>
 *   <li>{@link componentModel.Repository#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends RepositoryViewType {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getRepository_Components()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Inter Faces</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Faces</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getRepository_InterFaces()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Interface> getInterFaces();

	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getRepository_Signatures()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Signature> getSignatures();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getRepository_Services()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getRepository_DataTypes()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<DataType> getDataTypes();

} // Repository
