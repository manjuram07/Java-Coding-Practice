package StrategyPattern.application;

import StrategyPattern.service.PaymentService;
import StrategyPattern.service.impl.CreditCardPayment;
import StrategyPattern.service.impl.PaypalPayment;
import StrategyPattern.strategy.PaymentStrategy;
import StrategyPattern.service.impl.UpiPayment;

/**
 * Entry point — demonstrates all payment flows.
 * In Spring Boot, replace this with a @RestController.
 */
public class Main {

    public static void main(String[] args) {

        PaymentService service = new PaymentService(new UpiPayment());
        service.processPayment(2000);

        PaymentService service1 = new PaymentService(new CreditCardPayment());
        service1.processPayment(1500);

        PaymentService service2 = new PaymentService(new PaypalPayment());
        service2.processPayment(1800);
    }
}
