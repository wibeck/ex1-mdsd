/**
 */
package environment;

import componentModel.DeploymentViewPoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Deployment View Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.ConcreteDeploymentViewPoint#getAllocationEnvironment <em>Allocation Environment</em>}</li>
 *   <li>{@link environment.ConcreteDeploymentViewPoint#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getConcreteDeploymentViewPoint()
 * @model
 * @generated
 */
public interface ConcreteDeploymentViewPoint extends DeploymentViewPoint {
	/**
	 * Returns the value of the '<em><b>Allocation Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Environment</em>' containment reference.
	 * @see #setAllocationEnvironment(AllocationEnvironment)
	 * @see environment.EnvironmentPackage#getConcreteDeploymentViewPoint_AllocationEnvironment()
	 * @model containment="true"
	 * @generated
	 */
	AllocationEnvironment getAllocationEnvironment();

	/**
	 * Sets the value of the '{@link environment.ConcreteDeploymentViewPoint#getAllocationEnvironment <em>Allocation Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Environment</em>' containment reference.
	 * @see #getAllocationEnvironment()
	 * @generated
	 */
	void setAllocationEnvironment(AllocationEnvironment value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see environment.EnvironmentPackage#getConcreteDeploymentViewPoint_Environment()
	 * @model containment="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link environment.ConcreteDeploymentViewPoint#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

} // ConcreteDeploymentViewPoint
