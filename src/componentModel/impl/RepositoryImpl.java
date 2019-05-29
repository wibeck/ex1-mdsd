/**
 */
package componentModel.impl;

import componentModel.Component;
import componentModel.ComponentModelPackage;
import componentModel.DataType;
import componentModel.Interface;
import componentModel.Repository;
import componentModel.Service;
import componentModel.Signature;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentModel.impl.RepositoryImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link componentModel.impl.RepositoryImpl#getInterFaces <em>Inter Faces</em>}</li>
 *   <li>{@link componentModel.impl.RepositoryImpl#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link componentModel.impl.RepositoryImpl#getServices <em>Services</em>}</li>
 *   <li>{@link componentModel.impl.RepositoryImpl#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends RepositoryViewTypeImpl implements Repository {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getInterFaces() <em>Inter Faces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterFaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interFaces;

	/**
	 * The cached value of the '{@link #getSignatures() <em>Signatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> signatures;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> dataTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentModelPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, ComponentModelPackage.REPOSITORY__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getInterFaces() {
		if (interFaces == null) {
			interFaces = new EObjectContainmentEList<Interface>(Interface.class, this, ComponentModelPackage.REPOSITORY__INTER_FACES);
		}
		return interFaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signature> getSignatures() {
		if (signatures == null) {
			signatures = new EObjectContainmentEList<Signature>(Signature.class, this, ComponentModelPackage.REPOSITORY__SIGNATURES);
		}
		return signatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, ComponentModelPackage.REPOSITORY__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this, ComponentModelPackage.REPOSITORY__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentModelPackage.REPOSITORY__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case ComponentModelPackage.REPOSITORY__INTER_FACES:
				return ((InternalEList<?>)getInterFaces()).basicRemove(otherEnd, msgs);
			case ComponentModelPackage.REPOSITORY__SIGNATURES:
				return ((InternalEList<?>)getSignatures()).basicRemove(otherEnd, msgs);
			case ComponentModelPackage.REPOSITORY__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case ComponentModelPackage.REPOSITORY__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
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
			case ComponentModelPackage.REPOSITORY__COMPONENTS:
				return getComponents();
			case ComponentModelPackage.REPOSITORY__INTER_FACES:
				return getInterFaces();
			case ComponentModelPackage.REPOSITORY__SIGNATURES:
				return getSignatures();
			case ComponentModelPackage.REPOSITORY__SERVICES:
				return getServices();
			case ComponentModelPackage.REPOSITORY__DATA_TYPES:
				return getDataTypes();
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
			case ComponentModelPackage.REPOSITORY__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case ComponentModelPackage.REPOSITORY__INTER_FACES:
				getInterFaces().clear();
				getInterFaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case ComponentModelPackage.REPOSITORY__SIGNATURES:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends Signature>)newValue);
				return;
			case ComponentModelPackage.REPOSITORY__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ComponentModelPackage.REPOSITORY__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
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
			case ComponentModelPackage.REPOSITORY__COMPONENTS:
				getComponents().clear();
				return;
			case ComponentModelPackage.REPOSITORY__INTER_FACES:
				getInterFaces().clear();
				return;
			case ComponentModelPackage.REPOSITORY__SIGNATURES:
				getSignatures().clear();
				return;
			case ComponentModelPackage.REPOSITORY__SERVICES:
				getServices().clear();
				return;
			case ComponentModelPackage.REPOSITORY__DATA_TYPES:
				getDataTypes().clear();
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
			case ComponentModelPackage.REPOSITORY__COMPONENTS:
				return components != null && !components.isEmpty();
			case ComponentModelPackage.REPOSITORY__INTER_FACES:
				return interFaces != null && !interFaces.isEmpty();
			case ComponentModelPackage.REPOSITORY__SIGNATURES:
				return signatures != null && !signatures.isEmpty();
			case ComponentModelPackage.REPOSITORY__SERVICES:
				return services != null && !services.isEmpty();
			case ComponentModelPackage.REPOSITORY__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepositoryImpl
