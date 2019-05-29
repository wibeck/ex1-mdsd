/**
 */
package environment.impl;

import componentModel.impl.DeploymentViewPointImpl;

import environment.AllocationEnvironment;
import environment.ConcreteDeploymentViewPoint;
import environment.Environment;
import environment.EnvironmentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Deployment View Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.ConcreteDeploymentViewPointImpl#getAllocationEnvironment <em>Allocation Environment</em>}</li>
 *   <li>{@link environment.impl.ConcreteDeploymentViewPointImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteDeploymentViewPointImpl extends DeploymentViewPointImpl implements ConcreteDeploymentViewPoint {
	/**
	 * The cached value of the '{@link #getAllocationEnvironment() <em>Allocation Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationEnvironment()
	 * @generated
	 * @ordered
	 */
	protected AllocationEnvironment allocationEnvironment;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteDeploymentViewPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.CONCRETE_DEPLOYMENT_VIEW_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllocationEnvironment getAllocationEnvironment() {
		return allocationEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocationEnvironment(AllocationEnvironment newAllocationEnvironment, NotificationChain msgs) {
		AllocationEnvironment oldAllocationEnvironment = allocationEnvironment;
		allocationEnvironment = newAllocationEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ALLOCATION_ENVIRONMENT, oldAllocationEnvironment, newAllocationEnvironment);
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
	public void setAllocationEnvironment(AllocationEnvironment newAllocationEnvironment) {
		if (newAllocationEnvironment != allocationEnvironment) {
			NotificationChain msgs = null;
			if (allocationEnvironment != null)
				msgs = ((InternalEObject)allocationEnvironment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ALLOCATION_ENVIRONMENT, null, msgs);
			if (newAllocationEnvironment != null)
				msgs = ((InternalEObject)newAllocationEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ALLOCATION_ENVIRONMENT, null, msgs);
			msgs = basicSetAllocationEnvironment(newAllocationEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ALLOCATION_ENVIRONMENT, newAllocationEnvironment, newAllocationEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ENVIRONMENT, oldEnvironment, newEnvironment);
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
	public void setEnvironment(Environment newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ALLOCATION_ENVIRONMENT:
				return basicSetAllocationEnvironment(null, msgs);
			case EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
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
			case EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ALLOCATION_ENVIRONMENT:
				return getAllocationEnvironment();
			case EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ENVIRONMENT:
				return getEnvironment();
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
			case EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ALLOCATION_ENVIRONMENT:
				setAllocationEnvironment((AllocationEnvironment)newValue);
				return;
			case EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ENVIRONMENT:
				setEnvironment((Environment)newValue);
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
			case EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ALLOCATION_ENVIRONMENT:
				setAllocationEnvironment((AllocationEnvironment)null);
				return;
			case EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ENVIRONMENT:
				setEnvironment((Environment)null);
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
			case EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ALLOCATION_ENVIRONMENT:
				return allocationEnvironment != null;
			case EnvironmentPackage.CONCRETE_DEPLOYMENT_VIEW_POINT__ENVIRONMENT:
				return environment != null;
		}
		return super.eIsSet(featureID);
	}

} //ConcreteDeploymentViewPointImpl
