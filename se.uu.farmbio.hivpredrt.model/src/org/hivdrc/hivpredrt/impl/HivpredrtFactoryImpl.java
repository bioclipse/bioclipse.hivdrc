/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpredrt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.hivdrc.hivpredrt.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HivpredrtFactoryImpl extends EFactoryImpl implements HivpredrtFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static HivpredrtFactory init() {
        try {
            HivpredrtFactory theHivpredrtFactory = (HivpredrtFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.hivdrc.org/hivpredrt"); 
            if (theHivpredrtFactory != null) {
                return theHivpredrtFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new HivpredrtFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HivpredrtFactoryImpl() {
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
            case HivpredrtPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case HivpredrtPackage.HIV_PRED_RT_INPUT_TYPE: return createHIVPredRTInputType();
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE: return createHIVPredRTOutputType();
            case HivpredrtPackage.MUT_NOT_IN_DATASET_TYPE: return createMutNotInDatasetType();
            case HivpredrtPackage.MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE: return createMutOutsideModelBoundariesType();
            case HivpredrtPackage.MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE: return createMutPlusMutOutsideModelBoundariesType();
            case HivpredrtPackage.MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES_TYPE: return createMutPlusWtOutsideModelBoundariesType();
            case HivpredrtPackage.RESULT_TYPE: return createResultType();
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
    public HIVPredRTInputType createHIVPredRTInputType() {
        HIVPredRTInputTypeImpl hivPredRTInputType = new HIVPredRTInputTypeImpl();
        return hivPredRTInputType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HIVPredRTOutputType createHIVPredRTOutputType() {
        HIVPredRTOutputTypeImpl hivPredRTOutputType = new HIVPredRTOutputTypeImpl();
        return hivPredRTOutputType;
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
    public HivpredrtPackage getHivpredrtPackage() {
        return (HivpredrtPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static HivpredrtPackage getPackage() {
        return HivpredrtPackage.eINSTANCE;
    }

} //HivpredrtFactoryImpl
