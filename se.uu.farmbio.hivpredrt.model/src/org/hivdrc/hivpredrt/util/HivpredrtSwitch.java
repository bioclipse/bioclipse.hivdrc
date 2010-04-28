/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpredrt.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.hivdrc.hivpredrt.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.hivdrc.hivpredrt.HivpredrtPackage
 * @generated
 */
public class HivpredrtSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static HivpredrtPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HivpredrtSwitch() {
        if (modelPackage == null) {
            modelPackage = HivpredrtPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case HivpredrtPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case HivpredrtPackage.HIV_PRED_RT_INPUT_TYPE: {
                HIVPredRTInputType hivPredRTInputType = (HIVPredRTInputType)theEObject;
                T result = caseHIVPredRTInputType(hivPredRTInputType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE: {
                HIVPredRTOutputType hivPredRTOutputType = (HIVPredRTOutputType)theEObject;
                T result = caseHIVPredRTOutputType(hivPredRTOutputType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case HivpredrtPackage.MUT_NOT_IN_DATASET_TYPE: {
                MutNotInDatasetType mutNotInDatasetType = (MutNotInDatasetType)theEObject;
                T result = caseMutNotInDatasetType(mutNotInDatasetType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case HivpredrtPackage.MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE: {
                MutOutsideModelBoundariesType mutOutsideModelBoundariesType = (MutOutsideModelBoundariesType)theEObject;
                T result = caseMutOutsideModelBoundariesType(mutOutsideModelBoundariesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case HivpredrtPackage.MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE: {
                MutPlusMutOutsideModelBoundariesType mutPlusMutOutsideModelBoundariesType = (MutPlusMutOutsideModelBoundariesType)theEObject;
                T result = caseMutPlusMutOutsideModelBoundariesType(mutPlusMutOutsideModelBoundariesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case HivpredrtPackage.MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES_TYPE: {
                MutPlusWtOutsideModelBoundariesType mutPlusWtOutsideModelBoundariesType = (MutPlusWtOutsideModelBoundariesType)theEObject;
                T result = caseMutPlusWtOutsideModelBoundariesType(mutPlusWtOutsideModelBoundariesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case HivpredrtPackage.RESULT_TYPE: {
                ResultType resultType = (ResultType)theEObject;
                T result = caseResultType(resultType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>HIV Pred RT Input Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>HIV Pred RT Input Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHIVPredRTInputType(HIVPredRTInputType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>HIV Pred RT Output Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>HIV Pred RT Output Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHIVPredRTOutputType(HIVPredRTOutputType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mut Not In Dataset Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mut Not In Dataset Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMutNotInDatasetType(MutNotInDatasetType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mut Outside Model Boundaries Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mut Outside Model Boundaries Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMutOutsideModelBoundariesType(MutOutsideModelBoundariesType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mut Plus Mut Outside Model Boundaries Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mut Plus Mut Outside Model Boundaries Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMutPlusMutOutsideModelBoundariesType(MutPlusMutOutsideModelBoundariesType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mut Plus Wt Outside Model Boundaries Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mut Plus Wt Outside Model Boundaries Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMutPlusWtOutsideModelBoundariesType(MutPlusWtOutsideModelBoundariesType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Result Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Result Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResultType(ResultType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //HivpredrtSwitch
