package com.wallet.model;

import com.wallet.util.AccountNumberGenerator;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

public class Account {

    private int accountNo;

    private User user;

    private BigDecimal balance;

    private Set<Transaction> transactionList;

    public Account(String name, BigDecimal amount) {
        this.accountNo = AccountNumberGenerator.getNextAccountNumber();
        this.user = new User(name);
        this.balance = amount;
        this.transactionList = new TreeSet<>((a, b) -> a.getDate().compareTo(b.getDate()));
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", user=" + user +
                ", balance=" + balance +
                ", transactionList=" + transactionList +
                '}';
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Set<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(Set<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}
