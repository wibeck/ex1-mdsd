/**
 */
package componentModel;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentModel.Component#getName <em>Name</em>}</li>
 *   <li>{@link componentModel.Component#getInterfaceServiceMap <em>Interface Service Map</em>}</li>
 *   <li>{@link componentModel.Component#getServiceeffectspecification <em>Serviceeffectspecification</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='servicesForEachSignatreOfRequiredInterfaces'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot servicesForEachSignatreOfRequiredInterfaces='self.interfaceServiceMap -&gt;select(entry | entry.service \n\t\t\t-&gt; select(service| service.correspondence -&gt; union(entry.providedInterface.signatures)\n\t\t))  -&gt; notEmpty()'"
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see componentModel.ComponentModelPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentModel.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interface Service Map</b></em>' containment reference list.
	 * The list contents are of type {@link componentModel.InterfaceServiceMapEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Service Map</em>' containment reference list.
	 * @see componentModel.ComponentModelPackage#getComponent_InterfaceServiceMap()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<InterfaceServiceMapEntry> getInterfaceServiceMap();

	/**
	 * Returns the value of the '<em><b>Serviceeffectspecification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceeffectspecification</em>' containment reference.
	 * @see #setServiceeffectspecification(ServiceEffectSpecification)
	 * @see componentModel.ComponentModelPackage#getComponent_Serviceeffectspecification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServiceEffectSpecification getServiceeffectspecification();

	/**
	 * Sets the value of the '{@link componentModel.Component#getServiceeffectspecification <em>Serviceeffectspecification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviceeffectspecification</em>' containment reference.
	 * @see #getServiceeffectspecification()
	 * @generated
	 */
	void setServiceeffectspecification(ServiceEffectSpecification value);

} // Component
