package StrategyPattern.service;


import StrategyPattern.strategy.PaymentStrategy;

/**
 * Business-layer service.
 * Orchestrates payment processing — add logging, auditing,
 * idempotency checks, and event publishing here.
 */
public class PaymentService {

    private final PaymentStrategy paymentStrategy;

    // Constructor Injection
    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}