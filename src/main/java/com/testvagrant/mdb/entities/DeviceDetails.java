package com.testvagrant.mdb.entities;


import com.testvagrant.mdb.enums.DeviceType;
import com.testvagrant.mdb.enums.OSVersion;
import com.testvagrant.mdb.enums.Platform;
import com.testvagrant.mdb.enums.Status;

public class DeviceDetails {

    private String deviceName;
    private Platform platform;
    private OSVersion osVersion;
    private DeviceType deviceType;
    private Status status;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public OSVersion getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(OSVersion osVersion) {
        this.osVersion = osVersion;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
