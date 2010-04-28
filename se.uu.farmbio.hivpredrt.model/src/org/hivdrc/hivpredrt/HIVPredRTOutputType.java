/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpredrt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIV Pred RT Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getMutNotInDataset <em>Mut Not In Dataset</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getMutOutsideModelBoundaries <em>Mut Outside Model Boundaries</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getMutPlusMutOutsideModelBoundaries <em>Mut Plus Mut Outside Model Boundaries</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getMutPlusWtOutsideModelBoundaries <em>Mut Plus Wt Outside Model Boundaries</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getResult <em>Result</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getWarningMessage <em>Warning Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hivdrc.hivpredrt.HivpredrtPackage#getHIVPredRTOutputType()
 * @model extendedMetaData="name='HIVPredRTOutputType' kind='elementOnly'"
 * @generated
 */
public interface HIVPredRTOutputType extends EObject {
    /**
     * Returns the value of the '<em><b>Mut Not In Dataset</b></em>' containment reference list.
     * The list contents are of type {@link org.hivdrc.hivpredrt.MutNotInDatasetType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mut Not In Dataset</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mut Not In Dataset</em>' containment reference list.
     * @see org.hivdrc.hivpredrt.HivpredrtPackage#getHIVPredRTOutputType_MutNotInDataset()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='mutNotInDataset' namespace='##targetNamespace'"
     * @generated
     */
    EList<MutNotInDatasetType> getMutNotInDataset();

    /**
     * Returns the value of the '<em><b>Mut Outside Model Boundaries</b></em>' containment reference list.
     * The list contents are of type {@link org.hivdrc.hivpredrt.MutOutsideModelBoundariesType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mut Outside Model Boundaries</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mut Outside Model Boundaries</em>' containment reference list.
     * @see org.hivdrc.hivpredrt.HivpredrtPackage#getHIVPredRTOutputType_MutOutsideModelBoundaries()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='mutOutsideModelBoundaries' namespace='##targetNamespace'"
     * @generated
     */
    EList<MutOutsideModelBoundariesType> getMutOutsideModelBoundaries();

    /**
     * Returns the value of the '<em><b>Mut Plus Mut Outside Model Boundaries</b></em>' containment reference list.
     * The list contents are of type {@link org.hivdrc.hivpredrt.MutPlusMutOutsideModelBoundariesType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mut Plus Mut Outside Model Boundaries</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mut Plus Mut Outside Model Boundaries</em>' containment reference list.
     * @see org.hivdrc.hivpredrt.HivpredrtPackage#getHIVPredRTOutputType_MutPlusMutOutsideModelBoundaries()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='mutPlusMutOutsideModelBoundaries' namespace='##targetNamespace'"
     * @generated
     */
    EList<MutPlusMutOutsideModelBoundariesType> getMutPlusMutOutsideModelBoundaries();

    /**
     * Returns the value of the '<em><b>Mut Plus Wt Outside Model Boundaries</b></em>' containment reference list.
     * The list contents are of type {@link org.hivdrc.hivpredrt.MutPlusWtOutsideModelBoundariesType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mut Plus Wt Outside Model Boundaries</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mut Plus Wt Outside Model Boundaries</em>' containment reference list.
     * @see org.hivdrc.hivpredrt.HivpredrtPackage#getHIVPredRTOutputType_MutPlusWtOutsideModelBoundaries()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='mutPlusWtOutsideModelBoundaries' namespace='##targetNamespace'"
     * @generated
     */
    EList<MutPlusWtOutsideModelBoundariesType> getMutPlusWtOutsideModelBoundaries();

    /**
     * Returns the value of the '<em><b>Result</b></em>' containment reference list.
     * The list contents are of type {@link org.hivdrc.hivpredrt.ResultType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Result</em>' containment reference list.
     * @see org.hivdrc.hivpredrt.HivpredrtPackage#getHIVPredRTOutputType_Result()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='result' namespace='##targetNamespace'"
     * @generated
     */
    EList<ResultType> getResult();

    /**
     * Returns the value of the '<em><b>Error Message</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Error Message</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Error Message</em>' attribute.
     * @see #setErrorMessage(String)
     * @see org.hivdrc.hivpredrt.HivpredrtPackage#getHIVPredRTOutputType_ErrorMessage()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='errorMessage'"
     * @generated
     */
    String getErrorMessage();

    /**
     * Sets the value of the '{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getErrorMessage <em>Error Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Error Message</em>' attribute.
     * @see #getErrorMessage()
     * @generated
     */
    void setErrorMessage(String value);

    /**
     * Returns the value of the '<em><b>Warning Message</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Warning Message</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Warning Message</em>' attribute.
     * @see #setWarningMessage(String)
     * @see org.hivdrc.hivpredrt.HivpredrtPackage#getHIVPredRTOutputType_WarningMessage()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='warningMessage'"
     * @generated
     */
    String getWarningMessage();

    /**
     * Sets the value of the '{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getWarningMessage <em>Warning Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Warning Message</em>' attribute.
     * @see #getWarningMessage()
     * @generated
     */
    void setWarningMessage(String value);

} // HIVPredRTOutputType
