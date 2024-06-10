package com.practice.systemmanager.models;

import javax.swing.text.Style;

public enum MethodReceivedBy {

    PHONE("Phone"),
    EMAIL("Email"),
    WALK_IN("Walk-in");

    private final String displayName;

    MethodReceivedBy(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
