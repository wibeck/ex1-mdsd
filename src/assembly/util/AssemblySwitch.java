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

import componentModel.AssemblyViewType;
import componentModel.Component;
import componentModel.ViewType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see assembly.AssemblyPackage
 * @generated
 */
public class AssemblySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssemblyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblySwitch() {
		if (modelPackage == null) {
			modelPackage = AssemblyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AssemblyPackage.ASSEMBLY_CONTEXT: {
				AssemblyContext assemblyContext = (AssemblyContext)theEObject;
				T result = caseAssemblyContext(assemblyContext);
				if (result == null) result = caseContext(assemblyContext);
				if (result == null) result = caseAssemblyViewType(assemblyContext);
				if (result == null) result = caseViewType(assemblyContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyPackage.ASSEMBLY_CONNECTOR: {
				AssemblyConnector assemblyConnector = (AssemblyConnector)theEObject;
				T result = caseAssemblyConnector(assemblyConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyPackage.REQUIRED_DELEGATION_CONNECTOR: {
				RequiredDelegationConnector requiredDelegationConnector = (RequiredDelegationConnector)theEObject;
				T result = caseRequiredDelegationConnector(requiredDelegationConnector);
				if (result == null) result = caseDelegationConnector(requiredDelegationConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyPackage.REQUIRED_ROLE: {
				RequiredRole requiredRole = (RequiredRole)theEObject;
				T result = caseRequiredRole(requiredRole);
				if (result == null) result = caseRole(requiredRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyPackage.PROVIDED_ROLE: {
				ProvidedRole providedRole = (ProvidedRole)theEObject;
				T result = caseProvidedRole(providedRole);
				if (result == null) result = caseRole(providedRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyPackage.PROVIDED_DELEGATION_CONNECTOR: {
				ProvidedDelegationConnector providedDelegationConnector = (ProvidedDelegationConnector)theEObject;
				T result = caseProvidedDelegationConnector(providedDelegationConnector);
				if (result == null) result = caseDelegationConnector(providedDelegationConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyPackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyPackage.DELEGATION_CONNECTOR: {
				DelegationConnector delegationConnector = (DelegationConnector)theEObject;
				T result = caseDelegationConnector(delegationConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyPackage.SYSTEM: {
				assembly.System system = (assembly.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseContext(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyPackage.COMPOSITE_COMPONENT: {
				CompositeComponent compositeComponent = (CompositeComponent)theEObject;
				T result = caseCompositeComponent(compositeComponent);
				if (result == null) result = caseComponent(compositeComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyPackage.CONTEXT_ENVIRONMENT: {
				ContextEnvironment contextEnvironment = (ContextEnvironment)theEObject;
				T result = caseContextEnvironment(contextEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyContext(AssemblyContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyConnector(AssemblyConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredDelegationConnector(RequiredDelegationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredRole(RequiredRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedRole(ProvidedRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedDelegationConnector(ProvidedDelegationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationConnector(DelegationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(assembly.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeComponent(CompositeComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextEnvironment(ContextEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewType(ViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyViewType(AssemblyViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AssemblySwitch
