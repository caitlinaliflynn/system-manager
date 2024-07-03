package com.practice.systemmanager.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
public class TransferLog extends AbstractEntity {

    @NotBlank(message = "Account Title is required.")
    @Size(min = 2, max = 100, message = "Account Title must be 2-100 characters long.")
    private String accountTitle;

    @NotBlank(message = "Customer name is required.")
    @Size(min = 2, max = 100, message = "Customer Name must be 2-100 characters long.")
    private String customerName;

    @NotBlank(message = "Field is required.")
    private String accountStatus;

    private String accountFrom;

    private String accountTo;

    private String amount;

    private MethodReceivedBy methodReceivedBy;

    @NotBlank(message = "Employee taken by is required.")
    private String employeeTakenBy;

    @NotBlank(message = "Employee input by is required.")
    private String employeeInputBy;

    public TransferLog() {

    }

    public TransferLog(String accountTitle, String customerName, String accountStatus, String accountFrom, String accountTo, String amount, String employeeTakenBy, String employeeInputBy, MethodReceivedBy methodReceivedBy) {
        this.accountTitle = accountTitle;
        this.customerName = customerName;
        this.accountStatus = accountStatus;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
        this.employeeTakenBy = employeeTakenBy;
        this.employeeInputBy = employeeInputBy;
        this.methodReceivedBy = methodReceivedBy;
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

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    public String getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(String accountTo) {
        this.accountTo = accountTo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getEmployeeTakenBy() {
        return employeeTakenBy;
    }

    public void setEmployeeTakenBy(String employeeTakenBy) {
        this.employeeTakenBy = employeeTakenBy;
    }

    public String getEmployeeInputBy() {
        return employeeInputBy;
    }

    public void setEmployeeInputBy(String employeeInputBy) {
        this.employeeInputBy = employeeInputBy;
    }

    public MethodReceivedBy getMethodReceivedBy() {
        return methodReceivedBy;
    }

    public void setMethodReceivedBy(MethodReceivedBy methodReceivedBy) {
        this.methodReceivedBy = methodReceivedBy;
    }

    @Override
    public String toString() {
        return accountTitle + " | " + customerName + " | " + accountStatus + " | " + methodReceivedBy + " | " + accountFrom + " | " + accountTo + " | " + amount + " | " + employeeTakenBy + " | " + employeeInputBy;
    }

}
