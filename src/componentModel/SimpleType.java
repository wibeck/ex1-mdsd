/**
 */
package componentModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentModel.SimpleType#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getSimpleType()
 * @model
 * @generated
 */
public interface SimpleType extends Type {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * The literals are from the enumeration {@link componentModel.SimpleDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see componentModel.SimpleDataType
	 * @see #setTypeName(SimpleDataType)
	 * @see componentModel.ComponentModelPackage#getSimpleType_TypeName()
	 * @model required="true"
	 * @generated
	 */
	SimpleDataType getTypeName();

	/**
	 * Sets the value of the '{@link componentModel.SimpleType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see componentModel.SimpleDataType
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(SimpleDataType value);

} // SimpleType
