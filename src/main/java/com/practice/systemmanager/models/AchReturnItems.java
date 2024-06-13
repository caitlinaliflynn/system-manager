package com.practice.systemmanager.models;

import jakarta.persistence.Entity;

@Entity
public class AchReturnItems extends AbstractEntity {

    private String date;

    private String originator;

    private String receiver;

    private String amount;
    private String accountStatus;

    private String retReasonCode;

    public AchReturnItems() {

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getRetReasonCode() {
        return retReasonCode;
    }

    public void setRetReasonCode(String retReasonCode) {
        this.retReasonCode = retReasonCode;
    }

    @Override
    public String toString() {
        return date + " | " + originator + " | " + receiver + " | " + amount + " | " +  accountStatus + " | " + retReasonCode;

    }
}
