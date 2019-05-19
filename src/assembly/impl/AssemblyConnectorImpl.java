/**
 */
package assembly.impl;

import assembly.AssemblyConnector;
import assembly.AssemblyPackage;
import assembly.ProvidedRole;
import assembly.RequiredRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assembly.impl.AssemblyConnectorImpl#getProvidedrole <em>Providedrole</em>}</li>
 *   <li>{@link assembly.impl.AssemblyConnectorImpl#getRequiredrole <em>Requiredrole</em>}</li>
 *   <li>{@link assembly.impl.AssemblyConnectorImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorImpl extends MinimalEObjectImpl.Container implements AssemblyConnector {
	/**
	 * The cached value of the '{@link #getProvidedrole() <em>Providedrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedrole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole providedrole;

	/**
	 * The cached value of the '{@link #getRequiredrole() <em>Requiredrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredrole()
	 * @generated
	 * @ordered
	 */
	protected RequiredRole requiredrole;

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
	protected AssemblyConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.ASSEMBLY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedRole getProvidedrole() {
		if (providedrole != null && providedrole.eIsProxy()) {
			InternalEObject oldProvidedrole = (InternalEObject)providedrole;
			providedrole = (ProvidedRole)eResolveProxy(oldProvidedrole);
			if (providedrole != oldProvidedrole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE, oldProvidedrole, providedrole));
			}
		}
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetProvidedrole() {
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvidedrole(ProvidedRole newProvidedrole) {
		ProvidedRole oldProvidedrole = providedrole;
		providedrole = newProvidedrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE, oldProvidedrole, providedrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredRole getRequiredrole() {
		if (requiredrole != null && requiredrole.eIsProxy()) {
			InternalEObject oldRequiredrole = (InternalEObject)requiredrole;
			requiredrole = (RequiredRole)eResolveProxy(oldRequiredrole);
			if (requiredrole != oldRequiredrole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE, oldRequiredrole, requiredrole));
			}
		}
		return requiredrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole basicGetRequiredrole() {
		return requiredrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredrole(RequiredRole newRequiredrole) {
		RequiredRole oldRequiredrole = requiredrole;
		requiredrole = newRequiredrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE, oldRequiredrole, requiredrole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE:
				if (resolve) return getProvidedrole();
				return basicGetProvidedrole();
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE:
				if (resolve) return getRequiredrole();
				return basicGetRequiredrole();
			case AssemblyPackage.ASSEMBLY_CONNECTOR__NAME:
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE:
				setProvidedrole((ProvidedRole)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE:
				setRequiredrole((RequiredRole)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__NAME:
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE:
				setProvidedrole((ProvidedRole)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE:
				setRequiredrole((RequiredRole)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__NAME:
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE:
				return providedrole != null;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE:
				return requiredrole != null;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__NAME:
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

} //AssemblyConnectorImpl
