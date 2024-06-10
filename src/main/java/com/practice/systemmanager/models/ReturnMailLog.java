package com.practice.systemmanager.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class ReturnMailLog extends AbstractEntity {

    @NotBlank(message = "Account Title is required.")
    @Size(min = 2, max = 100, message = "Account Title must be 2-100 characters long.")
    private String accountTitle;

    private String firstLetterDate;

    private String secondLetterDate;

    private String thirdLetterDate;

    private String onlineBanking;

    @NotBlank(message = "Field is required.")
    private String accountStatus;

    private String notes;

    public ReturnMailLog() {
    }

    public ReturnMailLog(String accountTitle, String firstLetterDate, String secondLetterDate, String thirdLetterDate, String onlineBanking, String accountStatus, String notes) {
        this.accountTitle = accountTitle;
        this.firstLetterDate = firstLetterDate;
        this.secondLetterDate = secondLetterDate;
        this.thirdLetterDate = thirdLetterDate;
        this.onlineBanking = onlineBanking;
        this.accountStatus = accountStatus;
        this.notes = notes;
    }


    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public String getFirstLetterDate() {
        return firstLetterDate;
    }

    public void setFirstLetterDate(String firstLetterDate) {
        this.firstLetterDate = firstLetterDate;
    }

    public String getSecondLetterDate() {
        return secondLetterDate;
    }

    public void setSecondLetterDate(String secondLetterDate) {
        this.secondLetterDate = secondLetterDate;
    }

    public String getThirdLetterDate() {
        return thirdLetterDate;
    }

    public void setThirdLetterDate(String thirdLetterDate) {
        this.thirdLetterDate = thirdLetterDate;
    }

    public String getOnlineBanking() {
        return onlineBanking;
    }

    public void setOnlineBanking(String onlineBanking) {
        this.onlineBanking = onlineBanking;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return accountTitle + " | " + firstLetterDate + " | " + secondLetterDate + " | " + thirdLetterDate + " | " + onlineBanking + " | " + accountStatus;
    }


}
