/**
 */
package environment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.Container#getName <em>Name</em>}</li>
 *   <li>{@link environment.Container#getAllocationcontext <em>Allocationcontext</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see environment.EnvironmentPackage#getContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link environment.Container#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Allocationcontext</b></em>' reference list.
	 * The list contents are of type {@link environment.AllocationContext}.
	 * It is bidirectional and its opposite is '{@link environment.AllocationContext#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocationcontext</em>' reference list.
	 * @see environment.EnvironmentPackage#getContainer_Allocationcontext()
	 * @see environment.AllocationContext#getContainer
	 * @model opposite="container" required="true" ordered="false"
	 * @generated
	 */
	EList<AllocationContext> getAllocationcontext();

} // Container
