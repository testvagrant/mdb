package com.testvagrant.mdb.enums;


public enum  AOSVersion implements OSVersion {

    DONUT("Donut",1.6),
    ECLAIR("Eclair",2.1),
    FROYO("Froyo",2.2),
    GINGERBREAD("Gingerbread",2.3),
    HONEYCOMB("Honeycomb",3.0),
    ICE_CREAM_SANDWICH("Ice Cream Sandwich",4.0),
    JELLY_BEAN("Jelly Bean",4.1),
    KITKAT("Kitkat",4.4),
    LOLLIPOP("Lollipop",5.0),
    MARSHMALLOW("Marshmallow",6.0),
    NOUGAT("Nougat",7.0);

    private double versionNumber;
    private String name;
    AOSVersion(String name, double versionNumber) {
        this.versionNumber = versionNumber;
        this.name = name;
    }

    public double getVersion() {
        return versionNumber;
    }


    public String getName() {
        return name;
    }
}
