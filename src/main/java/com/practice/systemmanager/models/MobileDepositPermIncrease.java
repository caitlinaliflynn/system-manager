package com.practice.systemmanager.models;

import jakarta.persistence.Entity;

@Entity
public class MobileDepositPermIncrease extends AbstractEntity {

    private String date;

    private String approvedBy;

    private String accountTitle;

    private String customerName;

    private String username;

    private String originalDailyCount;

    private String newDailyCount;

    private String originalDailyAmount;

    private String newDailyAmount;

    private String originalMonthlyCount;

    private String newMonthlyCount;

    private String originalMonthlyAmount;

    private String newMonthlyAmount;

    private String enteredBy;

    private String verifiedBy;

    public MobileDepositPermIncrease() {

    }

    public MobileDepositPermIncrease(String date, String approvedBy, String accountTitle, String customerName, String username, String originalDailyCount, String newDailyCount, String originalDailyAmount, String newDailyAmount, String originalMonthlyCount, String newMonthlyCount, String originalMonthlyAmount, String newMonthlyAmount, String enteredBy, String verifiedBy) {
        this.date = date;
        this.approvedBy = approvedBy;
        this.accountTitle = accountTitle;
        this.customerName = customerName;
        this.username = username;
        this.originalDailyCount = originalDailyCount;
        this.newDailyCount = newDailyCount;
        this.originalDailyAmount = originalDailyAmount;
        this.newDailyAmount = newDailyAmount;
        this.originalMonthlyCount = originalMonthlyCount;
        this.newMonthlyCount = newMonthlyCount;
        this.originalMonthlyAmount = originalMonthlyAmount;
        this.newMonthlyAmount = newMonthlyAmount;
        this.enteredBy = enteredBy;
        this.verifiedBy = verifiedBy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOriginalDailyCount() {
        return originalDailyCount;
    }

    public void setOriginalDailyCount(String originalDailyCount) {
        this.originalDailyCount = originalDailyCount;
    }

    public String getNewDailyCount() {
        return newDailyCount;
    }

    public void setNewDailyCount(String newDailyCount) {
        this.newDailyCount = newDailyCount;
    }

    public String getOriginalDailyAmount() {
        return originalDailyAmount;
    }

    public void setOriginalDailyAmount(String originalDailyAmount) {
        this.originalDailyAmount = originalDailyAmount;
    }

    public String getNewDailyAmount() {
        return newDailyAmount;
    }

    public void setNewDailyAmount(String newDailyAmount) {
        this.newDailyAmount = newDailyAmount;
    }

    public String getOriginalMonthlyCount() {
        return originalMonthlyCount;
    }

    public void setOriginalMonthlyCount(String originalMonthlyCount) {
        this.originalMonthlyCount = originalMonthlyCount;
    }

    public String getNewMonthlyCount() {
        return newMonthlyCount;
    }

    public void setNewMonthlyCount(String newMonthlyCount) {
        this.newMonthlyCount = newMonthlyCount;
    }

    public String getOriginalMonthlyAmount() {
        return originalMonthlyAmount;
    }

    public void setOriginalMonthlyAmount(String originalMonthlyAmount) {
        this.originalMonthlyAmount = originalMonthlyAmount;
    }

    public String getNewMonthlyAmount() {
        return newMonthlyAmount;
    }

    public void setNewMonthlyAmount(String newMonthlyAmount) {
        this.newMonthlyAmount = newMonthlyAmount;
    }

    public String getEnteredBy() {
        return enteredBy;
    }

    public void setEnteredBy(String enteredBy) {
        this.enteredBy = enteredBy;
    }

    public String getVerifiedBy() {
        return verifiedBy;
    }

    public void setVerifiedBy(String verifiedBy) {
        this.verifiedBy = verifiedBy;
    }

    @Override
    public String toString() {
        return date + " | " + approvedBy + " | " + accountTitle + " | " + customerName + " | " +  username + " | " + originalDailyCount + " | " + newDailyCount + " | " + originalDailyAmount + " | " + newDailyAmount + " | " + originalMonthlyCount + " | " + newMonthlyCount + " | " + originalMonthlyAmount + " | " + newMonthlyAmount + " | " + enteredBy + " | " + verifiedBy;

    }
}
