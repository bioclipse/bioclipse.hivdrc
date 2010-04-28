/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpred.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.hivdrc.hivpred.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HivpredFactoryImpl extends EFactoryImpl implements HivpredFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HivpredFactory init() {
		try {
			HivpredFactory theHivpredFactory = (HivpredFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.hivdrc.org/hivpred"); 
			if (theHivpredFactory != null) {
				return theHivpredFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HivpredFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HivpredFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HivpredPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case HivpredPackage.HIV_PRED_INPUT_TYPE: return createHIVPredInputType();
			case HivpredPackage.HIV_PRED_OUTPUT_TYPE: return createHIVPredOutputType();
			case HivpredPackage.MUT_NOT_IN_DATASET_TYPE: return createMutNotInDatasetType();
			case HivpredPackage.MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE: return createMutOutsideModelBoundariesType();
			case HivpredPackage.MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE: return createMutPlusMutOutsideModelBoundariesType();
			case HivpredPackage.MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES_TYPE: return createMutPlusWtOutsideModelBoundariesType();
			case HivpredPackage.RESULT_TYPE: return createResultType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HIVPredInputType createHIVPredInputType() {
		HIVPredInputTypeImpl hivPredInputType = new HIVPredInputTypeImpl();
		return hivPredInputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HIVPredOutputType createHIVPredOutputType() {
		HIVPredOutputTypeImpl hivPredOutputType = new HIVPredOutputTypeImpl();
		return hivPredOutputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutNotInDatasetType createMutNotInDatasetType() {
		MutNotInDatasetTypeImpl mutNotInDatasetType = new MutNotInDatasetTypeImpl();
		return mutNotInDatasetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutOutsideModelBoundariesType createMutOutsideModelBoundariesType() {
		MutOutsideModelBoundariesTypeImpl mutOutsideModelBoundariesType = new MutOutsideModelBoundariesTypeImpl();
		return mutOutsideModelBoundariesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutPlusMutOutsideModelBoundariesType createMutPlusMutOutsideModelBoundariesType() {
		MutPlusMutOutsideModelBoundariesTypeImpl mutPlusMutOutsideModelBoundariesType = new MutPlusMutOutsideModelBoundariesTypeImpl();
		return mutPlusMutOutsideModelBoundariesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutPlusWtOutsideModelBoundariesType createMutPlusWtOutsideModelBoundariesType() {
		MutPlusWtOutsideModelBoundariesTypeImpl mutPlusWtOutsideModelBoundariesType = new MutPlusWtOutsideModelBoundariesTypeImpl();
		return mutPlusWtOutsideModelBoundariesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType createResultType() {
		ResultTypeImpl resultType = new ResultTypeImpl();
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HivpredPackage getHivpredPackage() {
		return (HivpredPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HivpredPackage getPackage() {
		return HivpredPackage.eINSTANCE;
	}

} //HivpredFactoryImpl
