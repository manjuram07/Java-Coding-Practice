package com.Factory;

public class EcommerceApplication {
    public static void main(String[] args) {

        // Create a factory instance
        Payment payment = PaymentFactory.getPayment("aa");
        // Use the payment instance to process a payment
        payment.pay(100.0);
    }
}
