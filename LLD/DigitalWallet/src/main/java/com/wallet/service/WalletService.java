package com.wallet.service;

import com.wallet.dao.WalletDao;
import com.wallet.model.Account;
import com.wallet.model.Transaction;

import java.math.BigDecimal;
import java.util.Date;

public class WalletService {

    private WalletDao walletDao = new WalletDao();

    public void createWallet(String name, BigDecimal balance){
        Account account = new Account(name, balance);
        walletDao.getAccountMap().put(account.getAccountNo(), account);
        System.out.println("Account created for user " + name + " with account number " + account.getAccountNo());
    }

    public void transfer(int from, int to, BigDecimal amount){
        if(!validate(from, to, amount)) {
            return;
        }

        Transaction transaction = new Transaction(from, to, amount, new Date());
        Account sender = walletDao.getAccountMap().get(from);
        Account reciver = walletDao.getAccountMap().get(to);
        if(sender.getBalance().compareTo(amount) < 0) {
            System.out.println("Insufficient Balance");
            return;
        }
        sender.setBalance(sender.getBalance().min(amount));
        reciver.setBalance(reciver.getBalance().add(amount));
        sender.getTransactionList().add(transaction);
        reciver.getTransactionList().add(transaction);
        System.out.println("Transfer Successful");
    }

    private boolean validate(int fromAccNum, int toAccNum, BigDecimal transferAmount) {
        if(fromAccNum == toAccNum) {
            System.out.println("Sender and Receiver cannot be same.");
            return false;
        }
        if (transferAmount.compareTo(new BigDecimal(0.0001)) < 0) {
            System.out.println("Amount too low");
            return false;
        }
        if (!walletDao.getAccountMap().containsKey(fromAccNum)) {
            System.out.println("Invalid Sender account number");
            return false;
        }
        if (!walletDao.getAccountMap().containsKey(toAccNum)) {
            System.out.println("Invalid Receiver account number");
            return false;
        }
        return true;
    }

    public void checkStatement(int accontNum){
        Account account = walletDao.getAccountMap().get(accontNum);
        if(account == null){
            System.out.println("No account found");
            return;
        }
        System.out.println("Summary for account number: " + account.getAccountNo());
        System.out.println("Current Balance: " + account.getBalance());
        System.out.println("Your Transaction History");
        System.out.println(account.getTransactionList());
    }

    public void overview() {
        for (int accNum : walletDao.getAccountMap().keySet()) {
            System.out.print("Balance for account number " + accNum + ": ");
            System.out.println(walletDao.getAccountMap().get(accNum).getBalance());
        }
    }
}
