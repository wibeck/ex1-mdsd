/**
 */
package componentModel.impl;

import componentModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentModelFactoryImpl extends EFactoryImpl implements ComponentModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentModelFactory init() {
		try {
			ComponentModelFactory theComponentModelFactory = (ComponentModelFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentModelPackage.eNS_URI);
			if (theComponentModelFactory != null) {
				return theComponentModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComponentModelPackage.SYSTEM_INDEPENDENT_VIEW_POINT: return createSystemIndependentViewPoint();
			case ComponentModelPackage.REPOSITORY: return createRepository();
			case ComponentModelPackage.COMPONENT: return createComponent();
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY: return createInterfaceServiceMapEntry();
			case ComponentModelPackage.SERVICE_EFFECT_SPECIFICATION: return createServiceEffectSpecification();
			case ComponentModelPackage.BRANCH: return createBranch();
			case ComponentModelPackage.LOOP: return createLoop();
			case ComponentModelPackage.EXTERNAL_CALL: return createExternalCall();
			case ComponentModelPackage.INTERNAL_ACTION: return createInternalAction();
			case ComponentModelPackage.INTERFACE: return createInterface();
			case ComponentModelPackage.SIGNATURE: return createSignature();
			case ComponentModelPackage.SERVICE: return createService();
			case ComponentModelPackage.PARAMETER: return createParameter();
			case ComponentModelPackage.ASSEMBLY_VIEW_POINT: return createAssemblyViewPoint();
			case ComponentModelPackage.DEPLOYMENT_VIEW_POINT: return createDeploymentViewPoint();
			case ComponentModelPackage.SIMPLE_TYPE: return createSimpleType();
			case ComponentModelPackage.COMPLEX_TYPE: return createComplexType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ComponentModelPackage.SIMPLE_DATA_TYPE:
				return createSimpleDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ComponentModelPackage.SIMPLE_DATA_TYPE:
				return convertSimpleDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemIndependentViewPoint createSystemIndependentViewPoint() {
		SystemIndependentViewPointImpl systemIndependentViewPoint = new SystemIndependentViewPointImpl();
		return systemIndependentViewPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceServiceMapEntry createInterfaceServiceMapEntry() {
		InterfaceServiceMapEntryImpl interfaceServiceMapEntry = new InterfaceServiceMapEntryImpl();
		return interfaceServiceMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceEffectSpecification createServiceEffectSpecification() {
		ServiceEffectSpecificationImpl serviceEffectSpecification = new ServiceEffectSpecificationImpl();
		return serviceEffectSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalCall createExternalCall() {
		ExternalCallImpl externalCall = new ExternalCallImpl();
		return externalCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalAction createInternalAction() {
		InternalActionImpl internalAction = new InternalActionImpl();
		return internalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyViewPoint createAssemblyViewPoint() {
		AssemblyViewPointImpl assemblyViewPoint = new AssemblyViewPointImpl();
		return assemblyViewPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentViewPoint createDeploymentViewPoint() {
		DeploymentViewPointImpl deploymentViewPoint = new DeploymentViewPointImpl();
		return deploymentViewPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleType createSimpleType() {
		SimpleTypeImpl simpleType = new SimpleTypeImpl();
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexType createComplexType() {
		ComplexTypeImpl complexType = new ComplexTypeImpl();
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDataType createSimpleDataTypeFromString(EDataType eDataType, String initialValue) {
		SimpleDataType result = SimpleDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentModelPackage getComponentModelPackage() {
		return (ComponentModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentModelPackage getPackage() {
		return ComponentModelPackage.eINSTANCE;
	}

} //ComponentModelFactoryImpl
