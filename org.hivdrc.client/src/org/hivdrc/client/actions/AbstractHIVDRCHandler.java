package org.hivdrc.client.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressConstants;
import org.hivdrc.client.Activator;

/**
 * 
 * @author ola
 *
 */
public abstract class AbstractHIVDRCHandler extends AbstractHandler {
    
    protected String predictionName="N/A";

    private ExecutionEvent event;

    private static final Logger logger = Logger.getLogger(AbstractHIVDRCHandler.class);

    public Object execute(ExecutionEvent event) throws ExecutionException {
        this.event=event;

        //Get current selection
        ISelection selection=
            PlatformUI.getWorkbench().getActiveWorkbenchWindow().
            getSelectionService().getSelection();

        //Handle case when text is selected
        if (selection instanceof ITextSelection) {
            ITextSelection textSel = (ITextSelection) selection;
            System.out.println("Predict for text: " + textSel.getText());
            //TODO: Implement
            
            return null;
        }

        //Handle case when file(s) selected
        else if (selection instanceof IStructuredSelection) {
            IStructuredSelection structsel = (IStructuredSelection) selection;

            final List<IFile> filelist=new ArrayList<IFile>();
            Iterator<?> it = structsel.iterator();
            while (it.hasNext()){
                Object o=it.next();
                if (o instanceof IFile) {
                    IFile file = (IFile) o;
                    filelist.add(file);
                }
            }

            if (filelist.size()<0) return null;

            //Set up and run job
            Job hivpredJob=new Job("HIV " + predictionName 
                                   + " susceptibility prediction"){

                @Override
                protected IStatus run( IProgressMonitor monitor ) {

                    monitor.beginTask( "HIV " + predictionName 
                                       + " susceptibility prediction", 
                                       filelist.size()+1 );
                    monitor.worked( 1 );

                    for (IFile file : filelist){
                        monitor.subTask( "Predicting file: " +  file.getName() );

                        try {
                            setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
                            doPrediction(file.getRawLocation().toOSString());
                            setProperty(IProgressConstants.ACTION_PROPERTY, JobSuccessAction());
                            monitor.worked( 1 );
                        } catch ( Exception e ) {
                            String emsg="Error predicting sequence: " + e.getMessage();
                            logger.error( emsg );
                            setProperty(IProgressConstants.ACTION_PROPERTY, JobErrorAction(new Status( IStatus.ERROR, Activator.PLUGIN_ID, emsg )));
                        }
                    }

                    monitor.done();

                    return Status.OK_STATUS;
                }

            };

            hivpredJob.setUser( true );
            hivpredJob.schedule();

        }

        return null;
    }

    protected Action JobErrorAction(final IStatus errorStatus) {
        return new Action(predictionName + " failed.") {
          public void run() {
              System.out.println("Error dlg");
              ErrorDialog dlg=new ErrorDialog( PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                                               "Error predicting suceptibility", 
                                               errorStatus.getMessage(), 
                                               errorStatus, 
                                               0 );
              dlg.open();
          }
        };
      }

    protected Action JobSuccessAction() {
        return new Action(predictionName + " completed successfully.") {
          public void run() {
              System.out.println("Success!");
          }
        };
      }

    protected abstract void doPrediction( String filepath );
}
