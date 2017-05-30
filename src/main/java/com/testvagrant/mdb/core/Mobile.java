package com.testvagrant.mdb.core;


import com.testvagrant.mdb.Exceptions.ConnectedDevicesException;
import com.testvagrant.mdb.enums.AOSVersion;
import com.testvagrant.mdb.enums.IOSVersion;
import com.testvagrant.mdb.enums.OSVersion;
import com.testvagrant.mdb.enums.Platform;
import com.testvagrant.mdb.utils.Commands;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public abstract class Mobile {

    protected CommandExecutor commandExecutor;

    protected Mobile() {
        commandExecutor = new CommandExecutor();
    }

    public List<String> collectDevicesOutput(Platform platform) {
        String command = null;
        switch (platform) {
            case ANDROID:
                command = Commands.AndroidCommands.LIST_ALL_DEVICES;
                break;
            case IOS:
                command = Commands.Instruments.LIST_ALL_DEVICES;
                break;
        }
        List<String> devices = new CommandExecutor().exec(command).asList();
        return devices;
    }

    protected abstract void collectDeviceDetails();


    public static OSVersion getOSVersion(Platform platform, String versionNumber) {
        switch (platform) {
            case ANDROID:
                Optional<AOSVersion> aosVersion = Arrays.stream(AOSVersion.values()).filter(OSVersion -> OSVersion.getVersion()== NumberUtils.toDouble(versionNumber)).findFirst();
                if(aosVersion.isPresent()) {
                    return aosVersion.get();
                } else
                    throw new ConnectedDevicesException(String.format("Cannot read the Android OS version %s , is the device valid??",versionNumber));
            case IOS:
                Optional<IOSVersion> iosVersion = Arrays.stream(IOSVersion.values()).filter(OSVersion -> OSVersion.getVersion()==NumberUtils.toDouble(versionNumber)).findFirst();
                if(iosVersion.isPresent()) {
                    return iosVersion.get();
                } else {
                    throw new ConnectedDevicesException(String.format("Cannot read the IOS OS version %s, is the device valid??",versionNumber));
                }
        }
        throw new RuntimeException("Failed to get OS Version");
    }



}
