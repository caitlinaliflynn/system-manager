package com.practice.systemmanager.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
public class WireLog extends AbstractEntity {

    @NotBlank(message = "Account Title is required.")
    @Size(min = 2, max = 100, message = "Account Title must be 2-100 characters long.")
    private String accountTitle;

    private String amount;

    @NotBlank(message = "OFAC checked by is required.")
    private String ofacCheckedBy;

    @NotBlank(message = "Originated by is required.")
    private String originatedBy;

    @NotBlank(message = "Time originated is required.")
    private String timeOriginated;

    @NotBlank(message = "Verified by is required.")
    private String verifiedBy;

    @NotBlank(message = "Time verified is required.")
    private String timeVerified;

    @NotBlank(message = "Released by is required.")
    private String releasedBy;

    @NotBlank(message = "Time released is required.")
    private String timeReleased;

    public WireLog() {
    }

    public WireLog(String accountTitle, String amount, String ofacCheckedBy, String originatedBy, String timeOriginated, String verifiedBy, String timeVerified, String releasedBy, String timeReleased) {
        this.accountTitle = accountTitle;
        this.amount = amount;
        this.ofacCheckedBy = ofacCheckedBy;
        this.originatedBy = originatedBy;
        this.timeOriginated = timeOriginated;
        this.verifiedBy = verifiedBy;
        this.timeVerified = timeVerified;
        this.releasedBy = releasedBy;
        this.timeReleased = timeReleased;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOfacCheckedBy() {
        return ofacCheckedBy;
    }

    public void setOfacCheckedBy(String ofacCheckedBy) {
        this.ofacCheckedBy = ofacCheckedBy;
    }

    public String getOriginatedBy() {
        return originatedBy;
    }

    public void setOriginatedBy(String originatedBy) {
        this.originatedBy = originatedBy;
    }

    public String getTimeOriginated() {
        return timeOriginated;
    }

    public void setTimeOriginated(String timeOriginated) {
        this.timeOriginated = timeOriginated;
    }

    public String getVerifiedBy() {
        return verifiedBy;
    }

    public void setVerifiedBy(String verifiedBy) {
        this.verifiedBy = verifiedBy;
    }

    public String getTimeVerified() {
        return timeVerified;
    }

    public void setTimeVerified(String timeVerified) {
        this.timeVerified = timeVerified;
    }

    public String getReleasedBy() {
        return releasedBy;
    }

    public void setReleasedBy(String releasedBy) {
        this.releasedBy = releasedBy;
    }

    public String getTimeReleased() {
        return timeReleased;
    }

    public void setTimeReleased(String timeReleased) {
        this.timeReleased = timeReleased;
    }

    @Override
    public String toString() {
        return accountTitle + " | " + amount + " | " + ofacCheckedBy + " | " + originatedBy + " | " + verifiedBy + " | " + releasedBy;
    }

}
