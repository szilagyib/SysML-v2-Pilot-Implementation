/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disjoint Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.kerml.owl.owl.DisjointUnion#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.DisjointUnion#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}</li>
 * </ul>
 *
 * @see org.omg.kerml.owl.owl.OwlPackage#getDisjointUnion()
 * @model
 * @generated
 */
public interface DisjointUnion extends ClassAxiom
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(ClassReference)
   * @see org.omg.kerml.owl.owl.OwlPackage#getDisjointUnion_Class()
   * @model containment="true"
   * @generated
   */
  ClassReference getClass_();

  /**
   * Sets the value of the '{@link org.omg.kerml.owl.owl.DisjointUnion#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(ClassReference value);

  /**
   * Returns the value of the '<em><b>Disjoint Class Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.kerml.owl.owl.ClassExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disjoint Class Expressions</em>' containment reference list.
   * @see org.omg.kerml.owl.owl.OwlPackage#getDisjointUnion_DisjointClassExpressions()
   * @model containment="true"
   * @generated
   */
  EList<ClassExpression> getDisjointClassExpressions();

} // DisjointUnion