/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getMemberFeature <em>Member Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwnedMemberFeature <em>Owned Member Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isPart <em>Is Part</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isPortion <em>Is Portion</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#isPort <em>Is Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwningType <em>Owning Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureMembershipImpl extends MembershipImpl implements FeatureMembership {
	/**
	 * The cached value of the '{@link #getMemberFeature() <em>Member Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature memberFeature;

	/**
	 * The default value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isPart() <em>Is Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PART_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPart() <em>Is Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPart()
	 * @generated
	 * @ordered
	 */
	protected boolean isPart = IS_PART_EDEFAULT;

	/**
	 * The default value of the '{@link #isPortion() <em>Is Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPortion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PORTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPortion() <em>Is Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPortion()
	 * @generated
	 * @ordered
	 */
	protected boolean isPortion = IS_PORTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isPort() <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPort()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPort() <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPort()
	 * @generated
	 * @ordered
	 */
	protected boolean isPort = IS_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated NOT
	 * @ordered
	 */
	protected static final FeatureDirectionKind DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected FeatureDirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_MEMBERSHIP;
	}
	
	public Feature getMemberFeature() {
		return memberFeature == null? basicGetMemberFeature(): getMemberFeatureGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getMemberFeatureGen() {
		if (memberFeature != null && memberFeature.eIsProxy()) {
			InternalEObject oldMemberFeature = (InternalEObject)memberFeature;
			memberFeature = (Feature)eResolveProxy(oldMemberFeature);
			if (memberFeature != oldMemberFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE, oldMemberFeature, memberFeature));
			}
		}
		return memberFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetMemberFeature() {
		Feature ownedMemberFeature = getOwnedMemberFeature();
		if (memberFeature == null && ownedMemberFeature != null) {
			memberFeature = ownedMemberFeature;
		}
		return memberFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberFeature(Feature newMemberFeature) {
		Feature oldMemberFeature = memberFeature;
		memberFeature = newMemberFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE, oldMemberFeature, memberFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetMemberFeature() {
		return basicGetMemberFeature() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isPart() {
		if (!isPart) {
			Feature memberFeature = getOwnedMemberFeature();
			isPart = memberFeature != null && ((FeatureImpl)memberFeature).basicIsComposite( );
		}
		return isPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPart(boolean newIsPart) {
		boolean oldIsPart = isPart;
		isPart = newIsPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__IS_PART, oldIsPart, isPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPortion() {
		return isPortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPortion(boolean newIsPortion) {
		boolean oldIsPortion = isPortion;
		isPortion = newIsPortion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__IS_PORTION, oldIsPortion, isPortion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPort() {
		return isPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPort(boolean newIsPort) {
		boolean oldIsPort = isPort;
		isPort = newIsPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT, oldIsPort, isPort));
	}

	/**
	 * @generated
	 */
	@Override
	public FeatureDirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(FeatureDirectionKind newDirection) {
		FeatureDirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION, oldDirection, direction));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type getOwningType() {
		return basicGetOwningType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetOwningType() {
		org.omg.sysml.lang.sysml.Package owningPackage = super.basicGetMembershipOwningPackage();
		return owningPackage instanceof Type? (Type)owningPackage: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOwningType(Type newOwningType, NotificationChain msgs) {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOwningType(Type newOwningType) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberFeature() {
		Feature ownedMemberFeature = basicGetOwnedMemberFeature();
		return ownedMemberFeature != null && ownedMemberFeature.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)ownedMemberFeature) : ownedMemberFeature;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetOwnedMemberFeature() {
		return getFirstOwnedRelatedElement(Feature.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedMemberFeature(Feature newOwnedMemberFeature) {
		// TODO: implement this method to set the 'Owned Member Feature' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				if (resolve) return getMemberFeature();
				return basicGetMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED:
				return isDerived();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY:
				return isReadOnly();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				if (resolve) return getOwnedMemberFeature();
				return basicGetOwnedMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PART:
				return isPart();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORTION:
				return isPortion();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				return isPort();
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				return getDirection();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_TYPE:
				if (resolve) return getOwningType();
				return basicGetOwningType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				setMemberFeature((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				setOwnedMemberFeature((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PART:
				setIsPart((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORTION:
				setIsPortion((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				setIsPort((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				setDirection((FeatureDirectionKind)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_TYPE:
				setOwningType((Type)newValue);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				setMemberFeature((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				setOwnedMemberFeature((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PART:
				setIsPart(IS_PART_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORTION:
				setIsPortion(IS_PORTION_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				setIsPort(IS_PORT_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_TYPE:
				setOwningType((Type)null);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_FEATURE:
				return isSetMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBER_ELEMENT:
				return isSetMemberElement();
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				return basicGetOwnedMemberFeature() != null;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PART:
				return isPart != IS_PART_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORTION:
				return isPortion != IS_PORTION_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__IS_PORT:
				return isPort != IS_PORT_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_TYPE:
				return basicGetOwningType() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (isDerived: ");
		result.append(isDerived);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isPart: ");
		result.append(isPart);
		result.append(", isPortion: ");
		result.append(isPortion);
		result.append(", isPort: ");
		result.append(isPort);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getMemberElement() {
		return getMemberFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetMemberElement() {
		return basicGetMemberFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberElement(Element newMemberElement) {
		if (newMemberElement != null && !(newMemberElement instanceof Feature)) {
			throw new IllegalArgumentException("newMemberElement must be an instance of Feature");
		}
		setMemberFeature((Feature) newMemberElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberElement() {
  		return false;
	}

} //FeatureMembershipImpl