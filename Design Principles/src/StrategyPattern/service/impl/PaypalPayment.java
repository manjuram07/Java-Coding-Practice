package StrategyPattern.service.impl;

import StrategyPattern.strategy.PaymentStrategy;

/**
 * Handles in-app Wallet payments.
 * In production: replace walletBalances with a DB-backed WalletRepository.
 */
public class PaypalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}