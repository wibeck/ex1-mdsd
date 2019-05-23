/**
 */
package assembly.impl;

import assembly.AssemblyPackage;
import assembly.CompositeComponent;
import assembly.Context;
import assembly.ContextEnvironment;
import assembly.DelegationConnector;
import assembly.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assembly.impl.ContextEnvironmentImpl#getCompositeComponents <em>Composite Components</em>}</li>
 *   <li>{@link assembly.impl.ContextEnvironmentImpl#getDelegationConnectors <em>Delegation Connectors</em>}</li>
 *   <li>{@link assembly.impl.ContextEnvironmentImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link assembly.impl.ContextEnvironmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link assembly.impl.ContextEnvironmentImpl#getContexts <em>Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextEnvironmentImpl extends MinimalEObjectImpl.Container implements ContextEnvironment {
	/**
	 * The cached value of the '{@link #getCompositeComponents() <em>Composite Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeComponent> compositeComponents;

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
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

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
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> contexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.CONTEXT_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompositeComponent> getCompositeComponents() {
		if (compositeComponents == null) {
			compositeComponents = new EObjectContainmentEList<CompositeComponent>(CompositeComponent.class, this, AssemblyPackage.CONTEXT_ENVIRONMENT__COMPOSITE_COMPONENTS);
		}
		return compositeComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DelegationConnector> getDelegationConnectors() {
		if (delegationConnectors == null) {
			delegationConnectors = new EObjectContainmentEList<DelegationConnector>(DelegationConnector.class, this, AssemblyPackage.CONTEXT_ENVIRONMENT__DELEGATION_CONNECTORS);
		}
		return delegationConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, AssemblyPackage.CONTEXT_ENVIRONMENT__ROLES);
		}
		return roles;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.CONTEXT_ENVIRONMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Context> getContexts() {
		if (contexts == null) {
			contexts = new EObjectContainmentEList<Context>(Context.class, this, AssemblyPackage.CONTEXT_ENVIRONMENT__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.CONTEXT_ENVIRONMENT__COMPOSITE_COMPONENTS:
				return ((InternalEList<?>)getCompositeComponents()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.CONTEXT_ENVIRONMENT__DELEGATION_CONNECTORS:
				return ((InternalEList<?>)getDelegationConnectors()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.CONTEXT_ENVIRONMENT__CONTEXTS:
				return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
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
			case AssemblyPackage.CONTEXT_ENVIRONMENT__COMPOSITE_COMPONENTS:
				return getCompositeComponents();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__DELEGATION_CONNECTORS:
				return getDelegationConnectors();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ROLES:
				return getRoles();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__NAME:
				return getName();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__CONTEXTS:
				return getContexts();
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
			case AssemblyPackage.CONTEXT_ENVIRONMENT__COMPOSITE_COMPONENTS:
				getCompositeComponents().clear();
				getCompositeComponents().addAll((Collection<? extends CompositeComponent>)newValue);
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__DELEGATION_CONNECTORS:
				getDelegationConnectors().clear();
				getDelegationConnectors().addAll((Collection<? extends DelegationConnector>)newValue);
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__NAME:
				setName((String)newValue);
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends Context>)newValue);
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
			case AssemblyPackage.CONTEXT_ENVIRONMENT__COMPOSITE_COMPONENTS:
				getCompositeComponents().clear();
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__DELEGATION_CONNECTORS:
				getDelegationConnectors().clear();
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ROLES:
				getRoles().clear();
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__CONTEXTS:
				getContexts().clear();
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
			case AssemblyPackage.CONTEXT_ENVIRONMENT__COMPOSITE_COMPONENTS:
				return compositeComponents != null && !compositeComponents.isEmpty();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__DELEGATION_CONNECTORS:
				return delegationConnectors != null && !delegationConnectors.isEmpty();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ROLES:
				return roles != null && !roles.isEmpty();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssemblyPackage.CONTEXT_ENVIRONMENT__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
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

} //ContextEnvironmentImpl
