package org.hivdrc.client.actions;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.hivdrc.client.Activator;

/**
 * 
 * @author ola
 *
 */
public class PredictPIHandler extends AbstractHIVDRCHandler {

    @Override
    protected void doPrediction( String filepath ){
        try {
            Activator.getDefault().getJavaHIVDRCManager().predictPI( filepath );
        } catch ( Exception e ) {
            
            MessageDialog.openError( 
                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                "Error", e.getMessage() );
        } 
    }

}
