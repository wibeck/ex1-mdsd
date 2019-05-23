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
 *   <li>{@link componentModel.Component#getServiceEffectSpecification <em>Service Effect Specification</em>}</li>
 * </ul>
 *
 * @see componentModel.ComponentModelPackage#getComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='servicesForEachSignatureOfProvidedInterfaces'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot servicesForEachSignatureOfProvidedInterfaces='self.interfaceServiceMap -&gt; forAll(entry | entry.services -&gt; \n\t\t\tcollect(correspondence) -&gt; intersection(entry.providedInterface.signatures) -&gt; size() \n\t\t\t=  entry.providedInterface.signatures -&gt; size())'"
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
	 * Returns the value of the '<em><b>Service Effect Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Effect Specification</em>' containment reference.
	 * @see #setServiceEffectSpecification(ServiceEffectSpecification)
	 * @see componentModel.ComponentModelPackage#getComponent_ServiceEffectSpecification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServiceEffectSpecification getServiceEffectSpecification();

	/**
	 * Sets the value of the '{@link componentModel.Component#getServiceEffectSpecification <em>Service Effect Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Effect Specification</em>' containment reference.
	 * @see #getServiceEffectSpecification()
	 * @generated
	 */
	void setServiceEffectSpecification(ServiceEffectSpecification value);

} // Component
