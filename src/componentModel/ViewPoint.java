/**
 */
package componentModel;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentModel.ViewPoint#getViewTypes <em>View Types</em>}</li>
 *   <li>{@link componentModel.ViewPoint#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getViewPoint()
 * @model abstract="true"
 * @generated
 */
public interface ViewPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>View Types</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.ViewType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Types</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getViewPoint_ViewTypes()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<ViewType> getViewTypes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see componentModel.ComponentModelPackage#getViewPoint_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentModel.ViewPoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ViewPoint
