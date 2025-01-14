/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Rendering Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ViewRenderingMembership is a FeatureMembership that identifies the <code>viewRendering</code> of a View. The <code>ownedMemberFeature</code> of a RequirementConstraintMembership must be a RenderingUsage.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewRenderingMembership#getOwnedRendering <em>Owned Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewRenderingMembership#getReferencedRendering <em>Referenced Rendering</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewRenderingMembership()
 * @model
 * @generated
 */
public interface ViewRenderingMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Owned Rendering</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature() <em>Owned Member Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Rendering</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Rendering</em>' reference.
	 * @see #setOwnedRendering(RenderingUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewRenderingMembership_OwnedRendering()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewRenderingMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	RenderingUsage getOwnedRendering();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewRenderingMembership#getOwnedRendering <em>Owned Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Rendering</em>' reference.
	 * @see #getOwnedRendering()
	 * @generated
	 */
	void setOwnedRendering(RenderingUsage value);

	/**
	 * Returns the value of the '<em><b>Referenced Rendering</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p> The RenderingUsage that is referenced through this ViewRenderingMembership. This is derived as being the first RenderingUsage subset by the <code>ownedRendering</code>, if there is one, and, otherwise, the <code>ownedRendering</code> itself.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Rendering</em>' reference.
	 * @see #setReferencedRendering(RenderingUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewRenderingMembership_ReferencedRendering()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referencingRenderingMembership'"
	 * @generated
	 */
	RenderingUsage getReferencedRendering();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewRenderingMembership#getReferencedRendering <em>Referenced Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Rendering</em>' reference.
	 * @see #getReferencedRendering()
	 * @generated
	 */
	void setReferencedRendering(RenderingUsage value);

} // ViewRenderingMembership
