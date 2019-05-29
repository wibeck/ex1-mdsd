/**
 */
package environment;

import componentModel.ComponentModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see environment.EnvironmentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import assembly='assembly.ecore#/' cm='componentModel.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface EnvironmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "environment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "env";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "env";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvironmentPackage eINSTANCE = environment.impl.EnvironmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link environment.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.EnvironmentImpl
	 * @see environment.impl.EnvironmentPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = ComponentModelPackage.ENVIRONMENT_VIEW_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__CONTAINER = ComponentModelPackage.ENVIRONMENT_VIEW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__LINK = ComponentModelPackage.ENVIRONMENT_VIEW_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = ComponentModelPackage.ENVIRONMENT_VIEW_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = ComponentModelPackage.ENVIRONMENT_VIEW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.ContainerImpl
	 * @see environment.impl.EnvironmentPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Allocation Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ALLOCATION_CONTEXTS = 1;

	/**
	 * The feature id for the '<em><b>Outward Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OUTWARD_LINKS = 2;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link environment.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.LinkImpl
	 * @see environment.impl.EnvironmentPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link environment.impl.AllocationContextImpl <em>Allocation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.AllocationContextImpl
	 * @see environment.impl.EnvironmentPackageImpl#getAllocationContext()
	 * @generated
	 */
	int ALLOCATION_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__NAME = ComponentModelPackage.ALLOCATION_VIEW_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT = ComponentModelPackage.ALLOCATION_VIEW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__CONTAINER = ComponentModelPackage.ALLOCATION_VIEW_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Allocation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT_FEATURE_COUNT = ComponentModelPackage.ALLOCATION_VIEW_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Allocation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT_OPERATION_COUNT = ComponentModelPackage.ALLOCATION_VIEW_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link environment.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see environment.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link environment.Environment#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container</em>'.
	 * @see environment.Environment#getContainer()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link environment.Environment#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see environment.Environment#getLink()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Link();

	/**
	 * Returns the meta object for class '{@link environment.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see environment.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link environment.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see environment.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link environment.Container#getAllocationContexts <em>Allocation Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocation Contexts</em>'.
	 * @see environment.Container#getAllocationContexts()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_AllocationContexts();

	/**
	 * Returns the meta object for the reference list '{@link environment.Container#getOutwardLinks <em>Outward Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outward Links</em>'.
	 * @see environment.Container#getOutwardLinks()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_OutwardLinks();

	/**
	 * Returns the meta object for class '{@link environment.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see environment.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference list '{@link environment.Link#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Container</em>'.
	 * @see environment.Link#getContainer()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Container();

	/**
	 * Returns the meta object for the attribute '{@link environment.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see environment.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for class '{@link environment.AllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Context</em>'.
	 * @see environment.AllocationContext
	 * @generated
	 */
	EClass getAllocationContext();

	/**
	 * Returns the meta object for the reference '{@link environment.AllocationContext#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context</em>'.
	 * @see environment.AllocationContext#getAssemblyContext()
	 * @see #getAllocationContext()
	 * @generated
	 */
	EReference getAllocationContext_AssemblyContext();

	/**
	 * Returns the meta object for the container reference '{@link environment.AllocationContext#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see environment.AllocationContext#getContainer()
	 * @see #getAllocationContext()
	 * @generated
	 */
	EReference getAllocationContext_Container();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnvironmentFactory getEnvironmentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link environment.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.EnvironmentImpl
		 * @see environment.impl.EnvironmentPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__CONTAINER = eINSTANCE.getEnvironment_Container();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__LINK = eINSTANCE.getEnvironment_Link();

		/**
		 * The meta object literal for the '{@link environment.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ContainerImpl
		 * @see environment.impl.EnvironmentPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Allocation Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ALLOCATION_CONTEXTS = eINSTANCE.getContainer_AllocationContexts();

		/**
		 * The meta object literal for the '<em><b>Outward Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__OUTWARD_LINKS = eINSTANCE.getContainer_OutwardLinks();

		/**
		 * The meta object literal for the '{@link environment.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.LinkImpl
		 * @see environment.impl.EnvironmentPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__CONTAINER = eINSTANCE.getLink_Container();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '{@link environment.impl.AllocationContextImpl <em>Allocation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.AllocationContextImpl
		 * @see environment.impl.EnvironmentPackageImpl#getAllocationContext()
		 * @generated
		 */
		EClass ALLOCATION_CONTEXT = eINSTANCE.getAllocationContext();

		/**
		 * The meta object literal for the '<em><b>Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT = eINSTANCE.getAllocationContext_AssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONTEXT__CONTAINER = eINSTANCE.getAllocationContext_Container();

	}

} //EnvironmentPackage
