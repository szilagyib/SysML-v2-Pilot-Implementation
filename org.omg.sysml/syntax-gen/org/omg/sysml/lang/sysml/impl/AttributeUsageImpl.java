/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.AttributeUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AttributeUsageImpl#getAttributeDefinition <em>Attribute Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeUsageImpl extends UsageImpl implements AttributeUsage {
	
	public static final String ATTRIBUTE_SUBSETTING_DEFAULT = "Base::dataValues";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ATTRIBUTE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<DataType> getAttributeDefinition() {
		EList<DataType> dataTypes = new EObjectEList<DataType>(DataType.class, this, SysMLPackage.ATTRIBUTE_USAGE__ATTRIBUTE_DEFINITION);
		super.getType().stream().
			filter(type->type instanceof DataType).
			map(type->(DataType)type).
			forEachOrdered(dataTypes::add);
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeDefinition() {
		return !getAttributeDefinition().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> attributeDefinition = (EList<Type>)((EList<?>)getAttributeDefinition());
		return attributeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

	@Override
	protected String getDefaultSupertype() {
		return ATTRIBUTE_SUBSETTING_DEFAULT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ATTRIBUTE_USAGE__ATTRIBUTE_DEFINITION:
				return getAttributeDefinition();
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
			case SysMLPackage.ATTRIBUTE_USAGE__ATTRIBUTE_DEFINITION:
				getAttributeDefinition().clear();
				getAttributeDefinition().addAll((Collection<? extends DataType>)newValue);
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
			case SysMLPackage.ATTRIBUTE_USAGE__ATTRIBUTE_DEFINITION:
				getAttributeDefinition().clear();
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
			case SysMLPackage.ATTRIBUTE_USAGE__TYPE:
				return isSetType();
			case SysMLPackage.ATTRIBUTE_USAGE__ATTRIBUTE_DEFINITION:
				return isSetAttributeDefinition();
		}
		return super.eIsSet(featureID);
	}

} //AttributeUsageImpl