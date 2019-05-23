/**
 */
package environment;

import assembly.AssemblyContext;

import componentModel.AllocationViewType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.AllocationContext#getAssemblyContext <em>Assembly Context</em>}</li>
 *   <li>{@link environment.AllocationContext#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getAllocationContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyTopLevelComponentsAllowedToBeAllocated'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot onlyTopLevelComponentsAllowedToBeAllocated='self.assemblyContext.ownerComponent = null'"
 * @generated
 */
public interface AllocationContext extends AllocationViewType {
	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' reference.
	 * @see #setAssemblyContext(AssemblyContext)
	 * @see environment.EnvironmentPackage#getAllocationContext_AssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getAssemblyContext();

	/**
	 * Sets the value of the '{@link environment.AllocationContext#getAssemblyContext <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context</em>' reference.
	 * @see #getAssemblyContext()
	 * @generated
	 */
	void setAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link environment.Container#getAllocationContexts <em>Allocation Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Container)
	 * @see environment.EnvironmentPackage#getAllocationContext_Container()
	 * @see environment.Container#getAllocationContexts
	 * @model opposite="allocationContexts" transient="false"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link environment.AllocationContext#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

} // AllocationContext
