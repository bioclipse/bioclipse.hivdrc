package se.uu.farmbio.hivpredrt.web;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.bioclipse.xws.client.Client;
import net.bioclipse.xws.client.IExecutionPipe;
import net.bioclipse.xws.client.adhoc.IFunction;
import net.bioclipse.xws.client.adhoc.IService;
import net.bioclipse.xws.client.disco.Functions;
import net.bioclipse.xws.exceptions.XmppException;
import net.bioclipse.xws.exceptions.XwsException;

import org.eclipse.jdt.internal.compiler.codegen.IntegerCache;
import org.hivdrc.hivpredrt.DocumentRoot;
import org.hivdrc.hivpredrt.HIVPredRTInputType;
import org.hivdrc.hivpredrt.HIVPredRTOutputType;
import org.hivdrc.hivpredrt.HivpredrtFactory;
import org.hivdrc.hivpredrt.HivpredrtPackage;
import org.hivdrc.hivpredrt.ResultType;
import org.hivdrc.hivpredrt.conversion.EMFDOMConversion;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.w3c.dom.Element;


/**
 * Servlet implementation class Predict
 */
public class Predict extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private HttpServletRequest request;
    private HttpServletResponse response;

    String formURL="http://www.hivdrc.org/predictRTSuscept/";

    String clientJID      = "hivrt@ws1.bmc.uu.se/web";
    String host           = "ws1.bmc.uu.se";
    String pwd            = "hivrt";
    String serviceJID     = "hivrtpred.ws1.bmc.uu.se";
    int port              = 5222;
    String functionName   ="predictSusceptibility";

    String wt="PISPIETVPVKLKPGMDGPKVKQWPLTEEKIKALVEICTEMEKEGKISKIGPENPYNTPVFAIKKKDSTKWRKLVDFRELNKRTQDFWEVQLGIPHPAGLKKKKSVTVLDVGDAYFSVPLDKDFRKYTAFTIPSINNETPGIRYQYNVLPQGWKGSPAIFQSSMTKILEPFRKQNPDIVIYQYMDDLYVGSDLEIGQHRTKIEELRQHLLRWGFTTPDKKHQKEPPFLWMGYELHPDKWT";

    DefaultCategoryDataset dataset;


    String sequence;
    String errorMessage;
    String warningMessage;
    String positionMessage;

    boolean showBoundaries;;

    //For correct range
    int lowerRange, upperRange;


    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Predict() {
        super();
        // TODO Auto-generated constructor stub
    }


    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.request=request;
        this.response=response;
        if (request.getParameter("sequence")!=null || request.getParameter("RTmuts")!=null)
            doPrediction();
        else
            createErrorPage( "No valid mutation or sequence given as input." );
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.request=request;
        this.response=response;
        if (request.getParameter("sequence")!=null || request.getParameter("RTmuts")!=null)
            doPrediction();
        else
            createErrorPage( "No valid mutation or sequence given as input." );
    }


    private void doPrediction() {

        String retrievedSequence=request.getParameter("sequence");
        String retrievedMutations=request.getParameter("RTmuts");

        if (retrievedSequence!=null && retrievedSequence!="")
            predictSequence(retrievedSequence);
        else if (retrievedMutations!=null && retrievedMutations!="")
            predictMutations(retrievedMutations);
        else
            createErrorPage( "No valid mutation or sequence given as input." );
    }
    

    /**
     * Predict by full 240/242 RT sequence
     * @param retrievedSequence
     */
    private void predictSequence( String retrievedSequence ) {

        String parsedSequence="";
        try{
            parsedSequence=RTHelper.processRawInputString(retrievedSequence);
        }catch (IllegalArgumentException e){
            createErrorPage(e.getMessage());
            return;
        }

        setSequence(parsedSequence.toUpperCase().trim());

        System.out.println("sequence: " + getSequence());
        setWarningMessage("");
        showBoundaries=false;

        String ret=validateSequence(sequence);
        if (ret!=null) {
            createErrorPage(ret);
            return;
        }


        //TODO: predict here
        // Register the package -- only needed for stand-alone!
        @SuppressWarnings("unused")
        HivpredrtPackage pkg=HivpredrtPackage.eINSTANCE;

        HIVPredRTInputType in = HivpredrtFactory.eINSTANCE.createHIVPredRTInputType();
        in.setSequence(sequence);

        DocumentRoot root=HivpredrtFactory.eINSTANCE.createDocumentRoot();
        root.setHIVPredRTInput(in);

        //Convert to DOM Element
        Element inputDomElement=EMFDOMConversion.getDomFromEMF(root);


        //Predict on WS1
        //=============
        HIVPredRTOutputType res=null;

        //For XMPP execution
        IExecutionPipe epipe = new IExecutionPipe() {
            public void exec(Runnable r) {
                r.run();
            }
        };



        try {
            Client client = new Client(clientJID, pwd, host, port, epipe);
            client.connect();

            IFunction hivFunction = client.getFunction(serviceJID, functionName);

            Element result = hivFunction.invokeSync(inputDomElement, 20000);
            System.out.println("Result from prediction: " + result.toString());

            //Convert output DOM to EMF
            DocumentRoot docroot=EMFDOMConversion.getEMFfromDOMusingJavaDOMtoolsAsHIV(result);
            res=docroot.getHIVPredRTOutput();

        } catch ( XmppException e1 ) {
            e1.printStackTrace();
        } catch ( XwsException e ) {
            e.printStackTrace();
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        }

        if (res==null){
            createErrorPage("XMPP service did not return anything. Service could be down. " +
            "Please contact service admin: ola.spjuth(AT)farmbio.uu.se");
            System.out.println("XMPP service returned NULL. Service down?");
            return;
        }
        else if (res.getResult().size()<=0){
            createErrorPage("Web service did not return any results.");
            System.out.println("Web service did not return any results.");
            return;
        }

        System.out.println("================");
        System.out.println("Results: ");
        List<Double> lst=new ArrayList<Double>();
        for (ResultType rtype : res.getResult()){
            System.out.println("Drug: " + rtype.getName() + " - " + rtype.getResult());
            lst.add(new Double(rtype.getResult()));
        }

        errorMessage = res.getErrorMessage();
        warningMessage = res.getWarningMessage();

        //Sort and set range to round up + 1
        Collections.sort(lst);
        lowerRange=(int)(lst.get(0)-2);
        upperRange=(int)(lst.get(lst.size()-1)+2);

        //Override dynamic range with fixed values
        lowerRange=-2;
        upperRange=3;

        System.out.println("Range set to: " + lowerRange + " - " + upperRange);


        //Set up string to present position messages
        String mutNotInDatasetmsg="";
        if (res.getMutNotInDataset().size()>0){
            mutNotInDatasetmsg="<b>Mutations of highly conserved sequence residues</b><br>" +
            "You have input a sequence with one or more mutations of highly conserved " +
            "sequence residues of HIV RT. These residues were invariant in the " +
            "dataset and their mutations will therefore not affect the predictions. " +
            "\n<ul><p>\n";
            for (int i=0; i<res.getMutNotInDataset().size(); i++) {
                mutNotInDatasetmsg=mutNotInDatasetmsg + "<li>" + res.getMutNotInDataset().get( i ).getName() + "</li>\n";
            }
            mutNotInDatasetmsg=mutNotInDatasetmsg + "</ul>\n";
        }

        String mutOutsideModelmsg="";
        if (res.getMutOutsideModelBoundaries().size()>0){
            mutOutsideModelmsg="<b>Unusual mutations</b><br>\n" +
            "You have input a sequence with one or more unusual mutations. " +
            "The numerical description of these mutation is outside the boundaries " +
            "of proteochemometric model. " +
            "While the prediction still can be accurate, this should be kept in mind."+
            "\n<ul><p>\n";
            showBoundaries=true;
            for (int i=0; i<res.getMutOutsideModelBoundaries().size(); i++) {
                mutOutsideModelmsg=mutOutsideModelmsg + "<li>" + res.getMutOutsideModelBoundaries().get( i ).getName() + "</li>\n";
            }
            mutOutsideModelmsg=mutOutsideModelmsg + "</ul>\n";
        }

        String mutPlusMutOutsideModelmsg="";
        if (res.getMutPlusMutOutsideModelBoundaries().size()>0){
            mutPlusMutOutsideModelmsg="<b>Mutations plus mutations outside model</b><br>\n" +
            "You have input a sequence with one or more unusual mutation combinations. " +
            "The numerical description of these mutations in combination " +
            "renders an interaction term that is outside the model boundaries. " +
            "Allthough this has a very negligible influence on the predictions, this " +
            "should be kept in mind." +
            "\n<ul><p>\n";
            showBoundaries=true;
            for (int i=0; i<res.getMutPlusMutOutsideModelBoundaries().size(); i++) {
                mutPlusMutOutsideModelmsg=mutPlusMutOutsideModelmsg + "<li>" + res.getMutPlusMutOutsideModelBoundaries().get( i ).getName() + "</li>\n";
            }
            mutPlusMutOutsideModelmsg=mutPlusMutOutsideModelmsg + "</ul>\n";
        }

        String mutPlusWTOutsideModelmsg="";
        if (res.getMutPlusWtOutsideModelBoundaries().size()>0){
            mutPlusWTOutsideModelmsg="<b>Mutations plus WT outside model</b><br>\n" +
            "You have input a sequence with one or more unusual mutations. " +
            "The numerical description of this mutation in combination with " +
            "the numerical description of the ligand or a wildtype amino acid " +
            "residues renders an interaction term that is outside the model boundaries. " +
            "Allthough this has a very negligible influence on the predictions, this " +
            "should be kept in mind." +
            "\n<ul><p>\n";
            showBoundaries=true;
            for (int i=0; i<res.getMutPlusWtOutsideModelBoundaries().size(); i++) {
                mutPlusWTOutsideModelmsg=mutPlusWTOutsideModelmsg + "<li>" + res.getMutPlusWtOutsideModelBoundaries().get( i ).getName() + "</li>\n";
            }
            mutPlusWTOutsideModelmsg=mutPlusWTOutsideModelmsg + "</ul>\n";
        }

        //Concat all positionMessages into a String
        positionMessage=mutNotInDatasetmsg + mutOutsideModelmsg + mutPlusWTOutsideModelmsg + mutPlusMutOutsideModelmsg;

        //Debug out:
        System.out.println("positionMessagesMsg:" + positionMessage);

        System.out.println("WarningMsg:" + warningMessage);
        System.out.println("ErrorMsg:" + errorMessage);
        System.out.println("================");






        //Create a new dataset for the Chart
        dataset = new DefaultCategoryDataset();
        String series1="bogus";   //Not shown
        DecimalFormat rounded = new DecimalFormat("#0.00");
        for (int i=0; i<res.getResult().size();i++){
            String value=rounded.format(res.getResult().get( i ).getResult());
            String drugname=res.getResult().get( i ).getName();
            dataset.addValue(new Double(value), series1, fullDrugNameToShortname(drugname));
        }

        //Create chart from dataset
        JFreeChart chart=createChart(dataset);

        //Write diagram to file and return URL
        String chartURL=generateChartURL(chart);
//        if (chartURL==null || chartURL.equals("")){
//            createErrorPage("Chart URL creation failed.");
//            return;
//        }

        createResultPage(chartURL);

        //Done

    }
    
    
    
    private void predictMutations( String retrievedMutations ) {

        //Parse mutations and build 240 aa string
        char[] mutseq=wt.toCharArray();
        
        String[] muts = retrievedMutations.split( "," );
        for (int i=0; i< muts.length; i++){
            int pos=Integer.parseInt( muts[i].substring( 0, muts[i].length()-1 ) );
            String mutaa=muts[i].substring( muts[i].length()-1, muts[i].length() );
            System.out.println("Mutation: " + pos + " - " + mutaa);
            
            //Replace in WT, note: base 0 (input is base 1)
            mutseq[pos-1]=mutaa.charAt( 0 );
        }
        
        String predictSeq=String.valueOf( mutseq);
        predictSequence( predictSeq );
        
    }


    
    
    
    
    
    

    private String fullDrugNameToShortname(String drugname) {
        
        if (drugname.startsWith("Zidovudine"))
          return "AZT";
        if (drugname.startsWith("Didanosine"))
          return "ddI";
        if (drugname.startsWith("Zalcitabine"))
          return "ddC";
        if (drugname.startsWith("Tenofovir"))
          return "TDF";
        if (drugname.startsWith("Lamivudine"))
          return "3TC";
        if (drugname.startsWith("Emtricitabine"))
          return "FTC";
          if (drugname.startsWith("Abacavir"))
          return "ABC";
          if (drugname.startsWith("Stavudine"))
          return "d4T";

          return "UNKNOWN DRUG: " + drugname;
    }

    
    
    private void createResultPage(String chartURL) {
        response.setContentType("text/html");
        PrintWriter out;
        try {
            out = response.getWriter();
            String title = "HIV RT Susceptibility prediction";

            out.println("<html>" +
                        "<BODY>\n" +
                        "<H2>" + title + "</H2>\n" +
                        "<p>\n Sequence predicted: " + getSequence() +
                        "<p>\n Mutations predicted: " + getMutations() +
                        "<p>\n " +
                        "<table><tr><td width='320px'>" +
                        "<img src='" + chartURL + "' align='left' alt='Drug Susceptibility Chart'>" +
                        		"</td>");

            out.println("<td width='100px'>&nbsp;</td>");
            
            out.println("<td><p><table frame='border'>"
                        +"<tr><td colspan=3 ><h3>Clinical cutoffs as defined by the <a href='http://www.monogramhiv.com/phenosense_introduction.aspx'>PhenoSense assay</a></h3></td></tr>"
                        +"<tr><td width=200 bgcolor='#DDDDDD'>Generic name</td><td bgcolor=\"#DDDDDD\">Cutoffs (Lower - Upper) as (log10)</td></tr>"
                        +"<tr><td>Lamivudine (3TC)</td><td align='center'>0.54*</td></tr>"
                        +"<tr><td>Abacavir (ABC)</td><td align='center'>(0.65** - 0.81***)</td></tr>"
                        +"<tr><td>Zidovudine (AZT)</td><td align='center'>0.29****</td></tr>"
                        +"<tr><td>Stavudine (D4T)</td><td align='center'>0.23*</td></tr>"
                        +"<tr><td>Zalcitabine (DDC)</td><td align='center'>N/A</td></tr>"
                        +"<tr><td>Didanosine (DDI)</td><td align='center'>(0.11** - 0.34***)</td></tr>"
                        +"<tr><td>Emtricitabine (FTC)</td><td align='center'>0.54****</td></tr>"
                        +"<tr><td>Tenofovir (TDF)</td><td align='center'>(0.15** - 0.6***)</td></tr>"
                        +"</table></td>" +
                        "<tr><td><font size='2'>The chart displays the susceptibility for various " +
                        "drugs to the analyzed HIV strain's protease. " +
                        "A positive value indicates a reduced susceptibility for the respective " +
                        "drug relative to a drug sensitive reference HIV strain. " +
                        "A negative value indicates a reduced susceptibility for " +
                        "the respective drug relative to a drug sensitive reference HIV strain." +
                        "</font></td>" +
                        		"<td>&nbsp</td>" +
                        		"<td><font size='2'>" +
                        		"* clinical cutoff (susceptible/resistant)<br>"+
                        		"** lower clinical cutoff (susceptible/partially susceptible)<br>"+
                        		"*** upper clinical cutoff (partially susceptible/resistant)<br>"+
                        		"**** Clinical cutoff(s) not defined. Shown is biological cutoff - value below which reside 99% of isolates without known drug resistance mutations<br>"+
                        		"N/A - DDC is rarely used inhibitor and no cutoffs are defined." +
                        		"</font></td></table>"
                        +"<p><br><br>");

            if (positionMessage!=null){
                if ((!positionMessage.equals(""))){
                    if ((!positionMessage.equals(""))){
                        out.println(
                                    "<p><b>Warning messages:</b> <p>\n <font size=2> " + positionMessage + "</font>");
                        if (showBoundaries){
                            out.println("<p> Note: Model boundaries are for the model defined individually for each" +
                            " variable as being within ±20 standard deviations from the variable mean");
                        }
                    }
                }
            }


            if (getWarningMessage()!=null){
                if ((!getWarningMessage().equals(""))){
                    out.println(
                                "<p>\n <font color=\"orange\"> " + getWarningMessage() + "</font>");
                }
            }

            if (getErrorMessage()!=null){
                if ((!getErrorMessage().equals(""))){
                    out.println(
                                "<p>\n <font color=\"red\"> " + getErrorMessage() + "</font>");
                }
            }

            out.println(
                        "<p><a href=\"" + HIVRTPredictionContants.PREDICT_HOMEPAGE + "\">Click here</a> to predict susceptibility for a new HIV RT sequence" +
            "</BODY></HTML>");  

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Could not generate result page!");
        }

    }



    private String getMutations() {
        
        if (getSequence()==null) return null;
        if (getSequence()=="") return "";
        
        //Parse sequence and return string of mutations
        char[] mutseq=getSequence().toCharArray();
        
        String retmuts="";
        
        for (int i=0; i< mutseq.length; i++){

            String caa=String.valueOf( mutseq[i]);
            String wtaa=wt.substring( i, i+1 );

            if (caa.compareTo( wtaa )!=0){
                retmuts=retmuts + (i+1) + caa + ", ";
            }
            
        }
        
        if (retmuts.length()>1)
            retmuts=retmuts.substring( 0, retmuts.length()-2 );
        
        return retmuts;
    }

    public String generateChartURL(JFreeChart chart){

        //      Note: Not used since temp dir is not accessible from URL
        //      ServletContext context=request.getSession().getServletContext();
        //      File tmpdir=(File)context.getAttribute("javax.servlet.context.tempdir");
        //      System.out.println("tempdir: " + tmpdir);

        //Use hardcoded temp dir in constants

        File outfile;
        File tempDir;
        
        String chosenBaseURL=HIVRTPredictionContants.TEMP_URL_BASE_LOCAL;
        try {
            tempDir=new File(HIVRTPredictionContants.TEMP_FILE_DIR_LOCAL);
            if (!(tempDir.exists())){

                //Try ws1 dir
                tempDir=new File(HIVRTPredictionContants.TEMP_FILE_DIR_WS1);
                chosenBaseURL=HIVRTPredictionContants.TEMP_URL_BASE_WS1;
                if (!(tempDir.exists())){
                    System.out.println("Temp dir does not exist: " + HIVRTPredictionContants.TEMP_FILE_DIR_LOCAL);
                    System.out.println("Temp dir does not exist: " + HIVRTPredictionContants.TEMP_FILE_DIR_WS1);
                    return null;
                }
            }
            else if (!(tempDir.isDirectory())){
                System.out.println("Temp dir is not a directory!");
                return null;
            }

            outfile = File.createTempFile("susPrediction", ".png",tempDir);
            System.out.println("Wrote temp file: " + outfile.getAbsolutePath());

            String ret=chosenBaseURL + outfile.getName();

            System.out.println("Temp URL: " + ret);

            //        URL url=outfile.toURL();

            FileOutputStream fs= new FileOutputStream(outfile);
            ChartUtilities.writeChartAsPNG(fs, chart, 400, 300);

            return ret;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Generate a chart suitable for susc prediction from a given dataset.
     * @param dataset
     * @return 
     */
    private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart chart = ChartFactory.createBarChart(
                                                       "HIV RT Susceptibility Prediction",         // chart title
                                                       "Drug",                 // domain axis label
                                                       "log(susceptibility)",                // range axis label
                                                       dataset,                    // data
                                                       PlotOrientation.HORIZONTAL, // orientation
                                                       true,                       // include legend
                                                       true,
                                                       false
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.white);
        plot.setRangeGridlinePaint(Color.lightGray);
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);

        // change the auto tick unit selection to integer units only...
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setRange(lowerRange, upperRange);
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        renderer.setSeriesVisible(false);
        renderer.setItemLabelGenerator(
                                       new StandardCategoryItemLabelGenerator());
        renderer.setSeriesItemLabelsVisible(0, Boolean.TRUE);
        chart.removeLegend();

        return chart;

    }


    private String validateSequence(String sequence) {
        RTHelper val=new RTHelper(240);
        return val.isValid(sequence);
    }



    private void createErrorPage(String errorMessage) {
        response.setContentType("text/html");

        PrintWriter out;
        try {
            out = response.getWriter();
            String title = "HIV RT Susceptibility prediction";

            out.println("<html>" +
                        "<BODY>\n" +
                        "<H2>" + title + "</H2>\n" +
                        "<p>\n <font color=\"red\"> ERROR: " + errorMessage + "</font>" +
                        "<p><br>Preferred REST parameter is 'RTmuts', with comma-separated values 'position + aa' in single letter code. Examples are 'RTmuts=44A' and 'RTmuts=44A,77L'<br>"+
                        "<p>Example of complete URL: "+
                        "<a href=\"http://ws1.bmc.uu.se:8080/hivrtpred/Predict?RTmuts=181C,41L\"> " +
                        "http://ws1.bmc.uu.se:8080/hivrtpred/Predict?RTmuts=181C,41L </a>" +
                        "<p>Web page with GUI for service is available at: " +
                        "<a href=\"" + formURL + "\">" +
                        formURL +
                        "</a>"+
            "</BODY></HTML>");  

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Could not generate forms page!");
        }

    }
    
    private void redirectToForm() {
        
        try {
            response.sendRedirect( formURL );
        } catch ( IOException e ) {
        }
        
    }



}
