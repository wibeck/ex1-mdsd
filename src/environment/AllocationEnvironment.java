/**
 */
package environment;

import componentModel.AllocationViewType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.AllocationEnvironment#getAllocationContexts <em>Allocation Contexts</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getAllocationEnvironment()
 * @model
 * @generated
 */
public interface AllocationEnvironment extends AllocationViewType {
	/**
	 * Returns the value of the '<em><b>Allocation Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link environment.AllocationContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Contexts</em>' containment reference list.
	 * @see environment.EnvironmentPackage#getAllocationEnvironment_AllocationContexts()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts();

} // AllocationEnvironment
