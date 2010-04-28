/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpredrt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hivdrc.hivpredrt.HIVPredRTInputType;
import org.hivdrc.hivpredrt.HivpredrtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIV Pred RT Input Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hivdrc.hivpredrt.impl.HIVPredRTInputTypeImpl#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HIVPredRTInputTypeImpl extends EObjectImpl implements HIVPredRTInputType {
    /**
     * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequence()
     * @generated
     * @ordered
     */
    protected static final String SEQUENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequence()
     * @generated
     * @ordered
     */
    protected String sequence = SEQUENCE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HIVPredRTInputTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return HivpredrtPackage.Literals.HIV_PRED_RT_INPUT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSequence(String newSequence) {
        String oldSequence = sequence;
        sequence = newSequence;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HivpredrtPackage.HIV_PRED_RT_INPUT_TYPE__SEQUENCE, oldSequence, sequence));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case HivpredrtPackage.HIV_PRED_RT_INPUT_TYPE__SEQUENCE:
                return getSequence();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case HivpredrtPackage.HIV_PRED_RT_INPUT_TYPE__SEQUENCE:
                setSequence((String)newValue);
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
            case HivpredrtPackage.HIV_PRED_RT_INPUT_TYPE__SEQUENCE:
                setSequence(SEQUENCE_EDEFAULT);
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
            case HivpredrtPackage.HIV_PRED_RT_INPUT_TYPE__SEQUENCE:
                return SEQUENCE_EDEFAULT == null ? sequence != null : !SEQUENCE_EDEFAULT.equals(sequence);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (sequence: ");
        result.append(sequence);
        result.append(')');
        return result.toString();
    }

} //HIVPredRTInputTypeImpl
