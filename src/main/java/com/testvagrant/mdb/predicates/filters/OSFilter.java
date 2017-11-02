package com.testvagrant.mdb.predicates.filters;


import com.testvagrant.commons.entities.DeviceDetails;
import com.testvagrant.commons.entities.device.OSVersion;
import com.testvagrant.mdb.predicates.MobileFilters;

import java.util.function.Predicate;

public class OSFilter extends MobileFilters {

    public static Predicate<DeviceDetails> eq(OSVersion osVersion) {
        return deviceDetails -> deviceDetails.getOsVersion().getVersion().equals(osVersion.getVersion());
    }

    public static Predicate<DeviceDetails> gt(OSVersion version) {
        return deviceDetails ->deviceDetails.getOsVersion().getBaseVersion()>version.getBaseVersion();

    }

    public static Predicate<DeviceDetails> gte(OSVersion version) {
        return deviceDetails -> deviceDetails.getOsVersion().getBaseVersion()>=version.getBaseVersion();
    }

    public static Predicate<DeviceDetails> lt(OSVersion version) {
        return deviceDetails -> deviceDetails.getOsVersion().getBaseVersion()<version.getBaseVersion();
    }

    public static Predicate<DeviceDetails> lte(OSVersion version) {
        return deviceDetails -> deviceDetails.getOsVersion().getBaseVersion()<=version.getBaseVersion();
    }
}
