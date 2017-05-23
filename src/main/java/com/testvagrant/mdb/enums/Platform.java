package com.testvagrant.mdb.enums;

public enum Platform {

    ANDROID("android"),
    IOS("ios");

    private String name;
    Platform(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
