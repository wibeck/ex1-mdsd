/**
 */
package assembly.impl;

import assembly.AssemblyContext;
import assembly.AssemblyPackage;
import assembly.CompositeComponent;
import assembly.ContextEnvironment;
import assembly.DelegationConnector;
import assembly.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assembly.impl.ContextEnvironmentImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link assembly.impl.ContextEnvironmentImpl#getCompositeComponents <em>Composite Components</em>}</li>
 *   <li>{@link assembly.impl.ContextEnvironmentImpl#getAssemblyContexts <em>Assembly Contexts</em>}</li>
 *   <li>{@link assembly.impl.ContextEnvironmentImpl#getDelegationConnectors <em>Delegation Connectors</em>}</li>
 *   <li>{@link assembly.impl.ContextEnvironmentImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextEnvironmentImpl extends MinimalEObjectImpl.Container implements ContextEnvironment {
	/**
	 * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<assembly.System> systems;

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
	 * The cached value of the '{@link #getAssemblyContexts() <em>Assembly Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyContext> assemblyContexts;

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
	public EList<assembly.System> getSystems() {
		if (systems == null) {
			systems = new EObjectContainmentEList<assembly.System>(assembly.System.class, this, AssemblyPackage.CONTEXT_ENVIRONMENT__SYSTEMS);
		}
		return systems;
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
	public EList<AssemblyContext> getAssemblyContexts() {
		if (assemblyContexts == null) {
			assemblyContexts = new EObjectResolvingEList<AssemblyContext>(AssemblyContext.class, this, AssemblyPackage.CONTEXT_ENVIRONMENT__ASSEMBLY_CONTEXTS);
		}
		return assemblyContexts;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.CONTEXT_ENVIRONMENT__SYSTEMS:
				return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.CONTEXT_ENVIRONMENT__COMPOSITE_COMPONENTS:
				return ((InternalEList<?>)getCompositeComponents()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.CONTEXT_ENVIRONMENT__DELEGATION_CONNECTORS:
				return ((InternalEList<?>)getDelegationConnectors()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case AssemblyPackage.CONTEXT_ENVIRONMENT__SYSTEMS:
				return getSystems();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__COMPOSITE_COMPONENTS:
				return getCompositeComponents();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ASSEMBLY_CONTEXTS:
				return getAssemblyContexts();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__DELEGATION_CONNECTORS:
				return getDelegationConnectors();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ROLES:
				return getRoles();
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
			case AssemblyPackage.CONTEXT_ENVIRONMENT__SYSTEMS:
				getSystems().clear();
				getSystems().addAll((Collection<? extends assembly.System>)newValue);
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__COMPOSITE_COMPONENTS:
				getCompositeComponents().clear();
				getCompositeComponents().addAll((Collection<? extends CompositeComponent>)newValue);
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ASSEMBLY_CONTEXTS:
				getAssemblyContexts().clear();
				getAssemblyContexts().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__DELEGATION_CONNECTORS:
				getDelegationConnectors().clear();
				getDelegationConnectors().addAll((Collection<? extends DelegationConnector>)newValue);
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case AssemblyPackage.CONTEXT_ENVIRONMENT__SYSTEMS:
				getSystems().clear();
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__COMPOSITE_COMPONENTS:
				getCompositeComponents().clear();
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ASSEMBLY_CONTEXTS:
				getAssemblyContexts().clear();
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__DELEGATION_CONNECTORS:
				getDelegationConnectors().clear();
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ROLES:
				getRoles().clear();
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
			case AssemblyPackage.CONTEXT_ENVIRONMENT__SYSTEMS:
				return systems != null && !systems.isEmpty();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__COMPOSITE_COMPONENTS:
				return compositeComponents != null && !compositeComponents.isEmpty();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ASSEMBLY_CONTEXTS:
				return assemblyContexts != null && !assemblyContexts.isEmpty();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__DELEGATION_CONNECTORS:
				return delegationConnectors != null && !delegationConnectors.isEmpty();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ROLES:
				return roles != null && !roles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextEnvironmentImpl
