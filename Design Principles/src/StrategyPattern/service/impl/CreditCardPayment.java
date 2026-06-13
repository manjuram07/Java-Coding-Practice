package StrategyPattern.service.impl;

import StrategyPattern.strategy.PaymentStrategy;

/**
 * Handles CREDIT_CARD and DEBIT_CARD payments.
 * In production: integrate Stripe / Razorpay SDK here.
 */
public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}