package org.hivdrc.hivpredrt.conversion;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.bioclipse.xws.JavaDOMTools;
import nu.xom.Serializer;
import nu.xom.converters.DOMConverter;

import org.apache.xerces.dom.DocumentImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.DefaultDOMHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.hivdrc.hivpredrt.DocumentRoot;
import org.hivdrc.hivpredrt.HIVPredRTOutputType;
import org.hivdrc.hivpredrt.HivpredrtPackage;
import org.hivdrc.hivpredrt.util.HivpredrtResourceFactoryImpl;
import org.hivdrc.hivpredrt.util.HivpredrtXMLProcessor;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;

public class EMFDOMConversion {

	@Deprecated
	public static EObject getEMFfromDOM(Element element) {

		// Register the package -- only needed for stand-alone!
		@SuppressWarnings("unused")
		HivpredrtPackage pkg=HivpredrtPackage.eINSTANCE;
		
		System.out.println("++++++++++");
		System.out.println("In EMFfromDOM:\n");
		System.out.println(JavaDOMTools.w3cElementToString(element));
		System.out.println("++++++++++");

		File tempFile=new File("dom2emfTmp.xml");

		FileOutputStream fos=null;

		//Serialize with w3c dom
//		String w3cXML=null;
		try {
			
			fos=new FileOutputStream(tempFile);
//			ByteArrayOutputStream bos=new ByteArrayOutputStream();
			
			element.removeAttribute("xmlns:hivpred");

			DOMImplementation implementation= DOMImplementationRegistry.newInstance()
			.getDOMImplementation("XML 3.0");
			DOMImplementationLS feature = (DOMImplementationLS) implementation.getFeature("LS",
			"3.0");
			
			LSSerializer serializer = feature.createLSSerializer();

			DOMConfiguration config = serializer.getDomConfig();
			config.setParameter("xml-declaration", true);
			config.setParameter("format-pretty-print", true);
//			config.setParameter("schema-type", "http://www.w3.org/2001/XMLSchema");
//			config.setParameter("validate", true);
//			config.setParameter("schema-location", "model/hivpredXX.xsd");

			
			LSOutput lsoutput = feature.createLSOutput();
			lsoutput.setByteStream(fos);
			lsoutput.setEncoding("UTF-8");
//			serializer.getDomConfig().setParameter("canonical-form", Boolean.TRUE);
			serializer.write(element, lsoutput);				
			fos.close();

		} catch (ClassCastException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (InstantiationException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IllegalAccessException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		//Output generated file:
		System.out.println("=======================\n" +
				"Temp file in getEMFfromDOM:");
		try {
			BufferedReader br=new BufferedReader(new FileReader(tempFile));
			String line=br.readLine();
			while (line!=null){
				System.out.println(line);
				line=br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=======================");
		
		//Read it back using EMF regular
		//==============================
		
		HivpredrtResourceFactoryImpl fac=new HivpredrtResourceFactoryImpl();
		URI fileURI = URI.createFileURI(tempFile.getAbsolutePath());
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());

		// Demand load the resource for this file.
		Resource resource2=fac.createResource(fileURI);
		try {
			resource2.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		EObject out=resource2.getContents().get(0);

		return out;
		
		
/*		
		ByteArrayInputStream bis=new ByteArrayInputStream(w3cXML.getBytes());

		
		// Register the package -- only needed for stand-alone!
		HivpredPackage pkg=HivpredPackage.eINSTANCE;

		Resource res=new ResourceImpl();

		ResourceSet rs=new ResourceSetImpl();
		rs.getPackageRegistry().put(null, HivpredPackage.eINSTANCE);
		res=rs.createResource(fileURI);


		try {
			res.load(bis, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		HIVPredOutputType out2=(HIVPredOutputType) res.getContents().get(0);

		return out2;
		*/
	}

	/**
	 * So that EMF is not direct dependency
	 * @param element
	 * @return
	 */
	public static DocumentRoot getEMFfromDOMusingJavaDOMtoolsAsHIV(Element element) {
		return (DocumentRoot)getEMFfromDOMusingJavaDOMtools(element);
	}


	/**
	 * USe the JavaDOMtools to serialize the DOM element to String and read in 
	 * using EMF
	 * @param element
	 * @return
	 */
	public static EObject getEMFfromDOMusingJavaDOMtools(Element element) {

		// Register the package -- only needed for stand-alone!
		@SuppressWarnings("unused")
		HivpredrtPackage pkg=HivpredrtPackage.eINSTANCE;
		
//		System.out.println("++++++++++");
//		System.out.println("In EMFfromDOM:\n");
//		System.out.println(JavaDOMTools.w3cElementToString(element));
//		System.out.println("++++++++++");

		String xmlString="<?xml version='1.0' encoding='UTF-8'?>";
		xmlString=xmlString+JavaDOMTools.w3cElementToString(element);

		System.out.println("++++++++++");
		System.out.println("In EMFfromDOM:\n");
		System.out.println(xmlString);
		System.out.println("++++++++++");

		//Read it back using EMF regular
		//==============================
		
		ByteArrayInputStream bais=new ByteArrayInputStream(xmlString.getBytes());
		
		HivpredrtResourceFactoryImpl fac=new HivpredrtResourceFactoryImpl();
		URI fileURI = URI.createFileURI("bogus");
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());

		// Demand load the resource for this file.
		Resource resource2=fac.createResource(fileURI);
		try {
			resource2.load(bais, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		EObject out=resource2.getContents().get(0);

		return out;
		
		
/*		
		ByteArrayInputStream bis=new ByteArrayInputStream(w3cXML.getBytes());

		
		// Register the package -- only needed for stand-alone!
		HivpredPackage pkg=HivpredPackage.eINSTANCE;

		Resource res=new ResourceImpl();

		ResourceSet rs=new ResourceSetImpl();
		rs.getPackageRegistry().put(null, HivpredPackage.eINSTANCE);
		res=rs.createResource(fileURI);


		try {
			res.load(bis, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		HIVPredOutputType out2=(HIVPredOutputType) res.getContents().get(0);

		return out2;
		*/
	}

	/**
	 *  Save it using XMLProcessor and DOM
	 * @param in
	 * @return
	 */
	public static Element getDomFromHIVEMF(DocumentRoot in) {
		return getDomFromEMF(in);
	}

	/**
	 *  Save it using XMLProcessor and DOM
	 * @param in
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Element getDomFromEMF(EObject in) {

		// Register the package -- only needed for stand-alone!
		@SuppressWarnings("unused")
    HivpredrtPackage pkg=HivpredrtPackage.eINSTANCE;
		

		ResourceSet resourceSet=new ResourceSetImpl();
		URI fileURI = URI.createFileURI(new File("bogus.xml").getAbsolutePath());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());

		Resource resource=resourceSet.createResource(fileURI);
		resource.getContents().add(in);

		

		Map opts=new HashMap();
		opts.put(XMLResource.OPTION_EXTENDED_META_DATA,new Boolean(true));
		opts.put(XMLResource.OPTION_DECLARE_XML,new Boolean(false));
		opts.put(XMLResource.OPTION_SCHEMA_LOCATION, "my_schema");
		opts.put(XMLResource.OPTION_DOM_USE_NAMESPACES_IN_SCOPE, Boolean.TRUE);

		XMLProcessor xp=new XMLProcessor();
		Document document=new DocumentImpl();

		try {
			xp.save(document, resource, new DefaultDOMHandlerImpl(), opts);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Element el = document.getDocumentElement();
		return el;

	}

	@Deprecated
	public static EObject getEMFfromDOMUsingXMLProcessor(Element element) {

		@SuppressWarnings("unused")
		Document document=new DocumentImpl();

		//		Map opts=new HashMap();
		//		opts.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		//		opts.put(XMLResource.OPTION_DOM_USE_NAMESPACES_IN_SCOPE, Boolean.TRUE);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new HivpredrtResourceFactoryImpl());

		// Register the package -- only needed for stand-alone!
		@SuppressWarnings("unused")
    HivpredrtPackage pkg=HivpredrtPackage.eINSTANCE;


		HivpredrtXMLProcessor xp=new HivpredrtXMLProcessor();

		URI uri = URI.createFileURI(new File("bogus121212.xml").getAbsolutePath());

		HivpredrtResourceFactoryImpl fac=new HivpredrtResourceFactoryImpl();
		Resource res=fac.createResource(uri);

		//		ResourceSet rs=new ResourceSetImpl();
		//		rs.getPackageRegistry().put(null, HivpredPackage.eINSTANCE);
		//		Resource res=null;
		//		res=rs.createResource(uri);




		try {
			//			res.load(null);
			res=xp.load(element, null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (res==null){
			System.err.println("Resource is null!!");
			return null;
		}

		if (res.getAllContents().hasNext()){
			EObject obj=res.getAllContents().next();

			return obj;
		}else{
			System.err.println("No EObj to return!");
		}

		return null;

	}


	@SuppressWarnings("unchecked")
    public static HIVPredRTOutputType getEMFfromDOMwithXOM(Element ele) {

		//So, serialize the e1 element with XOM
		//==============================
		URI fileURI3 = URI.createFileURI(new File("xomXML.xml").getAbsolutePath());

		ByteArrayOutputStream bos=new ByteArrayOutputStream();


		//Serialize with XOM
		nu.xom.Element xel=DOMConverter.convert(ele);
		nu.xom.Document doc = new nu.xom.Document(xel);

		try {

			Serializer serializer = new Serializer(bos, "UTF-8");
			serializer.setIndent(4);
			serializer.setMaxLength(64);
			serializer.write(doc);  
			String xomXML=new String(bos.toByteArray());

//			System.out.println("xomXML:\n" + xomXML);

			FileWriter w=new FileWriter("xomXML.xml");
			w.write(xomXML);
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		


		ResourceSet resourceSet=new ResourceSetImpl();
		// Demand load the resource for this file.
		Resource resource2 = resourceSet.getResource(fileURI3, true);

		Map opts=new HashMap();
		opts.put(XMLResource.OPTION_EXTENDED_META_DATA,Boolean.TRUE);
		opts.put(XMLResource.OPTION_DECLARE_XML,Boolean.TRUE);
		opts.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		opts.put(XMLResource.OPTION_DOM_USE_NAMESPACES_IN_SCOPE, Boolean.TRUE);

		try {
			resource2.load(opts);
		} catch (IOException e) {
			e.printStackTrace();
		}

		HIVPredRTOutputType out=(HIVPredRTOutputType) resource2.getContents().get(0);

		System.out.println("end 1" + out.getResult().get(0).getResult());

		return out;

	}


	
	
	
}
