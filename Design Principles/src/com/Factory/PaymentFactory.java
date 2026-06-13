package com.Factory;

import java.util.HashMap;
import java.util.Map;


/*
    * Factory class to create instances of different payment methods based on the input type.
    * This class uses a static block to initialize a map of payment types to their corresponding payment instances.
    * The getPayment method retrieves the appropriate payment instance based on the provided payment type.
    * This implementation allows for easy addition of new payment methods by simply adding them to the static block without modifying the existing code, adhering to the Open/Closed Principle.
    *
 */
public class PaymentFactory {

    private static final Map<String, Payment> payment = new HashMap<>();

    static {
        payment.put("UPI", new UpiPayment());
        payment.put("CARD", new CreditCardPayment());
        payment.put("PAYPAL", new PaypalPayment());
    }

    public static Payment getPayment(String paymentType) {

        if (paymentType == null || !payment.containsKey(paymentType.toUpperCase())) {
            throw new IllegalArgumentException("Invalid payment type: " + paymentType);
        }
        return payment.get(paymentType.toUpperCase());
    }

}
