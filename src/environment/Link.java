/**
 */
package environment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.Link#getContainer <em>Container</em>}</li>
 *   <li>{@link environment.Link#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference list.
	 * The list contents are of type {@link environment.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference list.
	 * @see environment.EnvironmentPackage#getLink_Container()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<Container> getContainer();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see environment.EnvironmentPackage#getLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link environment.Link#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Link
