package com.testvagrant.mdb.device;

import com.testvagrant.commons.entities.DeviceDetails;
import com.testvagrant.commons.entities.device.DeviceType;
import com.testvagrant.mdb.enums.IOSVersion;
import com.testvagrant.mdb.helpers.IOSHelper;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IOSHelperTest extends DeviceDetailsBase {

    @InjectMocks
    List<DeviceDetails> deviceDetailsList = new ArrayList<>();

    @Mock
    IOSHelper iosHelper = Mockito.spy(new IOSHelper(deviceDetailsList));

    @Test
    public void test() {
        iosHelper.initIDevices(iOSProcessLog());
        iosHelper.initSimulators(iOSProcessLog());
        Assert.assertEquals(5, deviceDetailsList.size());
        List<DeviceDetails> physicalDevices = deviceDetailsList.stream().filter(deviceDetails -> deviceDetails.getDeviceType().equals(DeviceType.DEVICE)).collect(Collectors.toList());
        List<DeviceDetails> simulatorDevices = deviceDetailsList.stream().filter(deviceDetails -> deviceDetails.getDeviceType().equals(DeviceType.SIMULATOR)).collect(Collectors.toList());
        Assert.assertEquals(1, physicalDevices.size());
        Assert.assertEquals(4, simulatorDevices.size());
        Assert.assertEquals(IOSVersion.WHITETAIL, physicalDevices.get(0).getOsVersion());
        simulatorDevices.forEach(simulatorDevice -> {
            Assert.assertEquals(IOSVersion.EAGLE, simulatorDevice.getOsVersion());
        });
    }


}
