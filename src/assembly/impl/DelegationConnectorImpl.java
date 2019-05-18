/**
 */
package assembly.impl;

import assembly.AssemblyPackage;
import assembly.DelegationConnector;
import assembly.Role;

import componentModel.Interface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assembly.impl.DelegationConnectorImpl#getInterFace <em>Inter Face</em>}</li>
 *   <li>{@link assembly.impl.DelegationConnectorImpl#getRole <em>Role</em>}</li>
 *   <li>{@link assembly.impl.DelegationConnectorImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DelegationConnectorImpl extends MinimalEObjectImpl.Container implements DelegationConnector {
	/**
	 * The cached value of the '{@link #getInterFace() <em>Inter Face</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterFace()
	 * @generated
	 * @ordered
	 */
	protected Interface interFace;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

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
	protected DelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.DELEGATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getInterFace() {
		if (interFace != null && interFace.eIsProxy()) {
			InternalEObject oldInterFace = (InternalEObject)interFace;
			interFace = (Interface)eResolveProxy(oldInterFace);
			if (interFace != oldInterFace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.DELEGATION_CONNECTOR__INTER_FACE, oldInterFace, interFace));
			}
		}
		return interFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterFace() {
		return interFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterFace(Interface newInterFace) {
		Interface oldInterFace = interFace;
		interFace = newInterFace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.DELEGATION_CONNECTOR__INTER_FACE, oldInterFace, interFace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.DELEGATION_CONNECTOR__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.DELEGATION_CONNECTOR__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.DELEGATION_CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.DELEGATION_CONNECTOR__INTER_FACE:
				if (resolve) return getInterFace();
				return basicGetInterFace();
			case AssemblyPackage.DELEGATION_CONNECTOR__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case AssemblyPackage.DELEGATION_CONNECTOR__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssemblyPackage.DELEGATION_CONNECTOR__INTER_FACE:
				setInterFace((Interface)newValue);
				return;
			case AssemblyPackage.DELEGATION_CONNECTOR__ROLE:
				setRole((Role)newValue);
				return;
			case AssemblyPackage.DELEGATION_CONNECTOR__NAME:
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
			case AssemblyPackage.DELEGATION_CONNECTOR__INTER_FACE:
				setInterFace((Interface)null);
				return;
			case AssemblyPackage.DELEGATION_CONNECTOR__ROLE:
				setRole((Role)null);
				return;
			case AssemblyPackage.DELEGATION_CONNECTOR__NAME:
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
			case AssemblyPackage.DELEGATION_CONNECTOR__INTER_FACE:
				return interFace != null;
			case AssemblyPackage.DELEGATION_CONNECTOR__ROLE:
				return role != null;
			case AssemblyPackage.DELEGATION_CONNECTOR__NAME:
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

} //DelegationConnectorImpl
