/**
 */
package componentModel.impl;

import componentModel.Component;
import componentModel.ComponentModelPackage;
import componentModel.Interface;
import componentModel.InterfaceServiceMapEntry;
import componentModel.ServiceEffectSpecification;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentModel.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link componentModel.impl.ComponentImpl#getInterfaceServiceMap <em>Interface Service Map</em>}</li>
 *   <li>{@link componentModel.impl.ComponentImpl#getServiceEffectSpecification <em>Service Effect Specification</em>}</li>
 *   <li>{@link componentModel.impl.ComponentImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaceServiceMap() <em>Interface Service Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceServiceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceServiceMapEntry> interfaceServiceMap;

	/**
	 * The cached value of the '{@link #getServiceEffectSpecification() <em>Service Effect Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceEffectSpecification()
	 * @generated
	 * @ordered
	 */
	protected ServiceEffectSpecification serviceEffectSpecification;

	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> requiredInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentModelPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceServiceMapEntry> getInterfaceServiceMap() {
		if (interfaceServiceMap == null) {
			interfaceServiceMap = new EObjectContainmentEList<InterfaceServiceMapEntry>(InterfaceServiceMapEntry.class, this, ComponentModelPackage.COMPONENT__INTERFACE_SERVICE_MAP);
		}
		return interfaceServiceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceEffectSpecification getServiceEffectSpecification() {
		return serviceEffectSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceEffectSpecification(ServiceEffectSpecification newServiceEffectSpecification, NotificationChain msgs) {
		ServiceEffectSpecification oldServiceEffectSpecification = serviceEffectSpecification;
		serviceEffectSpecification = newServiceEffectSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentModelPackage.COMPONENT__SERVICE_EFFECT_SPECIFICATION, oldServiceEffectSpecification, newServiceEffectSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceEffectSpecification(ServiceEffectSpecification newServiceEffectSpecification) {
		if (newServiceEffectSpecification != serviceEffectSpecification) {
			NotificationChain msgs = null;
			if (serviceEffectSpecification != null)
				msgs = ((InternalEObject)serviceEffectSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentModelPackage.COMPONENT__SERVICE_EFFECT_SPECIFICATION, null, msgs);
			if (newServiceEffectSpecification != null)
				msgs = ((InternalEObject)newServiceEffectSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentModelPackage.COMPONENT__SERVICE_EFFECT_SPECIFICATION, null, msgs);
			msgs = basicSetServiceEffectSpecification(newServiceEffectSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.COMPONENT__SERVICE_EFFECT_SPECIFICATION, newServiceEffectSpecification, newServiceEffectSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, ComponentModelPackage.COMPONENT__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentModelPackage.COMPONENT__INTERFACE_SERVICE_MAP:
				return ((InternalEList<?>)getInterfaceServiceMap()).basicRemove(otherEnd, msgs);
			case ComponentModelPackage.COMPONENT__SERVICE_EFFECT_SPECIFICATION:
				return basicSetServiceEffectSpecification(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentModelPackage.COMPONENT__NAME:
				return getName();
			case ComponentModelPackage.COMPONENT__INTERFACE_SERVICE_MAP:
				return getInterfaceServiceMap();
			case ComponentModelPackage.COMPONENT__SERVICE_EFFECT_SPECIFICATION:
				return getServiceEffectSpecification();
			case ComponentModelPackage.COMPONENT__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentModelPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ComponentModelPackage.COMPONENT__INTERFACE_SERVICE_MAP:
				getInterfaceServiceMap().clear();
				getInterfaceServiceMap().addAll((Collection<? extends InterfaceServiceMapEntry>)newValue);
				return;
			case ComponentModelPackage.COMPONENT__SERVICE_EFFECT_SPECIFICATION:
				setServiceEffectSpecification((ServiceEffectSpecification)newValue);
				return;
			case ComponentModelPackage.COMPONENT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				getRequiredInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentModelPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentModelPackage.COMPONENT__INTERFACE_SERVICE_MAP:
				getInterfaceServiceMap().clear();
				return;
			case ComponentModelPackage.COMPONENT__SERVICE_EFFECT_SPECIFICATION:
				setServiceEffectSpecification((ServiceEffectSpecification)null);
				return;
			case ComponentModelPackage.COMPONENT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentModelPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentModelPackage.COMPONENT__INTERFACE_SERVICE_MAP:
				return interfaceServiceMap != null && !interfaceServiceMap.isEmpty();
			case ComponentModelPackage.COMPONENT__SERVICE_EFFECT_SPECIFICATION:
				return serviceEffectSpecification != null;
			case ComponentModelPackage.COMPONENT__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
