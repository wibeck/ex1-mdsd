/**
 */
package assembly.impl;

import assembly.AssemblyConnector;
import assembly.AssemblyPackage;
import assembly.Context;
import assembly.DelegationConnector;

import componentModel.Interface;

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
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assembly.impl.ContextImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link assembly.impl.ContextImpl#getDelegationConnectors <em>Delegation Connectors</em>}</li>
 *   <li>{@link assembly.impl.ContextImpl#getNestedAssemblyConnectors <em>Nested Assembly Connectors</em>}</li>
 *   <li>{@link assembly.impl.ContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link assembly.impl.ContextImpl#getOutwardAssemblyConnectors <em>Outward Assembly Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContextImpl extends MinimalEObjectImpl.Container implements Context {
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
	 * The cached value of the '{@link #getDelegationConnectors() <em>Delegation Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<DelegationConnector> delegationConnectors;

	/**
	 * The cached value of the '{@link #getNestedAssemblyConnectors() <em>Nested Assembly Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedAssemblyConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyConnector> nestedAssemblyConnectors;

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
	 * The cached value of the '{@link #getOutwardAssemblyConnectors() <em>Outward Assembly Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutwardAssemblyConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyConnector> outwardAssemblyConnectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, AssemblyPackage.CONTEXT__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DelegationConnector> getDelegationConnectors() {
		if (delegationConnectors == null) {
			delegationConnectors = new EObjectContainmentEList<DelegationConnector>(DelegationConnector.class, this, AssemblyPackage.CONTEXT__DELEGATION_CONNECTORS);
		}
		return delegationConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssemblyConnector> getNestedAssemblyConnectors() {
		if (nestedAssemblyConnectors == null) {
			nestedAssemblyConnectors = new EObjectResolvingEList<AssemblyConnector>(AssemblyConnector.class, this, AssemblyPackage.CONTEXT__NESTED_ASSEMBLY_CONNECTORS);
		}
		return nestedAssemblyConnectors;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.CONTEXT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssemblyConnector> getOutwardAssemblyConnectors() {
		if (outwardAssemblyConnectors == null) {
			outwardAssemblyConnectors = new EObjectContainmentEList<AssemblyConnector>(AssemblyConnector.class, this, AssemblyPackage.CONTEXT__OUTWARD_ASSEMBLY_CONNECTORS);
		}
		return outwardAssemblyConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.CONTEXT__DELEGATION_CONNECTORS:
				return ((InternalEList<?>)getDelegationConnectors()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.CONTEXT__OUTWARD_ASSEMBLY_CONNECTORS:
				return ((InternalEList<?>)getOutwardAssemblyConnectors()).basicRemove(otherEnd, msgs);
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
			case AssemblyPackage.CONTEXT__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case AssemblyPackage.CONTEXT__DELEGATION_CONNECTORS:
				return getDelegationConnectors();
			case AssemblyPackage.CONTEXT__NESTED_ASSEMBLY_CONNECTORS:
				return getNestedAssemblyConnectors();
			case AssemblyPackage.CONTEXT__NAME:
				return getName();
			case AssemblyPackage.CONTEXT__OUTWARD_ASSEMBLY_CONNECTORS:
				return getOutwardAssemblyConnectors();
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
			case AssemblyPackage.CONTEXT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				getRequiredInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case AssemblyPackage.CONTEXT__DELEGATION_CONNECTORS:
				getDelegationConnectors().clear();
				getDelegationConnectors().addAll((Collection<? extends DelegationConnector>)newValue);
				return;
			case AssemblyPackage.CONTEXT__NESTED_ASSEMBLY_CONNECTORS:
				getNestedAssemblyConnectors().clear();
				getNestedAssemblyConnectors().addAll((Collection<? extends AssemblyConnector>)newValue);
				return;
			case AssemblyPackage.CONTEXT__NAME:
				setName((String)newValue);
				return;
			case AssemblyPackage.CONTEXT__OUTWARD_ASSEMBLY_CONNECTORS:
				getOutwardAssemblyConnectors().clear();
				getOutwardAssemblyConnectors().addAll((Collection<? extends AssemblyConnector>)newValue);
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
			case AssemblyPackage.CONTEXT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				return;
			case AssemblyPackage.CONTEXT__DELEGATION_CONNECTORS:
				getDelegationConnectors().clear();
				return;
			case AssemblyPackage.CONTEXT__NESTED_ASSEMBLY_CONNECTORS:
				getNestedAssemblyConnectors().clear();
				return;
			case AssemblyPackage.CONTEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssemblyPackage.CONTEXT__OUTWARD_ASSEMBLY_CONNECTORS:
				getOutwardAssemblyConnectors().clear();
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
			case AssemblyPackage.CONTEXT__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case AssemblyPackage.CONTEXT__DELEGATION_CONNECTORS:
				return delegationConnectors != null && !delegationConnectors.isEmpty();
			case AssemblyPackage.CONTEXT__NESTED_ASSEMBLY_CONNECTORS:
				return nestedAssemblyConnectors != null && !nestedAssemblyConnectors.isEmpty();
			case AssemblyPackage.CONTEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssemblyPackage.CONTEXT__OUTWARD_ASSEMBLY_CONNECTORS:
				return outwardAssemblyConnectors != null && !outwardAssemblyConnectors.isEmpty();
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

} //ContextImpl
