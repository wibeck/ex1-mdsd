/**
 */
package environment;

import componentModel.EnvironmentViewType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.Environment#getContainer <em>Container</em>}</li>
 *   <li>{@link environment.Environment#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EnvironmentViewType {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link environment.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see environment.EnvironmentPackage#getEnvironment_Container()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Container> getContainer();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link environment.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see environment.EnvironmentPackage#getEnvironment_Link()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Link> getLink();

} // Environment
