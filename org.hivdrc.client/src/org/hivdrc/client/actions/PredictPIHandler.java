package org.hivdrc.client.actions;

import net.bioclipse.xws.exceptions.XmppException;
import net.bioclipse.xws4j.exceptions.Xws4jException;

import org.hivdrc.client.Activator;

/**
 * 
 * @author ola
 *
 */
public class PredictPIHandler extends AbstractHIVDRCHandler {

    @Override
    protected void doPrediction( String filepath ) throws Xws4jException, XmppException, InterruptedException {
        Activator.getDefault().getJavaHIVDRCManager().predictPI( filepath );
    }

}
