package org.hivdrc.client.dialogs;

import java.io.IOException;
import java.net.URL;

import org.hivdrc.client.Activator;
import org.hivdrc.client.HIVPredictionContants;
import org.hivdrc.client.FixedLengthProteinSequenceValidator;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class PredictionDialog extends TitleAreaDialog {

	protected Text txtSequence;
	public String sequence;

	FixedLengthProteinSequenceValidator validator;
	
	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public PredictionDialog(Shell parentShell) {
		super(parentShell);
	}

	public PredictionDialog(Shell parentShell, String sequence) {
		super(parentShell);
		this.sequence=sequence;
	}

	@Override
	protected Control createContents(Composite parent) {
		
		Control contents = super.createContents(parent);
		
		setTitle("HIV Protease Susceptibility Web service");
		URL url = null;
		try {
			String dialogImage="/icons/"+ "hiv_protease_inhibitor_sm.jpg";
			url=FileLocator.toFileURL(Platform.getBundle(Activator.PLUGIN_ID).getEntry(dialogImage));
//			url = Platform.asLocalURL(Platform.getBundle(BioclipsePlugin.PLUGIN_ID).getEntry("/icons/"+ "saveas_wiz.png"));
		} catch (IOException e) {
			System.out.println("Could not locate wizard image");
			e.printStackTrace();
		}

		ImageDescriptor i = ImageDescriptor.createFromURL(url);
		setTitleImage(i.createImage());
		setMessage("Please paste an HIV protease sequence in the field below and\n press 'OK' to predict using the HIVPrediction Web Service." 
//				+ "\nExample: PQITLWQRPLVTIKIGGQLKEALLDTGADDTVLEEMNLPGRWKPKMIGGIGGFIKVRQYDQILIEICGHKAIGTVLVGPTPVNIIGRNLLTQIGCTLNF"
				+ "\n\nDepartment of Pharmaceutical Biosciences\nUppsala University, Uppsala, Sweden."
		+ "\n\nhttp://www.hivdrc.org");
		return contents;
	}
	
	protected Control createDialogArea(Composite parent) {
        // top level composite
        Composite parentComposite = (Composite) super.createDialogArea(parent);

        // create a composite with standard margins and spacing
        Composite composite = new Composite(parentComposite, SWT.NONE);

        GridLayout layout = new GridLayout();
        composite.setLayout(layout);
        layout.numColumns = 1;
        
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.grabExcessHorizontalSpace=true;
        gd.grabExcessVerticalSpace=true;
        gd.widthHint=600;
        
        Label topLabel= new Label(composite,SWT.NONE);
        topLabel.setText("Paste protease sequence here:");
        topLabel.setLayoutData(gd);
        //        topLabel.setLayoutData(new GridData(GridData.FILL_BOTH));
        
        txtSequence = new Text(composite, SWT.MULTI | SWT.BORDER | SWT.WRAP);

        
        
        if (sequence!=null){
            if (sequence!=""){
            	sequence=sequence.trim();	//Remove pre and post white spaces
            	sequence=sequence.replace("\n", "");
            	txtSequence.setText(sequence);
            }
        }
        else txtSequence.setText("");

        GridData gd2 = new GridData(GridData.FILL_BOTH);
        gd2.grabExcessHorizontalSpace=true;
        gd2.grabExcessVerticalSpace=true;
        gd2.widthHint=200;
        gd2.heightHint=60;
        txtSequence.setLayoutData(gd2);
        
        txtSequence.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				setDialogComplete(validateAll());
			}
			
		});

        //set disabled on startup
        setDialogComplete(false);

		return parentComposite;
    }
	
	private boolean validateAll() {

		//Create aa validator if not exists
		if (validator==null) validator=new FixedLengthProteinSequenceValidator(HIVPredictionContants.PROTEASE_EXACT_LENGTH);

		//Strip off any newlines
		
		//Verify aa sequence validity
		String retval=validator.isValid(txtSequence.getText());
		if (retval!=null){
			setErrorMessage(retval);
			return false;
		}
		
		setSequence(txtSequence.getText());
		setErrorMessage(null);
		return true;

	}
	
	protected void setDialogComplete(boolean value) {
		Button okButton = this.getButton(0);
		if (okButton != null) {
			okButton.setEnabled(value);
		}
	}

}
