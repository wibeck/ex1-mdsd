/**
 */
package assembly.impl;

import assembly.AssemblyContext;
import assembly.AssemblyPackage;
import assembly.CompositeComponent;

import componentModel.AllocationViewType;
import componentModel.ComponentModelPackage;
import componentModel.ViewType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assembly.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link assembly.impl.SystemImpl#getEncapsulatedAssemblyContexts <em>Encapsulated Assembly Contexts</em>}</li>
 *   <li>{@link assembly.impl.SystemImpl#getCompositeComponents <em>Composite Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends ContextImpl implements assembly.System {
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
	 * The cached value of the '{@link #getEncapsulatedAssemblyContexts() <em>Encapsulated Assembly Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedAssemblyContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyContext> encapsulatedAssemblyContexts;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssemblyContext> getEncapsulatedAssemblyContexts() {
		if (encapsulatedAssemblyContexts == null) {
			encapsulatedAssemblyContexts = new EObjectContainmentEList<AssemblyContext>(AssemblyContext.class, this, AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS);
		}
		return encapsulatedAssemblyContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompositeComponent> getCompositeComponents() {
		if (compositeComponents == null) {
			compositeComponents = new EObjectContainmentEList<CompositeComponent>(CompositeComponent.class, this, AssemblyPackage.SYSTEM__COMPOSITE_COMPONENTS);
		}
		return compositeComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				return ((InternalEList<?>)getEncapsulatedAssemblyContexts()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.SYSTEM__COMPOSITE_COMPONENTS:
				return ((InternalEList<?>)getCompositeComponents()).basicRemove(otherEnd, msgs);
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
			case AssemblyPackage.SYSTEM__NAME:
				return getName();
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				return getEncapsulatedAssemblyContexts();
			case AssemblyPackage.SYSTEM__COMPOSITE_COMPONENTS:
				return getCompositeComponents();
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
			case AssemblyPackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				getEncapsulatedAssemblyContexts().clear();
				getEncapsulatedAssemblyContexts().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
			case AssemblyPackage.SYSTEM__COMPOSITE_COMPONENTS:
				getCompositeComponents().clear();
				getCompositeComponents().addAll((Collection<? extends CompositeComponent>)newValue);
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
			case AssemblyPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				getEncapsulatedAssemblyContexts().clear();
				return;
			case AssemblyPackage.SYSTEM__COMPOSITE_COMPONENTS:
				getCompositeComponents().clear();
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
			case AssemblyPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				return encapsulatedAssemblyContexts != null && !encapsulatedAssemblyContexts.isEmpty();
			case AssemblyPackage.SYSTEM__COMPOSITE_COMPONENTS:
				return compositeComponents != null && !compositeComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ViewType.class) {
			switch (derivedFeatureID) {
				case AssemblyPackage.SYSTEM__NAME: return ComponentModelPackage.VIEW_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == AllocationViewType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ViewType.class) {
			switch (baseFeatureID) {
				case ComponentModelPackage.VIEW_TYPE__NAME: return AssemblyPackage.SYSTEM__NAME;
				default: return -1;
			}
		}
		if (baseClass == AllocationViewType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //SystemImpl
