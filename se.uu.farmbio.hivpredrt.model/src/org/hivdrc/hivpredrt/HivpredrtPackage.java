/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpredrt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.hivdrc.hivpredrt.HivpredrtFactory
 * @model kind="package"
 * @generated
 */
public interface HivpredrtPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "hivpredrt";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.hivdrc.org/hivpredrt";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "hivpredrt";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    HivpredrtPackage eINSTANCE = org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl.init();

    /**
     * The meta object id for the '{@link org.hivdrc.hivpredrt.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hivdrc.hivpredrt.impl.DocumentRootImpl
     * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 0;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>HIV Pred RT Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__HIV_PRED_RT_INPUT = 3;

    /**
     * The feature id for the '<em><b>HIV Pred RT Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__HIV_PRED_RT_OUTPUT = 4;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.hivdrc.hivpredrt.impl.HIVPredRTInputTypeImpl <em>HIV Pred RT Input Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hivdrc.hivpredrt.impl.HIVPredRTInputTypeImpl
     * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getHIVPredRTInputType()
     * @generated
     */
    int HIV_PRED_RT_INPUT_TYPE = 1;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIV_PRED_RT_INPUT_TYPE__SEQUENCE = 0;

    /**
     * The number of structural features of the '<em>HIV Pred RT Input Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIV_PRED_RT_INPUT_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.hivdrc.hivpredrt.impl.HIVPredRTOutputTypeImpl <em>HIV Pred RT Output Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hivdrc.hivpredrt.impl.HIVPredRTOutputTypeImpl
     * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getHIVPredRTOutputType()
     * @generated
     */
    int HIV_PRED_RT_OUTPUT_TYPE = 2;

    /**
     * The feature id for the '<em><b>Mut Not In Dataset</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIV_PRED_RT_OUTPUT_TYPE__MUT_NOT_IN_DATASET = 0;

    /**
     * The feature id for the '<em><b>Mut Outside Model Boundaries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIV_PRED_RT_OUTPUT_TYPE__MUT_OUTSIDE_MODEL_BOUNDARIES = 1;

    /**
     * The feature id for the '<em><b>Mut Plus Mut Outside Model Boundaries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES = 2;

    /**
     * The feature id for the '<em><b>Mut Plus Wt Outside Model Boundaries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES = 3;

    /**
     * The feature id for the '<em><b>Result</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIV_PRED_RT_OUTPUT_TYPE__RESULT = 4;

    /**
     * The feature id for the '<em><b>Error Message</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIV_PRED_RT_OUTPUT_TYPE__ERROR_MESSAGE = 5;

    /**
     * The feature id for the '<em><b>Warning Message</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIV_PRED_RT_OUTPUT_TYPE__WARNING_MESSAGE = 6;

    /**
     * The number of structural features of the '<em>HIV Pred RT Output Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIV_PRED_RT_OUTPUT_TYPE_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link org.hivdrc.hivpredrt.impl.MutNotInDatasetTypeImpl <em>Mut Not In Dataset Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hivdrc.hivpredrt.impl.MutNotInDatasetTypeImpl
     * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getMutNotInDatasetType()
     * @generated
     */
    int MUT_NOT_IN_DATASET_TYPE = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUT_NOT_IN_DATASET_TYPE__NAME = 0;

    /**
     * The number of structural features of the '<em>Mut Not In Dataset Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUT_NOT_IN_DATASET_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.hivdrc.hivpredrt.impl.MutOutsideModelBoundariesTypeImpl <em>Mut Outside Model Boundaries Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hivdrc.hivpredrt.impl.MutOutsideModelBoundariesTypeImpl
     * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getMutOutsideModelBoundariesType()
     * @generated
     */
    int MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE__NAME = 0;

    /**
     * The number of structural features of the '<em>Mut Outside Model Boundaries Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.hivdrc.hivpredrt.impl.MutPlusMutOutsideModelBoundariesTypeImpl <em>Mut Plus Mut Outside Model Boundaries Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hivdrc.hivpredrt.impl.MutPlusMutOutsideModelBoundariesTypeImpl
     * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getMutPlusMutOutsideModelBoundariesType()
     * @generated
     */
    int MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE__NAME = 0;

    /**
     * The number of structural features of the '<em>Mut Plus Mut Outside Model Boundaries Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.hivdrc.hivpredrt.impl.MutPlusWtOutsideModelBoundariesTypeImpl <em>Mut Plus Wt Outside Model Boundaries Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hivdrc.hivpredrt.impl.MutPlusWtOutsideModelBoundariesTypeImpl
     * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getMutPlusWtOutsideModelBoundariesType()
     * @generated
     */
    int MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES_TYPE = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES_TYPE__NAME = 0;

    /**
     * The number of structural features of the '<em>Mut Plus Wt Outside Model Boundaries Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.hivdrc.hivpredrt.impl.ResultTypeImpl <em>Result Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.hivdrc.hivpredrt.impl.ResultTypeImpl
     * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getResultType()
     * @generated
     */
    int RESULT_TYPE = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>Result</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_TYPE__RESULT = 1;

    /**
     * The number of structural features of the '<em>Result Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_TYPE_FEATURE_COUNT = 2;


    /**
     * Returns the meta object for class '{@link org.hivdrc.hivpredrt.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.hivdrc.hivpredrt.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.hivdrc.hivpredrt.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.hivdrc.hivpredrt.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.hivdrc.hivpredrt.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.hivdrc.hivpredrt.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.hivdrc.hivpredrt.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.hivdrc.hivpredrt.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.hivdrc.hivpredrt.DocumentRoot#getHIVPredRTInput <em>HIV Pred RT Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>HIV Pred RT Input</em>'.
     * @see org.hivdrc.hivpredrt.DocumentRoot#getHIVPredRTInput()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_HIVPredRTInput();

    /**
     * Returns the meta object for the containment reference '{@link org.hivdrc.hivpredrt.DocumentRoot#getHIVPredRTOutput <em>HIV Pred RT Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>HIV Pred RT Output</em>'.
     * @see org.hivdrc.hivpredrt.DocumentRoot#getHIVPredRTOutput()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_HIVPredRTOutput();

    /**
     * Returns the meta object for class '{@link org.hivdrc.hivpredrt.HIVPredRTInputType <em>HIV Pred RT Input Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>HIV Pred RT Input Type</em>'.
     * @see org.hivdrc.hivpredrt.HIVPredRTInputType
     * @generated
     */
    EClass getHIVPredRTInputType();

    /**
     * Returns the meta object for the attribute '{@link org.hivdrc.hivpredrt.HIVPredRTInputType#getSequence <em>Sequence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sequence</em>'.
     * @see org.hivdrc.hivpredrt.HIVPredRTInputType#getSequence()
     * @see #getHIVPredRTInputType()
     * @generated
     */
    EAttribute getHIVPredRTInputType_Sequence();

    /**
     * Returns the meta object for class '{@link org.hivdrc.hivpredrt.HIVPredRTOutputType <em>HIV Pred RT Output Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>HIV Pred RT Output Type</em>'.
     * @see org.hivdrc.hivpredrt.HIVPredRTOutputType
     * @generated
     */
    EClass getHIVPredRTOutputType();

    /**
     * Returns the meta object for the containment reference list '{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getMutNotInDataset <em>Mut Not In Dataset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mut Not In Dataset</em>'.
     * @see org.hivdrc.hivpredrt.HIVPredRTOutputType#getMutNotInDataset()
     * @see #getHIVPredRTOutputType()
     * @generated
     */
    EReference getHIVPredRTOutputType_MutNotInDataset();

    /**
     * Returns the meta object for the containment reference list '{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getMutOutsideModelBoundaries <em>Mut Outside Model Boundaries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mut Outside Model Boundaries</em>'.
     * @see org.hivdrc.hivpredrt.HIVPredRTOutputType#getMutOutsideModelBoundaries()
     * @see #getHIVPredRTOutputType()
     * @generated
     */
    EReference getHIVPredRTOutputType_MutOutsideModelBoundaries();

    /**
     * Returns the meta object for the containment reference list '{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getMutPlusMutOutsideModelBoundaries <em>Mut Plus Mut Outside Model Boundaries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mut Plus Mut Outside Model Boundaries</em>'.
     * @see org.hivdrc.hivpredrt.HIVPredRTOutputType#getMutPlusMutOutsideModelBoundaries()
     * @see #getHIVPredRTOutputType()
     * @generated
     */
    EReference getHIVPredRTOutputType_MutPlusMutOutsideModelBoundaries();

    /**
     * Returns the meta object for the containment reference list '{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getMutPlusWtOutsideModelBoundaries <em>Mut Plus Wt Outside Model Boundaries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mut Plus Wt Outside Model Boundaries</em>'.
     * @see org.hivdrc.hivpredrt.HIVPredRTOutputType#getMutPlusWtOutsideModelBoundaries()
     * @see #getHIVPredRTOutputType()
     * @generated
     */
    EReference getHIVPredRTOutputType_MutPlusWtOutsideModelBoundaries();

    /**
     * Returns the meta object for the containment reference list '{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getResult <em>Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Result</em>'.
     * @see org.hivdrc.hivpredrt.HIVPredRTOutputType#getResult()
     * @see #getHIVPredRTOutputType()
     * @generated
     */
    EReference getHIVPredRTOutputType_Result();

    /**
     * Returns the meta object for the attribute '{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getErrorMessage <em>Error Message</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Error Message</em>'.
     * @see org.hivdrc.hivpredrt.HIVPredRTOutputType#getErrorMessage()
     * @see #getHIVPredRTOutputType()
     * @generated
     */
    EAttribute getHIVPredRTOutputType_ErrorMessage();

    /**
     * Returns the meta object for the attribute '{@link org.hivdrc.hivpredrt.HIVPredRTOutputType#getWarningMessage <em>Warning Message</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Warning Message</em>'.
     * @see org.hivdrc.hivpredrt.HIVPredRTOutputType#getWarningMessage()
     * @see #getHIVPredRTOutputType()
     * @generated
     */
    EAttribute getHIVPredRTOutputType_WarningMessage();

    /**
     * Returns the meta object for class '{@link org.hivdrc.hivpredrt.MutNotInDatasetType <em>Mut Not In Dataset Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mut Not In Dataset Type</em>'.
     * @see org.hivdrc.hivpredrt.MutNotInDatasetType
     * @generated
     */
    EClass getMutNotInDatasetType();

    /**
     * Returns the meta object for the attribute '{@link org.hivdrc.hivpredrt.MutNotInDatasetType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.hivdrc.hivpredrt.MutNotInDatasetType#getName()
     * @see #getMutNotInDatasetType()
     * @generated
     */
    EAttribute getMutNotInDatasetType_Name();

    /**
     * Returns the meta object for class '{@link org.hivdrc.hivpredrt.MutOutsideModelBoundariesType <em>Mut Outside Model Boundaries Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mut Outside Model Boundaries Type</em>'.
     * @see org.hivdrc.hivpredrt.MutOutsideModelBoundariesType
     * @generated
     */
    EClass getMutOutsideModelBoundariesType();

    /**
     * Returns the meta object for the attribute '{@link org.hivdrc.hivpredrt.MutOutsideModelBoundariesType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.hivdrc.hivpredrt.MutOutsideModelBoundariesType#getName()
     * @see #getMutOutsideModelBoundariesType()
     * @generated
     */
    EAttribute getMutOutsideModelBoundariesType_Name();

    /**
     * Returns the meta object for class '{@link org.hivdrc.hivpredrt.MutPlusMutOutsideModelBoundariesType <em>Mut Plus Mut Outside Model Boundaries Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mut Plus Mut Outside Model Boundaries Type</em>'.
     * @see org.hivdrc.hivpredrt.MutPlusMutOutsideModelBoundariesType
     * @generated
     */
    EClass getMutPlusMutOutsideModelBoundariesType();

    /**
     * Returns the meta object for the attribute '{@link org.hivdrc.hivpredrt.MutPlusMutOutsideModelBoundariesType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.hivdrc.hivpredrt.MutPlusMutOutsideModelBoundariesType#getName()
     * @see #getMutPlusMutOutsideModelBoundariesType()
     * @generated
     */
    EAttribute getMutPlusMutOutsideModelBoundariesType_Name();

    /**
     * Returns the meta object for class '{@link org.hivdrc.hivpredrt.MutPlusWtOutsideModelBoundariesType <em>Mut Plus Wt Outside Model Boundaries Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mut Plus Wt Outside Model Boundaries Type</em>'.
     * @see org.hivdrc.hivpredrt.MutPlusWtOutsideModelBoundariesType
     * @generated
     */
    EClass getMutPlusWtOutsideModelBoundariesType();

    /**
     * Returns the meta object for the attribute '{@link org.hivdrc.hivpredrt.MutPlusWtOutsideModelBoundariesType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.hivdrc.hivpredrt.MutPlusWtOutsideModelBoundariesType#getName()
     * @see #getMutPlusWtOutsideModelBoundariesType()
     * @generated
     */
    EAttribute getMutPlusWtOutsideModelBoundariesType_Name();

    /**
     * Returns the meta object for class '{@link org.hivdrc.hivpredrt.ResultType <em>Result Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Result Type</em>'.
     * @see org.hivdrc.hivpredrt.ResultType
     * @generated
     */
    EClass getResultType();

    /**
     * Returns the meta object for the attribute '{@link org.hivdrc.hivpredrt.ResultType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.hivdrc.hivpredrt.ResultType#getName()
     * @see #getResultType()
     * @generated
     */
    EAttribute getResultType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.hivdrc.hivpredrt.ResultType#getResult <em>Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Result</em>'.
     * @see org.hivdrc.hivpredrt.ResultType#getResult()
     * @see #getResultType()
     * @generated
     */
    EAttribute getResultType_Result();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    HivpredrtFactory getHivpredrtFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.hivdrc.hivpredrt.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hivdrc.hivpredrt.impl.DocumentRootImpl
         * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>HIV Pred RT Input</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__HIV_PRED_RT_INPUT = eINSTANCE.getDocumentRoot_HIVPredRTInput();

        /**
         * The meta object literal for the '<em><b>HIV Pred RT Output</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__HIV_PRED_RT_OUTPUT = eINSTANCE.getDocumentRoot_HIVPredRTOutput();

        /**
         * The meta object literal for the '{@link org.hivdrc.hivpredrt.impl.HIVPredRTInputTypeImpl <em>HIV Pred RT Input Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hivdrc.hivpredrt.impl.HIVPredRTInputTypeImpl
         * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getHIVPredRTInputType()
         * @generated
         */
        EClass HIV_PRED_RT_INPUT_TYPE = eINSTANCE.getHIVPredRTInputType();

        /**
         * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HIV_PRED_RT_INPUT_TYPE__SEQUENCE = eINSTANCE.getHIVPredRTInputType_Sequence();

        /**
         * The meta object literal for the '{@link org.hivdrc.hivpredrt.impl.HIVPredRTOutputTypeImpl <em>HIV Pred RT Output Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hivdrc.hivpredrt.impl.HIVPredRTOutputTypeImpl
         * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getHIVPredRTOutputType()
         * @generated
         */
        EClass HIV_PRED_RT_OUTPUT_TYPE = eINSTANCE.getHIVPredRTOutputType();

        /**
         * The meta object literal for the '<em><b>Mut Not In Dataset</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIV_PRED_RT_OUTPUT_TYPE__MUT_NOT_IN_DATASET = eINSTANCE.getHIVPredRTOutputType_MutNotInDataset();

        /**
         * The meta object literal for the '<em><b>Mut Outside Model Boundaries</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIV_PRED_RT_OUTPUT_TYPE__MUT_OUTSIDE_MODEL_BOUNDARIES = eINSTANCE.getHIVPredRTOutputType_MutOutsideModelBoundaries();

        /**
         * The meta object literal for the '<em><b>Mut Plus Mut Outside Model Boundaries</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES = eINSTANCE.getHIVPredRTOutputType_MutPlusMutOutsideModelBoundaries();

        /**
         * The meta object literal for the '<em><b>Mut Plus Wt Outside Model Boundaries</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES = eINSTANCE.getHIVPredRTOutputType_MutPlusWtOutsideModelBoundaries();

        /**
         * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIV_PRED_RT_OUTPUT_TYPE__RESULT = eINSTANCE.getHIVPredRTOutputType_Result();

        /**
         * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HIV_PRED_RT_OUTPUT_TYPE__ERROR_MESSAGE = eINSTANCE.getHIVPredRTOutputType_ErrorMessage();

        /**
         * The meta object literal for the '<em><b>Warning Message</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HIV_PRED_RT_OUTPUT_TYPE__WARNING_MESSAGE = eINSTANCE.getHIVPredRTOutputType_WarningMessage();

        /**
         * The meta object literal for the '{@link org.hivdrc.hivpredrt.impl.MutNotInDatasetTypeImpl <em>Mut Not In Dataset Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hivdrc.hivpredrt.impl.MutNotInDatasetTypeImpl
         * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getMutNotInDatasetType()
         * @generated
         */
        EClass MUT_NOT_IN_DATASET_TYPE = eINSTANCE.getMutNotInDatasetType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MUT_NOT_IN_DATASET_TYPE__NAME = eINSTANCE.getMutNotInDatasetType_Name();

        /**
         * The meta object literal for the '{@link org.hivdrc.hivpredrt.impl.MutOutsideModelBoundariesTypeImpl <em>Mut Outside Model Boundaries Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hivdrc.hivpredrt.impl.MutOutsideModelBoundariesTypeImpl
         * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getMutOutsideModelBoundariesType()
         * @generated
         */
        EClass MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE = eINSTANCE.getMutOutsideModelBoundariesType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE__NAME = eINSTANCE.getMutOutsideModelBoundariesType_Name();

        /**
         * The meta object literal for the '{@link org.hivdrc.hivpredrt.impl.MutPlusMutOutsideModelBoundariesTypeImpl <em>Mut Plus Mut Outside Model Boundaries Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hivdrc.hivpredrt.impl.MutPlusMutOutsideModelBoundariesTypeImpl
         * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getMutPlusMutOutsideModelBoundariesType()
         * @generated
         */
        EClass MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE = eINSTANCE.getMutPlusMutOutsideModelBoundariesType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE__NAME = eINSTANCE.getMutPlusMutOutsideModelBoundariesType_Name();

        /**
         * The meta object literal for the '{@link org.hivdrc.hivpredrt.impl.MutPlusWtOutsideModelBoundariesTypeImpl <em>Mut Plus Wt Outside Model Boundaries Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hivdrc.hivpredrt.impl.MutPlusWtOutsideModelBoundariesTypeImpl
         * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getMutPlusWtOutsideModelBoundariesType()
         * @generated
         */
        EClass MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES_TYPE = eINSTANCE.getMutPlusWtOutsideModelBoundariesType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES_TYPE__NAME = eINSTANCE.getMutPlusWtOutsideModelBoundariesType_Name();

        /**
         * The meta object literal for the '{@link org.hivdrc.hivpredrt.impl.ResultTypeImpl <em>Result Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.hivdrc.hivpredrt.impl.ResultTypeImpl
         * @see org.hivdrc.hivpredrt.impl.HivpredrtPackageImpl#getResultType()
         * @generated
         */
        EClass RESULT_TYPE = eINSTANCE.getResultType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_TYPE__NAME = eINSTANCE.getResultType_Name();

        /**
         * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_TYPE__RESULT = eINSTANCE.getResultType_Result();

    }

} //HivpredrtPackage
