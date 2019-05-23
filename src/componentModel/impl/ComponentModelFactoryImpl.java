/**
 */
package componentModel.impl;

import componentModel.Branch;
import componentModel.Char;
import componentModel.ComplexType;
import componentModel.Component;
import componentModel.ComponentModelFactory;
import componentModel.ComponentModelPackage;
import componentModel.ConcreteAssemblyViewPoint;
import componentModel.ConcreteDeploymentViewPoint;
import componentModel.ConcreteSystemIndependentViewPoint;
import componentModel.Date;
import componentModel.ExternalCall;
import componentModel.Int;
import componentModel.Interface;
import componentModel.InterfaceServiceMapEntry;
import componentModel.InternalAction;
import componentModel.List;
import componentModel.Loop;
import componentModel.Map;
import componentModel.Parameter;
import componentModel.Repository;
import componentModel.Service;
import componentModel.ServiceEffectSpecification;
import componentModel.Signature;

import org.eclipse.emf.ecore.EClass;
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
			case ComponentModelPackage.VOID: return createVoid();
			case ComponentModelPackage.BOOLEAN: return createBoolean();
			case ComponentModelPackage.INT: return createInt();
			case ComponentModelPackage.CHAR: return createChar();
			case ComponentModelPackage.DATE: return createDate();
			case ComponentModelPackage.LIST: return createList();
			case ComponentModelPackage.MAP: return createMap();
			case ComponentModelPackage.FLOAT: return createFloat();
			case ComponentModelPackage.LONG: return createLong();
			case ComponentModelPackage.DOUBLE: return createDouble();
			case ComponentModelPackage.STRING: return createString();
			case ComponentModelPackage.PARAMETER: return createParameter();
			case ComponentModelPackage.COMPLEX_TYPE: return createComplexType();
			case ComponentModelPackage.CONCRETE_SYSTEM_INDEPENDENT_VIEW_POINT: return createConcreteSystemIndependentViewPoint();
			case ComponentModelPackage.CONCRETE_DEPLOYMENT_VIEW_POINT: return createConcreteDeploymentViewPoint();
			case ComponentModelPackage.CONCRETE_ASSEMBLY_VIEW_POINT: return createConcreteAssemblyViewPoint();
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
	public componentModel.Void createVoid() {
		VoidImpl void_ = new VoidImpl();
		return void_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public componentModel.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Int createInt() {
		IntImpl int_ = new IntImpl();
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Char createChar() {
		CharImpl char_ = new CharImpl();
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public componentModel.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public componentModel.Long createLong() {
		LongImpl long_ = new LongImpl();
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public componentModel.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public componentModel.String createString() {
		StringImpl string = new StringImpl();
		return string;
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
	public ComplexType createComplexType() {
		ComplexTypeImpl complexType = new ComplexTypeImpl();
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcreteSystemIndependentViewPoint createConcreteSystemIndependentViewPoint() {
		ConcreteSystemIndependentViewPointImpl concreteSystemIndependentViewPoint = new ConcreteSystemIndependentViewPointImpl();
		return concreteSystemIndependentViewPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcreteDeploymentViewPoint createConcreteDeploymentViewPoint() {
		ConcreteDeploymentViewPointImpl concreteDeploymentViewPoint = new ConcreteDeploymentViewPointImpl();
		return concreteDeploymentViewPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcreteAssemblyViewPoint createConcreteAssemblyViewPoint() {
		ConcreteAssemblyViewPointImpl concreteAssemblyViewPoint = new ConcreteAssemblyViewPointImpl();
		return concreteAssemblyViewPoint;
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
