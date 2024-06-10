package com.practice.systemmanager.models;

public enum TransferType {

    LOAN("Loan"),
    REGULAR("Regular - 20"),
    PRINCIPLE("Principle - 42"),
    PAY_OFF("Pay-off - 24");

    private final String displayName;

    TransferType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
