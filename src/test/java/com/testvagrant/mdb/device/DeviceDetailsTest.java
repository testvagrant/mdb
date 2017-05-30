package com.testvagrant.mdb.device;


import com.testvagrant.commons.entities.DeviceDetails;
import com.testvagrant.commons.entities.device.Platform;
import com.testvagrant.mdb.android.ADB;
import com.testvagrant.mdb.core.Mobile;
import com.testvagrant.mdb.enums.AOSVersion;
import com.testvagrant.mdb.enums.IOSVersion;
import com.testvagrant.mdb.ios.IDB;
import com.testvagrant.mdb.ios.IOS;
import com.testvagrant.mdb.predicates.filters.DeviceTypeFilter;
import com.testvagrant.mdb.predicates.filters.OSFilter;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.when;

public class DeviceDetailsTest extends DeviceDetailsBase {


    ADB android;
    IDB ios;

    Mobile mobile = Mockito.mock(Mobile.class);

    @Before
    public void before() {
//        android = new Android();
        ios = new IOS();
        when(mobile.collectDevicesOutput(Platform.ANDROID)).thenReturn(androidProcessLog());
        when(mobile.collectDevicesOutput(Platform.IOS)).thenReturn(iOSProcessLog());
    }
    @Test
    public void androidDeviceDetails() {
        List<DeviceDetails> devices = android.getDevices(OSFilter.gte(AOSVersion.LOLLIPOP));
        System.out.println(devices);
    }

    @Test
    public void iosDeviceDetails() {
        List<DeviceDetails> devices = ios.getDevices(OSFilter.eq(IOSVersion.EAGLE), DeviceTypeFilter.ofTypeSimulators());
        System.out.println(devices);
    }



}
