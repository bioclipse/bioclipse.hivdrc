/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpred.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.hivdrc.hivpred.DocumentRoot;
import org.hivdrc.hivpred.HIVPredInputType;
import org.hivdrc.hivpred.HIVPredOutputType;
import org.hivdrc.hivpred.HivpredFactory;
import org.hivdrc.hivpred.HivpredPackage;
import org.hivdrc.hivpred.MutNotInDatasetType;
import org.hivdrc.hivpred.MutOutsideModelBoundariesType;
import org.hivdrc.hivpred.MutPlusMutOutsideModelBoundariesType;
import org.hivdrc.hivpred.MutPlusWtOutsideModelBoundariesType;
import org.hivdrc.hivpred.ResultType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HivpredPackageImpl extends EPackageImpl implements HivpredPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hivPredInputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hivPredOutputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutNotInDatasetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutOutsideModelBoundariesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutPlusMutOutsideModelBoundariesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutPlusWtOutsideModelBoundariesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.hivdrc.hivpred.HivpredPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HivpredPackageImpl() {
		super(eNS_URI, HivpredFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HivpredPackage init() {
		if (isInited) return (HivpredPackage)EPackage.Registry.INSTANCE.getEPackage(HivpredPackage.eNS_URI);

		// Obtain or create and register package
		HivpredPackageImpl theHivpredPackage = (HivpredPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof HivpredPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new HivpredPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHivpredPackage.createPackageContents();

		// Initialize created meta-data
		theHivpredPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHivpredPackage.freeze();

		return theHivpredPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HIVPredInput() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HIVPredOutput() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHIVPredInputType() {
		return hivPredInputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHIVPredInputType_Sequence() {
		return (EAttribute)hivPredInputTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHIVPredOutputType() {
		return hivPredOutputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHIVPredOutputType_MutNotInDataset() {
		return (EReference)hivPredOutputTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHIVPredOutputType_MutOutsideModelBoundaries() {
		return (EReference)hivPredOutputTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHIVPredOutputType_MutPlusMutOutsideModelBoundaries() {
		return (EReference)hivPredOutputTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHIVPredOutputType_MutPlusWtOutsideModelBoundaries() {
		return (EReference)hivPredOutputTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHIVPredOutputType_Result() {
		return (EReference)hivPredOutputTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHIVPredOutputType_ErrorMessage() {
		return (EAttribute)hivPredOutputTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHIVPredOutputType_WarningMessage() {
		return (EAttribute)hivPredOutputTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMutNotInDatasetType() {
		return mutNotInDatasetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutNotInDatasetType_Name() {
		return (EAttribute)mutNotInDatasetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMutOutsideModelBoundariesType() {
		return mutOutsideModelBoundariesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutOutsideModelBoundariesType_Name() {
		return (EAttribute)mutOutsideModelBoundariesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMutPlusMutOutsideModelBoundariesType() {
		return mutPlusMutOutsideModelBoundariesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutPlusMutOutsideModelBoundariesType_Name() {
		return (EAttribute)mutPlusMutOutsideModelBoundariesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMutPlusWtOutsideModelBoundariesType() {
		return mutPlusWtOutsideModelBoundariesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutPlusWtOutsideModelBoundariesType_Name() {
		return (EAttribute)mutPlusWtOutsideModelBoundariesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultType() {
		return resultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Name() {
		return (EAttribute)resultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Result() {
		return (EAttribute)resultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HivpredFactory getHivpredFactory() {
		return (HivpredFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HIV_PRED_INPUT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HIV_PRED_OUTPUT);

		hivPredInputTypeEClass = createEClass(HIV_PRED_INPUT_TYPE);
		createEAttribute(hivPredInputTypeEClass, HIV_PRED_INPUT_TYPE__SEQUENCE);

		hivPredOutputTypeEClass = createEClass(HIV_PRED_OUTPUT_TYPE);
		createEReference(hivPredOutputTypeEClass, HIV_PRED_OUTPUT_TYPE__MUT_NOT_IN_DATASET);
		createEReference(hivPredOutputTypeEClass, HIV_PRED_OUTPUT_TYPE__MUT_OUTSIDE_MODEL_BOUNDARIES);
		createEReference(hivPredOutputTypeEClass, HIV_PRED_OUTPUT_TYPE__MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES);
		createEReference(hivPredOutputTypeEClass, HIV_PRED_OUTPUT_TYPE__MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES);
		createEReference(hivPredOutputTypeEClass, HIV_PRED_OUTPUT_TYPE__RESULT);
		createEAttribute(hivPredOutputTypeEClass, HIV_PRED_OUTPUT_TYPE__ERROR_MESSAGE);
		createEAttribute(hivPredOutputTypeEClass, HIV_PRED_OUTPUT_TYPE__WARNING_MESSAGE);

		mutNotInDatasetTypeEClass = createEClass(MUT_NOT_IN_DATASET_TYPE);
		createEAttribute(mutNotInDatasetTypeEClass, MUT_NOT_IN_DATASET_TYPE__NAME);

		mutOutsideModelBoundariesTypeEClass = createEClass(MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE);
		createEAttribute(mutOutsideModelBoundariesTypeEClass, MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE__NAME);

		mutPlusMutOutsideModelBoundariesTypeEClass = createEClass(MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE);
		createEAttribute(mutPlusMutOutsideModelBoundariesTypeEClass, MUT_PLUS_MUT_OUTSIDE_MODEL_BOUNDARIES_TYPE__NAME);

		mutPlusWtOutsideModelBoundariesTypeEClass = createEClass(MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES_TYPE);
		createEAttribute(mutPlusWtOutsideModelBoundariesTypeEClass, MUT_PLUS_WT_OUTSIDE_MODEL_BOUNDARIES_TYPE__NAME);

		resultTypeEClass = createEClass(RESULT_TYPE);
		createEAttribute(resultTypeEClass, RESULT_TYPE__NAME);
		createEAttribute(resultTypeEClass, RESULT_TYPE__RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HIVPredInput(), this.getHIVPredInputType(), null, "hIVPredInput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HIVPredOutput(), this.getHIVPredOutputType(), null, "hIVPredOutput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hivPredInputTypeEClass, HIVPredInputType.class, "HIVPredInputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHIVPredInputType_Sequence(), theXMLTypePackage.getString(), "sequence", null, 0, 1, HIVPredInputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hivPredOutputTypeEClass, HIVPredOutputType.class, "HIVPredOutputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHIVPredOutputType_MutNotInDataset(), this.getMutNotInDatasetType(), null, "mutNotInDataset", null, 0, -1, HIVPredOutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIVPredOutputType_MutOutsideModelBoundaries(), this.getMutOutsideModelBoundariesType(), null, "mutOutsideModelBoundaries", null, 0, -1, HIVPredOutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIVPredOutputType_MutPlusMutOutsideModelBoundaries(), this.getMutPlusMutOutsideModelBoundariesType(), null, "mutPlusMutOutsideModelBoundaries", null, 0, -1, HIVPredOutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIVPredOutputType_MutPlusWtOutsideModelBoundaries(), this.getMutPlusWtOutsideModelBoundariesType(), null, "mutPlusWtOutsideModelBoundaries", null, 0, -1, HIVPredOutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHIVPredOutputType_Result(), this.getResultType(), null, "result", null, 0, -1, HIVPredOutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHIVPredOutputType_ErrorMessage(), theXMLTypePackage.getString(), "errorMessage", null, 0, 1, HIVPredOutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHIVPredOutputType_WarningMessage(), theXMLTypePackage.getString(), "warningMessage", null, 0, 1, HIVPredOutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mutNotInDatasetTypeEClass, MutNotInDatasetType.class, "MutNotInDatasetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMutNotInDatasetType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MutNotInDatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mutOutsideModelBoundariesTypeEClass, MutOutsideModelBoundariesType.class, "MutOutsideModelBoundariesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMutOutsideModelBoundariesType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MutOutsideModelBoundariesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mutPlusMutOutsideModelBoundariesTypeEClass, MutPlusMutOutsideModelBoundariesType.class, "MutPlusMutOutsideModelBoundariesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMutPlusMutOutsideModelBoundariesType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MutPlusMutOutsideModelBoundariesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mutPlusWtOutsideModelBoundariesTypeEClass, MutPlusWtOutsideModelBoundariesType.class, "MutPlusWtOutsideModelBoundariesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMutPlusWtOutsideModelBoundariesType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MutPlusWtOutsideModelBoundariesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultTypeEClass, ResultType.class, "ResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultType_Result(), theXMLTypePackage.getDouble(), "result", null, 0, 1, ResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_HIVPredInput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HIVPredInput",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_HIVPredOutput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HIVPredOutput",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (hivPredInputTypeEClass, 
		   source, 
		   new String[] {
			 "name", "HIVPredInputType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getHIVPredInputType_Sequence(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sequence"
		   });		
		addAnnotation
		  (hivPredOutputTypeEClass, 
		   source, 
		   new String[] {
			 "name", "HIVPredOutputType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHIVPredOutputType_MutNotInDataset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mutNotInDataset",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHIVPredOutputType_MutOutsideModelBoundaries(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mutOutsideModelBoundaries",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHIVPredOutputType_MutPlusMutOutsideModelBoundaries(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mutPlusMutOutsideModelBoundaries",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHIVPredOutputType_MutPlusWtOutsideModelBoundaries(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mutPlusWtOutsideModelBoundaries",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHIVPredOutputType_Result(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHIVPredOutputType_ErrorMessage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "errorMessage"
		   });		
		addAnnotation
		  (getHIVPredOutputType_WarningMessage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "warningMessage"
		   });		
		addAnnotation
		  (mutNotInDatasetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MutNotInDatasetType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getMutNotInDatasetType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (mutOutsideModelBoundariesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MutOutsideModelBoundariesType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getMutOutsideModelBoundariesType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (mutPlusMutOutsideModelBoundariesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MutPlusMutOutsideModelBoundariesType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getMutPlusMutOutsideModelBoundariesType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (mutPlusWtOutsideModelBoundariesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MutPlusWtOutsideModelBoundariesType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getMutPlusWtOutsideModelBoundariesType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (resultTypeEClass, 
		   source, 
		   new String[] {
			 "name", "resultType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getResultType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getResultType_Result(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "result"
		   });
	}

//	  @Override
//	  protected Resource createResource(String uri)
//	  {
//	    return super.createResource("file://my/file/hivpred.xsd");
//	  }
	
	
} //HivpredPackageImpl
