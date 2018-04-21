package com.ten_thousand.silver_paving.dto;

public class AccountDto {
   private int accountId;
    private double totalDeposits;
    private double balance;
    private double amountInvest;
    private int investorId;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getTotalDeposits() {
        return totalDeposits;
    }

    public void setTotalDeposits(double totalDeposits) {
        this.totalDeposits = totalDeposits;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmountInvest() {
        return amountInvest;
    }

    public void setAmountInvest(double amountInvest) {
        this.amountInvest = amountInvest;
    }

    public int getInvestorId() {
        return investorId;
    }

    public void setInvestorId(int investorId) {
        this.investorId = investorId;
    }
}
