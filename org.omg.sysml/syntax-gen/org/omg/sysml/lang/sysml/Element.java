/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwningPackage <em>Owning Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwnedElement()
	 * @see org.omg.sysml.lang.sysml.Element#getOwner
	 * @model opposite="owner" containment="true" ordered="false"
	 * @generated
	 */
	EList<Element> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Owner()
	 * @see org.omg.sysml.lang.sysml.Element#getOwnedElement
	 * @model opposite="ownedElement" transient="false" ordered="false"
	 * @generated
	 */
	Element getOwner();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Element value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Identifier()
	 * @model ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Owning Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Package#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Package</em>' reference.
	 * @see #setOwningPackage(org.omg.sysml.lang.sysml.Package)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwningPackage()
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedMember
	 * @model opposite="ownedMember" ordered="false"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Package getOwningPackage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getOwningPackage <em>Owning Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Package</em>' reference.
	 * @see #getOwningPackage()
	 * @generated
	 */
	void setOwningPackage(org.omg.sysml.lang.sysml.Package value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Name()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Element