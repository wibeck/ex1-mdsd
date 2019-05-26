/**
 */
package componentModel.impl;

import assembly.AssemblyPackage;

import assembly.impl.AssemblyPackageImpl;

import componentModel.Action;
import componentModel.AllocationViewType;
import componentModel.AssemblyViewPoint;
import componentModel.AssemblyViewType;
import componentModel.Branch;
import componentModel.ComplexType;
import componentModel.Component;
import componentModel.ComponentModelFactory;
import componentModel.ComponentModelPackage;
import componentModel.DeploymentViewPoint;
import componentModel.EnvironmentViewType;
import componentModel.ExternalCall;
import componentModel.Interface;
import componentModel.InterfaceServiceMapEntry;
import componentModel.InternalAction;
import componentModel.Loop;
import componentModel.Parameter;
import componentModel.Repository;
import componentModel.RepositoryViewType;
import componentModel.Service;
import componentModel.ServiceEffectSpecification;
import componentModel.Signature;
import componentModel.SimpleDataType;
import componentModel.SimpleType;
import componentModel.SystemIndependentViewPoint;
import componentModel.Type;
import componentModel.ViewPoint;
import componentModel.ViewType;

import componentModel.util.ComponentModelValidator;

import environment.EnvironmentPackage;

import environment.impl.EnvironmentPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import root.RootPackage;

import root.impl.RootPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentModelPackageImpl extends EPackageImpl implements ComponentModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemIndependentViewPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceServiceMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEffectSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyViewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentViewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationViewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyViewPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentViewPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryViewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simpleDataTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see componentModel.ComponentModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentModelPackageImpl() {
		super(eNS_URI, ComponentModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ComponentModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentModelPackage init() {
		if (isInited) return (ComponentModelPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComponentModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComponentModelPackageImpl theComponentModelPackage = registeredComponentModelPackage instanceof ComponentModelPackageImpl ? (ComponentModelPackageImpl)registeredComponentModelPackage : new ComponentModelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RootPackage.eNS_URI);
		RootPackageImpl theRootPackage = (RootPackageImpl)(registeredPackage instanceof RootPackageImpl ? registeredPackage : RootPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);
		EnvironmentPackageImpl theEnvironmentPackage = (EnvironmentPackageImpl)(registeredPackage instanceof EnvironmentPackageImpl ? registeredPackage : EnvironmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI);
		AssemblyPackageImpl theAssemblyPackage = (AssemblyPackageImpl)(registeredPackage instanceof AssemblyPackageImpl ? registeredPackage : AssemblyPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentModelPackage.createPackageContents();
		theRootPackage.createPackageContents();
		theEnvironmentPackage.createPackageContents();
		theAssemblyPackage.createPackageContents();

		// Initialize created meta-data
		theComponentModelPackage.initializePackageContents();
		theRootPackage.initializePackageContents();
		theEnvironmentPackage.initializePackageContents();
		theAssemblyPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theComponentModelPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return ComponentModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theComponentModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentModelPackage.eNS_URI, theComponentModelPackage);
		return theComponentModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemIndependentViewPoint() {
		return systemIndependentViewPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_Components() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_InterFaces() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_Signatures() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_Services() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_InterfaceServiceMapEntries() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_InterfaceServiceMap() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_ServiceEffectSpecification() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_RequiredInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceServiceMapEntry() {
		return interfaceServiceMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceServiceMapEntry_ProvidedInterface() {
		return (EReference)interfaceServiceMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceServiceMapEntry_Services() {
		return (EReference)interfaceServiceMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceServiceMapEntry_Name() {
		return (EAttribute)interfaceServiceMapEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceEffectSpecification() {
		return serviceEffectSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceEffectSpecification_Actions() {
		return (EReference)serviceEffectSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceEffectSpecification_Name() {
		return (EAttribute)serviceEffectSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBranch_Actions() {
		return (EReference)branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Name() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoop_Actions() {
		return (EReference)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalCall() {
		return externalCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalCall_RequiredService() {
		return (EReference)externalCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalAction() {
		return internalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterface_Name() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface_Signatures() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewType() {
		return viewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewType_Name() {
		return (EAttribute)viewTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignature_Name() {
		return (EAttribute)signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Parameters() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_ReturnType() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Correspondence() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_RequiredInterfaces() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewPoint() {
		return viewPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewPoint_ViewTypes() {
		return (EReference)viewPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewPoint_Name() {
		return (EAttribute)viewPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_ParameterType() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssemblyViewType() {
		return assemblyViewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentViewType() {
		return environmentViewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllocationViewType() {
		return allocationViewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssemblyViewPoint() {
		return assemblyViewPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeploymentViewPoint() {
		return deploymentViewPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepositoryViewType() {
		return repositoryViewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleType() {
		return simpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleType_TypeName() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplexType() {
		return complexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplexType_Name() {
		return (EAttribute)complexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSimpleDataType() {
		return simpleDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentModelFactory getComponentModelFactory() {
		return (ComponentModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemIndependentViewPointEClass = createEClass(SYSTEM_INDEPENDENT_VIEW_POINT);

		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__COMPONENTS);
		createEReference(repositoryEClass, REPOSITORY__INTER_FACES);
		createEReference(repositoryEClass, REPOSITORY__SIGNATURES);
		createEReference(repositoryEClass, REPOSITORY__SERVICES);
		createEReference(repositoryEClass, REPOSITORY__INTERFACE_SERVICE_MAP_ENTRIES);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEReference(componentEClass, COMPONENT__INTERFACE_SERVICE_MAP);
		createEReference(componentEClass, COMPONENT__SERVICE_EFFECT_SPECIFICATION);
		createEReference(componentEClass, COMPONENT__REQUIRED_INTERFACES);

		interfaceServiceMapEntryEClass = createEClass(INTERFACE_SERVICE_MAP_ENTRY);
		createEReference(interfaceServiceMapEntryEClass, INTERFACE_SERVICE_MAP_ENTRY__PROVIDED_INTERFACE);
		createEReference(interfaceServiceMapEntryEClass, INTERFACE_SERVICE_MAP_ENTRY__SERVICES);
		createEAttribute(interfaceServiceMapEntryEClass, INTERFACE_SERVICE_MAP_ENTRY__NAME);

		serviceEffectSpecificationEClass = createEClass(SERVICE_EFFECT_SPECIFICATION);
		createEReference(serviceEffectSpecificationEClass, SERVICE_EFFECT_SPECIFICATION__ACTIONS);
		createEAttribute(serviceEffectSpecificationEClass, SERVICE_EFFECT_SPECIFICATION__NAME);

		branchEClass = createEClass(BRANCH);
		createEReference(branchEClass, BRANCH__ACTIONS);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NAME);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__ACTIONS);

		externalCallEClass = createEClass(EXTERNAL_CALL);
		createEReference(externalCallEClass, EXTERNAL_CALL__REQUIRED_SERVICE);

		internalActionEClass = createEClass(INTERNAL_ACTION);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__NAME);
		createEReference(interfaceEClass, INTERFACE__SIGNATURES);

		viewTypeEClass = createEClass(VIEW_TYPE);
		createEAttribute(viewTypeEClass, VIEW_TYPE__NAME);

		signatureEClass = createEClass(SIGNATURE);
		createEAttribute(signatureEClass, SIGNATURE__NAME);
		createEReference(signatureEClass, SIGNATURE__PARAMETERS);
		createEReference(signatureEClass, SIGNATURE__RETURN_TYPE);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEReference(serviceEClass, SERVICE__CORRESPONDENCE);
		createEReference(serviceEClass, SERVICE__REQUIRED_INTERFACES);

		viewPointEClass = createEClass(VIEW_POINT);
		createEReference(viewPointEClass, VIEW_POINT__VIEW_TYPES);
		createEAttribute(viewPointEClass, VIEW_POINT__NAME);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__PARAMETER_TYPE);

		assemblyViewTypeEClass = createEClass(ASSEMBLY_VIEW_TYPE);

		environmentViewTypeEClass = createEClass(ENVIRONMENT_VIEW_TYPE);

		allocationViewTypeEClass = createEClass(ALLOCATION_VIEW_TYPE);

		assemblyViewPointEClass = createEClass(ASSEMBLY_VIEW_POINT);

		deploymentViewPointEClass = createEClass(DEPLOYMENT_VIEW_POINT);

		repositoryViewTypeEClass = createEClass(REPOSITORY_VIEW_TYPE);

		typeEClass = createEClass(TYPE);

		simpleTypeEClass = createEClass(SIMPLE_TYPE);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__TYPE_NAME);

		complexTypeEClass = createEClass(COMPLEX_TYPE);
		createEAttribute(complexTypeEClass, COMPLEX_TYPE__NAME);

		// Create enums
		simpleDataTypeEEnum = createEEnum(SIMPLE_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemIndependentViewPointEClass.getESuperTypes().add(this.getViewPoint());
		repositoryEClass.getESuperTypes().add(this.getRepositoryViewType());
		branchEClass.getESuperTypes().add(this.getAction());
		loopEClass.getESuperTypes().add(this.getAction());
		externalCallEClass.getESuperTypes().add(this.getAction());
		internalActionEClass.getESuperTypes().add(this.getAction());
		assemblyViewTypeEClass.getESuperTypes().add(this.getViewType());
		environmentViewTypeEClass.getESuperTypes().add(this.getViewType());
		allocationViewTypeEClass.getESuperTypes().add(this.getViewType());
		assemblyViewPointEClass.getESuperTypes().add(this.getViewPoint());
		deploymentViewPointEClass.getESuperTypes().add(this.getViewPoint());
		repositoryViewTypeEClass.getESuperTypes().add(this.getViewType());
		simpleTypeEClass.getESuperTypes().add(this.getType());
		complexTypeEClass.getESuperTypes().add(this.getType());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemIndependentViewPointEClass, SystemIndependentViewPoint.class, "SystemIndependentViewPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_Components(), this.getComponent(), null, "components", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getRepository_Components().getEKeys().add(this.getComponent_Name());
		initEReference(getRepository_InterFaces(), this.getInterface(), null, "interFaces", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getRepository_InterFaces().getEKeys().add(this.getInterface_Name());
		initEReference(getRepository_Signatures(), this.getSignature(), null, "signatures", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getRepository_Signatures().getEKeys().add(this.getSignature_Name());
		initEReference(getRepository_Services(), this.getService(), null, "services", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getRepository_Services().getEKeys().add(this.getService_Name());
		initEReference(getRepository_InterfaceServiceMapEntries(), this.getInterfaceServiceMapEntry(), null, "interfaceServiceMapEntries", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getRepository_InterfaceServiceMapEntries().getEKeys().add(this.getInterfaceServiceMapEntry_Name());

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_InterfaceServiceMap(), this.getInterfaceServiceMapEntry(), null, "interfaceServiceMap", null, 1, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getComponent_InterfaceServiceMap().getEKeys().add(this.getInterfaceServiceMapEntry_Name());
		initEReference(getComponent_ServiceEffectSpecification(), this.getServiceEffectSpecification(), null, "serviceEffectSpecification", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_RequiredInterfaces(), this.getInterface(), null, "requiredInterfaces", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getComponent_RequiredInterfaces().getEKeys().add(this.getInterface_Name());

		initEClass(interfaceServiceMapEntryEClass, InterfaceServiceMapEntry.class, "InterfaceServiceMapEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceServiceMapEntry_ProvidedInterface(), this.getInterface(), null, "providedInterface", null, 1, 1, InterfaceServiceMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceServiceMapEntry_Services(), this.getService(), null, "services", null, 1, -1, InterfaceServiceMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getInterfaceServiceMapEntry_Services().getEKeys().add(this.getService_Name());
		initEAttribute(getInterfaceServiceMapEntry_Name(), ecorePackage.getEString(), "name", null, 1, 1, InterfaceServiceMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEffectSpecificationEClass, ServiceEffectSpecification.class, "ServiceEffectSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceEffectSpecification_Actions(), this.getAction(), null, "actions", null, 0, -1, ServiceEffectSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceEffectSpecification_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceEffectSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranch_Actions(), this.getAction(), null, "actions", null, 0, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Actions(), this.getAction(), null, "actions", null, 0, -1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalCallEClass, ExternalCall.class, "ExternalCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalCall_RequiredService(), this.getService(), null, "requiredService", null, 1, 1, ExternalCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalActionEClass, InternalAction.class, "InternalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Signatures(), this.getSignature(), null, "signatures", null, 1, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getInterface_Signatures().getEKeys().add(this.getSignature_Name());

		initEClass(viewTypeEClass, ViewType.class, "ViewType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewType_Name(), ecorePackage.getEString(), "name", null, 1, 1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignature_Name(), ecorePackage.getEString(), "name", null, 1, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getSignature_Parameters().getEKeys().add(this.getParameter_Name());
		initEReference(getSignature_ReturnType(), this.getType(), null, "returnType", null, 1, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Correspondence(), this.getSignature(), null, "correspondence", null, 1, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getService_Correspondence().getEKeys().add(this.getSignature_Name());
		initEReference(getService_RequiredInterfaces(), this.getInterface(), null, "requiredInterfaces", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getService_RequiredInterfaces().getEKeys().add(this.getInterface_Name());

		initEClass(viewPointEClass, ViewPoint.class, "ViewPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewPoint_ViewTypes(), this.getViewType(), null, "viewTypes", null, 0, -1, ViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getViewPoint_ViewTypes().getEKeys().add(this.getViewType_Name());
		initEAttribute(getViewPoint_Name(), ecorePackage.getEString(), "name", null, 1, 1, ViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_ParameterType(), this.getType(), null, "parameterType", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyViewTypeEClass, AssemblyViewType.class, "AssemblyViewType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(environmentViewTypeEClass, EnvironmentViewType.class, "EnvironmentViewType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocationViewTypeEClass, AllocationViewType.class, "AllocationViewType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assemblyViewPointEClass, AssemblyViewPoint.class, "AssemblyViewPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentViewPointEClass, DeploymentViewPoint.class, "DeploymentViewPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repositoryViewTypeEClass, RepositoryViewType.class, "RepositoryViewType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleType_TypeName(), this.getSimpleDataType(), "typeName", null, 1, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexTypeEClass, ComplexType.class, "ComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexType_Name(), ecorePackage.getEString(), "name", null, 1, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(simpleDataTypeEEnum, SimpleDataType.class, "SimpleDataType");
		addEEnumLiteral(simpleDataTypeEEnum, SimpleDataType.BOOLEAN);
		addEEnumLiteral(simpleDataTypeEEnum, SimpleDataType.INT);
		addEEnumLiteral(simpleDataTypeEEnum, SimpleDataType.CHAR);
		addEEnumLiteral(simpleDataTypeEEnum, SimpleDataType.DATE);
		addEEnumLiteral(simpleDataTypeEEnum, SimpleDataType.LIST);
		addEEnumLiteral(simpleDataTypeEEnum, SimpleDataType.MAP);
		addEEnumLiteral(simpleDataTypeEEnum, SimpleDataType.FLOAT);
		addEEnumLiteral(simpleDataTypeEEnum, SimpleDataType.LONG);
		addEEnumLiteral(simpleDataTypeEEnum, SimpleDataType.DOUBLE);
		addEEnumLiteral(simpleDataTypeEEnum, SimpleDataType.STRING);
		addEEnumLiteral(simpleDataTypeEEnum, SimpleDataType.VOID);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (systemIndependentViewPointEClass,
		   source,
		   new String[] {
			   "constraints", "SysIndependentVPOnlyHasRepositoryVT"
		   });
		addAnnotation
		  (componentEClass,
		   source,
		   new String[] {
			   "constraints", "servicesForEachSignatureOfProvidedInterfaces requiredInterfacesResultFromServices"
		   });
		addAnnotation
		  (parameterEClass,
		   source,
		   new String[] {
			   "constraints", "VoidNotParameterType"
		   });
		addAnnotation
		  (assemblyViewPointEClass,
		   source,
		   new String[] {
			   "constraints", "assemlbyVPonlyHasAssemblyVT"
		   });
		addAnnotation
		  (deploymentViewPointEClass,
		   source,
		   new String[] {
			   "constraints", "DeploymentVPonlyHasDeploymentVT"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (systemIndependentViewPointEClass,
		   source,
		   new String[] {
			   "SysIndependentVPOnlyHasRepositoryVT", "self.viewTypes -> forAll(vt | vt.oclIsKindOf(componentModel::RepositoryViewType) )"
		   });
		addAnnotation
		  (componentEClass,
		   source,
		   new String[] {
			   "servicesForEachSignatureOfProvidedInterfaces", "self.interfaceServiceMap -> forAll(entry | entry.services -> \n\t\t\tcollect(correspondence) -> intersection(entry.providedInterface.signatures) -> size() \n\t\t\t=  entry.providedInterface.signatures -> size())",
			   "requiredInterfacesResultFromServices", "self. requiredInterfaces -> includesAll(self.interfaceServiceMap -> \n\t\t\t\t\t\t\t\t\t\t\t\t\t\tcollect(services) -> collect(requiredInterfaces) -> asSet()) "
		   });
		addAnnotation
		  (parameterEClass,
		   source,
		   new String[] {
			   "VoidNotParameterType", "if self.parameterType.oclIsKindOf(SimpleType) then self.parameterType.oclAsType(SimpleType) \n\t\t\t\t\t\t\t\t\t\t<> SimpleDataType::VOID else true endif"
		   });
		addAnnotation
		  (assemblyViewPointEClass,
		   source,
		   new String[] {
			   "assemlbyVPonlyHasAssemblyVT", "self.viewTypes -> forAll(vt | vt.oclIsKindOf(componentModel::AssemblyViewType))"
		   });
		addAnnotation
		  (deploymentViewPointEClass,
		   source,
		   new String[] {
			   "DeploymentVPonlyHasDeploymentVT", "self.viewTypes -> forAll(vt | vt.oclIsKindOf(componentModel::EnvironmentViewType) \n\t\t\tor vt.oclIsKindOf(componentModel::AllocationViewType))"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";
		addAnnotation
		  (interfaceEClass,
		   source,
		   new String[] {
			   "archetype", "Role"
		   });
	}

} //ComponentModelPackageImpl
