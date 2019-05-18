/**
 */
package componentModel.impl;

import componentModel.Component;
import componentModel.ComponentModelPackage;
import componentModel.Interface;
import componentModel.InterfaceServiceMapEntry;
import componentModel.Repository;
import componentModel.Service;
import componentModel.Signature;
import componentModel.Type;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentModel.impl.RepositoryImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link componentModel.impl.RepositoryImpl#getInterFace <em>Inter Face</em>}</li>
 *   <li>{@link componentModel.impl.RepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link componentModel.impl.RepositoryImpl#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link componentModel.impl.RepositoryImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link componentModel.impl.RepositoryImpl#getServices <em>Services</em>}</li>
 *   <li>{@link componentModel.impl.RepositoryImpl#getInterfaceservicemapentry <em>Interfaceservicemapentry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends RepositoryViewTypeImpl implements Repository {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getInterFace() <em>Inter Face</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterFace()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interFace;

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
	 * The cached value of the '{@link #getSignatures() <em>Signatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> signatures;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getInterfaceservicemapentry() <em>Interfaceservicemapentry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceservicemapentry()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceServiceMapEntry> interfaceservicemapentry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentModelPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this, ComponentModelPackage.REPOSITORY__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getInterFace() {
		if (interFace == null) {
			interFace = new EObjectContainmentEList<Interface>(Interface.class, this, ComponentModelPackage.REPOSITORY__INTER_FACE);
		}
		return interFace;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signature> getSignatures() {
		if (signatures == null) {
			signatures = new EObjectContainmentEList<Signature>(Signature.class, this, ComponentModelPackage.REPOSITORY__SIGNATURES);
		}
		return signatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, ComponentModelPackage.REPOSITORY__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, ComponentModelPackage.REPOSITORY__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceServiceMapEntry> getInterfaceservicemapentry() {
		if (interfaceservicemapentry == null) {
			interfaceservicemapentry = new EObjectContainmentEList<InterfaceServiceMapEntry>(InterfaceServiceMapEntry.class, this, ComponentModelPackage.REPOSITORY__INTERFACESERVICEMAPENTRY);
		}
		return interfaceservicemapentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentModelPackage.REPOSITORY__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case ComponentModelPackage.REPOSITORY__INTER_FACE:
				return ((InternalEList<?>)getInterFace()).basicRemove(otherEnd, msgs);
			case ComponentModelPackage.REPOSITORY__SIGNATURES:
				return ((InternalEList<?>)getSignatures()).basicRemove(otherEnd, msgs);
			case ComponentModelPackage.REPOSITORY__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ComponentModelPackage.REPOSITORY__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case ComponentModelPackage.REPOSITORY__INTERFACESERVICEMAPENTRY:
				return ((InternalEList<?>)getInterfaceservicemapentry()).basicRemove(otherEnd, msgs);
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
			case ComponentModelPackage.REPOSITORY__COMPONENT:
				return getComponent();
			case ComponentModelPackage.REPOSITORY__INTER_FACE:
				return getInterFace();
			case ComponentModelPackage.REPOSITORY__NAME:
				return getName();
			case ComponentModelPackage.REPOSITORY__SIGNATURES:
				return getSignatures();
			case ComponentModelPackage.REPOSITORY__TYPES:
				return getTypes();
			case ComponentModelPackage.REPOSITORY__SERVICES:
				return getServices();
			case ComponentModelPackage.REPOSITORY__INTERFACESERVICEMAPENTRY:
				return getInterfaceservicemapentry();
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
			case ComponentModelPackage.REPOSITORY__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case ComponentModelPackage.REPOSITORY__INTER_FACE:
				getInterFace().clear();
				getInterFace().addAll((Collection<? extends Interface>)newValue);
				return;
			case ComponentModelPackage.REPOSITORY__NAME:
				setName((String)newValue);
				return;
			case ComponentModelPackage.REPOSITORY__SIGNATURES:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends Signature>)newValue);
				return;
			case ComponentModelPackage.REPOSITORY__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case ComponentModelPackage.REPOSITORY__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ComponentModelPackage.REPOSITORY__INTERFACESERVICEMAPENTRY:
				getInterfaceservicemapentry().clear();
				getInterfaceservicemapentry().addAll((Collection<? extends InterfaceServiceMapEntry>)newValue);
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
			case ComponentModelPackage.REPOSITORY__COMPONENT:
				getComponent().clear();
				return;
			case ComponentModelPackage.REPOSITORY__INTER_FACE:
				getInterFace().clear();
				return;
			case ComponentModelPackage.REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentModelPackage.REPOSITORY__SIGNATURES:
				getSignatures().clear();
				return;
			case ComponentModelPackage.REPOSITORY__TYPES:
				getTypes().clear();
				return;
			case ComponentModelPackage.REPOSITORY__SERVICES:
				getServices().clear();
				return;
			case ComponentModelPackage.REPOSITORY__INTERFACESERVICEMAPENTRY:
				getInterfaceservicemapentry().clear();
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
			case ComponentModelPackage.REPOSITORY__COMPONENT:
				return component != null && !component.isEmpty();
			case ComponentModelPackage.REPOSITORY__INTER_FACE:
				return interFace != null && !interFace.isEmpty();
			case ComponentModelPackage.REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentModelPackage.REPOSITORY__SIGNATURES:
				return signatures != null && !signatures.isEmpty();
			case ComponentModelPackage.REPOSITORY__TYPES:
				return types != null && !types.isEmpty();
			case ComponentModelPackage.REPOSITORY__SERVICES:
				return services != null && !services.isEmpty();
			case ComponentModelPackage.REPOSITORY__INTERFACESERVICEMAPENTRY:
				return interfaceservicemapentry != null && !interfaceservicemapentry.isEmpty();
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

} //RepositoryImpl
