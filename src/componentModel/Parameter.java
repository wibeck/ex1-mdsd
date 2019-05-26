/**
 */
package componentModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentModel.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link componentModel.Parameter#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='VoidNotParameterType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot VoidNotParameterType='if self.parameterType.oclIsKindOf(SimpleType) then self.parameterType.oclAsType(SimpleType) \n\t\t\t\t\t\t\t\t\t\t&lt;&gt; SimpleDataType::VOID else true endif'"
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see componentModel.ComponentModelPackage#getParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentModel.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' reference.
	 * @see #setParameterType(Type)
	 * @see componentModel.ComponentModelPackage#getParameter_ParameterType()
	 * @model required="true"
	 * @generated
	 */
	Type getParameterType();

	/**
	 * Sets the value of the '{@link componentModel.Parameter#getParameterType <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(Type value);

} // Parameter
