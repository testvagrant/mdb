package com.testvagrant.mdb.enums;

public enum Status {

    AVAILABLE("Available"),
    ENGAGED("Engaged"),
    OFFLINE("Offline");

    private String status;
    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
