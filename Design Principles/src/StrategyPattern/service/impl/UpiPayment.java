package StrategyPattern.service.impl;

import StrategyPattern.strategy.PaymentStrategy;

/**
 * Handles UPI payments (NPCI / VPA based).
 * In production: integrate payment gateway UPI API here.
 */
public class UpiPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}