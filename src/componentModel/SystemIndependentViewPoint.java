/**
 */
package componentModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Independent View Point</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see componentModel.ComponentModelPackage#getSystemIndependentViewPoint()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SysIndependentVPOnlyHasRepositoryVT'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SysIndependentVPOnlyHasRepositoryVT='self.viewTypes -&gt; forAll(vt | vt.oclIsKindOf(componentModel::RepositoryViewType) )'"
 * @generated
 */
public interface SystemIndependentViewPoint extends ViewPoint {
} // SystemIndependentViewPoint
