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

import org.hivdrc.hivpredrt.HivpredrtPackage;
import org.hivdrc.hivpredrt.ResultType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hivdrc.hivpredrt.impl.ResultTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hivdrc.hivpredrt.impl.ResultTypeImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultTypeImpl extends EObjectImpl implements ResultType {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResult()
     * @generated
     * @ordered
     */
    protected static final double RESULT_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResult()
     * @generated
     * @ordered
     */
    protected double result = RESULT_EDEFAULT;

    /**
     * This is true if the Result attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean resultESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResultTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return HivpredrtPackage.Literals.RESULT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HivpredrtPackage.RESULT_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getResult() {
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResult(double newResult) {
        double oldResult = result;
        result = newResult;
        boolean oldResultESet = resultESet;
        resultESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HivpredrtPackage.RESULT_TYPE__RESULT, oldResult, result, !oldResultESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetResult() {
        double oldResult = result;
        boolean oldResultESet = resultESet;
        result = RESULT_EDEFAULT;
        resultESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, HivpredrtPackage.RESULT_TYPE__RESULT, oldResult, RESULT_EDEFAULT, oldResultESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetResult() {
        return resultESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case HivpredrtPackage.RESULT_TYPE__NAME:
                return getName();
            case HivpredrtPackage.RESULT_TYPE__RESULT:
                return new Double(getResult());
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
            case HivpredrtPackage.RESULT_TYPE__NAME:
                setName((String)newValue);
                return;
            case HivpredrtPackage.RESULT_TYPE__RESULT:
                setResult(((Double)newValue).doubleValue());
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
            case HivpredrtPackage.RESULT_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case HivpredrtPackage.RESULT_TYPE__RESULT:
                unsetResult();
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
            case HivpredrtPackage.RESULT_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case HivpredrtPackage.RESULT_TYPE__RESULT:
                return isSetResult();
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
        result.append(" (name: ");
        result.append(name);
        result.append(", result: ");
        if (resultESet) result.append(result); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ResultTypeImpl
