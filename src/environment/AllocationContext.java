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
 *   <li>{@link environment.AllocationContext#getAssemblycontext <em>Assemblycontext</em>}</li>
 *   <li>{@link environment.AllocationContext#getContainer <em>Container</em>}</li>
 *   <li>{@link environment.AllocationContext#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getAllocationContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyTopLevelComponentsAllowedToBeAllocated'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot onlyTopLevelComponentsAllowedToBeAllocated='self.assemblycontext.ownerComponent = null'"
 * @generated
 */
public interface AllocationContext extends AllocationViewType {
	/**
	 * Returns the value of the '<em><b>Assemblycontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblycontext</em>' reference.
	 * @see #setAssemblycontext(AssemblyContext)
	 * @see environment.EnvironmentPackage#getAllocationContext_Assemblycontext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getAssemblycontext();

	/**
	 * Sets the value of the '{@link environment.AllocationContext#getAssemblycontext <em>Assemblycontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assemblycontext</em>' reference.
	 * @see #getAssemblycontext()
	 * @generated
	 */
	void setAssemblycontext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link environment.Container#getAllocationcontext <em>Allocationcontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Container)
	 * @see environment.EnvironmentPackage#getAllocationContext_Container()
	 * @see environment.Container#getAllocationcontext
	 * @model opposite="allocationcontext" transient="false"
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

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see environment.EnvironmentPackage#getAllocationContext_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link environment.AllocationContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AllocationContext
