/**
 */
package componentModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly View Point</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see componentModel.ComponentModelPackage#getAssemblyViewPoint()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='assemlbyVPonlyHasAssemblyVT'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot assemlbyVPonlyHasAssemblyVT='self.viewTypes -&gt; forAll(vt | vt.oclIsKindOf(componentModel::AssemblyViewType))'"
 * @generated
 */
public interface AssemblyViewPoint extends ViewPoint {
} // AssemblyViewPoint
