/**
 */
package assembly.impl;

import assembly.AssemblyContext;
import assembly.AssemblyPackage;
import assembly.CompositeComponent;

import componentModel.impl.ComponentImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assembly.impl.CompositeComponentImpl#getEncapsulatedAssemblyContexts <em>Encapsulated Assembly Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeComponentImpl extends ComponentImpl implements CompositeComponent {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.COMPOSITE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssemblyContext> getEncapsulatedAssemblyContexts() {
		if (encapsulatedAssemblyContexts == null) {
			encapsulatedAssemblyContexts = new EObjectContainmentEList<AssemblyContext>(AssemblyContext.class, this, AssemblyPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXTS);
		}
		return encapsulatedAssemblyContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				return ((InternalEList<?>)getEncapsulatedAssemblyContexts()).basicRemove(otherEnd, msgs);
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
			case AssemblyPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				return getEncapsulatedAssemblyContexts();
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
			case AssemblyPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				getEncapsulatedAssemblyContexts().clear();
				getEncapsulatedAssemblyContexts().addAll((Collection<? extends AssemblyContext>)newValue);
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
			case AssemblyPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				getEncapsulatedAssemblyContexts().clear();
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
			case AssemblyPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXTS:
				return encapsulatedAssemblyContexts != null && !encapsulatedAssemblyContexts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeComponentImpl
