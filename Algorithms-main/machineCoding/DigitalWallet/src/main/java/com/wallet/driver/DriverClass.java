package com.wallet.driver;

import com.wallet.service.WalletService;

import java.math.BigDecimal;

public class DriverClass {

    public static void main(String[] args) {

        WalletService walletService = new WalletService();
        walletService.createWallet("Happy Singh", BigDecimal.valueOf(10000));
        walletService.createWallet("Param Singh", BigDecimal.valueOf(1000));

        walletService.transfer(1, 2, BigDecimal.valueOf(100));

        walletService.checkStatement(1);
        walletService.checkStatement(2);

        walletService.overview();
    }
}
