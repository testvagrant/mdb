package com.testvagrant.mdb.android;


import com.testvagrant.mdb.entities.DeviceDetails;

import java.util.List;
import java.util.function.Predicate;

public class ADBImpl implements ADB {

    public List<DeviceDetails> getDevices() {
        return null;
    }

    @Override
    public List<DeviceDetails> getDevices(Predicate<DeviceDetails> deviceFilter) {
        return null;
    }

    @Override
    public List<DeviceDetails> getDevices(Predicate<DeviceDetails> deviceFilter, Predicate<DeviceDetails> deviceFilter1) {
        return null;
    }

    @Override
    public List<DeviceDetails> getDevices(Predicate<DeviceDetails> deviceFilter, Predicate<DeviceDetails> deviceFilter2, Predicate<DeviceDetails> deviceFilter3) {
        return null;
    }

    public String getDeviceModel(String deviceUDID) {
        return null;
    }

    public String getDeviceOS(String deviceUDID) {
        return null;
    }
}
