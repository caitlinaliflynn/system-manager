package com.practice.systemmanager.models;

public enum PaymentType {

    CHECK("Check"),

    DDA("DDA"),
    OTE("OTE"),
    SAVINGS("Savings"),
    AOC("AOC");

    private final String displayName;

    PaymentType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
