/**
 */
package root.impl;

import assembly.ContextEnvironment;

import componentModel.Repository;

import environment.Environment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import root.RootClass;
import root.RootPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link root.impl.RootClassImpl#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link root.impl.RootClassImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link root.impl.RootClassImpl#getContextEnvironment <em>Context Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootClassImpl extends MinimalEObjectImpl.Container implements RootClass {
	/**
	 * The cached value of the '{@link #getEnvironments() <em>Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environments;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositories;

	/**
	 * The cached value of the '{@link #getContextEnvironment() <em>Context Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextEnvironment> contextEnvironment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootPackage.Literals.ROOT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Environment> getEnvironments() {
		if (environments == null) {
			environments = new EObjectContainmentEList<Environment>(Environment.class, this, RootPackage.ROOT_CLASS__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Repository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<Repository>(Repository.class, this, RootPackage.ROOT_CLASS__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContextEnvironment> getContextEnvironment() {
		if (contextEnvironment == null) {
			contextEnvironment = new EObjectContainmentEList<ContextEnvironment>(ContextEnvironment.class, this, RootPackage.ROOT_CLASS__CONTEXT_ENVIRONMENT);
		}
		return contextEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RootPackage.ROOT_CLASS__ENVIRONMENTS:
				return ((InternalEList<?>)getEnvironments()).basicRemove(otherEnd, msgs);
			case RootPackage.ROOT_CLASS__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
			case RootPackage.ROOT_CLASS__CONTEXT_ENVIRONMENT:
				return ((InternalEList<?>)getContextEnvironment()).basicRemove(otherEnd, msgs);
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
			case RootPackage.ROOT_CLASS__ENVIRONMENTS:
				return getEnvironments();
			case RootPackage.ROOT_CLASS__REPOSITORIES:
				return getRepositories();
			case RootPackage.ROOT_CLASS__CONTEXT_ENVIRONMENT:
				return getContextEnvironment();
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
			case RootPackage.ROOT_CLASS__ENVIRONMENTS:
				getEnvironments().clear();
				getEnvironments().addAll((Collection<? extends Environment>)newValue);
				return;
			case RootPackage.ROOT_CLASS__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>)newValue);
				return;
			case RootPackage.ROOT_CLASS__CONTEXT_ENVIRONMENT:
				getContextEnvironment().clear();
				getContextEnvironment().addAll((Collection<? extends ContextEnvironment>)newValue);
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
			case RootPackage.ROOT_CLASS__ENVIRONMENTS:
				getEnvironments().clear();
				return;
			case RootPackage.ROOT_CLASS__REPOSITORIES:
				getRepositories().clear();
				return;
			case RootPackage.ROOT_CLASS__CONTEXT_ENVIRONMENT:
				getContextEnvironment().clear();
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
			case RootPackage.ROOT_CLASS__ENVIRONMENTS:
				return environments != null && !environments.isEmpty();
			case RootPackage.ROOT_CLASS__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
			case RootPackage.ROOT_CLASS__CONTEXT_ENVIRONMENT:
				return contextEnvironment != null && !contextEnvironment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootClassImpl
