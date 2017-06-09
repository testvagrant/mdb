package com.testvagrant.mdb.utils;

import com.testvagrant.commons.entities.device.OSVersion;
import com.testvagrant.commons.entities.device.Platform;
import com.testvagrant.mdb.core.Mobile;
import com.testvagrant.mdb.enums.AOSVersion;
import com.testvagrant.mdb.enums.IOSVersion;
import org.junit.Assert;
import org.junit.Test;


public class OSVersionTest {

    @Test
    public void osVersion() {
       OSVersion android =  Mobile.getOSVersion(Platform.ANDROID,"2.0.1");
        Assert.assertEquals(AOSVersion.ECLAIR,android);
        OSVersion ios =  Mobile.getOSVersion(Platform.IOS,"10.3");
        Assert.assertEquals(IOSVersion.ERIE,ios);
        OSVersion ios1 =  Mobile.getOSVersion(Platform.IOS,"9.3");
        Assert.assertEquals(IOSVersion.EAGLE,ios1);
    }
}
