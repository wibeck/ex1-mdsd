/**
 */
package assembly.impl;

import assembly.AssemblyConnector;
import assembly.AssemblyPackage;
import assembly.ProvidedRole;
import assembly.RequiredRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
	 * The cached value of the '{@link #getProvidedrole() <em>Providedrole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedrole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole providedrole;

	/**
	 * The cached value of the '{@link #getRequiredrole() <em>Requiredrole</em>}' containment reference.
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
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedrole(ProvidedRole newProvidedrole, NotificationChain msgs) {
		ProvidedRole oldProvidedrole = providedrole;
		providedrole = newProvidedrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE, oldProvidedrole, newProvidedrole);
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
	public void setProvidedrole(ProvidedRole newProvidedrole) {
		if (newProvidedrole != providedrole) {
			NotificationChain msgs = null;
			if (providedrole != null)
				msgs = ((InternalEObject)providedrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE, null, msgs);
			if (newProvidedrole != null)
				msgs = ((InternalEObject)newProvidedrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE, null, msgs);
			msgs = basicSetProvidedrole(newProvidedrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE, newProvidedrole, newProvidedrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredRole getRequiredrole() {
		return requiredrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredrole(RequiredRole newRequiredrole, NotificationChain msgs) {
		RequiredRole oldRequiredrole = requiredrole;
		requiredrole = newRequiredrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE, oldRequiredrole, newRequiredrole);
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
	public void setRequiredrole(RequiredRole newRequiredrole) {
		if (newRequiredrole != requiredrole) {
			NotificationChain msgs = null;
			if (requiredrole != null)
				msgs = ((InternalEObject)requiredrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE, null, msgs);
			if (newRequiredrole != null)
				msgs = ((InternalEObject)newRequiredrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE, null, msgs);
			msgs = basicSetRequiredrole(newRequiredrole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE, newRequiredrole, newRequiredrole));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE:
				return basicSetProvidedrole(null, msgs);
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE:
				return basicSetRequiredrole(null, msgs);
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDEDROLE:
				return getProvidedrole();
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIREDROLE:
				return getRequiredrole();
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
