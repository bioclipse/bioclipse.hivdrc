/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpred.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.hivdrc.hivpred.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hivdrc.hivpred.HivpredPackage
 * @generated
 */
public class HivpredAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HivpredPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HivpredAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HivpredPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HivpredSwitch<Adapter> modelSwitch =
		new HivpredSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseHIVPredInputType(HIVPredInputType object) {
				return createHIVPredInputTypeAdapter();
			}
			@Override
			public Adapter caseHIVPredOutputType(HIVPredOutputType object) {
				return createHIVPredOutputTypeAdapter();
			}
			@Override
			public Adapter caseMutNotInDatasetType(MutNotInDatasetType object) {
				return createMutNotInDatasetTypeAdapter();
			}
			@Override
			public Adapter caseMutOutsideModelBoundariesType(MutOutsideModelBoundariesType object) {
				return createMutOutsideModelBoundariesTypeAdapter();
			}
			@Override
			public Adapter caseMutPlusMutOutsideModelBoundariesType(MutPlusMutOutsideModelBoundariesType object) {
				return createMutPlusMutOutsideModelBoundariesTypeAdapter();
			}
			@Override
			public Adapter caseMutPlusWtOutsideModelBoundariesType(MutPlusWtOutsideModelBoundariesType object) {
				return createMutPlusWtOutsideModelBoundariesTypeAdapter();
			}
			@Override
			public Adapter caseResultType(ResultType object) {
				return createResultTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.hivdrc.hivpred.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hivdrc.hivpred.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hivdrc.hivpred.HIVPredInputType <em>HIV Pred Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hivdrc.hivpred.HIVPredInputType
	 * @generated
	 */
	public Adapter createHIVPredInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hivdrc.hivpred.HIVPredOutputType <em>HIV Pred Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hivdrc.hivpred.HIVPredOutputType
	 * @generated
	 */
	public Adapter createHIVPredOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hivdrc.hivpred.MutNotInDatasetType <em>Mut Not In Dataset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hivdrc.hivpred.MutNotInDatasetType
	 * @generated
	 */
	public Adapter createMutNotInDatasetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hivdrc.hivpred.MutOutsideModelBoundariesType <em>Mut Outside Model Boundaries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hivdrc.hivpred.MutOutsideModelBoundariesType
	 * @generated
	 */
	public Adapter createMutOutsideModelBoundariesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hivdrc.hivpred.MutPlusMutOutsideModelBoundariesType <em>Mut Plus Mut Outside Model Boundaries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hivdrc.hivpred.MutPlusMutOutsideModelBoundariesType
	 * @generated
	 */
	public Adapter createMutPlusMutOutsideModelBoundariesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hivdrc.hivpred.MutPlusWtOutsideModelBoundariesType <em>Mut Plus Wt Outside Model Boundaries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hivdrc.hivpred.MutPlusWtOutsideModelBoundariesType
	 * @generated
	 */
	public Adapter createMutPlusWtOutsideModelBoundariesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hivdrc.hivpred.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hivdrc.hivpred.ResultType
	 * @generated
	 */
	public Adapter createResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HivpredAdapterFactory
