/**
 */
package assembly.util;

import assembly.AssemblyConnector;
import assembly.AssemblyContext;
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

import componentModel.util.ComponentModelValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see assembly.AssemblyPackage
 * @generated
 */
public class AssemblyValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AssemblyValidator INSTANCE = new AssemblyValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "assembly";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentModelValidator componentModelValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyValidator() {
		super();
		componentModelValidator = ComponentModelValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AssemblyPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AssemblyPackage.ASSEMBLY_CONTEXT:
				return validateAssemblyContext((AssemblyContext)value, diagnostics, context);
			case AssemblyPackage.ASSEMBLY_CONNECTOR:
				return validateAssemblyConnector((AssemblyConnector)value, diagnostics, context);
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR:
				return validateRequiredDelegationConnector((RequiredDelegationConnector)value, diagnostics, context);
			case AssemblyPackage.REQUIRED_ROLE:
				return validateRequiredRole((RequiredRole)value, diagnostics, context);
			case AssemblyPackage.PROVIDED_ROLE:
				return validateProvidedRole((ProvidedRole)value, diagnostics, context);
			case AssemblyPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR:
				return validateProvidedDelegationConnector((ProvidedDelegationConnector)value, diagnostics, context);
			case AssemblyPackage.CONTEXT:
				return validateContext((Context)value, diagnostics, context);
			case AssemblyPackage.DELEGATION_CONNECTOR:
				return validateDelegationConnector((DelegationConnector)value, diagnostics, context);
			case AssemblyPackage.SYSTEM:
				return validateSystem((assembly.System)value, diagnostics, context);
			case AssemblyPackage.COMPOSITE_COMPONENT:
				return validateCompositeComponent((CompositeComponent)value, diagnostics, context);
			case AssemblyPackage.CONTEXT_ENVIRONMENT:
				return validateContextEnvironment((ContextEnvironment)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext(AssemblyContext assemblyContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyContext, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateContext_contextIsPartOfOutwardAssemblyConnectors(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyContext_reqInterfacesFromRequiredRoles(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyContext_providedInterfacesFromProvidedRoles(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyContext_onlyDelegationConnectorsIfComposite(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyContext_providedRoleForProvidedInterfaceExistsAndIsConnected(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyContext_requiredRoleForRequiredInterfaceExistsAndIsConnected(assemblyContext, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the reqInterfacesFromRequiredRoles constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONTEXT__REQ_INTERFACES_FROM_REQUIRED_ROLES__EEXPRESSION = "self.requiredInterfaces = self.requiredRoles -> collect(interFace)";

	/**
	 * Validates the reqInterfacesFromRequiredRoles constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext_reqInterfacesFromRequiredRoles(AssemblyContext assemblyContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONTEXT,
				 assemblyContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "reqInterfacesFromRequiredRoles",
				 ASSEMBLY_CONTEXT__REQ_INTERFACES_FROM_REQUIRED_ROLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the providedInterfacesFromProvidedRoles constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONTEXT__PROVIDED_INTERFACES_FROM_PROVIDED_ROLES__EEXPRESSION = "self.providedInterfaces = self.providedRoles -> collect(interFace)";

	/**
	 * Validates the providedInterfacesFromProvidedRoles constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext_providedInterfacesFromProvidedRoles(AssemblyContext assemblyContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONTEXT,
				 assemblyContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "providedInterfacesFromProvidedRoles",
				 ASSEMBLY_CONTEXT__PROVIDED_INTERFACES_FROM_PROVIDED_ROLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlyDelegationConnectorsIfComposite constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONTEXT__ONLY_DELEGATION_CONNECTORS_IF_COMPOSITE__EEXPRESSION = "if self.instantiates.oclIsKindOf(CompositeComponent) \n" +
		"\t\tthen self.delegationConnectors -> size() > 0 else self.delegationConnectors -> size() = 0 endif";

	/**
	 * Validates the onlyDelegationConnectorsIfComposite constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext_onlyDelegationConnectorsIfComposite(AssemblyContext assemblyContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONTEXT,
				 assemblyContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyDelegationConnectorsIfComposite",
				 ASSEMBLY_CONTEXT__ONLY_DELEGATION_CONNECTORS_IF_COMPOSITE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the providedRoleForProvidedInterfaceExistsAndIsConnected constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONTEXT__PROVIDED_ROLE_FOR_PROVIDED_INTERFACE_EXISTS_AND_IS_CONNECTED__EEXPRESSION = "\n" +
		"\t\t\tif self.instantiates.oclIsKindOf(CompositeComponent) then \n" +
		"\t\t\tself.providedInterfaces -> forAll(interFace | self.instantiates.oclAsType(CompositeComponent).encapsulatedAssemblyContexts \n" +
		"\t\t\t\t-> collect(providedRoles) -> exists(role | role.interFace = interFace and self.delegationConnectors -> exists(connector | \n" +
		"\t\t\t\t\tconnector.role = role and connector.interFace = interFace and connector.oclIsKindOf(assembly::ProvidedDelegationConnector)\n" +
		"\t\t\t\t))) else true endif";

	/**
	 * Validates the providedRoleForProvidedInterfaceExistsAndIsConnected constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext_providedRoleForProvidedInterfaceExistsAndIsConnected(AssemblyContext assemblyContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONTEXT,
				 assemblyContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "providedRoleForProvidedInterfaceExistsAndIsConnected",
				 ASSEMBLY_CONTEXT__PROVIDED_ROLE_FOR_PROVIDED_INTERFACE_EXISTS_AND_IS_CONNECTED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the requiredRoleForRequiredInterfaceExistsAndIsConnected constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONTEXT__REQUIRED_ROLE_FOR_REQUIRED_INTERFACE_EXISTS_AND_IS_CONNECTED__EEXPRESSION = "if self.instantiates.oclIsKindOf(CompositeComponent) then \n" +
		"\t\tself.requiredInterfaces -> forAll(interFace | self.instantiates.oclAsType(CompositeComponent).encapsulatedAssemblyContexts \n" +
		"\t\t\t\t-> collect(requiredRoles) -> exists(role | role.interFace = interFace and self.delegationConnectors -> exists(connector | \n" +
		"\t\t\t\t\tconnector.role = role and connector.interFace = interFace and connector.oclIsKindOf(assembly::RequiredDelegationConnector)\n" +
		"\t\t\t\t))) else true endif";

	/**
	 * Validates the requiredRoleForRequiredInterfaceExistsAndIsConnected constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext_requiredRoleForRequiredInterfaceExistsAndIsConnected(AssemblyContext assemblyContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONTEXT,
				 assemblyContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "requiredRoleForRequiredInterfaceExistsAndIsConnected",
				 ASSEMBLY_CONTEXT__REQUIRED_ROLE_FOR_REQUIRED_INTERFACE_EXISTS_AND_IS_CONNECTED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_assemblyContextsNotEqual(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_providedRoleHasRequiredInterface(assemblyConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the assemblyContextsNotEqual constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__ASSEMBLY_CONTEXTS_NOT_EQUAL__EEXPRESSION = "(not (self.providedRole.assemblyContext = self.requiredRole.assemblyContext)) = true";

	/**
	 * Validates the assemblyContextsNotEqual constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_assemblyContextsNotEqual(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "assemblyContextsNotEqual",
				 ASSEMBLY_CONNECTOR__ASSEMBLY_CONTEXTS_NOT_EQUAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the providedRoleHasRequiredInterface constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__PROVIDED_ROLE_HAS_REQUIRED_INTERFACE__EEXPRESSION = "self.providedRole.interFace = self.requiredRole.interFace";

	/**
	 * Validates the providedRoleHasRequiredInterface constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_providedRoleHasRequiredInterface(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "providedRoleHasRequiredInterface",
				 ASSEMBLY_CONNECTOR__PROVIDED_ROLE_HAS_REQUIRED_INTERFACE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredDelegationConnector(RequiredDelegationConnector requiredDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredDelegationConnector_roleCanOnlyBeRequired(requiredDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the roleCanOnlyBeRequired constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIRED_DELEGATION_CONNECTOR__ROLE_CAN_ONLY_BE_REQUIRED__EEXPRESSION = "self.role.oclIsKindOf(RequiredRole)";

	/**
	 * Validates the roleCanOnlyBeRequired constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredDelegationConnector_roleCanOnlyBeRequired(RequiredDelegationConnector requiredDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.REQUIRED_DELEGATION_CONNECTOR,
				 requiredDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "roleCanOnlyBeRequired",
				 REQUIRED_DELEGATION_CONNECTOR__ROLE_CAN_ONLY_BE_REQUIRED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredRole(RequiredRole requiredRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredRole_requiredInterfaceFromServiceThatRequiresIt(requiredRole, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the requiredInterfaceFromServiceThatRequiresIt constraint of '<em>Required Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIRED_ROLE__REQUIRED_INTERFACE_FROM_SERVICE_THAT_REQUIRES_IT__EEXPRESSION = "self.assemblyContext.instantiates.interfaceServiceMap ->exists(entry | entry.services -> select(service| service.requiredInterfaces \n" +
		"\t\t-> includes(self.interFace)))  -> notEmpty() and not (self.assemblyContext.instantiates = null)";

	/**
	 * Validates the requiredInterfaceFromServiceThatRequiresIt constraint of '<em>Required Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredRole_requiredInterfaceFromServiceThatRequiresIt(RequiredRole requiredRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.REQUIRED_ROLE,
				 requiredRole,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "requiredInterfaceFromServiceThatRequiresIt",
				 REQUIRED_ROLE__REQUIRED_INTERFACE_FROM_SERVICE_THAT_REQUIRES_IT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedRole(ProvidedRole providedRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providedRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validateProvidedRole_providededInterfaceFromISMap(providedRole, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the providededInterfaceFromISMap constraint of '<em>Provided Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROVIDED_ROLE__PROVIDEDED_INTERFACE_FROM_IS_MAP__EEXPRESSION = "self.assemblyContext.instantiates.interfaceServiceMap ->exists(entry | entry.providedInterface = self.interFace)";

	/**
	 * Validates the providededInterfaceFromISMap constraint of '<em>Provided Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedRole_providededInterfaceFromISMap(ProvidedRole providedRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.PROVIDED_ROLE,
				 providedRole,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "providededInterfaceFromISMap",
				 PROVIDED_ROLE__PROVIDEDED_INTERFACE_FROM_IS_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedDelegationConnector(ProvidedDelegationConnector providedDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providedDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateProvidedDelegationConnector_roleCanOnlyBeProvided(providedDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the roleCanOnlyBeProvided constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROVIDED_DELEGATION_CONNECTOR__ROLE_CAN_ONLY_BE_PROVIDED__EEXPRESSION = "self.role.oclIsKindOf(ProvidedRole)";

	/**
	 * Validates the roleCanOnlyBeProvided constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedDelegationConnector_roleCanOnlyBeProvided(ProvidedDelegationConnector providedDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.PROVIDED_DELEGATION_CONNECTOR,
				 providedDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "roleCanOnlyBeProvided",
				 PROVIDED_DELEGATION_CONNECTOR__ROLE_CAN_ONLY_BE_PROVIDED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContext(Context context, DiagnosticChain diagnostics, Map<Object, Object> theContext) {
		if (!validate_NoCircularContainment(context, diagnostics, theContext)) return false;
		boolean result = validate_EveryMultiplicityConforms(context, diagnostics, theContext);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(context, diagnostics, theContext);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(context, diagnostics, theContext);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(context, diagnostics, theContext);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(context, diagnostics, theContext);
		if (result || diagnostics != null) result &= validate_UniqueID(context, diagnostics, theContext);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(context, diagnostics, theContext);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(context, diagnostics, theContext);
		if (result || diagnostics != null) result &= validateContext_contextIsPartOfOutwardAssemblyConnectors(context, diagnostics, theContext);
		return result;
	}

	/**
	 * The cached validation expression for the contextIsPartOfOutwardAssemblyConnectors constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTEXT__CONTEXT_IS_PART_OF_OUTWARD_ASSEMBLY_CONNECTORS__EEXPRESSION = "\n" +
		"\t\tself.outwardAssemblyConnectors -> forAll(aCon | aCon.providedRole.assemblyContext = self xor aCon.requiredRole.assemblyContext = self )";

	/**
	 * Validates the contextIsPartOfOutwardAssemblyConnectors constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContext_contextIsPartOfOutwardAssemblyConnectors(Context context, DiagnosticChain diagnostics, Map<Object, Object> theContext) {
		return
			validate
				(AssemblyPackage.Literals.CONTEXT,
				 context,
				 diagnostics,
				 theContext,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "contextIsPartOfOutwardAssemblyConnectors",
				 CONTEXT__CONTEXT_IS_PART_OF_OUTWARD_ASSEMBLY_CONNECTORS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delegationConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(assembly.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(system, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateContext_contextIsPartOfOutwardAssemblyConnectors(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_providedRoleForProvidedInterfaceExistsAndIsConnected(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_requiredRoleForRequiredInterfaceExistsAndIsConnected(system, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the providedRoleForProvidedInterfaceExistsAndIsConnected constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__PROVIDED_ROLE_FOR_PROVIDED_INTERFACE_EXISTS_AND_IS_CONNECTED__EEXPRESSION = "\n" +
		"\t\tself.providedInterfaces -> forAll(interFace | self.encapsulatedAssemblyContexts -> collect(providedRoles) \n" +
		"\t\t\t-> exists(role | role.interFace = interFace and self.delegationConnectors -> exists(connector | connector.role = role \n" +
		"\t\t\t\tand connector.interFace = interFace and connector.oclIsKindOf(assembly::ProvidedDelegationConnector)) ))";

	/**
	 * Validates the providedRoleForProvidedInterfaceExistsAndIsConnected constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_providedRoleForProvidedInterfaceExistsAndIsConnected(assembly.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.SYSTEM,
				 system,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "providedRoleForProvidedInterfaceExistsAndIsConnected",
				 SYSTEM__PROVIDED_ROLE_FOR_PROVIDED_INTERFACE_EXISTS_AND_IS_CONNECTED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the requiredRoleForRequiredInterfaceExistsAndIsConnected constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__REQUIRED_ROLE_FOR_REQUIRED_INTERFACE_EXISTS_AND_IS_CONNECTED__EEXPRESSION = "\n" +
		"\t\tself.requiredInterfaces -> forAll(interFace | self.encapsulatedAssemblyContexts -> collect(requiredRoles) \n" +
		"\t\t\t-> exists(role | role.interFace = interFace and self.delegationConnectors -> exists(connector | connector.role = role \n" +
		"\t\t\t\tand connector.interFace = interFace and connector.oclIsKindOf(assembly::RequiredDelegationConnector)) ))";

	/**
	 * Validates the requiredRoleForRequiredInterfaceExistsAndIsConnected constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_requiredRoleForRequiredInterfaceExistsAndIsConnected(assembly.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.SYSTEM,
				 system,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "requiredRoleForRequiredInterfaceExistsAndIsConnected",
				 SYSTEM__REQUIRED_ROLE_FOR_REQUIRED_INTERFACE_EXISTS_AND_IS_CONNECTED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent(CompositeComponent compositeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentModelValidator.validateComponent_servicesForEachSignatureOfProvidedInterfaces(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= componentModelValidator.validateComponent_requiredInterfacesResultFromServices(compositeComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextEnvironment(ContextEnvironment contextEnvironment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextEnvironment, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AssemblyValidator
