/**
 */
package assembly;

import componentModel.Component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assembly.CompositeComponent#getEncapsulates <em>Encapsulates</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getCompositeComponent()
 * @model
 * @generated
 */
public interface CompositeComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Encapsulates</b></em>' containment reference list.
	 * The list contents are of type {@link assembly.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulates</em>' containment reference list.
	 * @see assembly.AssemblyPackage#getCompositeComponent_Encapsulates()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AssemblyContext> getEncapsulates();

} // CompositeComponent
