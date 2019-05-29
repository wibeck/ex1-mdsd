/**
 */
package assembly.impl;

import assembly.AssemblyConnector;
import assembly.AssemblyContext;
import assembly.AssemblyFactory;
import assembly.AssemblyPackage;
import assembly.CompositeComponent;
import assembly.Context;
import assembly.ContextEnvironment;
import assembly.DelegationConnector;
import assembly.ProvidedDelegationConnector;
import assembly.ProvidedRole;
import assembly.RequiredDelegationConnector;
import assembly.RequiredRole;
import assembly.Role;

import assembly.util.AssemblyValidator;

import componentModel.ComponentModelPackage;

import componentModel.impl.ComponentModelPackageImpl;

import environment.EnvironmentPackage;

import environment.impl.EnvironmentPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class AssemblyPackageImpl extends EPackageImpl implements AssemblyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEnvironmentEClass = null;

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
	 * @see assembly.AssemblyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssemblyPackageImpl() {
		super(eNS_URI, AssemblyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AssemblyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssemblyPackage init() {
		if (isInited) return (AssemblyPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAssemblyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AssemblyPackageImpl theAssemblyPackage = registeredAssemblyPackage instanceof AssemblyPackageImpl ? (AssemblyPackageImpl)registeredAssemblyPackage : new AssemblyPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RootPackage.eNS_URI);
		RootPackageImpl theRootPackage = (RootPackageImpl)(registeredPackage instanceof RootPackageImpl ? registeredPackage : RootPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);
		EnvironmentPackageImpl theEnvironmentPackage = (EnvironmentPackageImpl)(registeredPackage instanceof EnvironmentPackageImpl ? registeredPackage : EnvironmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComponentModelPackage.eNS_URI);
		ComponentModelPackageImpl theComponentModelPackage = (ComponentModelPackageImpl)(registeredPackage instanceof ComponentModelPackageImpl ? registeredPackage : ComponentModelPackage.eINSTANCE);

		// Create package meta-data objects
		theAssemblyPackage.createPackageContents();
		theRootPackage.createPackageContents();
		theEnvironmentPackage.createPackageContents();
		theComponentModelPackage.createPackageContents();

		// Initialize created meta-data
		theAssemblyPackage.initializePackageContents();
		theRootPackage.initializePackageContents();
		theEnvironmentPackage.initializePackageContents();
		theComponentModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAssemblyPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return AssemblyValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAssemblyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssemblyPackage.eNS_URI, theAssemblyPackage);
		return theAssemblyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssemblyContext() {
		return assemblyContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyContext_Instantiates() {
		return (EReference)assemblyContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyContext_RequiredRoles() {
		return (EReference)assemblyContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyContext_ProvidedRoles() {
		return (EReference)assemblyContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyContext_OwnerComponent() {
		return (EReference)assemblyContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyContext_OutwardAssemblyConnectors() {
		return (EReference)assemblyContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssemblyContext_Name() {
		return (EAttribute)assemblyContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssemblyConnector() {
		return assemblyConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyConnector_ProvidedRole() {
		return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyConnector_RequiredRole() {
		return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssemblyConnector_Name() {
		return (EAttribute)assemblyConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredDelegationConnector() {
		return requiredDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredRole() {
		return requiredRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedRole() {
		return providedRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_AssemblyContext() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_InterFace() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedDelegationConnector() {
		return providedDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContext_RequiredInterfaces() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContext_DelegationConnectors() {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContext_NestedAssemblyConnectors() {
		return (EReference)contextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContext_ProvidedInterfaces() {
		return (EReference)contextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelegationConnector() {
		return delegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelegationConnector_InterFace() {
		return (EReference)delegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelegationConnector_Role() {
		return (EReference)delegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelegationConnector_Name() {
		return (EAttribute)delegationConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_EncapsulatedAssemblyContexts() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_CompositeComponents() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeComponent() {
		return compositeComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeComponent_EncapsulatedAssemblyContexts() {
		return (EReference)compositeComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextEnvironment() {
		return contextEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextEnvironment_Contexts() {
		return (EReference)contextEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextEnvironment_AssemblyConnectors() {
		return (EReference)contextEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextEnvironment_Roles() {
		return (EReference)contextEnvironmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyFactory getAssemblyFactory() {
		return (AssemblyFactory)getEFactoryInstance();
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
		assemblyContextEClass = createEClass(ASSEMBLY_CONTEXT);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__INSTANTIATES);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__REQUIRED_ROLES);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__PROVIDED_ROLES);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__OWNER_COMPONENT);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__OUTWARD_ASSEMBLY_CONNECTORS);
		createEAttribute(assemblyContextEClass, ASSEMBLY_CONTEXT__NAME);

		assemblyConnectorEClass = createEClass(ASSEMBLY_CONNECTOR);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__PROVIDED_ROLE);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__REQUIRED_ROLE);
		createEAttribute(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__NAME);

		requiredDelegationConnectorEClass = createEClass(REQUIRED_DELEGATION_CONNECTOR);

		requiredRoleEClass = createEClass(REQUIRED_ROLE);

		providedRoleEClass = createEClass(PROVIDED_ROLE);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__ASSEMBLY_CONTEXT);
		createEAttribute(roleEClass, ROLE__NAME);
		createEReference(roleEClass, ROLE__INTER_FACE);

		providedDelegationConnectorEClass = createEClass(PROVIDED_DELEGATION_CONNECTOR);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__REQUIRED_INTERFACES);
		createEReference(contextEClass, CONTEXT__DELEGATION_CONNECTORS);
		createEReference(contextEClass, CONTEXT__NESTED_ASSEMBLY_CONNECTORS);
		createEReference(contextEClass, CONTEXT__PROVIDED_INTERFACES);

		delegationConnectorEClass = createEClass(DELEGATION_CONNECTOR);
		createEReference(delegationConnectorEClass, DELEGATION_CONNECTOR__INTER_FACE);
		createEReference(delegationConnectorEClass, DELEGATION_CONNECTOR__ROLE);
		createEAttribute(delegationConnectorEClass, DELEGATION_CONNECTOR__NAME);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS);
		createEReference(systemEClass, SYSTEM__COMPOSITE_COMPONENTS);

		compositeComponentEClass = createEClass(COMPOSITE_COMPONENT);
		createEReference(compositeComponentEClass, COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXTS);

		contextEnvironmentEClass = createEClass(CONTEXT_ENVIRONMENT);
		createEReference(contextEnvironmentEClass, CONTEXT_ENVIRONMENT__CONTEXTS);
		createEReference(contextEnvironmentEClass, CONTEXT_ENVIRONMENT__ASSEMBLY_CONNECTORS);
		createEReference(contextEnvironmentEClass, CONTEXT_ENVIRONMENT__ROLES);
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

		// Obtain other dependent packages
		ComponentModelPackage theComponentModelPackage = (ComponentModelPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assemblyContextEClass.getESuperTypes().add(this.getContext());
		requiredDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
		requiredRoleEClass.getESuperTypes().add(this.getRole());
		providedRoleEClass.getESuperTypes().add(this.getRole());
		providedDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
		systemEClass.getESuperTypes().add(this.getContext());
		systemEClass.getESuperTypes().add(theComponentModelPackage.getAllocationViewType());
		compositeComponentEClass.getESuperTypes().add(theComponentModelPackage.getComponent());
		contextEnvironmentEClass.getESuperTypes().add(theComponentModelPackage.getAssemblyViewType());

		// Initialize classes, features, and operations; add parameters
		initEClass(assemblyContextEClass, AssemblyContext.class, "AssemblyContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyContext_Instantiates(), theComponentModelPackage.getComponent(), null, "instantiates", null, 1, 1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyContext_RequiredRoles(), this.getRequiredRole(), null, "requiredRoles", null, 0, -1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getAssemblyContext_RequiredRoles().getEKeys().add(this.getRole_Name());
		initEReference(getAssemblyContext_ProvidedRoles(), this.getProvidedRole(), null, "providedRoles", null, 1, -1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getAssemblyContext_ProvidedRoles().getEKeys().add(this.getRole_Name());
		initEReference(getAssemblyContext_OwnerComponent(), this.getCompositeComponent(), null, "ownerComponent", null, 0, 1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyContext_OutwardAssemblyConnectors(), this.getAssemblyConnector(), null, "outwardAssemblyConnectors", null, 0, -1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getAssemblyContext_OutwardAssemblyConnectors().getEKeys().add(this.getAssemblyConnector_Name());
		initEAttribute(getAssemblyContext_Name(), ecorePackage.getEString(), "name", null, 1, 1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyConnectorEClass, AssemblyConnector.class, "AssemblyConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyConnector_ProvidedRole(), this.getProvidedRole(), null, "providedRole", null, 1, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyConnector_RequiredRole(), this.getRequiredRole(), null, "requiredRole", null, 1, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssemblyConnector_Name(), ecorePackage.getEString(), "name", null, 1, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredDelegationConnectorEClass, RequiredDelegationConnector.class, "RequiredDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredRoleEClass, RequiredRole.class, "RequiredRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providedRoleEClass, ProvidedRole.class, "ProvidedRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_AssemblyContext(), this.getAssemblyContext(), null, "assemblyContext", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_InterFace(), theComponentModelPackage.getInterface(), null, "interFace", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedDelegationConnectorEClass, ProvidedDelegationConnector.class, "ProvidedDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextEClass, Context.class, "Context", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_RequiredInterfaces(), theComponentModelPackage.getInterface(), null, "requiredInterfaces", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getContext_RequiredInterfaces().getEKeys().add(theComponentModelPackage.getInterface_Name());
		initEReference(getContext_DelegationConnectors(), this.getDelegationConnector(), null, "delegationConnectors", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getContext_DelegationConnectors().getEKeys().add(this.getDelegationConnector_Name());
		initEReference(getContext_NestedAssemblyConnectors(), this.getAssemblyConnector(), null, "nestedAssemblyConnectors", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getContext_NestedAssemblyConnectors().getEKeys().add(this.getAssemblyConnector_Name());
		initEReference(getContext_ProvidedInterfaces(), theComponentModelPackage.getInterface(), null, "providedInterfaces", null, 1, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getContext_ProvidedInterfaces().getEKeys().add(theComponentModelPackage.getInterface_Name());

		initEClass(delegationConnectorEClass, DelegationConnector.class, "DelegationConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationConnector_InterFace(), theComponentModelPackage.getInterface(), null, "interFace", null, 1, 1, DelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegationConnector_Role(), this.getRole(), null, "role", null, 1, 1, DelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegationConnector_Name(), ecorePackage.getEString(), "name", null, 1, 1, DelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, assembly.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_EncapsulatedAssemblyContexts(), this.getAssemblyContext(), null, "encapsulatedAssemblyContexts", null, 0, -1, assembly.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getSystem_EncapsulatedAssemblyContexts().getEKeys().add(this.getAssemblyContext_Name());
		initEReference(getSystem_CompositeComponents(), this.getCompositeComponent(), null, "compositeComponents", null, 0, -1, assembly.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getSystem_CompositeComponents().getEKeys().add(theComponentModelPackage.getComponent_Name());

		initEClass(compositeComponentEClass, CompositeComponent.class, "CompositeComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeComponent_EncapsulatedAssemblyContexts(), this.getAssemblyContext(), null, "encapsulatedAssemblyContexts", null, 0, -1, CompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(contextEnvironmentEClass, ContextEnvironment.class, "ContextEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextEnvironment_Contexts(), this.getContext(), null, "contexts", null, 0, -1, ContextEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContextEnvironment_AssemblyConnectors(), this.getAssemblyConnector(), null, "assemblyConnectors", null, 0, -1, ContextEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContextEnvironment_AssemblyConnectors().getEKeys().add(this.getAssemblyConnector_Name());
		initEReference(getContextEnvironment_Roles(), this.getRole(), null, "roles", null, 0, -1, ContextEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getContextEnvironment_Roles().getEKeys().add(this.getRole_Name());

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "cm", "componentModel.ecore#/"
		   });
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
		  (assemblyContextEClass,
		   source,
		   new String[] {
			   "constraints", "reqInterfacesFromRequiredRoles providedInterfacesFromProvidedRoles onlyDelegationConnectorsIfComposite providedRoleForProvidedInterfaceExistsAndIsConnected requiredRoleForRequiredInterfaceExistsAndIsConnected assemblyContextIsPartOfOutwardAssemblyConnectors"
		   });
		addAnnotation
		  (assemblyConnectorEClass,
		   source,
		   new String[] {
			   "constraints", "assemblyContextsNotEqual providedRoleHasRequiredInterface"
		   });
		addAnnotation
		  (requiredDelegationConnectorEClass,
		   source,
		   new String[] {
			   "constraints", "roleCanOnlyBeRequired"
		   });
		addAnnotation
		  (requiredRoleEClass,
		   source,
		   new String[] {
			   "constraints", "requiredInterfaceFromServiceThatRequiresIt"
		   });
		addAnnotation
		  (providedRoleEClass,
		   source,
		   new String[] {
			   "constraints", "providededInterfaceFromISMap"
		   });
		addAnnotation
		  (providedDelegationConnectorEClass,
		   source,
		   new String[] {
			   "constraints", "roleCanOnlyBeProvided"
		   });
		addAnnotation
		  (systemEClass,
		   source,
		   new String[] {
			   "constraints", "providedRoleForProvidedInterfaceExistsAndIsConnected requiredRoleForRequiredInterfaceExistsAndIsConnected"
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
		  (assemblyContextEClass,
		   source,
		   new String[] {
			   "reqInterfacesFromRequiredRoles", "self.requiredInterfaces = self.requiredRoles -> collect(interFace)",
			   "providedInterfacesFromProvidedRoles", "self.providedInterfaces = self.providedRoles -> collect(interFace)",
			   "onlyDelegationConnectorsIfComposite", "if self.instantiates.oclIsKindOf(CompositeComponent) \n\t\tthen self.delegationConnectors -> size() > 0 else self.delegationConnectors -> size() = 0 endif",
			   "providedRoleForProvidedInterfaceExistsAndIsConnected", "\n\t\t\tif self.instantiates.oclIsKindOf(CompositeComponent) then \n\t\t\tself.providedInterfaces -> forAll(interFace | self.instantiates.oclAsType(CompositeComponent).encapsulatedAssemblyContexts \n\t\t\t\t-> collect(providedRoles) -> exists(role | role.interFace = interFace and self.delegationConnectors -> exists(connector | \n\t\t\t\t\tconnector.role = role and connector.interFace = interFace and connector.oclIsKindOf(assembly::ProvidedDelegationConnector)\n\t\t\t\t))) else true endif",
			   "requiredRoleForRequiredInterfaceExistsAndIsConnected", "if self.instantiates.oclIsKindOf(CompositeComponent) then \n\t\tself.requiredInterfaces -> forAll(interFace | self.instantiates.oclAsType(CompositeComponent).encapsulatedAssemblyContexts \n\t\t\t\t-> collect(requiredRoles) -> exists(role | role.interFace = interFace and self.delegationConnectors -> exists(connector | \n\t\t\t\t\tconnector.role = role and connector.interFace = interFace and connector.oclIsKindOf(assembly::RequiredDelegationConnector)\n\t\t\t\t))) else true endif",
			   "assemblyContextIsPartOfOutwardAssemblyConnectors", "\n\t\tself.outwardAssemblyConnectors -> forAll(aCon | aCon.providedRole.assemblyContext = self xor aCon.requiredRole.assemblyContext = self )"
		   });
		addAnnotation
		  (assemblyConnectorEClass,
		   source,
		   new String[] {
			   "assemblyContextsNotEqual", "(not (self.providedRole.assemblyContext = self.requiredRole.assemblyContext)) = true",
			   "providedRoleHasRequiredInterface", "self.providedRole.interFace = self.requiredRole.interFace"
		   });
		addAnnotation
		  (requiredDelegationConnectorEClass,
		   source,
		   new String[] {
			   "roleCanOnlyBeRequired", "self.role.oclIsKindOf(RequiredRole)"
		   });
		addAnnotation
		  (requiredRoleEClass,
		   source,
		   new String[] {
			   "requiredInterfaceFromServiceThatRequiresIt", "self.assemblyContext.instantiates.interfaceServiceMap ->exists(entry | entry.services -> select(service| service.requiredInterfaces \n\t\t-> includes(self.interFace)))  -> notEmpty() and not (self.assemblyContext.instantiates = null)"
		   });
		addAnnotation
		  (providedRoleEClass,
		   source,
		   new String[] {
			   "providededInterfaceFromISMap", "self.assemblyContext.instantiates.interfaceServiceMap ->exists(entry | entry.providedInterface = self.interFace)"
		   });
		addAnnotation
		  (providedDelegationConnectorEClass,
		   source,
		   new String[] {
			   "roleCanOnlyBeProvided", "self.role.oclIsKindOf(ProvidedRole)"
		   });
		addAnnotation
		  (systemEClass,
		   source,
		   new String[] {
			   "providedRoleForProvidedInterfaceExistsAndIsConnected", "\n\t\tself.providedInterfaces -> forAll(interFace | self.encapsulatedAssemblyContexts -> collect(providedRoles) \n\t\t\t-> exists(role | role.interFace = interFace and self.delegationConnectors -> exists(connector | connector.role = role \n\t\t\t\tand connector.interFace = interFace and connector.oclIsKindOf(assembly::ProvidedDelegationConnector)) ))",
			   "requiredRoleForRequiredInterfaceExistsAndIsConnected", "\n\t\tself.requiredInterfaces -> forAll(interFace | self.encapsulatedAssemblyContexts -> collect(requiredRoles) \n\t\t\t-> exists(role | role.interFace = interFace and self.delegationConnectors -> exists(connector | connector.role = role \n\t\t\t\tand connector.interFace = interFace and connector.oclIsKindOf(assembly::RequiredDelegationConnector)) ))"
		   });
	}

} //AssemblyPackageImpl
