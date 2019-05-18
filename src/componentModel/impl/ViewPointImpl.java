/**
 */
package componentModel.impl;

import componentModel.ComponentModelPackage;
import componentModel.ViewPoint;
import componentModel.ViewType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentModel.impl.ViewPointImpl#getViewtypes <em>Viewtypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ViewPointImpl extends MinimalEObjectImpl.Container implements ViewPoint {
	/**
	 * The cached value of the '{@link #getViewtypes() <em>Viewtypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewType> viewtypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentModelPackage.Literals.VIEW_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ViewType> getViewtypes() {
		if (viewtypes == null) {
			viewtypes = new EObjectContainmentEList<ViewType>(ViewType.class, this, ComponentModelPackage.VIEW_POINT__VIEWTYPES);
		}
		return viewtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentModelPackage.VIEW_POINT__VIEWTYPES:
				return ((InternalEList<?>)getViewtypes()).basicRemove(otherEnd, msgs);
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
			case ComponentModelPackage.VIEW_POINT__VIEWTYPES:
				return getViewtypes();
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
			case ComponentModelPackage.VIEW_POINT__VIEWTYPES:
				getViewtypes().clear();
				getViewtypes().addAll((Collection<? extends ViewType>)newValue);
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
			case ComponentModelPackage.VIEW_POINT__VIEWTYPES:
				getViewtypes().clear();
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
			case ComponentModelPackage.VIEW_POINT__VIEWTYPES:
				return viewtypes != null && !viewtypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewPointImpl
