/**
 */
package componentModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment View Point</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see componentModel.ComponentModelPackage#getDeploymentViewPoint()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DeploymentVPonlyHasDeploymentVT'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DeploymentVPonlyHasDeploymentVT='self.viewTypes -&gt; forAll(vt | vt.oclIsKindOf(componentModel::EnvironmentViewType) \n\t\t\tor vt.oclIsKindOf(componentModel::AllocationViewType))'"
 * @generated
 */
public interface DeploymentViewPoint extends ViewPoint {
} // DeploymentViewPoint
