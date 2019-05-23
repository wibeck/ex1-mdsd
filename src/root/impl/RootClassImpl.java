/**
 */
package root.impl;

import assembly.ContextEnvironment;

import componentModel.ViewPoint;

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
 *   <li>{@link root.impl.RootClassImpl#getViewPoints <em>View Points</em>}</li>
 *   <li>{@link root.impl.RootClassImpl#getContextEnvironments <em>Context Environments</em>}</li>
 *   <li>{@link root.impl.RootClassImpl#getEnvironments <em>Environments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootClassImpl extends MinimalEObjectImpl.Container implements RootClass {
	/**
	 * The cached value of the '{@link #getViewPoints() <em>View Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewPoint> viewPoints;

	/**
	 * The cached value of the '{@link #getContextEnvironments() <em>Context Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextEnvironment> contextEnvironments;

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
	public EList<ViewPoint> getViewPoints() {
		if (viewPoints == null) {
			viewPoints = new EObjectContainmentEList<ViewPoint>(ViewPoint.class, this, RootPackage.ROOT_CLASS__VIEW_POINTS);
		}
		return viewPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContextEnvironment> getContextEnvironments() {
		if (contextEnvironments == null) {
			contextEnvironments = new EObjectContainmentEList<ContextEnvironment>(ContextEnvironment.class, this, RootPackage.ROOT_CLASS__CONTEXT_ENVIRONMENTS);
		}
		return contextEnvironments;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RootPackage.ROOT_CLASS__VIEW_POINTS:
				return ((InternalEList<?>)getViewPoints()).basicRemove(otherEnd, msgs);
			case RootPackage.ROOT_CLASS__CONTEXT_ENVIRONMENTS:
				return ((InternalEList<?>)getContextEnvironments()).basicRemove(otherEnd, msgs);
			case RootPackage.ROOT_CLASS__ENVIRONMENTS:
				return ((InternalEList<?>)getEnvironments()).basicRemove(otherEnd, msgs);
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
			case RootPackage.ROOT_CLASS__VIEW_POINTS:
				return getViewPoints();
			case RootPackage.ROOT_CLASS__CONTEXT_ENVIRONMENTS:
				return getContextEnvironments();
			case RootPackage.ROOT_CLASS__ENVIRONMENTS:
				return getEnvironments();
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
			case RootPackage.ROOT_CLASS__VIEW_POINTS:
				getViewPoints().clear();
				getViewPoints().addAll((Collection<? extends ViewPoint>)newValue);
				return;
			case RootPackage.ROOT_CLASS__CONTEXT_ENVIRONMENTS:
				getContextEnvironments().clear();
				getContextEnvironments().addAll((Collection<? extends ContextEnvironment>)newValue);
				return;
			case RootPackage.ROOT_CLASS__ENVIRONMENTS:
				getEnvironments().clear();
				getEnvironments().addAll((Collection<? extends Environment>)newValue);
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
			case RootPackage.ROOT_CLASS__VIEW_POINTS:
				getViewPoints().clear();
				return;
			case RootPackage.ROOT_CLASS__CONTEXT_ENVIRONMENTS:
				getContextEnvironments().clear();
				return;
			case RootPackage.ROOT_CLASS__ENVIRONMENTS:
				getEnvironments().clear();
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
			case RootPackage.ROOT_CLASS__VIEW_POINTS:
				return viewPoints != null && !viewPoints.isEmpty();
			case RootPackage.ROOT_CLASS__CONTEXT_ENVIRONMENTS:
				return contextEnvironments != null && !contextEnvironments.isEmpty();
			case RootPackage.ROOT_CLASS__ENVIRONMENTS:
				return environments != null && !environments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootClassImpl
