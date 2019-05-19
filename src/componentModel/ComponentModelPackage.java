/**
 */
package componentModel;

import java.lang.String;

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
 * @see componentModel.ComponentModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ComponentModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "componentModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentModelPackage eINSTANCE = componentModel.impl.ComponentModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link componentModel.impl.ViewPointImpl <em>View Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.ViewPointImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getViewPoint()
	 * @generated
	 */
	int VIEW_POINT = 15;

	/**
	 * The feature id for the '<em><b>Viewtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_POINT__VIEWTYPES = 0;

	/**
	 * The number of structural features of the '<em>View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_POINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.SystemIndependentViewPointImpl <em>System Independent View Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.SystemIndependentViewPointImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getSystemIndependentViewPoint()
	 * @generated
	 */
	int SYSTEM_INDEPENDENT_VIEW_POINT = 0;

	/**
	 * The feature id for the '<em><b>Viewtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INDEPENDENT_VIEW_POINT__VIEWTYPES = VIEW_POINT__VIEWTYPES;

	/**
	 * The number of structural features of the '<em>System Independent View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INDEPENDENT_VIEW_POINT_FEATURE_COUNT = VIEW_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Independent View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INDEPENDENT_VIEW_POINT_OPERATION_COUNT = VIEW_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.ViewTypeImpl <em>View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.ViewTypeImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getViewType()
	 * @generated
	 */
	int VIEW_TYPE = 11;

	/**
	 * The number of structural features of the '<em>View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.RepositoryViewTypeImpl <em>Repository View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.RepositoryViewTypeImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getRepositoryViewType()
	 * @generated
	 */
	int REPOSITORY_VIEW_TYPE = 34;

	/**
	 * The number of structural features of the '<em>Repository View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_VIEW_TYPE_FEATURE_COUNT = VIEW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Repository View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_VIEW_TYPE_OPERATION_COUNT = VIEW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.RepositoryImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COMPONENT = REPOSITORY_VIEW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inter Face</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__INTER_FACE = REPOSITORY_VIEW_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = REPOSITORY_VIEW_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SIGNATURES = REPOSITORY_VIEW_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__TYPES = REPOSITORY_VIEW_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SERVICES = REPOSITORY_VIEW_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interfaceservicemapentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__INTERFACESERVICEMAPENTRY = REPOSITORY_VIEW_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PARAMETERS = REPOSITORY_VIEW_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = REPOSITORY_VIEW_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = REPOSITORY_VIEW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.ComponentImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interface Service Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INTERFACE_SERVICE_MAP = 1;

	/**
	 * The feature id for the '<em><b>Serviceeffectspecification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SERVICEEFFECTSPECIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.InterfaceServiceMapEntryImpl <em>Interface Service Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.InterfaceServiceMapEntryImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getInterfaceServiceMapEntry()
	 * @generated
	 */
	int INTERFACE_SERVICE_MAP_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Provided Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVICE_MAP_ENTRY__PROVIDED_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVICE_MAP_ENTRY__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVICE_MAP_ENTRY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Interface Service Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVICE_MAP_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interface Service Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVICE_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.ServiceEffectSpecificationImpl <em>Service Effect Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.ServiceEffectSpecificationImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getServiceEffectSpecification()
	 * @generated
	 */
	int SERVICE_EFFECT_SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EFFECT_SPECIFICATION__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EFFECT_SPECIFICATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Service Effect Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EFFECT_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Effect Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EFFECT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.ActionImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.BranchImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ACTIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.LoopImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ACTIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.ExternalCallImpl <em>External Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.ExternalCallImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getExternalCall()
	 * @generated
	 */
	int EXTERNAL_CALL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Required Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL__REQUIRED_SERVICE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.InternalActionImpl <em>Internal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.InternalActionImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getInternalAction()
	 * @generated
	 */
	int INTERNAL_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.InterfaceImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SIGNATURES = 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.SignatureImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__RETURN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.TypeImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 13;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.ServiceImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Correspondence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CORRESPONDENCE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REQUIRED = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.VoidImpl <em>Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.VoidImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getVoid()
	 * @generated
	 */
	int VOID = 16;

	/**
	 * The number of structural features of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.SimpleTypeImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 17;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.BooleanImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 18;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.IntImpl <em>Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.IntImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getInt()
	 * @generated
	 */
	int INT = 19;

	/**
	 * The number of structural features of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.CharImpl <em>Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.CharImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getChar()
	 * @generated
	 */
	int CHAR = 20;

	/**
	 * The number of structural features of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.DateImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 21;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.ListImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getList()
	 * @generated
	 */
	int LIST = 22;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.MapImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 23;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.FloatImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 24;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.LongImpl <em>Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.LongImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 25;

	/**
	 * The number of structural features of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.DoubleImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 26;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.StringImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getString()
	 * @generated
	 */
	int STRING = 27;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.ParameterImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.AssemblyViewTypeImpl <em>Assembly View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.AssemblyViewTypeImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getAssemblyViewType()
	 * @generated
	 */
	int ASSEMBLY_VIEW_TYPE = 29;

	/**
	 * The number of structural features of the '<em>Assembly View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VIEW_TYPE_FEATURE_COUNT = VIEW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assembly View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VIEW_TYPE_OPERATION_COUNT = VIEW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.EnvironmentViewTypeImpl <em>Environment View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.EnvironmentViewTypeImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getEnvironmentViewType()
	 * @generated
	 */
	int ENVIRONMENT_VIEW_TYPE = 30;

	/**
	 * The number of structural features of the '<em>Environment View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VIEW_TYPE_FEATURE_COUNT = VIEW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Environment View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VIEW_TYPE_OPERATION_COUNT = VIEW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.AllocationViewTypeImpl <em>Allocation View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.AllocationViewTypeImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getAllocationViewType()
	 * @generated
	 */
	int ALLOCATION_VIEW_TYPE = 31;

	/**
	 * The number of structural features of the '<em>Allocation View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_VIEW_TYPE_FEATURE_COUNT = VIEW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Allocation View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_VIEW_TYPE_OPERATION_COUNT = VIEW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.AssemblyViewPointImpl <em>Assembly View Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.AssemblyViewPointImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getAssemblyViewPoint()
	 * @generated
	 */
	int ASSEMBLY_VIEW_POINT = 32;

	/**
	 * The feature id for the '<em><b>Viewtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VIEW_POINT__VIEWTYPES = VIEW_POINT__VIEWTYPES;

	/**
	 * The number of structural features of the '<em>Assembly View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VIEW_POINT_FEATURE_COUNT = VIEW_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assembly View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VIEW_POINT_OPERATION_COUNT = VIEW_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.DeploymentViewPointImpl <em>Deployment View Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.DeploymentViewPointImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getDeploymentViewPoint()
	 * @generated
	 */
	int DEPLOYMENT_VIEW_POINT = 33;

	/**
	 * The feature id for the '<em><b>Viewtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_VIEW_POINT__VIEWTYPES = VIEW_POINT__VIEWTYPES;

	/**
	 * The number of structural features of the '<em>Deployment View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_VIEW_POINT_FEATURE_COUNT = VIEW_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deployment View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_VIEW_POINT_OPERATION_COUNT = VIEW_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentModel.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentModel.impl.ComplexTypeImpl
	 * @see componentModel.impl.ComponentModelPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 35;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link componentModel.SystemIndependentViewPoint <em>System Independent View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Independent View Point</em>'.
	 * @see componentModel.SystemIndependentViewPoint
	 * @generated
	 */
	EClass getSystemIndependentViewPoint();

	/**
	 * Returns the meta object for class '{@link componentModel.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see componentModel.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link componentModel.Repository#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see componentModel.Repository#getComponent()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link componentModel.Repository#getInterFace <em>Inter Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inter Face</em>'.
	 * @see componentModel.Repository#getInterFace()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_InterFace();

	/**
	 * Returns the meta object for the attribute '{@link componentModel.Repository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentModel.Repository#getName()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link componentModel.Repository#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures</em>'.
	 * @see componentModel.Repository#getSignatures()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Signatures();

	/**
	 * Returns the meta object for the containment reference list '{@link componentModel.Repository#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see componentModel.Repository#getTypes()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link componentModel.Repository#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see componentModel.Repository#getServices()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link componentModel.Repository#getInterfaceservicemapentry <em>Interfaceservicemapentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaceservicemapentry</em>'.
	 * @see componentModel.Repository#getInterfaceservicemapentry()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Interfaceservicemapentry();

	/**
	 * Returns the meta object for the containment reference list '{@link componentModel.Repository#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see componentModel.Repository#getParameters()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Parameters();

	/**
	 * Returns the meta object for class '{@link componentModel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see componentModel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link componentModel.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentModel.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link componentModel.Component#getInterfaceServiceMap <em>Interface Service Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Service Map</em>'.
	 * @see componentModel.Component#getInterfaceServiceMap()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_InterfaceServiceMap();

	/**
	 * Returns the meta object for the containment reference '{@link componentModel.Component#getServiceeffectspecification <em>Serviceeffectspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serviceeffectspecification</em>'.
	 * @see componentModel.Component#getServiceeffectspecification()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Serviceeffectspecification();

	/**
	 * Returns the meta object for class '{@link componentModel.InterfaceServiceMapEntry <em>Interface Service Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Service Map Entry</em>'.
	 * @see componentModel.InterfaceServiceMapEntry
	 * @generated
	 */
	EClass getInterfaceServiceMapEntry();

	/**
	 * Returns the meta object for the reference '{@link componentModel.InterfaceServiceMapEntry#getProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Interface</em>'.
	 * @see componentModel.InterfaceServiceMapEntry#getProvidedInterface()
	 * @see #getInterfaceServiceMapEntry()
	 * @generated
	 */
	EReference getInterfaceServiceMapEntry_ProvidedInterface();

	/**
	 * Returns the meta object for the reference list '{@link componentModel.InterfaceServiceMapEntry#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service</em>'.
	 * @see componentModel.InterfaceServiceMapEntry#getService()
	 * @see #getInterfaceServiceMapEntry()
	 * @generated
	 */
	EReference getInterfaceServiceMapEntry_Service();

	/**
	 * Returns the meta object for the attribute '{@link componentModel.InterfaceServiceMapEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentModel.InterfaceServiceMapEntry#getName()
	 * @see #getInterfaceServiceMapEntry()
	 * @generated
	 */
	EAttribute getInterfaceServiceMapEntry_Name();

	/**
	 * Returns the meta object for class '{@link componentModel.ServiceEffectSpecification <em>Service Effect Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Effect Specification</em>'.
	 * @see componentModel.ServiceEffectSpecification
	 * @generated
	 */
	EClass getServiceEffectSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link componentModel.ServiceEffectSpecification#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see componentModel.ServiceEffectSpecification#getActions()
	 * @see #getServiceEffectSpecification()
	 * @generated
	 */
	EReference getServiceEffectSpecification_Actions();

	/**
	 * Returns the meta object for the attribute '{@link componentModel.ServiceEffectSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentModel.ServiceEffectSpecification#getName()
	 * @see #getServiceEffectSpecification()
	 * @generated
	 */
	EAttribute getServiceEffectSpecification_Name();

	/**
	 * Returns the meta object for class '{@link componentModel.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see componentModel.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link componentModel.Branch#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see componentModel.Branch#getActions()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Actions();

	/**
	 * Returns the meta object for class '{@link componentModel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see componentModel.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link componentModel.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentModel.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for class '{@link componentModel.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see componentModel.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link componentModel.Loop#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see componentModel.Loop#getActions()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Actions();

	/**
	 * Returns the meta object for class '{@link componentModel.ExternalCall <em>External Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Call</em>'.
	 * @see componentModel.ExternalCall
	 * @generated
	 */
	EClass getExternalCall();

	/**
	 * Returns the meta object for the reference '{@link componentModel.ExternalCall#getRequiredService <em>Required Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Service</em>'.
	 * @see componentModel.ExternalCall#getRequiredService()
	 * @see #getExternalCall()
	 * @generated
	 */
	EReference getExternalCall_RequiredService();

	/**
	 * Returns the meta object for class '{@link componentModel.InternalAction <em>Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Action</em>'.
	 * @see componentModel.InternalAction
	 * @generated
	 */
	EClass getInternalAction();

	/**
	 * Returns the meta object for class '{@link componentModel.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see componentModel.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link componentModel.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentModel.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the reference list '{@link componentModel.Interface#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signatures</em>'.
	 * @see componentModel.Interface#getSignatures()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Signatures();

	/**
	 * Returns the meta object for class '{@link componentModel.ViewType <em>View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Type</em>'.
	 * @see componentModel.ViewType
	 * @generated
	 */
	EClass getViewType();

	/**
	 * Returns the meta object for class '{@link componentModel.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see componentModel.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the attribute '{@link componentModel.Signature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentModel.Signature#getName()
	 * @see #getSignature()
	 * @generated
	 */
	EAttribute getSignature_Name();

	/**
	 * Returns the meta object for the reference '{@link componentModel.Signature#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see componentModel.Signature#getReturnType()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_ReturnType();

	/**
	 * Returns the meta object for the reference list '{@link componentModel.Signature#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see componentModel.Signature#getParameters()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Parameters();

	/**
	 * Returns the meta object for class '{@link componentModel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see componentModel.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link componentModel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see componentModel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link componentModel.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentModel.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the reference list '{@link componentModel.Service#getCorrespondence <em>Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Correspondence</em>'.
	 * @see componentModel.Service#getCorrespondence()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Correspondence();

	/**
	 * Returns the meta object for the reference list '{@link componentModel.Service#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required</em>'.
	 * @see componentModel.Service#getRequired()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Required();

	/**
	 * Returns the meta object for class '{@link componentModel.ViewPoint <em>View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Point</em>'.
	 * @see componentModel.ViewPoint
	 * @generated
	 */
	EClass getViewPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link componentModel.ViewPoint#getViewtypes <em>Viewtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viewtypes</em>'.
	 * @see componentModel.ViewPoint#getViewtypes()
	 * @see #getViewPoint()
	 * @generated
	 */
	EReference getViewPoint_Viewtypes();

	/**
	 * Returns the meta object for class '{@link componentModel.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void</em>'.
	 * @see componentModel.Void
	 * @generated
	 */
	EClass getVoid();

	/**
	 * Returns the meta object for class '{@link componentModel.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see componentModel.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for class '{@link componentModel.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see componentModel.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link componentModel.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int</em>'.
	 * @see componentModel.Int
	 * @generated
	 */
	EClass getInt();

	/**
	 * Returns the meta object for class '{@link componentModel.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char</em>'.
	 * @see componentModel.Char
	 * @generated
	 */
	EClass getChar();

	/**
	 * Returns the meta object for class '{@link componentModel.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see componentModel.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for class '{@link componentModel.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see componentModel.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link componentModel.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see componentModel.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for class '{@link componentModel.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see componentModel.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for class '{@link componentModel.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long</em>'.
	 * @see componentModel.Long
	 * @generated
	 */
	EClass getLong();

	/**
	 * Returns the meta object for class '{@link componentModel.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see componentModel.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for class '{@link componentModel.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see componentModel.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link componentModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see componentModel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link componentModel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentModel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link componentModel.Parameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Type</em>'.
	 * @see componentModel.Parameter#getParameterType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParameterType();

	/**
	 * Returns the meta object for class '{@link componentModel.AssemblyViewType <em>Assembly View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly View Type</em>'.
	 * @see componentModel.AssemblyViewType
	 * @generated
	 */
	EClass getAssemblyViewType();

	/**
	 * Returns the meta object for class '{@link componentModel.EnvironmentViewType <em>Environment View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment View Type</em>'.
	 * @see componentModel.EnvironmentViewType
	 * @generated
	 */
	EClass getEnvironmentViewType();

	/**
	 * Returns the meta object for class '{@link componentModel.AllocationViewType <em>Allocation View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation View Type</em>'.
	 * @see componentModel.AllocationViewType
	 * @generated
	 */
	EClass getAllocationViewType();

	/**
	 * Returns the meta object for class '{@link componentModel.AssemblyViewPoint <em>Assembly View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly View Point</em>'.
	 * @see componentModel.AssemblyViewPoint
	 * @generated
	 */
	EClass getAssemblyViewPoint();

	/**
	 * Returns the meta object for class '{@link componentModel.DeploymentViewPoint <em>Deployment View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment View Point</em>'.
	 * @see componentModel.DeploymentViewPoint
	 * @generated
	 */
	EClass getDeploymentViewPoint();

	/**
	 * Returns the meta object for class '{@link componentModel.RepositoryViewType <em>Repository View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository View Type</em>'.
	 * @see componentModel.RepositoryViewType
	 * @generated
	 */
	EClass getRepositoryViewType();

	/**
	 * Returns the meta object for class '{@link componentModel.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see componentModel.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentModelFactory getComponentModelFactory();

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
		 * The meta object literal for the '{@link componentModel.impl.SystemIndependentViewPointImpl <em>System Independent View Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.SystemIndependentViewPointImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getSystemIndependentViewPoint()
		 * @generated
		 */
		EClass SYSTEM_INDEPENDENT_VIEW_POINT = eINSTANCE.getSystemIndependentViewPoint();

		/**
		 * The meta object literal for the '{@link componentModel.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.RepositoryImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__COMPONENT = eINSTANCE.getRepository_Component();

		/**
		 * The meta object literal for the '<em><b>Inter Face</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__INTER_FACE = eINSTANCE.getRepository_InterFace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__SIGNATURES = eINSTANCE.getRepository_Signatures();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__TYPES = eINSTANCE.getRepository_Types();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__SERVICES = eINSTANCE.getRepository_Services();

		/**
		 * The meta object literal for the '<em><b>Interfaceservicemapentry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__INTERFACESERVICEMAPENTRY = eINSTANCE.getRepository_Interfaceservicemapentry();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__PARAMETERS = eINSTANCE.getRepository_Parameters();

		/**
		 * The meta object literal for the '{@link componentModel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.ComponentImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Interface Service Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INTERFACE_SERVICE_MAP = eINSTANCE.getComponent_InterfaceServiceMap();

		/**
		 * The meta object literal for the '<em><b>Serviceeffectspecification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SERVICEEFFECTSPECIFICATION = eINSTANCE.getComponent_Serviceeffectspecification();

		/**
		 * The meta object literal for the '{@link componentModel.impl.InterfaceServiceMapEntryImpl <em>Interface Service Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.InterfaceServiceMapEntryImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getInterfaceServiceMapEntry()
		 * @generated
		 */
		EClass INTERFACE_SERVICE_MAP_ENTRY = eINSTANCE.getInterfaceServiceMapEntry();

		/**
		 * The meta object literal for the '<em><b>Provided Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SERVICE_MAP_ENTRY__PROVIDED_INTERFACE = eINSTANCE.getInterfaceServiceMapEntry_ProvidedInterface();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SERVICE_MAP_ENTRY__SERVICE = eINSTANCE.getInterfaceServiceMapEntry_Service();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_SERVICE_MAP_ENTRY__NAME = eINSTANCE.getInterfaceServiceMapEntry_Name();

		/**
		 * The meta object literal for the '{@link componentModel.impl.ServiceEffectSpecificationImpl <em>Service Effect Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.ServiceEffectSpecificationImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getServiceEffectSpecification()
		 * @generated
		 */
		EClass SERVICE_EFFECT_SPECIFICATION = eINSTANCE.getServiceEffectSpecification();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_EFFECT_SPECIFICATION__ACTIONS = eINSTANCE.getServiceEffectSpecification_Actions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EFFECT_SPECIFICATION__NAME = eINSTANCE.getServiceEffectSpecification_Name();

		/**
		 * The meta object literal for the '{@link componentModel.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.BranchImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__ACTIONS = eINSTANCE.getBranch_Actions();

		/**
		 * The meta object literal for the '{@link componentModel.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.ActionImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '{@link componentModel.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.LoopImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__ACTIONS = eINSTANCE.getLoop_Actions();

		/**
		 * The meta object literal for the '{@link componentModel.impl.ExternalCallImpl <em>External Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.ExternalCallImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getExternalCall()
		 * @generated
		 */
		EClass EXTERNAL_CALL = eINSTANCE.getExternalCall();

		/**
		 * The meta object literal for the '<em><b>Required Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CALL__REQUIRED_SERVICE = eINSTANCE.getExternalCall_RequiredService();

		/**
		 * The meta object literal for the '{@link componentModel.impl.InternalActionImpl <em>Internal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.InternalActionImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getInternalAction()
		 * @generated
		 */
		EClass INTERNAL_ACTION = eINSTANCE.getInternalAction();

		/**
		 * The meta object literal for the '{@link componentModel.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.InterfaceImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SIGNATURES = eINSTANCE.getInterface_Signatures();

		/**
		 * The meta object literal for the '{@link componentModel.impl.ViewTypeImpl <em>View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.ViewTypeImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getViewType()
		 * @generated
		 */
		EClass VIEW_TYPE = eINSTANCE.getViewType();

		/**
		 * The meta object literal for the '{@link componentModel.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.SignatureImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE__NAME = eINSTANCE.getSignature_Name();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__RETURN_TYPE = eINSTANCE.getSignature_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__PARAMETERS = eINSTANCE.getSignature_Parameters();

		/**
		 * The meta object literal for the '{@link componentModel.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.TypeImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link componentModel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.ServiceImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Correspondence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__CORRESPONDENCE = eINSTANCE.getService_Correspondence();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__REQUIRED = eINSTANCE.getService_Required();

		/**
		 * The meta object literal for the '{@link componentModel.impl.ViewPointImpl <em>View Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.ViewPointImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getViewPoint()
		 * @generated
		 */
		EClass VIEW_POINT = eINSTANCE.getViewPoint();

		/**
		 * The meta object literal for the '<em><b>Viewtypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_POINT__VIEWTYPES = eINSTANCE.getViewPoint_Viewtypes();

		/**
		 * The meta object literal for the '{@link componentModel.impl.VoidImpl <em>Void</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.VoidImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getVoid()
		 * @generated
		 */
		EClass VOID = eINSTANCE.getVoid();

		/**
		 * The meta object literal for the '{@link componentModel.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.SimpleTypeImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '{@link componentModel.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.BooleanImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link componentModel.impl.IntImpl <em>Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.IntImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getInt()
		 * @generated
		 */
		EClass INT = eINSTANCE.getInt();

		/**
		 * The meta object literal for the '{@link componentModel.impl.CharImpl <em>Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.CharImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getChar()
		 * @generated
		 */
		EClass CHAR = eINSTANCE.getChar();

		/**
		 * The meta object literal for the '{@link componentModel.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.DateImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '{@link componentModel.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.ListImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link componentModel.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.MapImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '{@link componentModel.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.FloatImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '{@link componentModel.impl.LongImpl <em>Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.LongImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getLong()
		 * @generated
		 */
		EClass LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '{@link componentModel.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.DoubleImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '{@link componentModel.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.StringImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link componentModel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.ParameterImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETER_TYPE = eINSTANCE.getParameter_ParameterType();

		/**
		 * The meta object literal for the '{@link componentModel.impl.AssemblyViewTypeImpl <em>Assembly View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.AssemblyViewTypeImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getAssemblyViewType()
		 * @generated
		 */
		EClass ASSEMBLY_VIEW_TYPE = eINSTANCE.getAssemblyViewType();

		/**
		 * The meta object literal for the '{@link componentModel.impl.EnvironmentViewTypeImpl <em>Environment View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.EnvironmentViewTypeImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getEnvironmentViewType()
		 * @generated
		 */
		EClass ENVIRONMENT_VIEW_TYPE = eINSTANCE.getEnvironmentViewType();

		/**
		 * The meta object literal for the '{@link componentModel.impl.AllocationViewTypeImpl <em>Allocation View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.AllocationViewTypeImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getAllocationViewType()
		 * @generated
		 */
		EClass ALLOCATION_VIEW_TYPE = eINSTANCE.getAllocationViewType();

		/**
		 * The meta object literal for the '{@link componentModel.impl.AssemblyViewPointImpl <em>Assembly View Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.AssemblyViewPointImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getAssemblyViewPoint()
		 * @generated
		 */
		EClass ASSEMBLY_VIEW_POINT = eINSTANCE.getAssemblyViewPoint();

		/**
		 * The meta object literal for the '{@link componentModel.impl.DeploymentViewPointImpl <em>Deployment View Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.DeploymentViewPointImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getDeploymentViewPoint()
		 * @generated
		 */
		EClass DEPLOYMENT_VIEW_POINT = eINSTANCE.getDeploymentViewPoint();

		/**
		 * The meta object literal for the '{@link componentModel.impl.RepositoryViewTypeImpl <em>Repository View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.RepositoryViewTypeImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getRepositoryViewType()
		 * @generated
		 */
		EClass REPOSITORY_VIEW_TYPE = eINSTANCE.getRepositoryViewType();

		/**
		 * The meta object literal for the '{@link componentModel.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentModel.impl.ComplexTypeImpl
		 * @see componentModel.impl.ComponentModelPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

	}

} //ComponentModelPackage
