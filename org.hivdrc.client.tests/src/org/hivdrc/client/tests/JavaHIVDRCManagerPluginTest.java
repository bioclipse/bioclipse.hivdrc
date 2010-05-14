/*******************************************************************************
 * Copyright (c) 2010  Ola Spjuth <ola@bioclipse.net>
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * www.eclipse.org—epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>
 * 
 * Contact: http://www.bioclipse.net/    
 ******************************************************************************/
package org.hivdrc.client.tests;

import org.junit.BeforeClass;

public class JavaHIVDRCManagerPluginTest
    extends AbstractHIVDRCManagerPluginTest {

    @BeforeClass public static void setup() {
        hivdrc = org.hivdrc.client.Activator.getDefault()
            .getJavaHIVDRCManager();
    }

}