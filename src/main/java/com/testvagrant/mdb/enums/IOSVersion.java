package com.testvagrant.mdb.enums;

public enum IOSVersion implements OSVersion {

    BIG_BEAR("Big Bear",2.0),
    SUGARBOWL("Sugarbowl",2.1),
    TIMBERLINE("Timberline",2.2),
    KIRKWOOD("Kirkwood",3.0),
    NORTHSTAR("Northstar",3.1),
    WILDCAT("Wildcat",3.2),
    APEX("Apex",4.0),
    BAKER("Baker",4.1),
    JASPER("Jasper",4.2),
    DURANGO("Durango",4.3),
    TELLURIDE("Telluride",5.0),
    HOODOO("Hoodoo",5.1),
    SUNDANCE("Sundance",6.0),
    BRIGHTON("Brighton",6.1),
    INNSBRUCK("Innsbruck",7.0),
    SOCHI("Sochi",7.1),
    OKEMO("Okemo",8.0),
    OKEMO_TAOS("OkemoTaos",8.1),
    OKEMO_ZURS("OkemoZurs",8.2),
    STOWE("Stowe",8.3),
    COPPER("Copper",8.4),
    MONARCH("Monarch",9.0),
    BOULDER("Bourlder",9.1),
    CASTLEROCK("Castlerock",9.2),
    EAGLE("Eagle",9.3),
    WHITETAIL("Whitetail",10.0),
    BUTLER("Butler",10.1),
    CORRY("Corry",10.2),
    ERIE("Erie",10.3);


    private double versionNumber;
    private String name;
    IOSVersion(String name, double versionNumber) {
        this.name = name;
        this.versionNumber = versionNumber;
    }

    public double getVersion() {
        return versionNumber;
    }

    public String getName() {
        return name;
    }
}
