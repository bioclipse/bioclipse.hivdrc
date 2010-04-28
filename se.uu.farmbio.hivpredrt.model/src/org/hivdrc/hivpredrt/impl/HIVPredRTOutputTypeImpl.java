/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpredrt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hivdrc.hivpredrt.HIVPredRTOutputType;
import org.hivdrc.hivpredrt.HivpredrtPackage;
import org.hivdrc.hivpredrt.MutNotInDatasetType;
import org.hivdrc.hivpredrt.MutOutsideModelBoundariesType;
import org.hivdrc.hivpredrt.MutPlusMutOutsideModelBoundariesType;
import org.hivdrc.hivpredrt.MutPlusWtOutsideModelBoundariesType;
import org.hivdrc.hivpredrt.ResultType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIV Pred RT Output Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hivdrc.hivpredrt.impl.HIVPredRTOutputTypeImpl#getMutNotInDataset <em>Mut Not In Dataset</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.impl.HIVPredRTOutputTypeImpl#getMutOutsideModelBoundaries <em>Mut Outside Model Boundaries</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.impl.HIVPredRTOutputTypeImpl#getMutPlusMutOutsideModelBoundaries <em>Mut Plus Mut Outside Model Boundaries</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.impl.HIVPredRTOutputTypeImpl#getMutPlusWtOutsideModelBoundaries <em>Mut Plus Wt Outside Model Boundaries</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.impl.HIVPredRTOutputTypeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.impl.HIVPredRTOutputTypeImpl#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.impl.HIVPredRTOutputTypeImpl#getWarningMessage <em>Warning Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HIVPredRTOutputTypeImpl extends EObjectImpl implements HIVPredRTOutputType {
    /**
     * The cached value of the '{@link #getMutNotInDataset() <em>Mut Not In Dataset</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMutNotInDataset()
     * @generated
     * @ordered
     */
    protected EList<MutNotInDatasetType> mutNotInDataset;

    /**
     * The cached value of the '{@link #getMutOutsideModelBoundaries() <em>Mut Outside Model Boundaries</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMutOutsideModelBoundaries()
     * @generated
     * @ordered
     */
    protected EList<MutOutsideModelBoundariesType> mutOutsideModelBoundaries;

    /**
     * The cached value of the '{@link #getMutPlusMutOutsideModelBoundaries() <em>Mut Plus Mut Outside Model Boundaries</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMutPlusMutOutsideModelBoundaries()
     * @generated
     * @ordered
     */
    protected EList<MutPlusMutOutsideModelBoundariesType> mutPlusMutOutsideModelBoundaries;

    /**
     * The cached value of the '{@link #getMutPlusWtOutsideModelBoundaries() <em>Mut Plus Wt Outside Model Boundaries</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMutPlusWtOutsideModelBoundaries()
     * @generated
     * @ordered
     */
    protected EList<MutPlusWtOutsideModelBoundariesType> mutPlusWtOutsideModelBoundaries;

    /**
     * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResult()
     * @generated
     * @ordered
     */
    protected EList<ResultType> result;

    /**
     * The default value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErrorMessage()
     * @generated
     * @ordered
     */
    protected static final String ERROR_MESSAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErrorMessage()
     * @generated
     * @ordered
     */
    protected String errorMessage = ERROR_MESSAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getWarningMessage() <em>Warning Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWarningMessage()
     * @generated
     * @ordered
     */
    protected static final String WARNING_MESSAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWarningMessage() <em>Warning Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWarningMessage()
     * @generated
     * @ordered
     */
    protected String warningMessage = WARNING_MESSAGE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HIVPredRTOutputTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return HivpredrtPackage.Literals.HIV_PRED_RT_OUTPUT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MutNotInDatasetType> getMutNotInDataset() {
        if (mutNotInDataset == null) {
            mutNotInDataset = new EObjectContainmentEList<MutNotInDatasetType>(MutNotInDatasetType.class, this, HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_NOT_IN_DATASET);
        }
        return mutNotInDataset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MutOutsideModelBoundariesType> getMutOutsideModelBoundaries() {
        if (mutOutsideModelBoundaries == null) {
            mutOutsideModelBoundaries = new EObjectContainmentEList<MutOutsideModelBoundariesType>(MutOutsideModelBoundariesType.class, this, HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_OUTSIDE_MODEL_BOUNDARIES);
        }
        return mutOutsideModelBoundaries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MutPlusMutOutsideModelBoundariesType> getMutPlusMutOutsideModelBoundaries() {
        if (mutPlusMutOutsideModelBoundaries == null) {
            mutPlusMutOutsideModelBoundaries = new EObjectContainmentEList<MutPlusMutOutsideModelBoundariesType>(MutPlusMutOutsideModelBoundariesType.class, this, HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES);
        }
        return mutPlusMutOutsideModelBoundaries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MutPlusWtOutsideModelBoundariesType> getMutPlusWtOutsideModelBoundaries() {
        if (mutPlusWtOutsideModelBoundaries == null) {
            mutPlusWtOutsideModelBoundaries = new EObjectContainmentEList<MutPlusWtOutsideModelBoundariesType>(MutPlusWtOutsideModelBoundariesType.class, this, HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES);
        }
        return mutPlusWtOutsideModelBoundaries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ResultType> getResult() {
        if (result == null) {
            result = new EObjectContainmentEList<ResultType>(ResultType.class, this, HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__RESULT);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setErrorMessage(String newErrorMessage) {
        String oldErrorMessage = errorMessage;
        errorMessage = newErrorMessage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__ERROR_MESSAGE, oldErrorMessage, errorMessage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getWarningMessage() {
        return warningMessage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWarningMessage(String newWarningMessage) {
        String oldWarningMessage = warningMessage;
        warningMessage = newWarningMessage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__WARNING_MESSAGE, oldWarningMessage, warningMessage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_NOT_IN_DATASET:
                return ((InternalEList<?>)getMutNotInDataset()).basicRemove(otherEnd, msgs);
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_OUTSIDE_MODEL_BOUNDARIES:
                return ((InternalEList<?>)getMutOutsideModelBoundaries()).basicRemove(otherEnd, msgs);
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES:
                return ((InternalEList<?>)getMutPlusMutOutsideModelBoundaries()).basicRemove(otherEnd, msgs);
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES:
                return ((InternalEList<?>)getMutPlusWtOutsideModelBoundaries()).basicRemove(otherEnd, msgs);
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__RESULT:
                return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_NOT_IN_DATASET:
                return getMutNotInDataset();
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_OUTSIDE_MODEL_BOUNDARIES:
                return getMutOutsideModelBoundaries();
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES:
                return getMutPlusMutOutsideModelBoundaries();
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES:
                return getMutPlusWtOutsideModelBoundaries();
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__RESULT:
                return getResult();
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__ERROR_MESSAGE:
                return getErrorMessage();
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__WARNING_MESSAGE:
                return getWarningMessage();
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
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_NOT_IN_DATASET:
                getMutNotInDataset().clear();
                getMutNotInDataset().addAll((Collection<? extends MutNotInDatasetType>)newValue);
                return;
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_OUTSIDE_MODEL_BOUNDARIES:
                getMutOutsideModelBoundaries().clear();
                getMutOutsideModelBoundaries().addAll((Collection<? extends MutOutsideModelBoundariesType>)newValue);
                return;
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES:
                getMutPlusMutOutsideModelBoundaries().clear();
                getMutPlusMutOutsideModelBoundaries().addAll((Collection<? extends MutPlusMutOutsideModelBoundariesType>)newValue);
                return;
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES:
                getMutPlusWtOutsideModelBoundaries().clear();
                getMutPlusWtOutsideModelBoundaries().addAll((Collection<? extends MutPlusWtOutsideModelBoundariesType>)newValue);
                return;
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__RESULT:
                getResult().clear();
                getResult().addAll((Collection<? extends ResultType>)newValue);
                return;
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__ERROR_MESSAGE:
                setErrorMessage((String)newValue);
                return;
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__WARNING_MESSAGE:
                setWarningMessage((String)newValue);
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
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_NOT_IN_DATASET:
                getMutNotInDataset().clear();
                return;
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_OUTSIDE_MODEL_BOUNDARIES:
                getMutOutsideModelBoundaries().clear();
                return;
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES:
                getMutPlusMutOutsideModelBoundaries().clear();
                return;
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES:
                getMutPlusWtOutsideModelBoundaries().clear();
                return;
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__RESULT:
                getResult().clear();
                return;
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__ERROR_MESSAGE:
                setErrorMessage(ERROR_MESSAGE_EDEFAULT);
                return;
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__WARNING_MESSAGE:
                setWarningMessage(WARNING_MESSAGE_EDEFAULT);
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
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_NOT_IN_DATASET:
                return mutNotInDataset != null && !mutNotInDataset.isEmpty();
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_OUTSIDE_MODEL_BOUNDARIES:
                return mutOutsideModelBoundaries != null && !mutOutsideModelBoundaries.isEmpty();
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES:
                return mutPlusMutOutsideModelBoundaries != null && !mutPlusMutOutsideModelBoundaries.isEmpty();
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES:
                return mutPlusWtOutsideModelBoundaries != null && !mutPlusWtOutsideModelBoundaries.isEmpty();
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__RESULT:
                return result != null && !result.isEmpty();
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__ERROR_MESSAGE:
                return ERROR_MESSAGE_EDEFAULT == null ? errorMessage != null : !ERROR_MESSAGE_EDEFAULT.equals(errorMessage);
            case HivpredrtPackage.HIV_PRED_RT_OUTPUT_TYPE__WARNING_MESSAGE:
                return WARNING_MESSAGE_EDEFAULT == null ? warningMessage != null : !WARNING_MESSAGE_EDEFAULT.equals(warningMessage);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer resultBuffer = new StringBuffer("");
        if ("".compareTo(errorMessage)!=0){
          resultBuffer.append("Error: ");
          resultBuffer.append(errorMessage);
        }
        else if (result.size()>0){
          resultBuffer.append("Result: \n");
          for (ResultType t : result){
            resultBuffer.append("\t" + t.getName() + ": " + t.getResult() + "\n");
          }
          if (warningMessage!=null && "".compareTo(warningMessage)!=0){
            resultBuffer.append("\n");
            resultBuffer.append("Warning: ");
            resultBuffer.append(warningMessage);
          }
          if (mutNotInDataset!=null && 
              mutNotInDataset.size()>0){
            resultBuffer.append("\n");
            resultBuffer.append("Mutations not in dataset: ");
            for (MutNotInDatasetType t : mutNotInDataset){
              resultBuffer.append(t.getName() + ", ");
            }
          }
          if (mutOutsideModelBoundaries!=null && 
              mutOutsideModelBoundaries.size()>0){
            resultBuffer.append("\n");
            resultBuffer.append("Mutations outside model boundaries: ");
            for (MutOutsideModelBoundariesType t : mutOutsideModelBoundaries){
              resultBuffer.append(t.getName() + ", ");
            }
          }
          if (mutPlusMutOutsideModelBoundaries!=null && 
              mutPlusMutOutsideModelBoundaries.size()>0){
            resultBuffer.append("\n");
            resultBuffer.append("Mutations plus mutations outside model boundaries: ");
            for (MutPlusMutOutsideModelBoundariesType t: mutPlusMutOutsideModelBoundaries){
              resultBuffer.append(t.getName() + ", ");
            }
          }
          if (mutPlusWtOutsideModelBoundaries!=null && 
              mutPlusWtOutsideModelBoundaries.size()>0){
            resultBuffer.append("\n");
            resultBuffer.append("Mutations plus wildtype outside model boundaries: ");
            for (MutPlusWtOutsideModelBoundariesType t: mutPlusWtOutsideModelBoundaries){
              resultBuffer.append(t.getName() + ", ");
            }
          }
          resultBuffer.append("\n");
        }

        return resultBuffer.toString();
    }

} //HIVPredRTOutputTypeImpl
