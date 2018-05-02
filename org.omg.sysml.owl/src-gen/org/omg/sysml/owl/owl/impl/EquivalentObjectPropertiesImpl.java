/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.owl.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.owl.owl.EquivalentObjectProperties;
import org.omg.sysml.owl.owl.ObjectPropertyExpression;
import org.omg.sysml.owl.owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Object Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.impl.EquivalentObjectPropertiesImpl#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquivalentObjectPropertiesImpl extends ObjectPropertyAxiomImpl implements EquivalentObjectProperties
{
  /**
   * The cached value of the '{@link #getObjectPropertyExpressions() <em>Object Property Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectPropertyExpressions()
   * @generated
   * @ordered
   */
  protected EList<ObjectPropertyExpression> objectPropertyExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EquivalentObjectPropertiesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OwlPackage.Literals.EQUIVALENT_OBJECT_PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ObjectPropertyExpression> getObjectPropertyExpressions()
  {
    if (objectPropertyExpressions == null)
    {
      objectPropertyExpressions = new EObjectContainmentEList<ObjectPropertyExpression>(ObjectPropertyExpression.class, this, OwlPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS);
    }
    return objectPropertyExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OwlPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS:
        return ((InternalEList<?>)getObjectPropertyExpressions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OwlPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS:
        return getObjectPropertyExpressions();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OwlPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS:
        getObjectPropertyExpressions().clear();
        getObjectPropertyExpressions().addAll((Collection<? extends ObjectPropertyExpression>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OwlPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS:
        getObjectPropertyExpressions().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OwlPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS:
        return objectPropertyExpressions != null && !objectPropertyExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EquivalentObjectPropertiesImpl