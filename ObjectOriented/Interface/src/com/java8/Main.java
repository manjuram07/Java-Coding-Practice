package com.java8;

/**
 * Demonstration of DEFAULT and STATIC Methods in Interfaces (Java 8+)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("========== STATIC METHOD DEMO ==========");
        // STATIC METHODS: Called on interface, not instances
        RBI.bankInfo();
        RBI.displayRBIServices();
        System.out.println("Is valid account number (1234567890): " + RBI.isValidAccountNumber("1234567890"));
        System.out.println("Is valid account number (123): " + RBI.isValidAccountNumber("123"));

        System.out.println("\n========== DEFAULT METHOD DEMO - CANARA BANK ==========");
        // DEFAULT METHODS: Called on instance objects
        RBI canara = new Canara();
        canara.display();                           // Output: Canara Bank
        canara.interest();                          // Output: Canara Bank Special Interest Rate: 6.5% (OVERRIDDEN)
        canara.calculateEMI(500000, 7.5, 5);       // Calculate EMI using default method

        System.out.println("\n========== DEFAULT METHOD DEMO - ICICI BANK ==========");
        // DEFAULT METHODS with inherited implementation
        RBI icici = new ICICI();
        icici.display();                            // Output: ICICI Bank
        icici.interest();                           // Output: Default RBI Interest Rate: 5% (INHERITED)
        icici.calculateEMI(1000000, 8.0, 10);      // Calculate EMI using default method

        System.out.println("\n========== KEY DIFFERENCES ==========");
        System.out.println("1. STATIC METHOD  : RBI.bankInfo() - Called on Interface");
        System.out.println("2. DEFAULT METHOD : canara.interest() - Called on Instance");
        System.out.println("3. STATIC METHOD  : Cannot be overridden");
        System.out.println("4. DEFAULT METHOD : Can be optionally overridden");
    }
}
