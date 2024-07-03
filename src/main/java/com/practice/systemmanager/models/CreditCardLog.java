package com.practice.systemmanager.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class CreditCardLog extends AbstractEntity {

    @NotBlank(message = "Customer name is required.")
    @Size(min = 2, max = 100, message = "Customer Name must be 2-100 characters long.")
    private String customerName;

    private String cardNumber;

    private String amount;

    private PaymentType paymentType;

    @NotBlank(message = "Employee taken by is required.")
    private String employeeTakenBy;

    private String paymentMadeBy;

    public CreditCardLog() {

    }

    public CreditCardLog(String customerName, String cardNumber, String amount, PaymentType paymentType, String employeeTakenBy, String paymentMadeBy) {
        this.customerName = customerName;
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.paymentType = paymentType;
        this.employeeTakenBy = employeeTakenBy;
        this.paymentMadeBy = paymentMadeBy;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getEmployeeTakenBy() {
        return employeeTakenBy;
    }

    public void setEmployeeTakenBy(String employeeTakenBy) {
        this.employeeTakenBy = employeeTakenBy;
    }

    public String getPaymentMadeBy() {
        return paymentMadeBy;
    }

    public void setPaymentMadeBy(String paymentMadeBy) {
        this.paymentMadeBy = paymentMadeBy;
    }

    @Override
    public String toString() {
        return customerName + " | " + cardNumber + " | " + amount + " | " + paymentType + " | " +  employeeTakenBy + " | " + paymentMadeBy;

    }
}
