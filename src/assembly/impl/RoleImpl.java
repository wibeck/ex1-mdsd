/**
 */
package assembly.impl;

import assembly.AssemblyContext;
import assembly.AssemblyPackage;
import assembly.Role;

import componentModel.Interface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assembly.impl.RoleImpl#getAssemblyContext <em>Assembly Context</em>}</li>
 *   <li>{@link assembly.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link assembly.impl.RoleImpl#getInterFace <em>Inter Face</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RoleImpl extends MinimalEObjectImpl.Container implements Role {
	/**
	 * The cached value of the '{@link #getAssemblyContext() <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext assemblyContext;

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
	 * The cached value of the '{@link #getInterFace() <em>Inter Face</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterFace()
	 * @generated
	 * @ordered
	 */
	protected Interface interFace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyContext getAssemblyContext() {
		if (assemblyContext != null && assemblyContext.eIsProxy()) {
			InternalEObject oldAssemblyContext = (InternalEObject)assemblyContext;
			assemblyContext = (AssemblyContext)eResolveProxy(oldAssemblyContext);
			if (assemblyContext != oldAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ROLE__ASSEMBLY_CONTEXT, oldAssemblyContext, assemblyContext));
			}
		}
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblyContext() {
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssemblyContext(AssemblyContext newAssemblyContext) {
		AssemblyContext oldAssemblyContext = assemblyContext;
		assemblyContext = newAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ROLE__ASSEMBLY_CONTEXT, oldAssemblyContext, assemblyContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getInterFace() {
		if (interFace != null && interFace.eIsProxy()) {
			InternalEObject oldInterFace = (InternalEObject)interFace;
			interFace = (Interface)eResolveProxy(oldInterFace);
			if (interFace != oldInterFace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ROLE__INTER_FACE, oldInterFace, interFace));
			}
		}
		return interFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterFace() {
		return interFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterFace(Interface newInterFace) {
		Interface oldInterFace = interFace;
		interFace = newInterFace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ROLE__INTER_FACE, oldInterFace, interFace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.ROLE__ASSEMBLY_CONTEXT:
				if (resolve) return getAssemblyContext();
				return basicGetAssemblyContext();
			case AssemblyPackage.ROLE__NAME:
				return getName();
			case AssemblyPackage.ROLE__INTER_FACE:
				if (resolve) return getInterFace();
				return basicGetInterFace();
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
			case AssemblyPackage.ROLE__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)newValue);
				return;
			case AssemblyPackage.ROLE__NAME:
				setName((String)newValue);
				return;
			case AssemblyPackage.ROLE__INTER_FACE:
				setInterFace((Interface)newValue);
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
			case AssemblyPackage.ROLE__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)null);
				return;
			case AssemblyPackage.ROLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssemblyPackage.ROLE__INTER_FACE:
				setInterFace((Interface)null);
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
			case AssemblyPackage.ROLE__ASSEMBLY_CONTEXT:
				return assemblyContext != null;
			case AssemblyPackage.ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssemblyPackage.ROLE__INTER_FACE:
				return interFace != null;
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

} //RoleImpl
