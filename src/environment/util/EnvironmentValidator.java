/**
 */
package environment.util;

import environment.*;

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
 * @see environment.EnvironmentPackage
 * @generated
 */
public class EnvironmentValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EnvironmentValidator INSTANCE = new EnvironmentValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "environment";

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
	public EnvironmentValidator() {
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
	  return EnvironmentPackage.eINSTANCE;
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
			case EnvironmentPackage.ENVIRONMENT:
				return validateEnvironment((Environment)value, diagnostics, context);
			case EnvironmentPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case EnvironmentPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case EnvironmentPackage.ALLOCATION_CONTEXT:
				return validateAllocationContext((AllocationContext)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironment(Environment environment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(container, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(container, diagnostics, context);
		if (result || diagnostics != null) result &= validateContainer_containerPartOfOutwardLinks(container, diagnostics, context);
		if (result || diagnostics != null) result &= validateContainer_allocationOnSameContainerOrContainersLinked(container, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the containerPartOfOutwardLinks constraint of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTAINER__CONTAINER_PART_OF_OUTWARD_LINKS__EEXPRESSION = "\n" +
		"\t\tself.outwardLinks ->collect(container) -> includes(self)";

	/**
	 * Validates the containerPartOfOutwardLinks constraint of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer_containerPartOfOutwardLinks(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnvironmentPackage.Literals.CONTAINER,
				 container,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "containerPartOfOutwardLinks",
				 CONTAINER__CONTAINER_PART_OF_OUTWARD_LINKS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the allocationOnSameContainerOrContainersLinked constraint of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTAINER__ALLOCATION_ON_SAME_CONTAINER_OR_CONTAINERS_LINKED__EEXPRESSION = "\n" +
		"\t\tlet ProvidedAssemblyContexts =\n" +
		"\t\tself.allocationContexts -> collect(assemblyContext) -> collect(outwardAssemblyConnectors) -> collect(providedRole),\n" +
		"\t\tRequiredAssemblyContexts =\n" +
		"\t\tself.allocationContexts -> collect(assemblyContext) -> collect(outwardAssemblyConnectors) -> collect(requiredRole)\n" +
		"\t\tin self.allocationContexts -> collect(assemblyContext) -> includesAll(ProvidedAssemblyContexts -> union(RequiredAssemblyContexts))\n" +
		"\t\txor self.outwardLinks ->exists(link | link.container ->collect(allocationContexts) -> collect(assemblyContext) \n" +
		"\t\t-> includesAll(ProvidedAssemblyContexts -> union(RequiredAssemblyContexts)))";

	/**
	 * Validates the allocationOnSameContainerOrContainersLinked constraint of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer_allocationOnSameContainerOrContainersLinked(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnvironmentPackage.Literals.CONTAINER,
				 container,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "allocationOnSameContainerOrContainersLinked",
				 CONTAINER__ALLOCATION_ON_SAME_CONTAINER_OR_CONTAINERS_LINKED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationContext(AllocationContext allocationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allocationContext, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocationContext_onlyTopLevelComponentsAllowedToBeAllocated(allocationContext, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the onlyTopLevelComponentsAllowedToBeAllocated constraint of '<em>Allocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALLOCATION_CONTEXT__ONLY_TOP_LEVEL_COMPONENTS_ALLOWED_TO_BE_ALLOCATED__EEXPRESSION = "self.assemblyContext.ownerComponent = null";

	/**
	 * Validates the onlyTopLevelComponentsAllowedToBeAllocated constraint of '<em>Allocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationContext_onlyTopLevelComponentsAllowedToBeAllocated(AllocationContext allocationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnvironmentPackage.Literals.ALLOCATION_CONTEXT,
				 allocationContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyTopLevelComponentsAllowedToBeAllocated",
				 ALLOCATION_CONTEXT__ONLY_TOP_LEVEL_COMPONENTS_ALLOWED_TO_BE_ALLOCATED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //EnvironmentValidator
