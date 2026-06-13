# Static and Default Methods in Interfaces (Java 8+)

## Overview
Java 8 introduced two new types of methods in interfaces: **DEFAULT methods** and **STATIC methods**. These additions allow interfaces to have method implementations, moving away from the traditional concept of interfaces being purely abstract.

---

## 1. DEFAULT Methods

### Definition
A default method is an interface method with a **body/implementation** that can be called on instance objects.

### Key Characteristics
- ✅ Has a body/implementation
- ✅ Can be called on instance objects (using object reference)
- ✅ Can be overridden in implementing classes (optional)
- ✅ Helps add new functionality without breaking existing implementations
- ✅ Declared using the `default` keyword

### Purpose
- Add new methods to existing interfaces without breaking implementations
- Provide common functionality that all implementing classes can use
- Allow interface evolution while maintaining backward compatibility

### Example from RBI.java

```java
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
```

### How to Use
```java
// Implementing class
class Bank implements RBI {
    @Override
    public void display() {
        System.out.println("Bank Details");
    }
}

// Usage
Bank bank = new Bank();
bank.display();           // Calls overridden method
bank.interest();          // Calls default method from RBI
bank.calculateEMI(100000, 8.5, 5);  // Calls default method
```

### Overriding Default Methods
```java
class PrivateBank implements RBI {
    @Override
    public void display() {
        System.out.println("Private Bank");
    }
    
    // Optionally override default method
    @Override
    public void interest() {
        System.out.println("Private Bank Interest Rate: 7%");
    }
}
```

---

## 2. STATIC Methods

### Definition
A static method is an interface method with a **body/implementation** that **belongs to the interface itself**, not to instances.

### Key Characteristics
- ✅ Has a body/implementation
- ✅ Belongs to the interface itself, not to instances
- ✅ Called using `InterfaceName.methodName()`
- ✅ Cannot be overridden or inherited
- ✅ Declared using the `static` keyword

### Purpose
- Provide utility functions related to the interface
- Helper methods for working with the interface
- Encapsulate interface-related logic
- Similar to utility methods in classes

### Example from RBI.java

```java
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
```

### How to Use
```java
// Static methods are called on the interface, NOT on objects
RBI.bankInfo();                    // Output: RBI is the central bank of India.
RBI.displayRBIServices();          // Displays RBI services
boolean valid = RBI.isValidAccountNumber("1234567890");  // Returns true
```

### Important: Cannot Override Static Methods
```java
class Bank implements RBI {
    // This is NOT an override, but a different method
    // This won't compile with @Override annotation if you try it
    static void bankInfo() {
        System.out.println("This is a bank static method");
    }
}

// Calling methods
RBI.bankInfo();     // Calls RBI interface static method
Bank.bankInfo();    // Calls Bank class static method
```

---

## 3. Comparison: DEFAULT vs STATIC Methods

| Feature | DEFAULT Method | STATIC Method |
|---------|-----------------|---------------|
| **Keyword** | `default` | `static` |
| **Has Body** | ✅ Yes | ✅ Yes |
| **Called On** | Instance objects | Interface/Class name |
| **Can Override** | ✅ Yes (optional) | ❌ No |
| **Can Inherit** | ✅ Yes | ❌ No |
| **Purpose** | Provide common implementation | Provide utility/helper functions |
| **Access** | `object.methodName()` | `InterfaceName.methodName()` |

---

## 4. Abstract Method vs DEFAULT vs STATIC

| Feature | Abstract | DEFAULT | STATIC |
|---------|----------|---------|--------|
| **Has Body** | ❌ No | ✅ Yes | ✅ Yes |
| **Must Implement** | ✅ Yes | ❌ No (optional) | ❌ N/A |
| **Called On** | Instance | Instance | Interface |
| **Can Override** | N/A | ✅ Yes | ❌ No |

### Example:
```java
public interface RBI {
    // ABSTRACT - must be implemented
    void display();
    
    // DEFAULT - optional to override
    default void interest() {
        System.out.println("Default rate: 5%");
    }
    
    // STATIC - belongs to interface, cannot override
    static void bankInfo() {
        System.out.println("RBI is central bank");
    }
}
```

---

## 5. Real-World Use Cases

### DEFAULT Methods
- Adding new methods to existing interface without breaking legacy code
- Providing common functionality across all implementations
- Backward compatibility in library updates

```java
// Example: Adding new method to existing interface
public interface PaymentGateway {
    void processPayment(double amount);
    
    // New method added in version 2.0
    default void issueReceipt() {
        System.out.println("Receipt issued");
    }
}
```

### STATIC Methods
- Validation helper methods
- Factory methods
- Utility functions

```java
// Example: Validation utility
public interface Account {
    void withdraw(double amount);
    
    // Static utility method
    static boolean isValidAmount(double amount) {
        return amount > 0 && amount <= 1000000;
    }
}

// Usage
if (Account.isValidAmount(5000)) {
    account.withdraw(5000);
}
```

---

## 6. Multiple Interface Implementation

When implementing multiple interfaces with default methods:

```java
interface InterfaceA {
    default void display() {
        System.out.println("Interface A");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("Interface B");
    }
}

// This creates a conflict - must override display()
class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void display() {
        // Must explicitly choose which implementation to use
        InterfaceA.super.display();  // Call A's implementation
        // or
        InterfaceB.super.display();  // Call B's implementation
        // or provide your own
        System.out.println("MyClass");
    }
}
```

---

## 7. Key Takeaways

✅ **DEFAULT methods** allow interfaces to evolve while maintaining backward compatibility
✅ **STATIC methods** provide utility functions tied to the interface
✅ Abstract methods still exist and must be implemented
✅ Use `default` for shared implementation logic
✅ Use `static` for utility/helper functions
✅ Multiple default methods from different interfaces require explicit resolution
✅ Static methods in interfaces are NOT overridden, they're shadowed

---

## Summary

Java 8's introduction of default and static methods transformed interfaces from pure contracts to a more flexible mechanism. They enable better code organization, backward compatibility, and utility function encapsulation while still maintaining the core principle of interfaces as contracts for implementing classes.

