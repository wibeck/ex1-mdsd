/**
 */
package root;

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
 * @see root.RootFactory
 * @model kind="package"
 * @generated
 */
public interface RootPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "root";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "root";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootPackage eINSTANCE = root.impl.RootPackageImpl.init();

	/**
	 * The meta object id for the '{@link root.impl.RootClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see root.impl.RootClassImpl
	 * @see root.impl.RootPackageImpl#getRootClass()
	 * @generated
	 */
	int ROOT_CLASS = 0;

	/**
	 * The feature id for the '<em><b>View Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS__VIEW_POINTS = 0;

	/**
	 * The feature id for the '<em><b>Context Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS__CONTEXT_ENVIRONMENTS = 1;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link root.RootClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see root.RootClass
	 * @generated
	 */
	EClass getRootClass();

	/**
	 * Returns the meta object for the containment reference list '{@link root.RootClass#getViewPoints <em>View Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Points</em>'.
	 * @see root.RootClass#getViewPoints()
	 * @see #getRootClass()
	 * @generated
	 */
	EReference getRootClass_ViewPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link root.RootClass#getContextEnvironments <em>Context Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Environments</em>'.
	 * @see root.RootClass#getContextEnvironments()
	 * @see #getRootClass()
	 * @generated
	 */
	EReference getRootClass_ContextEnvironments();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RootFactory getRootFactory();

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
		 * The meta object literal for the '{@link root.impl.RootClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see root.impl.RootClassImpl
		 * @see root.impl.RootPackageImpl#getRootClass()
		 * @generated
		 */
		EClass ROOT_CLASS = eINSTANCE.getRootClass();

		/**
		 * The meta object literal for the '<em><b>View Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_CLASS__VIEW_POINTS = eINSTANCE.getRootClass_ViewPoints();

		/**
		 * The meta object literal for the '<em><b>Context Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_CLASS__CONTEXT_ENVIRONMENTS = eINSTANCE.getRootClass_ContextEnvironments();

	}

} //RootPackage
