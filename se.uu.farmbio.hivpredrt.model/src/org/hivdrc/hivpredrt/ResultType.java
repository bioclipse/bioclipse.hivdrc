/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpredrt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hivdrc.hivpredrt.ResultType#getName <em>Name</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.ResultType#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hivdrc.hivpredrt.HivpredrtPackage#getResultType()
 * @model extendedMetaData="name='resultType' kind='empty'"
 * @generated
 */
public interface ResultType extends EObject {
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
     * @see org.hivdrc.hivpredrt.HivpredrtPackage#getResultType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.hivdrc.hivpredrt.ResultType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Result</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Result</em>' attribute.
     * @see #isSetResult()
     * @see #unsetResult()
     * @see #setResult(double)
     * @see org.hivdrc.hivpredrt.HivpredrtPackage#getResultType_Result()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
     *        extendedMetaData="kind='attribute' name='result'"
     * @generated
     */
    double getResult();

    /**
     * Sets the value of the '{@link org.hivdrc.hivpredrt.ResultType#getResult <em>Result</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Result</em>' attribute.
     * @see #isSetResult()
     * @see #unsetResult()
     * @see #getResult()
     * @generated
     */
    void setResult(double value);

    /**
     * Unsets the value of the '{@link org.hivdrc.hivpredrt.ResultType#getResult <em>Result</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetResult()
     * @see #getResult()
     * @see #setResult(double)
     * @generated
     */
    void unsetResult();

    /**
     * Returns whether the value of the '{@link org.hivdrc.hivpredrt.ResultType#getResult <em>Result</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Result</em>' attribute is set.
     * @see #unsetResult()
     * @see #getResult()
     * @see #setResult(double)
     * @generated
     */
    boolean isSetResult();

} // ResultType
