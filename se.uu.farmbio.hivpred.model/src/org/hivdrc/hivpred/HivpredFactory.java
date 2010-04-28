/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpred;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.hivdrc.hivpred.HivpredPackage
 * @generated
 */
public interface HivpredFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HivpredFactory eINSTANCE = org.hivdrc.hivpred.impl.HivpredFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>HIV Pred Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HIV Pred Input Type</em>'.
	 * @generated
	 */
	HIVPredInputType createHIVPredInputType();

	/**
	 * Returns a new object of class '<em>HIV Pred Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HIV Pred Output Type</em>'.
	 * @generated
	 */
	HIVPredOutputType createHIVPredOutputType();

	/**
	 * Returns a new object of class '<em>Mut Not In Dataset Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mut Not In Dataset Type</em>'.
	 * @generated
	 */
	MutNotInDatasetType createMutNotInDatasetType();

	/**
	 * Returns a new object of class '<em>Mut Outside Model Boundaries Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mut Outside Model Boundaries Type</em>'.
	 * @generated
	 */
	MutOutsideModelBoundariesType createMutOutsideModelBoundariesType();

	/**
	 * Returns a new object of class '<em>Mut Plus Mut Outside Model Boundaries Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mut Plus Mut Outside Model Boundaries Type</em>'.
	 * @generated
	 */
	MutPlusMutOutsideModelBoundariesType createMutPlusMutOutsideModelBoundariesType();

	/**
	 * Returns a new object of class '<em>Mut Plus Wt Outside Model Boundaries Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mut Plus Wt Outside Model Boundaries Type</em>'.
	 * @generated
	 */
	MutPlusWtOutsideModelBoundariesType createMutPlusWtOutsideModelBoundariesType();

	/**
	 * Returns a new object of class '<em>Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Type</em>'.
	 * @generated
	 */
	ResultType createResultType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HivpredPackage getHivpredPackage();

} //HivpredFactory
