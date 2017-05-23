package com.testvagrant.mdb.predicates.filters;


import com.testvagrant.mdb.entities.DeviceDetails;
import com.testvagrant.mdb.enums.AOSVersion;
import com.testvagrant.mdb.enums.OSVersion;
import com.testvagrant.mdb.predicates.MobileFilters;

import java.util.function.Predicate;

public class OSFilter extends MobileFilters {

    public static Predicate<DeviceDetails> eq(OSVersion osVersion) {
        return deviceDetails -> deviceDetails.getOsVersion().equals(osVersion);
    }

    public static Predicate<DeviceDetails> gt(OSVersion version) {
        return deviceDetails -> deviceDetails.getOsVersion().getVersionNumber()>version.getVersionNumber();
    }

    public static Predicate<DeviceDetails> gte(OSVersion version) {
        return deviceDetails -> deviceDetails.getOsVersion().getVersionNumber()>=version.getVersionNumber();
    }

    public static Predicate<DeviceDetails> lt(OSVersion version) {
        return deviceDetails -> deviceDetails.getOsVersion().getVersionNumber()<version.getVersionNumber();
    }

    public static Predicate<DeviceDetails> lte(OSVersion version) {
        return deviceDetails -> deviceDetails.getOsVersion().getVersionNumber()<=version.getVersionNumber();
    }
}
