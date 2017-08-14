package com.testvagrant.mdb.device.verification;

import com.testvagrant.commons.entities.DeviceDetails;
import com.testvagrant.commons.entities.device.DeviceType;
import com.testvagrant.commons.entities.device.Status;
import com.testvagrant.mdb.device.DeviceDetailsBase;
import com.testvagrant.mdb.enums.AOSVersion;
import com.testvagrant.mdb.helpers.AndroidHelper;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.Mockito.when;

public class AndroidHelperTest extends DeviceDetailsBase {


    @InjectMocks
    List<DeviceDetails> deviceDetailsList = new ArrayList<>();

    @Mock
    AndroidHelper androidHelper = Mockito.spy(new AndroidHelper(deviceDetailsList));

    @BeforeTest
    public void setup() {
        when(androidHelper.getModel("ZY223D7XPB")).thenReturn("Moto G(4)");
        when(androidHelper.getModel("ZY223D7GPB")).thenReturn("Moto G(5)");
        when(androidHelper.getOSVersion("ZY223D7XPB")).thenReturn("7.0");
        when(androidHelper.getOSVersion("ZY223D7GPB")).thenReturn("8.0");
        when(androidHelper.getModel("192.168.56.101:5555")).thenReturn("Google Nexus 5 - 5.0.0 - API 21");
        when(androidHelper.getOSVersion("192.168.56.101:5555")).thenReturn("5.0");
        when(androidHelper.getModel("emulator-5554")).thenReturn("Android_SDK_built_for_x86_64");
        when(androidHelper.getOSVersion("emulator-5554")).thenReturn("5.0.1");
        androidHelper.initADevices(androidProcessLog());
        androidHelper.initEmulators(androidProcessLog());
    }


    @Test
    public void onAValidCommandExecutionDeviceDetailsShouldBeCorrect() {
        DeviceDetails deviceDetails = deviceDetailsList.get(0);
        Assert.assertEquals("Moto G(4)",deviceDetails.getDeviceName());
        Assert.assertEquals(DeviceType.DEVICE,deviceDetails.getDeviceType());
        Assert.assertEquals(AOSVersion.NOUGAT,AOSVersion.valueOf(deviceDetails.getOsVersion().getName().toUpperCase()));
        Assert.assertEquals(Status.Available,deviceDetails.getStatus());
    }

    @Test
    public void onAValidCommandExecutionEmulatorDetailsShouldBeCorrect() {
        List<DeviceDetails> collectedDevices = deviceDetailsList.stream().filter(deviceDetails -> deviceDetails.getOsVersion().getName().equals(AOSVersion.LOLLIPOP.getName())).collect(Collectors.toList());
        Assert.assertEquals(2,collectedDevices.size());
    }


    @Test
    public void differentPlatformVersionsForSamePlatformShouldBeRecorded() {
        List<DeviceDetails> vFiveO1 = deviceDetailsList.stream().filter(deviceDetails -> deviceDetails.getOsVersion().getVersion().equals("5.0.1")).collect(Collectors.toList());
        Assert.assertEquals(1, vFiveO1.size());
        List<DeviceDetails> vFiveO = deviceDetailsList.stream().filter(deviceDetails -> deviceDetails.getOsVersion().getVersion().equals("5.0")).collect(Collectors.toList());
        Assert.assertEquals(1, vFiveO.size());
    }
}
