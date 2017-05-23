package com.testvagrant.mdb.enums;

public enum IOSVersion implements OSVersion {

    BIG_BEAR("Big Bear",2.0);


    private double versionNumber;
    private String name;
    IOSVersion(String name, double versionNumber) {
        this.name = name;
        this.versionNumber = versionNumber;
    }

    public double getVersionNumber() {
        return versionNumber;
    }

    public String getName() {
        return name;
    }
}
