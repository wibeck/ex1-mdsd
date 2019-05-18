/**
 */
package assembly.impl;

import assembly.AssemblyContext;
import assembly.AssemblyPackage;

import componentModel.Interface;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link assembly.impl.SystemImpl#getEncapsulated <em>Encapsulated</em>}</li>
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
	 * The cached value of the '{@link #getEncapsulated() <em>Encapsulated</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulated()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyContext> encapsulated;

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
	public EList<AssemblyContext> getEncapsulated() {
		if (encapsulated == null) {
			encapsulated = new EObjectResolvingEList<AssemblyContext>(AssemblyContext.class, this, AssemblyPackage.SYSTEM__ENCAPSULATED);
		}
		return encapsulated;
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
			case AssemblyPackage.SYSTEM__ENCAPSULATED:
				return getEncapsulated();
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
			case AssemblyPackage.SYSTEM__ENCAPSULATED:
				getEncapsulated().clear();
				getEncapsulated().addAll((Collection<? extends AssemblyContext>)newValue);
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
			case AssemblyPackage.SYSTEM__ENCAPSULATED:
				getEncapsulated().clear();
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
			case AssemblyPackage.SYSTEM__ENCAPSULATED:
				return encapsulated != null && !encapsulated.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
