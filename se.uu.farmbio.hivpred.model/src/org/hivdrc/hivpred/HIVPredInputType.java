/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpred;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIV Pred Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hivdrc.hivpred.HIVPredInputType#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hivdrc.hivpred.HivpredPackage#getHIVPredInputType()
 * @model extendedMetaData="name='HIVPredInputType' kind='empty'"
 * @generated
 */
public interface HIVPredInputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(String)
	 * @see org.hivdrc.hivpred.HivpredPackage#getHIVPredInputType_Sequence()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sequence'"
	 * @generated
	 */
	String getSequence();

	/**
	 * Sets the value of the '{@link org.hivdrc.hivpred.HIVPredInputType#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(String value);

} // HIVPredInputType
