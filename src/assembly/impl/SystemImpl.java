/**
 */
package assembly.impl;

import assembly.AssemblyContext;
import assembly.AssemblyPackage;

import componentModel.Interface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assembly.impl.SystemImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link assembly.impl.SystemImpl#getEncapsulatedAssemblyContexts <em>Encapsulated Assembly Contexts</em>}</li>
 *   <li>{@link assembly.impl.SystemImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends ContextImpl implements assembly.System {
	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> providedInterfaces;

	/**
	 * The cached value of the '{@link #getEncapsulatedAssemblyContexts() <em>Encapsulated Assembly Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedAssemblyContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyContext> encapsulatedAssemblyContexts;

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
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, AssemblyPackage.SYSTEM__PROVIDED_INTERFACES);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssemblyContext> getEncapsulatedAssemblyContexts() {
		if (encapsulatedAssemblyContexts == null) {
			encapsulatedAssemblyContexts = new EObjectResolvingEList<AssemblyContext>(AssemblyContext.class, this, AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS);
		}
		return encapsulatedAssemblyContexts;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.SYSTEM__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				return getEncapsulatedAssemblyContexts();
			case AssemblyPackage.SYSTEM__NAME:
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
			case AssemblyPackage.SYSTEM__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				getProvidedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				getEncapsulatedAssemblyContexts().clear();
				getEncapsulatedAssemblyContexts().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
			case AssemblyPackage.SYSTEM__NAME:
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
			case AssemblyPackage.SYSTEM__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				return;
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				getEncapsulatedAssemblyContexts().clear();
				return;
			case AssemblyPackage.SYSTEM__NAME:
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
			case AssemblyPackage.SYSTEM__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				return encapsulatedAssemblyContexts != null && !encapsulatedAssemblyContexts.isEmpty();
			case AssemblyPackage.SYSTEM__NAME:
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

} //SystemImpl
