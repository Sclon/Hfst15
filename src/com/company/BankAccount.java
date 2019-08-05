package com.company;

import java.util.Objects;

public class BankAccount {
    private double amount;
    private String idNumber;

    public BankAccount(double amount, String idNumber) {
        this.amount = amount;
        this.idNumber = idNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof BankAccount)) {
            return false;
        }
        return ((BankAccount) o).idNumber == this.idNumber;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long amountLong = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (amountLong ^ (amountLong >>> 32));
        result = 31 * result + idNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "amount=" + amount +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
