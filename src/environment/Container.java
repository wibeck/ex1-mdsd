/**
 */
package environment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.Container#getName <em>Name</em>}</li>
 *   <li>{@link environment.Container#getAllocationContexts <em>Allocation Contexts</em>}</li>
 *   <li>{@link environment.Container#getOutwardLinks <em>Outward Links</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getContainer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='containerPartOfOutwardLinks allocationOnSameContainerOrContainersLinked'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot containerPartOfOutwardLinks='\n\t\tself.outwardLinks -&gt;collect(container) -&gt; includes(self)' allocationOnSameContainerOrContainersLinked='\n\t\tlet ProvidedAssemblyContexts =\n\t\tself.allocationContexts -&gt; collect(assemblyContext) -&gt; collect(outwardAssemblyConnectors) -&gt; collect(providedRole),\n\t\tRequiredAssemblyContexts =\n\t\tself.allocationContexts -&gt; collect(assemblyContext) -&gt; collect(outwardAssemblyConnectors) -&gt; collect(requiredRole)\n\t\tin self.allocationContexts -&gt; collect(assemblyContext) -&gt; includesAll(ProvidedAssemblyContexts -&gt; union(RequiredAssemblyContexts))\n\t\txor self.outwardLinks -&gt;exists(link | link.container -&gt;collect(allocationContexts) -&gt; collect(assemblyContext) \n\t\t-&gt; includesAll(ProvidedAssemblyContexts -&gt; union(RequiredAssemblyContexts)))'"
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see environment.EnvironmentPackage#getContainer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link environment.Container#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Allocation Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link environment.AllocationContext}.
	 * It is bidirectional and its opposite is '{@link environment.AllocationContext#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Contexts</em>' containment reference list.
	 * @see environment.EnvironmentPackage#getContainer_AllocationContexts()
	 * @see environment.AllocationContext#getContainer
	 * @model opposite="container" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts();

	/**
	 * Returns the value of the '<em><b>Outward Links</b></em>' reference list.
	 * The list contents are of type {@link environment.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outward Links</em>' reference list.
	 * @see environment.EnvironmentPackage#getContainer_OutwardLinks()
	 * @model keys="name" ordered="false"
	 * @generated
	 */
	EList<Link> getOutwardLinks();

} // Container
