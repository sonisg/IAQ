package com.wallet.util;

public class AccountNumberGenerator {

    private static int accountNumber = 1;

    public static int getNextAccountNumber() {
        return accountNumber++;
    }
}
