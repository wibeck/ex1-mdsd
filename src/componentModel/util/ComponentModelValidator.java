/**
 */
package componentModel.util;

import componentModel.Action;
import componentModel.AllocationViewType;
import componentModel.AssemblyViewPoint;
import componentModel.AssemblyViewType;
import componentModel.Branch;
import componentModel.Char;
import componentModel.ComplexType;
import componentModel.Component;
import componentModel.ComponentModelPackage;
import componentModel.DataType;
import componentModel.Date;
import componentModel.DeploymentViewPoint;
import componentModel.EnvironmentViewType;
import componentModel.ExternalCall;
import componentModel.Int;
import componentModel.Interface;
import componentModel.InterfaceServiceMapEntry;
import componentModel.InternalAction;
import componentModel.List;
import componentModel.Loop;
import componentModel.Parameter;
import componentModel.ParameterType;
import componentModel.Repository;
import componentModel.RepositoryViewType;
import componentModel.Service;
import componentModel.ServiceEffectSpecification;
import componentModel.Signature;
import componentModel.SimpleType;
import componentModel.SystemIndependentViewPoint;
import componentModel.ViewPoint;
import componentModel.ViewType;

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
 * @see componentModel.ComponentModelPackage
 * @generated
 */
public class ComponentModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ComponentModelValidator INSTANCE = new ComponentModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "componentModel";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ComponentModelPackage.eINSTANCE;
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
			case ComponentModelPackage.SYSTEM_INDEPENDENT_VIEW_POINT:
				return validateSystemIndependentViewPoint((SystemIndependentViewPoint)value, diagnostics, context);
			case ComponentModelPackage.REPOSITORY:
				return validateRepository((Repository)value, diagnostics, context);
			case ComponentModelPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case ComponentModelPackage.INTERFACE_SERVICE_MAP_ENTRY:
				return validateInterfaceServiceMapEntry((InterfaceServiceMapEntry)value, diagnostics, context);
			case ComponentModelPackage.SERVICE_EFFECT_SPECIFICATION:
				return validateServiceEffectSpecification((ServiceEffectSpecification)value, diagnostics, context);
			case ComponentModelPackage.BRANCH:
				return validateBranch((Branch)value, diagnostics, context);
			case ComponentModelPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case ComponentModelPackage.LOOP:
				return validateLoop((Loop)value, diagnostics, context);
			case ComponentModelPackage.EXTERNAL_CALL:
				return validateExternalCall((ExternalCall)value, diagnostics, context);
			case ComponentModelPackage.INTERNAL_ACTION:
				return validateInternalAction((InternalAction)value, diagnostics, context);
			case ComponentModelPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case ComponentModelPackage.VIEW_TYPE:
				return validateViewType((ViewType)value, diagnostics, context);
			case ComponentModelPackage.SIGNATURE:
				return validateSignature((Signature)value, diagnostics, context);
			case ComponentModelPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case ComponentModelPackage.VIEW_POINT:
				return validateViewPoint((ViewPoint)value, diagnostics, context);
			case ComponentModelPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case ComponentModelPackage.ASSEMBLY_VIEW_TYPE:
				return validateAssemblyViewType((AssemblyViewType)value, diagnostics, context);
			case ComponentModelPackage.ENVIRONMENT_VIEW_TYPE:
				return validateEnvironmentViewType((EnvironmentViewType)value, diagnostics, context);
			case ComponentModelPackage.ALLOCATION_VIEW_TYPE:
				return validateAllocationViewType((AllocationViewType)value, diagnostics, context);
			case ComponentModelPackage.ASSEMBLY_VIEW_POINT:
				return validateAssemblyViewPoint((AssemblyViewPoint)value, diagnostics, context);
			case ComponentModelPackage.DEPLOYMENT_VIEW_POINT:
				return validateDeploymentViewPoint((DeploymentViewPoint)value, diagnostics, context);
			case ComponentModelPackage.REPOSITORY_VIEW_TYPE:
				return validateRepositoryViewType((RepositoryViewType)value, diagnostics, context);
			case ComponentModelPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case ComponentModelPackage.VOID:
				return validateVoid((componentModel.Void)value, diagnostics, context);
			case ComponentModelPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case ComponentModelPackage.COMPLEX_TYPE:
				return validateComplexType((ComplexType)value, diagnostics, context);
			case ComponentModelPackage.SIMPLE_TYPE:
				return validateSimpleType((SimpleType)value, diagnostics, context);
			case ComponentModelPackage.BOOLEAN:
				return validateBoolean((componentModel.Boolean)value, diagnostics, context);
			case ComponentModelPackage.INT:
				return validateInt((Int)value, diagnostics, context);
			case ComponentModelPackage.CHAR:
				return validateChar((Char)value, diagnostics, context);
			case ComponentModelPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case ComponentModelPackage.LIST:
				return validateList((List)value, diagnostics, context);
			case ComponentModelPackage.MAP:
				return validateMap((componentModel.Map)value, diagnostics, context);
			case ComponentModelPackage.FLOAT:
				return validateFloat((componentModel.Float)value, diagnostics, context);
			case ComponentModelPackage.LONG:
				return validateLong((componentModel.Long)value, diagnostics, context);
			case ComponentModelPackage.DOUBLE:
				return validateDouble((componentModel.Double)value, diagnostics, context);
			case ComponentModelPackage.STRING:
				return validateString((componentModel.String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemIndependentViewPoint(SystemIndependentViewPoint systemIndependentViewPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemIndependentViewPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemIndependentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemIndependentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemIndependentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemIndependentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemIndependentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemIndependentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemIndependentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemIndependentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemIndependentViewPoint_SysIndependentVPOnlyHasRepositoryVT(systemIndependentViewPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SysIndependentVPOnlyHasRepositoryVT constraint of '<em>System Independent View Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM_INDEPENDENT_VIEW_POINT__SYS_INDEPENDENT_VP_ONLY_HAS_REPOSITORY_VT__EEXPRESSION = "self.viewTypes -> forAll(vt | vt.oclIsKindOf(componentModel::RepositoryViewType) )";

	/**
	 * Validates the SysIndependentVPOnlyHasRepositoryVT constraint of '<em>System Independent View Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemIndependentViewPoint_SysIndependentVPOnlyHasRepositoryVT(SystemIndependentViewPoint systemIndependentViewPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentModelPackage.Literals.SYSTEM_INDEPENDENT_VIEW_POINT,
				 systemIndependentViewPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SysIndependentVPOnlyHasRepositoryVT",
				 SYSTEM_INDEPENDENT_VIEW_POINT__SYS_INDEPENDENT_VP_ONLY_HAS_REPOSITORY_VT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_servicesForEachSignatureOfProvidedInterfaces(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_requiredInterfacesResultFromServices(component, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the servicesForEachSignatureOfProvidedInterfaces constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT__SERVICES_FOR_EACH_SIGNATURE_OF_PROVIDED_INTERFACES__EEXPRESSION = "self.interfaceServiceMap -> forAll(entry | entry.services -> \n" +
		"\t\t\tcollect(correspondence) -> intersection(entry.providedInterface.signatures) -> size() \n" +
		"\t\t\t=  entry.providedInterface.signatures -> size())";

	/**
	 * Validates the servicesForEachSignatureOfProvidedInterfaces constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_servicesForEachSignatureOfProvidedInterfaces(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentModelPackage.Literals.COMPONENT,
				 component,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "servicesForEachSignatureOfProvidedInterfaces",
				 COMPONENT__SERVICES_FOR_EACH_SIGNATURE_OF_PROVIDED_INTERFACES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the requiredInterfacesResultFromServices constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT__REQUIRED_INTERFACES_RESULT_FROM_SERVICES__EEXPRESSION = "self. requiredInterfaces -> includesAll(self.interfaceServiceMap -> \n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\tcollect(services) -> collect(requiredInterfaces) -> asSet()) ";

	/**
	 * Validates the requiredInterfacesResultFromServices constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_requiredInterfacesResultFromServices(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentModelPackage.Literals.COMPONENT,
				 component,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "requiredInterfacesResultFromServices",
				 COMPONENT__REQUIRED_INTERFACES_RESULT_FROM_SERVICES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceServiceMapEntry(InterfaceServiceMapEntry interfaceServiceMapEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfaceServiceMapEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEffectSpecification(ServiceEffectSpecification serviceEffectSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceEffectSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalCall(ExternalCall externalCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalAction(InternalAction internalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internalAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interface_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewType(ViewType viewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignature(Signature signature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewPoint(ViewPoint viewPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyViewType(AssemblyViewType assemblyViewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assemblyViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentViewType(EnvironmentViewType environmentViewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environmentViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationViewType(AllocationViewType allocationViewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allocationViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyViewPoint(AssemblyViewPoint assemblyViewPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyViewPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyViewPoint_assemlbyVPonlyHasAssemblyVT(assemblyViewPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the assemlbyVPonlyHasAssemblyVT constraint of '<em>Assembly View Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_VIEW_POINT__ASSEMLBY_VPONLY_HAS_ASSEMBLY_VT__EEXPRESSION = "self.viewTypes -> forAll(vt | vt.oclIsKindOf(componentModel::AssemblyViewType))";

	/**
	 * Validates the assemlbyVPonlyHasAssemblyVT constraint of '<em>Assembly View Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyViewPoint_assemlbyVPonlyHasAssemblyVT(AssemblyViewPoint assemblyViewPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentModelPackage.Literals.ASSEMBLY_VIEW_POINT,
				 assemblyViewPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "assemlbyVPonlyHasAssemblyVT",
				 ASSEMBLY_VIEW_POINT__ASSEMLBY_VPONLY_HAS_ASSEMBLY_VT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentViewPoint(DeploymentViewPoint deploymentViewPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deploymentViewPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deploymentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deploymentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deploymentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deploymentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deploymentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deploymentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deploymentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deploymentViewPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeploymentViewPoint_DeploymentVPonlyHasDeploymentVT(deploymentViewPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DeploymentVPonlyHasDeploymentVT constraint of '<em>Deployment View Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEPLOYMENT_VIEW_POINT__DEPLOYMENT_VPONLY_HAS_DEPLOYMENT_VT__EEXPRESSION = "self.viewTypes -> forAll(vt | vt.oclIsKindOf(componentModel::EnvironmentViewType) \n" +
		"\t\t\tor vt.oclIsKindOf(componentModel::AllocationViewType))";

	/**
	 * Validates the DeploymentVPonlyHasDeploymentVT constraint of '<em>Deployment View Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentViewPoint_DeploymentVPonlyHasDeploymentVT(DeploymentViewPoint deploymentViewPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentModelPackage.Literals.DEPLOYMENT_VIEW_POINT,
				 deploymentViewPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DeploymentVPonlyHasDeploymentVT",
				 DEPLOYMENT_VIEW_POINT__DEPLOYMENT_VPONLY_HAS_DEPLOYMENT_VT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositoryViewType(RepositoryViewType repositoryViewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repositoryViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoid(componentModel.Void void_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(void_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexType(ComplexType complexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleType(SimpleType simpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(componentModel.Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInt(Int int_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(int_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChar(Char char_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(char_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(date, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(list, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMap(componentModel.Map map, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(map, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat(componentModel.Float float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong(componentModel.Long long_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble(componentModel.Double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(componentModel.String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string, diagnostics, context);
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

} //ComponentModelValidator
