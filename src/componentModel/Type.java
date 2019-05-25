/**
 */
package componentModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentModel.Type#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * The literals are from the enumeration {@link componentModel.CBSDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see componentModel.CBSDataType
	 * @see #setTypeName(CBSDataType)
	 * @see componentModel.ComponentModelPackage#getType_TypeName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CBSDataType getTypeName();

	/**
	 * Sets the value of the '{@link componentModel.Type#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see componentModel.CBSDataType
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(CBSDataType value);

} // Type
