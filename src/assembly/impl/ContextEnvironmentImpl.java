/**
 */
package assembly.impl;

import assembly.AssemblyConnector;
import assembly.AssemblyPackage;
import assembly.Context;
import assembly.ContextEnvironment;
import assembly.Role;

import componentModel.impl.AssemblyViewTypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link assembly.impl.ContextEnvironmentImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link assembly.impl.ContextEnvironmentImpl#getAssemblyConnectors <em>Assembly Connectors</em>}</li>
 *   <li>{@link assembly.impl.ContextEnvironmentImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextEnvironmentImpl extends AssemblyViewTypeImpl implements ContextEnvironment {
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
	 * The cached value of the '{@link #getAssemblyConnectors() <em>Assembly Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyConnector> assemblyConnectors;

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
	public EList<AssemblyConnector> getAssemblyConnectors() {
		if (assemblyConnectors == null) {
			assemblyConnectors = new EObjectContainmentEList<AssemblyConnector>(AssemblyConnector.class, this, AssemblyPackage.CONTEXT_ENVIRONMENT__ASSEMBLY_CONNECTORS);
		}
		return assemblyConnectors;
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
			case AssemblyPackage.CONTEXT_ENVIRONMENT__CONTEXTS:
				return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ASSEMBLY_CONNECTORS:
				return ((InternalEList<?>)getAssemblyConnectors()).basicRemove(otherEnd, msgs);
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
			case AssemblyPackage.CONTEXT_ENVIRONMENT__CONTEXTS:
				return getContexts();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ASSEMBLY_CONNECTORS:
				return getAssemblyConnectors();
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
			case AssemblyPackage.CONTEXT_ENVIRONMENT__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ASSEMBLY_CONNECTORS:
				getAssemblyConnectors().clear();
				getAssemblyConnectors().addAll((Collection<? extends AssemblyConnector>)newValue);
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
			case AssemblyPackage.CONTEXT_ENVIRONMENT__CONTEXTS:
				getContexts().clear();
				return;
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ASSEMBLY_CONNECTORS:
				getAssemblyConnectors().clear();
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
			case AssemblyPackage.CONTEXT_ENVIRONMENT__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ASSEMBLY_CONNECTORS:
				return assemblyConnectors != null && !assemblyConnectors.isEmpty();
			case AssemblyPackage.CONTEXT_ENVIRONMENT__ROLES:
				return roles != null && !roles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextEnvironmentImpl
