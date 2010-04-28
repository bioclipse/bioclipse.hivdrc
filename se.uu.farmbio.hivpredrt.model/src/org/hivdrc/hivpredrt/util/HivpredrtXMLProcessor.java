/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hivdrc.hivpredrt.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.hivdrc.hivpredrt.HivpredrtPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HivpredrtXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HivpredrtXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        HivpredrtPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the HivpredrtResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new HivpredrtResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new HivpredrtResourceFactoryImpl());
        }
        return registrations;
    }

} //HivpredrtXMLProcessor
