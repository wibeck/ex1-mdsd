/**
 */
package environment.impl;

import assembly.AssemblyContext;

import componentModel.impl.AllocationViewTypeImpl;

import environment.AllocationContext;
import environment.EnvironmentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.AllocationContextImpl#getAssemblycontext <em>Assemblycontext</em>}</li>
 *   <li>{@link environment.impl.AllocationContextImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link environment.impl.AllocationContextImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationContextImpl extends AllocationViewTypeImpl implements AllocationContext {
	/**
	 * The cached value of the '{@link #getAssemblycontext() <em>Assemblycontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblycontext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext assemblycontext;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected environment.Container container;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.ALLOCATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyContext getAssemblycontext() {
		if (assemblycontext != null && assemblycontext.eIsProxy()) {
			InternalEObject oldAssemblycontext = (InternalEObject)assemblycontext;
			assemblycontext = (AssemblyContext)eResolveProxy(oldAssemblycontext);
			if (assemblycontext != oldAssemblycontext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnvironmentPackage.ALLOCATION_CONTEXT__ASSEMBLYCONTEXT, oldAssemblycontext, assemblycontext));
			}
		}
		return assemblycontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblycontext() {
		return assemblycontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssemblycontext(AssemblyContext newAssemblycontext) {
		AssemblyContext oldAssemblycontext = assemblycontext;
		assemblycontext = newAssemblycontext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.ALLOCATION_CONTEXT__ASSEMBLYCONTEXT, oldAssemblycontext, assemblycontext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public environment.Container getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (environment.Container)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnvironmentPackage.ALLOCATION_CONTEXT__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environment.Container basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(environment.Container newContainer, NotificationChain msgs) {
		environment.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvironmentPackage.ALLOCATION_CONTEXT__CONTAINER, oldContainer, newContainer);
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
	public void setContainer(environment.Container newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, EnvironmentPackage.CONTAINER__ALLOCATIONCONTEXT, environment.Container.class, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, EnvironmentPackage.CONTAINER__ALLOCATIONCONTEXT, environment.Container.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.ALLOCATION_CONTEXT__CONTAINER, newContainer, newContainer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.ALLOCATION_CONTEXT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvironmentPackage.ALLOCATION_CONTEXT__CONTAINER:
				if (container != null)
					msgs = ((InternalEObject)container).eInverseRemove(this, EnvironmentPackage.CONTAINER__ALLOCATIONCONTEXT, environment.Container.class, msgs);
				return basicSetContainer((environment.Container)otherEnd, msgs);
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
			case EnvironmentPackage.ALLOCATION_CONTEXT__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case EnvironmentPackage.ALLOCATION_CONTEXT__ASSEMBLYCONTEXT:
				if (resolve) return getAssemblycontext();
				return basicGetAssemblycontext();
			case EnvironmentPackage.ALLOCATION_CONTEXT__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
			case EnvironmentPackage.ALLOCATION_CONTEXT__NAME:
				return getName();
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
			case EnvironmentPackage.ALLOCATION_CONTEXT__ASSEMBLYCONTEXT:
				setAssemblycontext((AssemblyContext)newValue);
				return;
			case EnvironmentPackage.ALLOCATION_CONTEXT__CONTAINER:
				setContainer((environment.Container)newValue);
				return;
			case EnvironmentPackage.ALLOCATION_CONTEXT__NAME:
				setName((String)newValue);
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
			case EnvironmentPackage.ALLOCATION_CONTEXT__ASSEMBLYCONTEXT:
				setAssemblycontext((AssemblyContext)null);
				return;
			case EnvironmentPackage.ALLOCATION_CONTEXT__CONTAINER:
				setContainer((environment.Container)null);
				return;
			case EnvironmentPackage.ALLOCATION_CONTEXT__NAME:
				setName(NAME_EDEFAULT);
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
			case EnvironmentPackage.ALLOCATION_CONTEXT__ASSEMBLYCONTEXT:
				return assemblycontext != null;
			case EnvironmentPackage.ALLOCATION_CONTEXT__CONTAINER:
				return container != null;
			case EnvironmentPackage.ALLOCATION_CONTEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //AllocationContextImpl
