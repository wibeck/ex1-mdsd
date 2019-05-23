/**
 */
package environment.impl;

import environment.AllocationContext;
import environment.EnvironmentPackage;
import environment.Link;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link environment.impl.ContainerImpl#getAllocationContexts <em>Allocation Contexts</em>}</li>
 *   <li>{@link environment.impl.ContainerImpl#getOutwardLinks <em>Outward Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements environment.Container {
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
	 * The cached value of the '{@link #getAllocationContexts() <em>Allocation Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationContext> allocationContexts;

	/**
	 * The cached value of the '{@link #getOutwardLinks() <em>Outward Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutwardLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> outwardLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AllocationContext> getAllocationContexts() {
		if (allocationContexts == null) {
			allocationContexts = new EObjectContainmentWithInverseEList<AllocationContext>(AllocationContext.class, this, EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXTS, EnvironmentPackage.ALLOCATION_CONTEXT__CONTAINER);
		}
		return allocationContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getOutwardLinks() {
		if (outwardLinks == null) {
			outwardLinks = new EObjectResolvingEList<Link>(Link.class, this, EnvironmentPackage.CONTAINER__OUTWARD_LINKS);
		}
		return outwardLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocationContexts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXTS:
				return ((InternalEList<?>)getAllocationContexts()).basicRemove(otherEnd, msgs);
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
			case EnvironmentPackage.CONTAINER__NAME:
				return getName();
			case EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXTS:
				return getAllocationContexts();
			case EnvironmentPackage.CONTAINER__OUTWARD_LINKS:
				return getOutwardLinks();
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
			case EnvironmentPackage.CONTAINER__NAME:
				setName((String)newValue);
				return;
			case EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
				getAllocationContexts().addAll((Collection<? extends AllocationContext>)newValue);
				return;
			case EnvironmentPackage.CONTAINER__OUTWARD_LINKS:
				getOutwardLinks().clear();
				getOutwardLinks().addAll((Collection<? extends Link>)newValue);
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
			case EnvironmentPackage.CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
				return;
			case EnvironmentPackage.CONTAINER__OUTWARD_LINKS:
				getOutwardLinks().clear();
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
			case EnvironmentPackage.CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXTS:
				return allocationContexts != null && !allocationContexts.isEmpty();
			case EnvironmentPackage.CONTAINER__OUTWARD_LINKS:
				return outwardLinks != null && !outwardLinks.isEmpty();
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

} //ContainerImpl
