package org.hivdrc.client.views;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.apache.log4j.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.*;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;



/**
 * View for visualizing the results from a Susceptibility prediction
 * in a Chart.
 */

public class HIVPredictionResultView extends ViewPart {

	public static final String ID = "net.bioclipse.xmpp.hivpred.views.HIVPredictionResultView";

	private static final Logger logger = Logger.getLogger(HIVPredictionResultView.class);

	//For Jfreechart
	private static Composite chartComposite;
	private static DefaultCategoryDataset dataset;
	private static ChartPanel chartPanel;
	private static JFreeChart chart;
	private static Frame chartFrame;

	//Variables for chart and GUI
	private static double[] predictAnswer;
	private static String[] drugs;
	private static String sequence;
	private static Text txtSequence;

	private static CategoryPlot plot;

	
	public static double[] getPredictAnswer() {
		return predictAnswer;
	}

	public static void setPredictAnswer(double[] predictAnswer) {
		HIVPredictionResultView.predictAnswer = predictAnswer;
	}

	public static String[] getDrugs() {
		return drugs;
	}

	public static void setDrugs(String[] drugs) {
		HIVPredictionResultView.drugs = drugs;
	}

	public static String getSequence() {
		return sequence;
	}

	public static void setSequence(String sequence) {
		HIVPredictionResultView.sequence = sequence;
	}


	/**
	 * The empty constructor.
	 */
	public HIVPredictionResultView() {
	}

	/**
	 * Create view contents
	 */
	public void createPartControl(Composite parent) {

		GridLayout gl = new GridLayout();
		gl.numColumns=1;
		parent.setLayout(gl);

		Label label1=new Label(parent,SWT.NONE);
		label1.setText("Protease");

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		//        gd.grabExcessHorizontalSpace=true;
		//        gd.grabExcessVerticalSpace=true;
		gd.heightHint=60;

		txtSequence=new Text(parent,SWT.MULTI);
		txtSequence.setText("No prediction performed yet.");
		txtSequence.setLayoutData(gd);

		chartComposite = new Composite(parent, SWT.EMBEDDED);
		GridLayout layout = new GridLayout();
		chartComposite.setLayout(layout);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		chartComposite.setLayoutData(layoutData);

		chartFrame = SWT_AWT.new_Frame(chartComposite);
		chartFrame.setLayout(new BorderLayout());
		updateResults();


	}


	/**
	 * Creates a chart.
	 * 
	 * @param dataset  the dataset.
	 * 
	 * @return A chart.
	 */
	private static JFreeChart createChart(CategoryDataset dataset) {

		chart = ChartFactory.createBarChart(
				"Protease Susceptibility Prediction",         // chart title
				"Drug",                 // domain axis label
				"Susceptibility",                // range axis label
				dataset,                    // data
				PlotOrientation.HORIZONTAL, // orientation
				true,                       // include legend
				true,
				false
		);

		// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

		// change the auto tick unit selection to integer units only...

		// set the background color for the chart...
		chart.setBackgroundPaint(Color.white);

		// get a reference to the plot for further customisation...
		plot = (CategoryPlot) chart.getPlot();
		plot.setBackgroundPaint(Color.white);
		plot.setRangeGridlinePaint(Color.lightGray);
		plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);

		// change the auto tick unit selection to integer units only...
		NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setRange(-3, 3);
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

		BarRenderer renderer = (BarRenderer) plot.getRenderer();
		renderer.setDrawBarOutline(false);
		renderer.setSeriesVisible(false);
		renderer.setItemLabelGenerator(
				new StandardCategoryItemLabelGenerator());
		renderer.setSeriesItemLabelsVisible(0, Boolean.TRUE);
		chart.removeLegend();
		//        renderer.setLegendItemToolTipGenerator(new StandardCategorySeriesLabelGenerator("Tooltip: {0}"));
		// OPTIONAL CUSTOMISATION COMPLETED.

		return chart;

	}

	/**
	 * Creates a sample dataset.
	 * 
	 * @return A dataset.
	 */
	/*    private static CategoryDataset createDataset(HashMap<String, Double> data) { 

        // create the dataset...
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String series1="bogus";		//Not shown
        for (String key:data.keySet()){
            dataset.addValue(data.get(key), series1, key);
        }

        return dataset;
    }
	 */

	@Override
	public void setFocus() {
	}

	public static void updateResults() {

		//Create a new dataset for the Chart
		dataset = new DefaultCategoryDataset();

		//We need to ensure that '.' is always decimal separator in all locales
		DecimalFormatSymbols sym=new DecimalFormatSymbols();
		sym.setDecimalSeparator( '.' );
		DecimalFormat rounded = new DecimalFormat("#0.00", sym);
		String series1="bogus";		//Not shown
		if (drugs!=null && predictAnswer!=null){

			if (drugs.length!=predictAnswer.length){
				showMessage("Drug names and results are not of same length.");
				return;
			}

			for (int i=0; i<drugs.length;i++){
				
				//Round to 2 decimals
				String value=rounded.format(predictAnswer[i]);
				dataset.addValue(new Double(value), series1, drugs[i]);
				                System.out.println("Added: " + predictAnswer[i] + " for " + drugs[i]);
			}
		}

		chart=createChart(dataset);
		chart.setTitle("Susceptibility prediction");

		chartPanel=new ChartPanel(chart);
		chartFrame.removeAll();
		chartFrame.add(chartPanel, BorderLayout.CENTER);

		chartFrame.validate();
		chartComposite.redraw();
			

		//Now, update the labels
		if (sequence!=null)
			txtSequence.setText(sequence);

	}

	private static void showMessage(String message) {
		MessageDialog.openInformation(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				"Message",
				message);
	}

	public static void show() {

		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchPage wbPage = wb.getActiveWorkbenchWindow().getActivePage(); 
		if (wbPage != null) {
			try {
				wbPage.showView(ID);
			} catch (PartInitException e) {
				logger.error("HivpredResultView.show() - PartInitException: " + e.getMessage());
			}
		}
	}

}