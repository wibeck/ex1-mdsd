/**
 */
package componentModel;

import java.lang.String;

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
 *   <li>{@link componentModel.Repository#getComponent <em>Component</em>}</li>
 *   <li>{@link componentModel.Repository#getInterFace <em>Inter Face</em>}</li>
 *   <li>{@link componentModel.Repository#getName <em>Name</em>}</li>
 *   <li>{@link componentModel.Repository#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link componentModel.Repository#getTypes <em>Types</em>}</li>
 *   <li>{@link componentModel.Repository#getServices <em>Services</em>}</li>
 *   <li>{@link componentModel.Repository#getInterfaceservicemapentry <em>Interfaceservicemapentry</em>}</li>
 *   <li>{@link componentModel.Repository#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends RepositoryViewType {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getRepository_Component()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Inter Face</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Face</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getRepository_InterFace()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getInterFace();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see componentModel.ComponentModelPackage#getRepository_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentModel.Repository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getRepository_Signatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signature> getSignatures();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getRepository_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getRepository_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Interfaceservicemapentry</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.InterfaceServiceMapEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaceservicemapentry</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getRepository_Interfaceservicemapentry()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceServiceMapEntry> getInterfaceservicemapentry();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getRepository_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Repository
