/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpred;

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
 * @see org.hivdrc.hivpred.HivpredFactory
 * @model kind="package"
 * @generated
 */
public interface HivpredPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hivpred";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.hivdrc.org/hivpred";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hivpred";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HivpredPackage eINSTANCE = org.hivdrc.hivpred.impl.HivpredPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hivdrc.hivpred.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hivdrc.hivpred.impl.DocumentRootImpl
	 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>HIV Pred Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HIV_PRED_INPUT = 3;

	/**
	 * The feature id for the '<em><b>HIV Pred Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HIV_PRED_OUTPUT = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.hivdrc.hivpred.impl.HIVPredInputTypeImpl <em>HIV Pred Input Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hivdrc.hivpred.impl.HIVPredInputTypeImpl
	 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getHIVPredInputType()
	 * @generated
	 */
	int HIV_PRED_INPUT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIV_PRED_INPUT_TYPE__SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>HIV Pred Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIV_PRED_INPUT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hivdrc.hivpred.impl.HIVPredOutputTypeImpl <em>HIV Pred Output Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hivdrc.hivpred.impl.HIVPredOutputTypeImpl
	 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getHIVPredOutputType()
	 * @generated
	 */
	int HIV_PRED_OUTPUT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mut Not In Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIV_PRED_OUTPUT_TYPE__MUT_NOT_IN_DATASET = 0;

	/**
	 * The feature id for the '<em><b>Mut Outside Model Boundaries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIV_PRED_OUTPUT_TYPE__MUT_OUTSIDE_MODEL_BOUNDARIES = 1;

	/**
	 * The feature id for the '<em><b>Mut Plus Mut Outside Model Boundaries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIV_PRED_OUTPUT_TYPE__MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES = 2;

	/**
	 * The feature id for the '<em><b>Mut Plus Wt Outside Model Boundaries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIV_PRED_OUTPUT_TYPE__MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES = 3;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIV_PRED_OUTPUT_TYPE__RESULT = 4;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIV_PRED_OUTPUT_TYPE__ERROR_MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Warning Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIV_PRED_OUTPUT_TYPE__WARNING_MESSAGE = 6;

	/**
	 * The number of structural features of the '<em>HIV Pred Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIV_PRED_OUTPUT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.hivdrc.hivpred.impl.MutNotInDatasetTypeImpl <em>Mut Not In Dataset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hivdrc.hivpred.impl.MutNotInDatasetTypeImpl
	 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getMutNotInDatasetType()
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
	 * The meta object id for the '{@link org.hivdrc.hivpred.impl.MutOutsideModelBoundariesTypeImpl <em>Mut Outside Model Boundaries Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hivdrc.hivpred.impl.MutOutsideModelBoundariesTypeImpl
	 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getMutOutsideModelBoundariesType()
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
	 * The meta object id for the '{@link org.hivdrc.hivpred.impl.MutPlusMutOutsideModelBoundariesTypeImpl <em>Mut Plus Mut Outside Model Boundaries Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hivdrc.hivpred.impl.MutPlusMutOutsideModelBoundariesTypeImpl
	 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getMutPlusMutOutsideModelBoundariesType()
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
	 * The meta object id for the '{@link org.hivdrc.hivpred.impl.MutPlusWtOutsideModelBoundariesTypeImpl <em>Mut Plus Wt Outside Model Boundaries Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hivdrc.hivpred.impl.MutPlusWtOutsideModelBoundariesTypeImpl
	 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getMutPlusWtOutsideModelBoundariesType()
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
	 * The meta object id for the '{@link org.hivdrc.hivpred.impl.ResultTypeImpl <em>Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hivdrc.hivpred.impl.ResultTypeImpl
	 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getResultType()
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
	 * Returns the meta object for class '{@link org.hivdrc.hivpred.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.hivdrc.hivpred.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.hivdrc.hivpred.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.hivdrc.hivpred.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.hivdrc.hivpred.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.hivdrc.hivpred.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.hivdrc.hivpred.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.hivdrc.hivpred.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hivdrc.hivpred.DocumentRoot#getHIVPredInput <em>HIV Pred Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HIV Pred Input</em>'.
	 * @see org.hivdrc.hivpred.DocumentRoot#getHIVPredInput()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HIVPredInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.hivdrc.hivpred.DocumentRoot#getHIVPredOutput <em>HIV Pred Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HIV Pred Output</em>'.
	 * @see org.hivdrc.hivpred.DocumentRoot#getHIVPredOutput()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HIVPredOutput();

	/**
	 * Returns the meta object for class '{@link org.hivdrc.hivpred.HIVPredInputType <em>HIV Pred Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIV Pred Input Type</em>'.
	 * @see org.hivdrc.hivpred.HIVPredInputType
	 * @generated
	 */
	EClass getHIVPredInputType();

	/**
	 * Returns the meta object for the attribute '{@link org.hivdrc.hivpred.HIVPredInputType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see org.hivdrc.hivpred.HIVPredInputType#getSequence()
	 * @see #getHIVPredInputType()
	 * @generated
	 */
	EAttribute getHIVPredInputType_Sequence();

	/**
	 * Returns the meta object for class '{@link org.hivdrc.hivpred.HIVPredOutputType <em>HIV Pred Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIV Pred Output Type</em>'.
	 * @see org.hivdrc.hivpred.HIVPredOutputType
	 * @generated
	 */
	EClass getHIVPredOutputType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hivdrc.hivpred.HIVPredOutputType#getMutNotInDataset <em>Mut Not In Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mut Not In Dataset</em>'.
	 * @see org.hivdrc.hivpred.HIVPredOutputType#getMutNotInDataset()
	 * @see #getHIVPredOutputType()
	 * @generated
	 */
	EReference getHIVPredOutputType_MutNotInDataset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hivdrc.hivpred.HIVPredOutputType#getMutOutsideModelBoundaries <em>Mut Outside Model Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mut Outside Model Boundaries</em>'.
	 * @see org.hivdrc.hivpred.HIVPredOutputType#getMutOutsideModelBoundaries()
	 * @see #getHIVPredOutputType()
	 * @generated
	 */
	EReference getHIVPredOutputType_MutOutsideModelBoundaries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hivdrc.hivpred.HIVPredOutputType#getMutPlusMutOutsideModelBoundaries <em>Mut Plus Mut Outside Model Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mut Plus Mut Outside Model Boundaries</em>'.
	 * @see org.hivdrc.hivpred.HIVPredOutputType#getMutPlusMutOutsideModelBoundaries()
	 * @see #getHIVPredOutputType()
	 * @generated
	 */
	EReference getHIVPredOutputType_MutPlusMutOutsideModelBoundaries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hivdrc.hivpred.HIVPredOutputType#getMutPlusWtOutsideModelBoundaries <em>Mut Plus Wt Outside Model Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mut Plus Wt Outside Model Boundaries</em>'.
	 * @see org.hivdrc.hivpred.HIVPredOutputType#getMutPlusWtOutsideModelBoundaries()
	 * @see #getHIVPredOutputType()
	 * @generated
	 */
	EReference getHIVPredOutputType_MutPlusWtOutsideModelBoundaries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hivdrc.hivpred.HIVPredOutputType#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see org.hivdrc.hivpred.HIVPredOutputType#getResult()
	 * @see #getHIVPredOutputType()
	 * @generated
	 */
	EReference getHIVPredOutputType_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.hivdrc.hivpred.HIVPredOutputType#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see org.hivdrc.hivpred.HIVPredOutputType#getErrorMessage()
	 * @see #getHIVPredOutputType()
	 * @generated
	 */
	EAttribute getHIVPredOutputType_ErrorMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.hivdrc.hivpred.HIVPredOutputType#getWarningMessage <em>Warning Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warning Message</em>'.
	 * @see org.hivdrc.hivpred.HIVPredOutputType#getWarningMessage()
	 * @see #getHIVPredOutputType()
	 * @generated
	 */
	EAttribute getHIVPredOutputType_WarningMessage();

	/**
	 * Returns the meta object for class '{@link org.hivdrc.hivpred.MutNotInDatasetType <em>Mut Not In Dataset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mut Not In Dataset Type</em>'.
	 * @see org.hivdrc.hivpred.MutNotInDatasetType
	 * @generated
	 */
	EClass getMutNotInDatasetType();

	/**
	 * Returns the meta object for the attribute '{@link org.hivdrc.hivpred.MutNotInDatasetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hivdrc.hivpred.MutNotInDatasetType#getName()
	 * @see #getMutNotInDatasetType()
	 * @generated
	 */
	EAttribute getMutNotInDatasetType_Name();

	/**
	 * Returns the meta object for class '{@link org.hivdrc.hivpred.MutOutsideModelBoundariesType <em>Mut Outside Model Boundaries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mut Outside Model Boundaries Type</em>'.
	 * @see org.hivdrc.hivpred.MutOutsideModelBoundariesType
	 * @generated
	 */
	EClass getMutOutsideModelBoundariesType();

	/**
	 * Returns the meta object for the attribute '{@link org.hivdrc.hivpred.MutOutsideModelBoundariesType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hivdrc.hivpred.MutOutsideModelBoundariesType#getName()
	 * @see #getMutOutsideModelBoundariesType()
	 * @generated
	 */
	EAttribute getMutOutsideModelBoundariesType_Name();

	/**
	 * Returns the meta object for class '{@link org.hivdrc.hivpred.MutPlusMutOutsideModelBoundariesType <em>Mut Plus Mut Outside Model Boundaries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mut Plus Mut Outside Model Boundaries Type</em>'.
	 * @see org.hivdrc.hivpred.MutPlusMutOutsideModelBoundariesType
	 * @generated
	 */
	EClass getMutPlusMutOutsideModelBoundariesType();

	/**
	 * Returns the meta object for the attribute '{@link org.hivdrc.hivpred.MutPlusMutOutsideModelBoundariesType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hivdrc.hivpred.MutPlusMutOutsideModelBoundariesType#getName()
	 * @see #getMutPlusMutOutsideModelBoundariesType()
	 * @generated
	 */
	EAttribute getMutPlusMutOutsideModelBoundariesType_Name();

	/**
	 * Returns the meta object for class '{@link org.hivdrc.hivpred.MutPlusWtOutsideModelBoundariesType <em>Mut Plus Wt Outside Model Boundaries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mut Plus Wt Outside Model Boundaries Type</em>'.
	 * @see org.hivdrc.hivpred.MutPlusWtOutsideModelBoundariesType
	 * @generated
	 */
	EClass getMutPlusWtOutsideModelBoundariesType();

	/**
	 * Returns the meta object for the attribute '{@link org.hivdrc.hivpred.MutPlusWtOutsideModelBoundariesType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hivdrc.hivpred.MutPlusWtOutsideModelBoundariesType#getName()
	 * @see #getMutPlusWtOutsideModelBoundariesType()
	 * @generated
	 */
	EAttribute getMutPlusWtOutsideModelBoundariesType_Name();

	/**
	 * Returns the meta object for class '{@link org.hivdrc.hivpred.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Type</em>'.
	 * @see org.hivdrc.hivpred.ResultType
	 * @generated
	 */
	EClass getResultType();

	/**
	 * Returns the meta object for the attribute '{@link org.hivdrc.hivpred.ResultType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hivdrc.hivpred.ResultType#getName()
	 * @see #getResultType()
	 * @generated
	 */
	EAttribute getResultType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hivdrc.hivpred.ResultType#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.hivdrc.hivpred.ResultType#getResult()
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
	HivpredFactory getHivpredFactory();

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
		 * The meta object literal for the '{@link org.hivdrc.hivpred.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hivdrc.hivpred.impl.DocumentRootImpl
		 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>HIV Pred Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HIV_PRED_INPUT = eINSTANCE.getDocumentRoot_HIVPredInput();

		/**
		 * The meta object literal for the '<em><b>HIV Pred Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HIV_PRED_OUTPUT = eINSTANCE.getDocumentRoot_HIVPredOutput();

		/**
		 * The meta object literal for the '{@link org.hivdrc.hivpred.impl.HIVPredInputTypeImpl <em>HIV Pred Input Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hivdrc.hivpred.impl.HIVPredInputTypeImpl
		 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getHIVPredInputType()
		 * @generated
		 */
		EClass HIV_PRED_INPUT_TYPE = eINSTANCE.getHIVPredInputType();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIV_PRED_INPUT_TYPE__SEQUENCE = eINSTANCE.getHIVPredInputType_Sequence();

		/**
		 * The meta object literal for the '{@link org.hivdrc.hivpred.impl.HIVPredOutputTypeImpl <em>HIV Pred Output Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hivdrc.hivpred.impl.HIVPredOutputTypeImpl
		 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getHIVPredOutputType()
		 * @generated
		 */
		EClass HIV_PRED_OUTPUT_TYPE = eINSTANCE.getHIVPredOutputType();

		/**
		 * The meta object literal for the '<em><b>Mut Not In Dataset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIV_PRED_OUTPUT_TYPE__MUT_NOT_IN_DATASET = eINSTANCE.getHIVPredOutputType_MutNotInDataset();

		/**
		 * The meta object literal for the '<em><b>Mut Outside Model Boundaries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIV_PRED_OUTPUT_TYPE__MUT_OUTSIDE_MODEL_BOUNDARIES = eINSTANCE.getHIVPredOutputType_MutOutsideModelBoundaries();

		/**
		 * The meta object literal for the '<em><b>Mut Plus Mut Outside Model Boundaries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIV_PRED_OUTPUT_TYPE__MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES = eINSTANCE.getHIVPredOutputType_MutPlusMutOutsideModelBoundaries();

		/**
		 * The meta object literal for the '<em><b>Mut Plus Wt Outside Model Boundaries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIV_PRED_OUTPUT_TYPE__MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES = eINSTANCE.getHIVPredOutputType_MutPlusWtOutsideModelBoundaries();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIV_PRED_OUTPUT_TYPE__RESULT = eINSTANCE.getHIVPredOutputType_Result();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIV_PRED_OUTPUT_TYPE__ERROR_MESSAGE = eINSTANCE.getHIVPredOutputType_ErrorMessage();

		/**
		 * The meta object literal for the '<em><b>Warning Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIV_PRED_OUTPUT_TYPE__WARNING_MESSAGE = eINSTANCE.getHIVPredOutputType_WarningMessage();

		/**
		 * The meta object literal for the '{@link org.hivdrc.hivpred.impl.MutNotInDatasetTypeImpl <em>Mut Not In Dataset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hivdrc.hivpred.impl.MutNotInDatasetTypeImpl
		 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getMutNotInDatasetType()
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
		 * The meta object literal for the '{@link org.hivdrc.hivpred.impl.MutOutsideModelBoundariesTypeImpl <em>Mut Outside Model Boundaries Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hivdrc.hivpred.impl.MutOutsideModelBoundariesTypeImpl
		 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getMutOutsideModelBoundariesType()
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
		 * The meta object literal for the '{@link org.hivdrc.hivpred.impl.MutPlusMutOutsideModelBoundariesTypeImpl <em>Mut Plus Mut Outside Model Boundaries Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hivdrc.hivpred.impl.MutPlusMutOutsideModelBoundariesTypeImpl
		 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getMutPlusMutOutsideModelBoundariesType()
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
		 * The meta object literal for the '{@link org.hivdrc.hivpred.impl.MutPlusWtOutsideModelBoundariesTypeImpl <em>Mut Plus Wt Outside Model Boundaries Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hivdrc.hivpred.impl.MutPlusWtOutsideModelBoundariesTypeImpl
		 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getMutPlusWtOutsideModelBoundariesType()
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
		 * The meta object literal for the '{@link org.hivdrc.hivpred.impl.ResultTypeImpl <em>Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hivdrc.hivpred.impl.ResultTypeImpl
		 * @see org.hivdrc.hivpred.impl.HivpredPackageImpl#getResultType()
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

} //HivpredPackage
