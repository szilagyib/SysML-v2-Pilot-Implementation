/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Subaction Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StateSubactionMembership is a FeatureMembership for an entry, do or exit Action in a StateUsage. The memberFeature must be an ActionUsage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.StateSubactionMembership#getKind <em>Kind</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateSubactionMembership#getAction_comp <em>Action comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateSubactionMembership#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateSubactionMembership()
 * @model
 * @generated
 */
public interface StateSubactionMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.StateSubactionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this is an entry, do or exit Action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.StateSubactionKind
	 * @see #setKind(StateSubactionKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateSubactionMembership_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StateSubactionKind getKind();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateSubactionMembership#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.StateSubactionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(StateSubactionKind value);

	/**
	 * Returns the value of the '<em><b>Action comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature_comp() <em>Owned Member Feature comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ActionUsage that is the memberFeature of this StateSubactionMembership.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action comp</em>' containment reference.
	 * @see #setAction_comp(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateSubactionMembership_Action_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='stateSubactionMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	ActionUsage getAction_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateSubactionMembership#getAction_comp <em>Action comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action comp</em>' containment reference.
	 * @see #getAction_comp()
	 * @generated
	 */
	void setAction_comp(ActionUsage value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateSubactionMembership_Action()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	ActionUsage getAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateSubactionMembership#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionUsage value);

} // StateSubactionMembership
