/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getMemberElement <em>Member Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getMembershipOwningPackage <em>Membership Owning Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MembershipImpl#getOwnedMemberElement <em>Owned Member Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MembershipImpl extends RelationshipImpl implements Membership {
	/**
	 * The cached value of the '{@link #getMemberElement() <em>Member Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberElement()
	 * @generated
	 * @ordered
	 */
	protected Element memberElement;

	/**
	 * The default value of the '{@link #getMemberName() <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberName() <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberName()
	 * @generated
	 * @ordered
	 */
	protected String memberName = MEMBER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAliases() <em>Aliases</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliases()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aliases;

	/**
	 * The cached value of the '{@link #getMembershipOwningPackage() <em>Membership Owning Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembershipOwningPackage()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Package membershipOwningPackage;

	/**
	 * The cached value of the '{@link #getOwnedMemberElement() <em>Owned Member Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemberElement()
	 * @generated
	 * @ordered
	 */
	protected Element ownedMemberElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.MEMBERSHIP;
	}
	
	public Element getMemberElement() {
		return memberElement == null? basicGetMemberElement(): getMemberElementGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getMemberElementGen() {
		if (memberElement != null && memberElement.eIsProxy()) {
			InternalEObject oldMemberElement = (InternalEObject)memberElement;
			memberElement = (Element)eResolveProxy(oldMemberElement);
			if (memberElement != oldMemberElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT, oldMemberElement, memberElement));
			}
		}
		return memberElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element basicGetMemberElement() {
		Element ownedMemberElement = getOwnedMemberElement();
		if (memberElement == null && ownedMemberElement != null) {
			memberElement = ownedMemberElement;
		}
		return memberElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberElement(Element newMemberElement) {
		Element oldMemberElement = memberElement;
		memberElement = newMemberElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT, oldMemberElement, memberElement));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (ownedMemberElement != null && ownedMemberElement != newMemberElement) {
				setOwnedMemberElement(null);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberElement() {
		return memberElement != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (membershipOwningPackage != null && membershipOwningPackage != newOwningRelatedElement) {
				setMembershipOwningPackage(null);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRelatedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRelatedElement != null)
				msgs = ((InternalEObject)newOwningRelatedElement).eInverseAdd(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
			msgs = basicSetOwningRelatedElement(newOwningRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		if (ownedRelatedElement == null) {
			ownedRelatedElement = new SubsetSupersetEObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.MEMBERSHIP__OWNED_RELATED_ELEMENT, null, OWNED_RELATED_ELEMENT_ESUBSETS, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedRelatedElement() <em>Owned Related Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_RELATED_ELEMENT_ESUBSETS = new int[] {SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getMemberName() {
		if (memberName == null) {
			ElementImpl memberElement = (ElementImpl)this.getMemberElement();
			if (memberElement != null) {
				if (memberElement == getOwnedMemberElement()) {
					memberName = memberElement.basicGetName();
					memberElement.basicSetName(null);
				} else {
					memberName = memberElement.getName();
				}
			}
		}
		return memberName;
	}

	@Override
	public void setMemberName(String newMemberName) {
		setMemberNameGen(unescapeString(newMemberName));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberNameGen(String newMemberName) {
		String oldMemberName = memberName;
		memberName = newMemberName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__MEMBER_NAME, oldMemberName, memberName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAliases() {
		if (aliases == null) {
			aliases = new EDataTypeUniqueEList<String>(String.class, this, SysMLPackage.MEMBERSHIP__ALIASES);
		}
		return aliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.omg.sysml.lang.sysml.Package getMembershipOwningPackage() {
		if (membershipOwningPackage != null && membershipOwningPackage.eIsProxy()) {
			InternalEObject oldMembershipOwningPackage = (InternalEObject)membershipOwningPackage;
			membershipOwningPackage = (org.omg.sysml.lang.sysml.Package)eResolveProxy(oldMembershipOwningPackage);
			if (membershipOwningPackage != oldMembershipOwningPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE, oldMembershipOwningPackage, membershipOwningPackage));
			}
		}
		return membershipOwningPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.omg.sysml.lang.sysml.Package basicGetMembershipOwningPackage() {
		return getOwningRelatedElement(org.omg.sysml.lang.sysml.Package.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMembershipOwningPackage(org.omg.sysml.lang.sysml.Package newMembershipOwningPackage, NotificationChain msgs) {
		org.omg.sysml.lang.sysml.Package oldMembershipOwningPackage = membershipOwningPackage;
		membershipOwningPackage = newMembershipOwningPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE, oldMembershipOwningPackage, newMembershipOwningPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newMembershipOwningPackage != null) {
				Element owningRelatedElement = getOwningRelatedElement();
				if (newMembershipOwningPackage != owningRelatedElement) {
					setOwningRelatedElement(newMembershipOwningPackage);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setMembershipOwningPackage(org.omg.sysml.lang.sysml.Package newMembershipOwningPackage) {
		// TODO: implement this method to set the 'Membership Owning Package' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembershipOwningPackage() {
		return membershipOwningPackage != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwnedMemberElement() {
		if (ownedMemberElement != null && ownedMemberElement.eIsProxy()) {
			InternalEObject oldOwnedMemberElement = (InternalEObject)ownedMemberElement;
			ownedMemberElement = (Element)eResolveProxy(oldOwnedMemberElement);
			if (ownedMemberElement != oldOwnedMemberElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT, oldOwnedMemberElement, ownedMemberElement));
			}
		}
		return ownedMemberElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element basicGetOwnedMemberElement() {
		return getFirstOwnedRelatedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberElement(Element newOwnedMemberElement, NotificationChain msgs) {
		Element oldOwnedMemberElement = ownedMemberElement;
		ownedMemberElement = newOwnedMemberElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT, oldOwnedMemberElement, newOwnedMemberElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwnedMemberElement != null) {
				if (newOwnedMemberElement != memberElement) {
					setMemberElement(newOwnedMemberElement);
				}
			}
			if (newOwnedMemberElement != null) {
				EList<Element> ownedRelatedElement = getOwnedRelatedElement();
				if (!ownedRelatedElement.contains(newOwnedMemberElement)) {
					ownedRelatedElement.add(newOwnedMemberElement);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedMemberElement(Element newOwnedMemberElement) {
		// TODO: implement this method to set the 'Owned Member Element' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	// Operations
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isDistinguishableFrom(Membership other) {
		// TODO Implement full distinguishibility test.
		String name = this.getMemberName();
		String otherName = other.getMemberName();
		return name == null? otherName != null: !name.equals(otherName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
			case SysMLPackage.MEMBERSHIP__OWNED_RELATED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement()).basicAdd(otherEnd, msgs);
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE:
				if (membershipOwningPackage != null)
					msgs = ((InternalEObject)membershipOwningPackage).eInverseRemove(this, SysMLPackage.PACKAGE__OWNED_MEMBERSHIP_COMP, org.omg.sysml.lang.sysml.Package.class, msgs);
				return basicSetMembershipOwningPackage((org.omg.sysml.lang.sysml.Package)otherEnd, msgs);
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				if (ownedMemberElement != null)
					msgs = ((InternalEObject)ownedMemberElement).eInverseRemove(this, SysMLPackage.ELEMENT__OWNING_MEMBERSHIP, Element.class, msgs);
				return basicSetOwnedMemberElement((Element)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
			case SysMLPackage.MEMBERSHIP__OWNED_RELATED_ELEMENT:
				return ((InternalEList<?>)getOwnedRelatedElement()).basicRemove(otherEnd, msgs);
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE:
				return basicSetMembershipOwningPackage(null, msgs);
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				return basicSetOwnedMemberElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT:
				if (resolve) return getMemberElement();
				return basicGetMemberElement();
			case SysMLPackage.MEMBERSHIP__MEMBER_NAME:
				return getMemberName();
			case SysMLPackage.MEMBERSHIP__VISIBILITY:
				return getVisibility();
			case SysMLPackage.MEMBERSHIP__ALIASES:
				return getAliases();
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE:
				if (resolve) return getMembershipOwningPackage();
				return basicGetMembershipOwningPackage();
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				if (resolve) return getOwnedMemberElement();
				return basicGetOwnedMemberElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT:
				setMemberElement((Element)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBER_NAME:
				setMemberName((String)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__ALIASES:
				getAliases().clear();
				getAliases().addAll((Collection<? extends String>)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE:
				setMembershipOwningPackage((org.omg.sysml.lang.sysml.Package)newValue);
				return;
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				setOwnedMemberElement((Element)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT:
				setMemberElement((Element)null);
				return;
			case SysMLPackage.MEMBERSHIP__MEMBER_NAME:
				setMemberName(MEMBER_NAME_EDEFAULT);
				return;
			case SysMLPackage.MEMBERSHIP__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case SysMLPackage.MEMBERSHIP__ALIASES:
				getAliases().clear();
				return;
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE:
				setMembershipOwningPackage((org.omg.sysml.lang.sysml.Package)null);
				return;
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				setOwnedMemberElement((Element)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.MEMBERSHIP__MEMBER_ELEMENT:
				return isSetMemberElement();
			case SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.MEMBERSHIP__OWNED_RELATED_ELEMENT:
				return ownedRelatedElement != null && !ownedRelatedElement.isEmpty();
			case SysMLPackage.MEMBERSHIP__TARGET:
				return isSetTarget();
			case SysMLPackage.MEMBERSHIP__SOURCE:
				return isSetSource();
			case SysMLPackage.MEMBERSHIP__MEMBER_NAME:
				return MEMBER_NAME_EDEFAULT == null ? memberName != null : !MEMBER_NAME_EDEFAULT.equals(memberName);
			case SysMLPackage.MEMBERSHIP__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case SysMLPackage.MEMBERSHIP__ALIASES:
				return aliases != null && !aliases.isEmpty();
			case SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE:
				return isSetMembershipOwningPackage();
			case SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				return ownedMemberElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP:
				return isDistinguishableFrom((Membership)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (memberName: ");
		result.append(memberName);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", aliases: ");
		result.append(aliases);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.MEMBERSHIP__TARGET);
		// NOTE: The "memberElement" object must NOT be resolved here, in order to avoid Xtext lazy linking errors.
		Element memberElement = basicGetMemberElement();
		if (memberElement != null) {
			target.add(memberElement);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTarget() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.MEMBERSHIP__SOURCE);
		Element membershipOwningPackage = getMembershipOwningPackage();
		if (membershipOwningPackage != null) {
			source.add(membershipOwningPackage);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
  		return false;
	}

} //MembershipImpl
