package com.testvagrant.mdb.device;

import com.testvagrant.commons.entities.device.Platform;
import com.testvagrant.mdb.core.Mobile;
import com.testvagrant.mdb.enums.AOSVersion;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AOSVersionTest {

    private String v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,
    v16,v17,v18,v19,v20,v21,v22;

    private Platform platform = Platform.ANDROID;
    @BeforeMethod
    public void setup() {
        v1 = "1.6";v2 = "2.0";v3 = "2.1";v4 = "2.2";v5 = "2.2.3";v6 = "2.3";v7 = "2.3.1";
        v8 = "2.3.2";v9 = "3.0";v10 = "3.2.1";v11 = "4.0";v12 = "4.0.4";v13 = "4.1";v14 = "4.3.1";
        v15 = "4.4";v16 = "4.4.4";v17 = "5.0";v18 = "5.1.1";v19 = "6.0";v20 = "6.0.1";v21 = "7.0";v22 = "7.1.2";
    }

    @Test
    public void verifyAllTheAOSVersions() {
        Assert.assertEquals(AOSVersion.DONUT, Mobile.getOSVersion(platform,v1));
        Assert.assertEquals(AOSVersion.ECLAIR, Mobile.getOSVersion(platform,v2));
        Assert.assertEquals(AOSVersion.ECLAIR, Mobile.getOSVersion(platform,v3));
        Assert.assertEquals(AOSVersion.FROYO, Mobile.getOSVersion(platform,v4));
        Assert.assertEquals(AOSVersion.FROYO,Mobile.getOSVersion(platform,v5));
        Assert.assertEquals(AOSVersion.GINGERBREAD,Mobile.getOSVersion(platform,v6));
        Assert.assertEquals(AOSVersion.GINGERBREAD,Mobile.getOSVersion(platform,v7));
        Assert.assertEquals(AOSVersion.GINGERBREAD,Mobile.getOSVersion(platform,v8));
        Assert.assertEquals(AOSVersion.HONEYCOMB,Mobile.getOSVersion(platform,v9));
        Assert.assertEquals(AOSVersion.HONEYCOMB,Mobile.getOSVersion(platform,v10));
        Assert.assertEquals(AOSVersion.ICE_CREAM_SANDWICH,Mobile.getOSVersion(platform,v11));
        Assert.assertEquals(AOSVersion.ICE_CREAM_SANDWICH,Mobile.getOSVersion(platform,v12));
        Assert.assertEquals(AOSVersion.JELLY_BEAN,Mobile.getOSVersion(platform,v13));
        Assert.assertEquals(AOSVersion.JELLY_BEAN,Mobile.getOSVersion(platform,v14));
        Assert.assertEquals(AOSVersion.KITKAT,Mobile.getOSVersion(platform,v15));
        Assert.assertEquals(AOSVersion.KITKAT,Mobile.getOSVersion(platform,v16));
        Assert.assertEquals(AOSVersion.LOLLIPOP,Mobile.getOSVersion(platform,v17));
        Assert.assertEquals(AOSVersion.LOLLIPOP,Mobile.getOSVersion(platform,v18));
        Assert.assertEquals(AOSVersion.MARSHMALLOW,Mobile.getOSVersion(platform,v19));
        Assert.assertEquals(AOSVersion.MARSHMALLOW,Mobile.getOSVersion(platform,v20));
        Assert.assertEquals(AOSVersion.NOUGAT,Mobile.getOSVersion(platform,v21));
        Assert.assertEquals(AOSVersion.NOUGAT,Mobile.getOSVersion(platform,v22));
    }
}
