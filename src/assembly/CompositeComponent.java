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
 *   <li>{@link assembly.CompositeComponent#getEncapsulatedAssemblyContexts <em>Encapsulated Assembly Contexts</em>}</li>
 * </ul>
 *
 * @see assembly.AssemblyPackage#getCompositeComponent()
 * @model
 * @generated
 */
public interface CompositeComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Encapsulated Assembly Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link assembly.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated Assembly Contexts</em>' containment reference list.
	 * @see assembly.AssemblyPackage#getCompositeComponent_EncapsulatedAssemblyContexts()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<AssemblyContext> getEncapsulatedAssemblyContexts();

} // CompositeComponent
