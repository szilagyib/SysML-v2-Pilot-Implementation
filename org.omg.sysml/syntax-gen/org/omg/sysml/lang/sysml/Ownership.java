/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Ownership</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Ownership provides an organizational hint to the model to support the development of tree views of the model and nested serializations.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Ownership#getOwningSource <em>Owning Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Ownership#getOwnedTarget <em>Owned Target</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwnership()
 * @model
 * @generated
 */
public interface Ownership extends Relationship {

	/**
	 * Returns the value of the '<em><b>Owning Source</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Source</em>' reference.
	 * @see #setOwningSource(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwnership_OwningSource()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sourceOwnership'"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 * @generated
	 */
	Element getOwningSource();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Ownership#getOwningSource <em>Owning Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Source</em>' reference.
	 * @see #getOwningSource()
	 * @generated
	 */
	void setOwningSource(Element value);

	/**
	 * Returns the value of the '<em><b>Owned Target</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement() <em>Owned Related Element</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Target</em>' reference.
	 * @see #setOwnedTarget(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwnership_OwnedTarget()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='targetOwnership'"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 * @generated
	 */
	Element getOwnedTarget();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Ownership#getOwnedTarget <em>Owned Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Target</em>' reference.
	 * @see #getOwnedTarget()
	 * @generated
	 */
	void setOwnedTarget(Element value);
} // Ownership
