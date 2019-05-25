/**
 */
package environment.impl;

import assembly.AssemblyPackage;

import assembly.impl.AssemblyPackageImpl;

import componentModel.ComponentModelPackage;

import componentModel.impl.ComponentModelPackageImpl;

import environment.AllocationContext;
import environment.Environment;
import environment.EnvironmentFactory;
import environment.EnvironmentPackage;
import environment.Link;

import environment.util.EnvironmentValidator;

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
public class EnvironmentPackageImpl extends EPackageImpl implements EnvironmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationContextEClass = null;

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
	 * @see environment.EnvironmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnvironmentPackageImpl() {
		super(eNS_URI, EnvironmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnvironmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnvironmentPackage init() {
		if (isInited) return (EnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEnvironmentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EnvironmentPackageImpl theEnvironmentPackage = registeredEnvironmentPackage instanceof EnvironmentPackageImpl ? (EnvironmentPackageImpl)registeredEnvironmentPackage : new EnvironmentPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RootPackage.eNS_URI);
		RootPackageImpl theRootPackage = (RootPackageImpl)(registeredPackage instanceof RootPackageImpl ? registeredPackage : RootPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComponentModelPackage.eNS_URI);
		ComponentModelPackageImpl theComponentModelPackage = (ComponentModelPackageImpl)(registeredPackage instanceof ComponentModelPackageImpl ? registeredPackage : ComponentModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI);
		AssemblyPackageImpl theAssemblyPackage = (AssemblyPackageImpl)(registeredPackage instanceof AssemblyPackageImpl ? registeredPackage : AssemblyPackage.eINSTANCE);

		// Create package meta-data objects
		theEnvironmentPackage.createPackageContents();
		theRootPackage.createPackageContents();
		theComponentModelPackage.createPackageContents();
		theAssemblyPackage.createPackageContents();

		// Initialize created meta-data
		theEnvironmentPackage.initializePackageContents();
		theRootPackage.initializePackageContents();
		theComponentModelPackage.initializePackageContents();
		theAssemblyPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEnvironmentPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return EnvironmentValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEnvironmentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnvironmentPackage.eNS_URI, theEnvironmentPackage);
		return theEnvironmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironment_Container() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironment_Link() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Name() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AllocationContexts() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_OutwardLinks() {
		return (EReference)containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Container() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Name() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllocationContext() {
		return allocationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllocationContext_AssemblyContext() {
		return (EReference)allocationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllocationContext_Container() {
		return (EReference)allocationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentFactory getEnvironmentFactory() {
		return (EnvironmentFactory)getEFactoryInstance();
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
		environmentEClass = createEClass(ENVIRONMENT);
		createEReference(environmentEClass, ENVIRONMENT__CONTAINER);
		createEReference(environmentEClass, ENVIRONMENT__LINK);

		containerEClass = createEClass(CONTAINER);
		createEAttribute(containerEClass, CONTAINER__NAME);
		createEReference(containerEClass, CONTAINER__ALLOCATION_CONTEXTS);
		createEReference(containerEClass, CONTAINER__OUTWARD_LINKS);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__CONTAINER);
		createEAttribute(linkEClass, LINK__NAME);

		allocationContextEClass = createEClass(ALLOCATION_CONTEXT);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__CONTAINER);
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
		AssemblyPackage theAssemblyPackage = (AssemblyPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		environmentEClass.getESuperTypes().add(theComponentModelPackage.getEnvironmentViewType());
		allocationContextEClass.getESuperTypes().add(theComponentModelPackage.getAllocationViewType());

		// Initialize classes, features, and operations; add parameters
		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironment_Container(), this.getContainer(), null, "container", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_Link(), this.getLink(), null, "link", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(containerEClass, environment.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainer_Name(), ecorePackage.getEString(), "name", null, 1, 1, environment.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_AllocationContexts(), this.getAllocationContext(), this.getAllocationContext_Container(), "allocationContexts", null, 0, -1, environment.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContainer_OutwardLinks(), this.getLink(), null, "outwardLinks", null, 0, -1, environment.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Container(), this.getContainer(), null, "container", null, 2, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLink_Name(), ecorePackage.getEString(), "name", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationContextEClass, AllocationContext.class, "AllocationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationContext_AssemblyContext(), theAssemblyPackage.getAssemblyContext(), null, "assemblyContext", null, 1, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationContext_Container(), this.getContainer(), this.getContainer_AllocationContexts(), "container", null, 0, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "assembly", "assembly.ecore#/",
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
		  (containerEClass,
		   source,
		   new String[] {
			   "constraints", "containerPartOfOutwardLinks allocationOnSameContainerOrContainersLinked"
		   });
		addAnnotation
		  (allocationContextEClass,
		   source,
		   new String[] {
			   "constraints", "onlyTopLevelComponentsAllowedToBeAllocated"
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
		  (containerEClass,
		   source,
		   new String[] {
			   "containerPartOfOutwardLinks", "\n\t\tself.outwardLinks ->collect(container) -> includes(self)",
			   "allocationOnSameContainerOrContainersLinked", "\n\t\tlet ProvidedAssemblyContexts =\n\t\tself.allocationContexts -> collect(assemblyContext) -> collect(outwardAssemblyConnectors) -> collect(providedRole),\n\t\tRequiredAssemblyContexts =\n\t\tself.allocationContexts -> collect(assemblyContext) -> collect(outwardAssemblyConnectors) -> collect(requiredRole)\n\t\tin self.allocationContexts -> collect(assemblyContext) -> includesAll(ProvidedAssemblyContexts -> union(RequiredAssemblyContexts))\n\t\txor self.outwardLinks ->exists(link | link.container ->collect(allocationContexts) -> collect(assemblyContext) \n\t\t-> includesAll(ProvidedAssemblyContexts -> union(RequiredAssemblyContexts)))"
		   });
		addAnnotation
		  (allocationContextEClass,
		   source,
		   new String[] {
			   "onlyTopLevelComponentsAllowedToBeAllocated", "self.assemblyContext.ownerComponent = null"
		   });
	}

} //EnvironmentPackageImpl
