/**
 */
package assembly;

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
 * @see assembly.AssemblyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import cm='componentModel.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface AssemblyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assembly";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "assembly";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assembly";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssemblyPackage eINSTANCE = assembly.impl.AssemblyPackageImpl.init();

	/**
	 * The meta object id for the '{@link assembly.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assembly.impl.ContextImpl
	 * @see assembly.impl.AssemblyPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 7;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__REQUIRED_INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Delegation Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DELEGATION_CONNECTORS = 1;

	/**
	 * The feature id for the '<em><b>Nested Assembly Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NESTED_ASSEMBLY_CONNECTORS = 2;

	/**
	 * The feature id for the '<em><b>Outward Assembly Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__OUTWARD_ASSEMBLY_CONNECTORS = 3;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assembly.impl.AssemblyContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assembly.impl.AssemblyContextImpl
	 * @see assembly.impl.AssemblyPackageImpl#getAssemblyContext()
	 * @generated
	 */
	int ASSEMBLY_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__REQUIRED_INTERFACES = CONTEXT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Delegation Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__DELEGATION_CONNECTORS = CONTEXT__DELEGATION_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Nested Assembly Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__NESTED_ASSEMBLY_CONNECTORS = CONTEXT__NESTED_ASSEMBLY_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Outward Assembly Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__OUTWARD_ASSEMBLY_CONNECTORS = CONTEXT__OUTWARD_ASSEMBLY_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__NAME = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instantiates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__INSTANTIATES = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__REQUIRED_ROLES = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__PROVIDED_ROLES = CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owner Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__OWNER_COMPONENT = CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__PROVIDED_INTERFACES = CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assembly.impl.AssemblyConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assembly.impl.AssemblyConnectorImpl
	 * @see assembly.impl.AssemblyPackageImpl#getAssemblyConnector()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PROVIDED_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__REQUIRED_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__NAME = 2;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assembly.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assembly.impl.DelegationConnectorImpl
	 * @see assembly.impl.AssemblyPackageImpl#getDelegationConnector()
	 * @generated
	 */
	int DELEGATION_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Inter Face</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__INTER_FACE = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__NAME = 2;

	/**
	 * The number of structural features of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assembly.impl.RequiredDelegationConnectorImpl <em>Required Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assembly.impl.RequiredDelegationConnectorImpl
	 * @see assembly.impl.AssemblyPackageImpl#getRequiredDelegationConnector()
	 * @generated
	 */
	int REQUIRED_DELEGATION_CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Inter Face</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__INTER_FACE = DELEGATION_CONNECTOR__INTER_FACE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__ROLE = DELEGATION_CONNECTOR__ROLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__NAME = DELEGATION_CONNECTOR__NAME;

	/**
	 * The number of structural features of the '<em>Required Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR_FEATURE_COUNT = DELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR_OPERATION_COUNT = DELEGATION_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assembly.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assembly.impl.RoleImpl
	 * @see assembly.impl.AssemblyPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 5;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ASSEMBLY_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Inter Face</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INTER_FACE = 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assembly.impl.RequiredRoleImpl <em>Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assembly.impl.RequiredRoleImpl
	 * @see assembly.impl.AssemblyPackageImpl#getRequiredRole()
	 * @generated
	 */
	int REQUIRED_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__ASSEMBLY_CONTEXT = ROLE__ASSEMBLY_CONTEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Inter Face</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__INTER_FACE = ROLE__INTER_FACE;

	/**
	 * The number of structural features of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assembly.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assembly.impl.ProvidedRoleImpl
	 * @see assembly.impl.AssemblyPackageImpl#getProvidedRole()
	 * @generated
	 */
	int PROVIDED_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__ASSEMBLY_CONTEXT = ROLE__ASSEMBLY_CONTEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Inter Face</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__INTER_FACE = ROLE__INTER_FACE;

	/**
	 * The number of structural features of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assembly.impl.ProvidedDelegationConnectorImpl <em>Provided Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assembly.impl.ProvidedDelegationConnectorImpl
	 * @see assembly.impl.AssemblyPackageImpl#getProvidedDelegationConnector()
	 * @generated
	 */
	int PROVIDED_DELEGATION_CONNECTOR = 6;

	/**
	 * The feature id for the '<em><b>Inter Face</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__INTER_FACE = DELEGATION_CONNECTOR__INTER_FACE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__ROLE = DELEGATION_CONNECTOR__ROLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__NAME = DELEGATION_CONNECTOR__NAME;

	/**
	 * The number of structural features of the '<em>Provided Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR_FEATURE_COUNT = DELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR_OPERATION_COUNT = DELEGATION_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assembly.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assembly.impl.SystemImpl
	 * @see assembly.impl.AssemblyPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 9;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REQUIRED_INTERFACES = CONTEXT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Delegation Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DELEGATION_CONNECTORS = CONTEXT__DELEGATION_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Nested Assembly Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NESTED_ASSEMBLY_CONNECTORS = CONTEXT__NESTED_ASSEMBLY_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Outward Assembly Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OUTWARD_ASSEMBLY_CONNECTORS = CONTEXT__OUTWARD_ASSEMBLY_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROVIDED_INTERFACES = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encapsulated Assembly Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assembly.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assembly.impl.CompositeComponentImpl
	 * @see assembly.impl.AssemblyPackageImpl#getCompositeComponent()
	 * @generated
	 */
	int COMPOSITE_COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__NAME = ComponentModelPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Interface Service Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__INTERFACE_SERVICE_MAP = ComponentModelPackage.COMPONENT__INTERFACE_SERVICE_MAP;

	/**
	 * The feature id for the '<em><b>Service Effect Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__SERVICE_EFFECT_SPECIFICATION = ComponentModelPackage.COMPONENT__SERVICE_EFFECT_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Encapsulated Assembly Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXTS = ComponentModelPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_FEATURE_COUNT = ComponentModelPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_OPERATION_COUNT = ComponentModelPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assembly.impl.ContextEnvironmentImpl <em>Context Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assembly.impl.ContextEnvironmentImpl
	 * @see assembly.impl.AssemblyPackageImpl#getContextEnvironment()
	 * @generated
	 */
	int CONTEXT_ENVIRONMENT = 11;

	/**
	 * The feature id for the '<em><b>Composite Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENVIRONMENT__COMPOSITE_COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Delegation Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENVIRONMENT__DELEGATION_CONNECTORS = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENVIRONMENT__ROLES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENVIRONMENT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENVIRONMENT__CONTEXTS = 4;

	/**
	 * The number of structural features of the '<em>Context Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENVIRONMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Context Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ENVIRONMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link assembly.AssemblyContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see assembly.AssemblyContext
	 * @generated
	 */
	EClass getAssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link assembly.AssemblyContext#getInstantiates <em>Instantiates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiates</em>'.
	 * @see assembly.AssemblyContext#getInstantiates()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_Instantiates();

	/**
	 * Returns the meta object for the containment reference list '{@link assembly.AssemblyContext#getRequiredRoles <em>Required Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Roles</em>'.
	 * @see assembly.AssemblyContext#getRequiredRoles()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_RequiredRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link assembly.AssemblyContext#getProvidedRoles <em>Provided Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Roles</em>'.
	 * @see assembly.AssemblyContext#getProvidedRoles()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_ProvidedRoles();

	/**
	 * Returns the meta object for the reference '{@link assembly.AssemblyContext#getOwnerComponent <em>Owner Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Component</em>'.
	 * @see assembly.AssemblyContext#getOwnerComponent()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_OwnerComponent();

	/**
	 * Returns the meta object for the reference list '{@link assembly.AssemblyContext#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Interfaces</em>'.
	 * @see assembly.AssemblyContext#getProvidedInterfaces()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_ProvidedInterfaces();

	/**
	 * Returns the meta object for class '{@link assembly.AssemblyConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see assembly.AssemblyConnector
	 * @generated
	 */
	EClass getAssemblyConnector();

	/**
	 * Returns the meta object for the reference '{@link assembly.AssemblyConnector#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see assembly.AssemblyConnector#getProvidedRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link assembly.AssemblyConnector#getRequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Role</em>'.
	 * @see assembly.AssemblyConnector#getRequiredRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_RequiredRole();

	/**
	 * Returns the meta object for the attribute '{@link assembly.AssemblyConnector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assembly.AssemblyConnector#getName()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EAttribute getAssemblyConnector_Name();

	/**
	 * Returns the meta object for class '{@link assembly.RequiredDelegationConnector <em>Required Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Delegation Connector</em>'.
	 * @see assembly.RequiredDelegationConnector
	 * @generated
	 */
	EClass getRequiredDelegationConnector();

	/**
	 * Returns the meta object for class '{@link assembly.RequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Role</em>'.
	 * @see assembly.RequiredRole
	 * @generated
	 */
	EClass getRequiredRole();

	/**
	 * Returns the meta object for class '{@link assembly.ProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Role</em>'.
	 * @see assembly.ProvidedRole
	 * @generated
	 */
	EClass getProvidedRole();

	/**
	 * Returns the meta object for class '{@link assembly.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see assembly.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference '{@link assembly.Role#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context</em>'.
	 * @see assembly.Role#getAssemblyContext()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_AssemblyContext();

	/**
	 * Returns the meta object for the attribute '{@link assembly.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assembly.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the reference '{@link assembly.Role#getInterFace <em>Inter Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inter Face</em>'.
	 * @see assembly.Role#getInterFace()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_InterFace();

	/**
	 * Returns the meta object for class '{@link assembly.ProvidedDelegationConnector <em>Provided Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Delegation Connector</em>'.
	 * @see assembly.ProvidedDelegationConnector
	 * @generated
	 */
	EClass getProvidedDelegationConnector();

	/**
	 * Returns the meta object for class '{@link assembly.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see assembly.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference list '{@link assembly.Context#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Interfaces</em>'.
	 * @see assembly.Context#getRequiredInterfaces()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_RequiredInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link assembly.Context#getDelegationConnectors <em>Delegation Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation Connectors</em>'.
	 * @see assembly.Context#getDelegationConnectors()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_DelegationConnectors();

	/**
	 * Returns the meta object for the reference list '{@link assembly.Context#getNestedAssemblyConnectors <em>Nested Assembly Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nested Assembly Connectors</em>'.
	 * @see assembly.Context#getNestedAssemblyConnectors()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_NestedAssemblyConnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link assembly.Context#getOutwardAssemblyConnectors <em>Outward Assembly Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outward Assembly Connectors</em>'.
	 * @see assembly.Context#getOutwardAssemblyConnectors()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_OutwardAssemblyConnectors();

	/**
	 * Returns the meta object for class '{@link assembly.DelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector</em>'.
	 * @see assembly.DelegationConnector
	 * @generated
	 */
	EClass getDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link assembly.DelegationConnector#getInterFace <em>Inter Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inter Face</em>'.
	 * @see assembly.DelegationConnector#getInterFace()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_InterFace();

	/**
	 * Returns the meta object for the reference '{@link assembly.DelegationConnector#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see assembly.DelegationConnector#getRole()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_Role();

	/**
	 * Returns the meta object for the attribute '{@link assembly.DelegationConnector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assembly.DelegationConnector#getName()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EAttribute getDelegationConnector_Name();

	/**
	 * Returns the meta object for class '{@link assembly.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see assembly.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the reference list '{@link assembly.System#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Interfaces</em>'.
	 * @see assembly.System#getProvidedInterfaces()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ProvidedInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link assembly.System#getEncapsulatedAssemblyContexts <em>Encapsulated Assembly Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encapsulated Assembly Contexts</em>'.
	 * @see assembly.System#getEncapsulatedAssemblyContexts()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_EncapsulatedAssemblyContexts();

	/**
	 * Returns the meta object for the attribute '{@link assembly.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assembly.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for class '{@link assembly.CompositeComponent <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component</em>'.
	 * @see assembly.CompositeComponent
	 * @generated
	 */
	EClass getCompositeComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link assembly.CompositeComponent#getEncapsulatedAssemblyContexts <em>Encapsulated Assembly Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Encapsulated Assembly Contexts</em>'.
	 * @see assembly.CompositeComponent#getEncapsulatedAssemblyContexts()
	 * @see #getCompositeComponent()
	 * @generated
	 */
	EReference getCompositeComponent_EncapsulatedAssemblyContexts();

	/**
	 * Returns the meta object for class '{@link assembly.ContextEnvironment <em>Context Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Environment</em>'.
	 * @see assembly.ContextEnvironment
	 * @generated
	 */
	EClass getContextEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link assembly.ContextEnvironment#getCompositeComponents <em>Composite Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Components</em>'.
	 * @see assembly.ContextEnvironment#getCompositeComponents()
	 * @see #getContextEnvironment()
	 * @generated
	 */
	EReference getContextEnvironment_CompositeComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link assembly.ContextEnvironment#getDelegationConnectors <em>Delegation Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation Connectors</em>'.
	 * @see assembly.ContextEnvironment#getDelegationConnectors()
	 * @see #getContextEnvironment()
	 * @generated
	 */
	EReference getContextEnvironment_DelegationConnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link assembly.ContextEnvironment#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see assembly.ContextEnvironment#getRoles()
	 * @see #getContextEnvironment()
	 * @generated
	 */
	EReference getContextEnvironment_Roles();

	/**
	 * Returns the meta object for the attribute '{@link assembly.ContextEnvironment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assembly.ContextEnvironment#getName()
	 * @see #getContextEnvironment()
	 * @generated
	 */
	EAttribute getContextEnvironment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link assembly.ContextEnvironment#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see assembly.ContextEnvironment#getContexts()
	 * @see #getContextEnvironment()
	 * @generated
	 */
	EReference getContextEnvironment_Contexts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssemblyFactory getAssemblyFactory();

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
		 * The meta object literal for the '{@link assembly.impl.AssemblyContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assembly.impl.AssemblyContextImpl
		 * @see assembly.impl.AssemblyPackageImpl#getAssemblyContext()
		 * @generated
		 */
		EClass ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Instantiates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__INSTANTIATES = eINSTANCE.getAssemblyContext_Instantiates();

		/**
		 * The meta object literal for the '<em><b>Required Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__REQUIRED_ROLES = eINSTANCE.getAssemblyContext_RequiredRoles();

		/**
		 * The meta object literal for the '<em><b>Provided Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__PROVIDED_ROLES = eINSTANCE.getAssemblyContext_ProvidedRoles();

		/**
		 * The meta object literal for the '<em><b>Owner Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__OWNER_COMPONENT = eINSTANCE.getAssemblyContext_OwnerComponent();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__PROVIDED_INTERFACES = eINSTANCE.getAssemblyContext_ProvidedInterfaces();

		/**
		 * The meta object literal for the '{@link assembly.impl.AssemblyConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assembly.impl.AssemblyConnectorImpl
		 * @see assembly.impl.AssemblyPackageImpl#getAssemblyConnector()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR = eINSTANCE.getAssemblyConnector();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__PROVIDED_ROLE = eINSTANCE.getAssemblyConnector_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__REQUIRED_ROLE = eINSTANCE.getAssemblyConnector_RequiredRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSEMBLY_CONNECTOR__NAME = eINSTANCE.getAssemblyConnector_Name();

		/**
		 * The meta object literal for the '{@link assembly.impl.RequiredDelegationConnectorImpl <em>Required Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assembly.impl.RequiredDelegationConnectorImpl
		 * @see assembly.impl.AssemblyPackageImpl#getRequiredDelegationConnector()
		 * @generated
		 */
		EClass REQUIRED_DELEGATION_CONNECTOR = eINSTANCE.getRequiredDelegationConnector();

		/**
		 * The meta object literal for the '{@link assembly.impl.RequiredRoleImpl <em>Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assembly.impl.RequiredRoleImpl
		 * @see assembly.impl.AssemblyPackageImpl#getRequiredRole()
		 * @generated
		 */
		EClass REQUIRED_ROLE = eINSTANCE.getRequiredRole();

		/**
		 * The meta object literal for the '{@link assembly.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assembly.impl.ProvidedRoleImpl
		 * @see assembly.impl.AssemblyPackageImpl#getProvidedRole()
		 * @generated
		 */
		EClass PROVIDED_ROLE = eINSTANCE.getProvidedRole();

		/**
		 * The meta object literal for the '{@link assembly.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assembly.impl.RoleImpl
		 * @see assembly.impl.AssemblyPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ASSEMBLY_CONTEXT = eINSTANCE.getRole_AssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Inter Face</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__INTER_FACE = eINSTANCE.getRole_InterFace();

		/**
		 * The meta object literal for the '{@link assembly.impl.ProvidedDelegationConnectorImpl <em>Provided Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assembly.impl.ProvidedDelegationConnectorImpl
		 * @see assembly.impl.AssemblyPackageImpl#getProvidedDelegationConnector()
		 * @generated
		 */
		EClass PROVIDED_DELEGATION_CONNECTOR = eINSTANCE.getProvidedDelegationConnector();

		/**
		 * The meta object literal for the '{@link assembly.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assembly.impl.ContextImpl
		 * @see assembly.impl.AssemblyPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Required Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__REQUIRED_INTERFACES = eINSTANCE.getContext_RequiredInterfaces();

		/**
		 * The meta object literal for the '<em><b>Delegation Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__DELEGATION_CONNECTORS = eINSTANCE.getContext_DelegationConnectors();

		/**
		 * The meta object literal for the '<em><b>Nested Assembly Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__NESTED_ASSEMBLY_CONNECTORS = eINSTANCE.getContext_NestedAssemblyConnectors();

		/**
		 * The meta object literal for the '<em><b>Outward Assembly Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__OUTWARD_ASSEMBLY_CONNECTORS = eINSTANCE.getContext_OutwardAssemblyConnectors();

		/**
		 * The meta object literal for the '{@link assembly.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assembly.impl.DelegationConnectorImpl
		 * @see assembly.impl.AssemblyPackageImpl#getDelegationConnector()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR = eINSTANCE.getDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Inter Face</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__INTER_FACE = eINSTANCE.getDelegationConnector_InterFace();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__ROLE = eINSTANCE.getDelegationConnector_Role();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION_CONNECTOR__NAME = eINSTANCE.getDelegationConnector_Name();

		/**
		 * The meta object literal for the '{@link assembly.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assembly.impl.SystemImpl
		 * @see assembly.impl.AssemblyPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROVIDED_INTERFACES = eINSTANCE.getSystem_ProvidedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Encapsulated Assembly Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXTS = eINSTANCE.getSystem_EncapsulatedAssemblyContexts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '{@link assembly.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assembly.impl.CompositeComponentImpl
		 * @see assembly.impl.AssemblyPackageImpl#getCompositeComponent()
		 * @generated
		 */
		EClass COMPOSITE_COMPONENT = eINSTANCE.getCompositeComponent();

		/**
		 * The meta object literal for the '<em><b>Encapsulated Assembly Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXTS = eINSTANCE.getCompositeComponent_EncapsulatedAssemblyContexts();

		/**
		 * The meta object literal for the '{@link assembly.impl.ContextEnvironmentImpl <em>Context Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assembly.impl.ContextEnvironmentImpl
		 * @see assembly.impl.AssemblyPackageImpl#getContextEnvironment()
		 * @generated
		 */
		EClass CONTEXT_ENVIRONMENT = eINSTANCE.getContextEnvironment();

		/**
		 * The meta object literal for the '<em><b>Composite Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ENVIRONMENT__COMPOSITE_COMPONENTS = eINSTANCE.getContextEnvironment_CompositeComponents();

		/**
		 * The meta object literal for the '<em><b>Delegation Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ENVIRONMENT__DELEGATION_CONNECTORS = eINSTANCE.getContextEnvironment_DelegationConnectors();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ENVIRONMENT__ROLES = eINSTANCE.getContextEnvironment_Roles();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ENVIRONMENT__NAME = eINSTANCE.getContextEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ENVIRONMENT__CONTEXTS = eINSTANCE.getContextEnvironment_Contexts();

	}

} //AssemblyPackage
