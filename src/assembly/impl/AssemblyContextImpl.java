/**
 */
package assembly.impl;

import assembly.AssemblyContext;
import assembly.AssemblyPackage;
import assembly.CompositeComponent;
import assembly.ProvidedRole;
import assembly.RequiredRole;

import componentModel.Component;
import componentModel.Interface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assembly.impl.AssemblyContextImpl#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link assembly.impl.AssemblyContextImpl#getRequiredRoles <em>Required Roles</em>}</li>
 *   <li>{@link assembly.impl.AssemblyContextImpl#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link assembly.impl.AssemblyContextImpl#getOwnerComponent <em>Owner Component</em>}</li>
 *   <li>{@link assembly.impl.AssemblyContextImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyContextImpl extends ContextImpl implements AssemblyContext {
	/**
	 * The cached value of the '{@link #getInstantiates() <em>Instantiates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiates()
	 * @generated
	 * @ordered
	 */
	protected Component instantiates;

	/**
	 * The cached value of the '{@link #getRequiredRoles() <em>Required Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredRole> requiredRoles;

	/**
	 * The cached value of the '{@link #getProvidedRoles() <em>Provided Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedRole> providedRoles;

	/**
	 * The cached value of the '{@link #getOwnerComponent() <em>Owner Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerComponent()
	 * @generated
	 * @ordered
	 */
	protected CompositeComponent ownerComponent;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.ASSEMBLY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getInstantiates() {
		if (instantiates != null && instantiates.eIsProxy()) {
			InternalEObject oldInstantiates = (InternalEObject)instantiates;
			instantiates = (Component)eResolveProxy(oldInstantiates);
			if (instantiates != oldInstantiates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONTEXT__INSTANTIATES, oldInstantiates, instantiates));
			}
		}
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetInstantiates() {
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstantiates(Component newInstantiates) {
		Component oldInstantiates = instantiates;
		instantiates = newInstantiates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONTEXT__INSTANTIATES, oldInstantiates, instantiates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequiredRole> getRequiredRoles() {
		if (requiredRoles == null) {
			requiredRoles = new EObjectResolvingEList<RequiredRole>(RequiredRole.class, this, AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES);
		}
		return requiredRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProvidedRole> getProvidedRoles() {
		if (providedRoles == null) {
			providedRoles = new EObjectResolvingEList<ProvidedRole>(ProvidedRole.class, this, AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES);
		}
		return providedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeComponent getOwnerComponent() {
		if (ownerComponent != null && ownerComponent.eIsProxy()) {
			InternalEObject oldOwnerComponent = (InternalEObject)ownerComponent;
			ownerComponent = (CompositeComponent)eResolveProxy(oldOwnerComponent);
			if (ownerComponent != oldOwnerComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONTEXT__OWNER_COMPONENT, oldOwnerComponent, ownerComponent));
			}
		}
		return ownerComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeComponent basicGetOwnerComponent() {
		return ownerComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerComponent(CompositeComponent newOwnerComponent) {
		CompositeComponent oldOwnerComponent = ownerComponent;
		ownerComponent = newOwnerComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONTEXT__OWNER_COMPONENT, oldOwnerComponent, ownerComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_INTERFACES);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.ASSEMBLY_CONTEXT__INSTANTIATES:
				if (resolve) return getInstantiates();
				return basicGetInstantiates();
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
				return getRequiredRoles();
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
				return getProvidedRoles();
			case AssemblyPackage.ASSEMBLY_CONTEXT__OWNER_COMPONENT:
				if (resolve) return getOwnerComponent();
				return basicGetOwnerComponent();
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__INSTANTIATES:
				setInstantiates((Component)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
				getRequiredRoles().clear();
				getRequiredRoles().addAll((Collection<? extends RequiredRole>)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
				getProvidedRoles().clear();
				getProvidedRoles().addAll((Collection<? extends ProvidedRole>)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__OWNER_COMPONENT:
				setOwnerComponent((CompositeComponent)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				getProvidedInterfaces().addAll((Collection<? extends Interface>)newValue);
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__INSTANTIATES:
				setInstantiates((Component)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
				getRequiredRoles().clear();
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
				getProvidedRoles().clear();
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__OWNER_COMPONENT:
				setOwnerComponent((CompositeComponent)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__INSTANTIATES:
				return instantiates != null;
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
				return requiredRoles != null && !requiredRoles.isEmpty();
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
				return providedRoles != null && !providedRoles.isEmpty();
			case AssemblyPackage.ASSEMBLY_CONTEXT__OWNER_COMPONENT:
				return ownerComponent != null;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssemblyContextImpl
