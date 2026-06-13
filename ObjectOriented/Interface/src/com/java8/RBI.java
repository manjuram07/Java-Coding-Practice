package com.java8;

/**
 * Interface demonstrating DEFAULT and STATIC methods in Java 8+
 * 
 * DEFAULT METHOD:
 * - Has a body/implementation
 * - Can be called on instance objects
 * - Can be overridden in implementing classes (optional)
 * - Helps add new functionality without breaking existing implementations
 * 
 * STATIC METHOD:
 * - Has a body/implementation
 * - Belongs to the interface itself, not to instances
 * - Called using InterfaceName.methodName()
 * - Cannot be overridden or inherited
 */
public interface RBI {
    // Abstract method - must be implemented
    void display();

    // DEFAULT METHOD - can be called on instance objects
    default void interest() {
        System.out.println("Default RBI Interest Rate: 5%");
    }

    // Another DEFAULT METHOD example with more logic
    default void calculateEMI(double principal, double ratePerAnnum, int years) {
        double monthlyRate = ratePerAnnum / 12 / 100;
        int numberOfPayments = years * 12;
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) 
                     / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
        System.out.printf("Monthly EMI: Rs. %.2f%n", emi);
    }

    // STATIC METHOD - belongs to interface, not instances
    // Called as: RBI.bankInfo()
    static void bankInfo() {
        System.out.println("RBI is the central bank of India.");
    }

    // Another STATIC METHOD example
    static void displayRBIServices() {
        System.out.println("=== RBI Services ===");
        System.out.println("1. Monetary Policy");
        System.out.println("2. Banking Regulation");
        System.out.println("3. Currency Management");
        System.out.println("4. Financial Stability");
    }

    // STATIC METHOD for validation
    static boolean isValidAccountNumber(String accountNumber) {
        return accountNumber != null && accountNumber.length() >= 10;
    }
}
