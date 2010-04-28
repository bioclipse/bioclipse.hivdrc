package org.hivdrc.client.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

public class HivpredAction extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {

		//Get current selection
		ISelection selection=
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().
			getSelectionService().getSelection();

		//Handle case when text is selected
		if (selection instanceof ITextSelection) {
			ITextSelection textSel = (ITextSelection) selection;
			System.out.println("Predict for text: " + textSel.getText());

			return null;
		}

		//Handle case when file(s) selected
		else if (selection instanceof IStructuredSelection) {
			IStructuredSelection structsel = (IStructuredSelection) selection;

			List<IFile> filelist=new ArrayList<IFile>();
			Iterator<?> it = structsel.iterator();
			while (it.hasNext()){
				Object o=it.next();
				if (o instanceof IFile) {
					IFile file = (IFile) o;
					filelist.add(file);
				}
			}
			
			if (filelist.size()<0) return null;
			
			for (IFile file : filelist){
				System.out.println("Predicting file: " + file);
			}
		}
		
		return null;
	}


}
