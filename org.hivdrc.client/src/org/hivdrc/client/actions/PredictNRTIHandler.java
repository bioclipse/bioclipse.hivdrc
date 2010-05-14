package org.hivdrc.client.actions;

import net.bioclipse.core.business.BioclipseException;
import net.bioclipse.xws.exceptions.XmppException;
import net.bioclipse.xws4j.exceptions.Xws4jException;

import org.hivdrc.client.Activator;

/**
 * 
 * @author ola
 *
 */
public class PredictNRTIHandler extends AbstractHIVDRCHandler {

    @Override
    protected void doPrediction( String filepath ) throws Xws4jException, XmppException, InterruptedException, BioclipseException {
        Activator.getDefault().getJavaHIVDRCManager().predictNRTI( filepath );
    }

}
