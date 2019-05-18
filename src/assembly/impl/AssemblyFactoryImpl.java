/**
 */
package assembly.impl;

import assembly.AssemblyConnector;
import assembly.AssemblyContext;
import assembly.AssemblyFactory;
import assembly.AssemblyPackage;
import assembly.CompositeComponent;
import assembly.ContextEnvironment;
import assembly.ProvidedDelegationConnector;
import assembly.ProvidedRole;
import assembly.RequiredDelegationConnector;
import assembly.RequiredRole;

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
public class AssemblyFactoryImpl extends EFactoryImpl implements AssemblyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssemblyFactory init() {
		try {
			AssemblyFactory theAssemblyFactory = (AssemblyFactory)EPackage.Registry.INSTANCE.getEFactory(AssemblyPackage.eNS_URI);
			if (theAssemblyFactory != null) {
				return theAssemblyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssemblyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyFactoryImpl() {
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
			case AssemblyPackage.ASSEMBLY_CONTEXT: return createAssemblyContext();
			case AssemblyPackage.ASSEMBLY_CONNECTOR: return createAssemblyConnector();
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR: return createRequiredDelegationConnector();
			case AssemblyPackage.REQUIRED_ROLE: return createRequiredRole();
			case AssemblyPackage.PROVIDED_ROLE: return createProvidedRole();
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR: return createProvidedDelegationConnector();
			case AssemblyPackage.SYSTEM: return createSystem();
			case AssemblyPackage.COMPOSITE_COMPONENT: return createCompositeComponent();
			case AssemblyPackage.CONTEXT_ENVIRONMENT: return createContextEnvironment();
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
	public AssemblyContext createAssemblyContext() {
		AssemblyContextImpl assemblyContext = new AssemblyContextImpl();
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyConnector createAssemblyConnector() {
		AssemblyConnectorImpl assemblyConnector = new AssemblyConnectorImpl();
		return assemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredDelegationConnector createRequiredDelegationConnector() {
		RequiredDelegationConnectorImpl requiredDelegationConnector = new RequiredDelegationConnectorImpl();
		return requiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredRole createRequiredRole() {
		RequiredRoleImpl requiredRole = new RequiredRoleImpl();
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedRole createProvidedRole() {
		ProvidedRoleImpl providedRole = new ProvidedRoleImpl();
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedDelegationConnector createProvidedDelegationConnector() {
		ProvidedDelegationConnectorImpl providedDelegationConnector = new ProvidedDelegationConnectorImpl();
		return providedDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public assembly.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeComponent createCompositeComponent() {
		CompositeComponentImpl compositeComponent = new CompositeComponentImpl();
		return compositeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextEnvironment createContextEnvironment() {
		ContextEnvironmentImpl contextEnvironment = new ContextEnvironmentImpl();
		return contextEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyPackage getAssemblyPackage() {
		return (AssemblyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssemblyPackage getPackage() {
		return AssemblyPackage.eINSTANCE;
	}

} //AssemblyFactoryImpl
