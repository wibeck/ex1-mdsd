/**
 */
package environment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see environment.EnvironmentPackage
 * @generated
 */
public interface EnvironmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvironmentFactory eINSTANCE = environment.impl.EnvironmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment</em>'.
	 * @generated
	 */
	Environment createEnvironment();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Allocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Context</em>'.
	 * @generated
	 */
	AllocationContext createAllocationContext();

	/**
	 * Returns a new object of class '<em>Allocation Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Environment</em>'.
	 * @generated
	 */
	AllocationEnvironment createAllocationEnvironment();

	/**
	 * Returns a new object of class '<em>Concrete Deployment View Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Deployment View Point</em>'.
	 * @generated
	 */
	ConcreteDeploymentViewPoint createConcreteDeploymentViewPoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnvironmentPackage getEnvironmentPackage();

} //EnvironmentFactory
