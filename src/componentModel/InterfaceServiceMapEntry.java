/**
 */
package componentModel;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Service Map Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentModel.InterfaceServiceMapEntry#getProvidedInterface <em>Provided Interface</em>}</li>
 *   <li>{@link componentModel.InterfaceServiceMapEntry#getService <em>Service</em>}</li>
 *   <li>{@link componentModel.InterfaceServiceMapEntry#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getInterfaceServiceMapEntry()
 * @model
 * @generated
 */
public interface InterfaceServiceMapEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Provided Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interface</em>' reference.
	 * @see #setProvidedInterface(Interface)
	 * @see componentModel.ComponentModelPackage#getInterfaceServiceMapEntry_ProvidedInterface()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interface getProvidedInterface();

	/**
	 * Sets the value of the '{@link componentModel.InterfaceServiceMapEntry#getProvidedInterface <em>Provided Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Interface</em>' reference.
	 * @see #getProvidedInterface()
	 * @generated
	 */
	void setProvidedInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference list.
	 * The list contents are of type {@link componentModel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference list.
	 * @see componentModel.ComponentModelPackage#getInterfaceServiceMapEntry_Service()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see componentModel.ComponentModelPackage#getInterfaceServiceMapEntry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentModel.InterfaceServiceMapEntry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // InterfaceServiceMapEntry
