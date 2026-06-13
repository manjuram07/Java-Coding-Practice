
/*
 	Key Points:
			Declaration: A sealed class is declared using the sealed modifier.
			Permits Clause: The permits keyword specifies the classes that are allowed to extend the sealed class.
			Extending Classes: The permitted subclasses must explicitly declare themselves as final, non-sealed, or sealed.
	
	Benefits:
			Provides better control over inheritance.
			Improves code readability and maintainability.
			Helps enforce domain-specific constraints.
 	
 */

sealed abstract class Payment permits CreditCardPayment, UPIPayment {

    public abstract void processPayment(double amount);
}


final class CreditCardPayment extends Payment {

	    @Override
	    public void processPayment(double amount) {
	        System.out.println("Processing Credit Card payment: " + amount);
	    }
	}

non-sealed class UPIPayment extends Payment {

	    @Override
	    public void processPayment(double amount) {
	        System.out.println("Processing UPI payment: " + amount);
	    }
	}

final class CashPayment extends UPIPayment {

	    @Override
	    public void processPayment(double amount) {
	        System.out.println("Processing Cash payment: " + amount);
	    }
	}

public class SealedDemo {
	    public static void main(String[] args) {

	        Payment p1 = new CreditCardPayment();
	        Payment p2 = new UPIPayment();
	        Payment p3 = new CashPayment();

	        p1.processPayment(1000);
	        p2.processPayment(500);
	        p3.processPayment(200);
	    }
	}
