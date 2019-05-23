/**
 */
package componentModel.impl;

import componentModel.ComponentModelPackage;
import componentModel.Interface;
import componentModel.InterfaceServiceMapEntry;
import componentModel.Service;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Service Map Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentModel.impl.InterfaceServiceMapEntryImpl#getProvidedInterface <em>Provided Interface</em>}</li>
 *   <li>{@link componentModel.impl.InterfaceServiceMapEntryImpl#getServices <em>Services</em>}</li>
 *   <li>{@link componentModel.impl.InterfaceServiceMapEntryImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceServiceMapEntryImpl extends MinimalEObjectImpl.Container implements InterfaceServiceMapEntry {
	/**
	 * The cached value of the '{@link #getProvidedInterface() <em>Provided Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface providedInterface;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceServiceMapEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentModelPackage.Literals.INTERFACE_SERVICE_MAP_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getProvidedInterface() {
		if (providedInterface != null && providedInterface.eIsProxy()) {
			InternalEObject oldProvidedInterface = (InternalEObject)providedInterface;
			providedInterface = (Interface)eResolveProxy(oldProvidedInterface);
			if (providedInterface != oldProvidedInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__PROVIDED_INTERFACE, oldProvidedInterface, providedInterface));
			}
		}
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetProvidedInterface() {
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvidedInterface(Interface newProvidedInterface) {
		Interface oldProvidedInterface = providedInterface;
		providedInterface = newProvidedInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__PROVIDED_INTERFACE, oldProvidedInterface, providedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<Service>(Service.class, this, ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__SERVICES);
		}
		return services;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__PROVIDED_INTERFACE:
				if (resolve) return getProvidedInterface();
				return basicGetProvidedInterface();
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__SERVICES:
				return getServices();
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__NAME:
				return getName();
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
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__PROVIDED_INTERFACE:
				setProvidedInterface((Interface)newValue);
				return;
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__NAME:
				setName((String)newValue);
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
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__PROVIDED_INTERFACE:
				setProvidedInterface((Interface)null);
				return;
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__SERVICES:
				getServices().clear();
				return;
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__NAME:
				setName(NAME_EDEFAULT);
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
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__PROVIDED_INTERFACE:
				return providedInterface != null;
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__SERVICES:
				return services != null && !services.isEmpty();
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //InterfaceServiceMapEntryImpl
