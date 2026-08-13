// ================================
// Abstract base class
// ================================
abstract class PaymentProcessor {
    String merchantId;

    PaymentProcessor(String merchantId) {
        this.merchantId = merchantId;
    }

    // Abstract method - NO body
    // Every payment type processes money differently, so no shared default makes sense
    abstract boolean processPayment(double amount);

    // Concrete method - HAS a body
    // Logging behavior is identical for every payment type, so it's written once here
    void logTransaction(double amount) {
        System.out.println("[LOG] Merchant: " + merchantId + " | Amount Logged: Rs." + amount);
    }
}

// ================================
// Child class 1
// ================================
class CreditCardProcessor extends PaymentProcessor {

    CreditCardProcessor(String merchantId) {
        super(merchantId); // calling parent constructor
    }

    @Override
    boolean processPayment(double amount) {
        System.out.println("Processing Rs." + amount + " via Credit Card Gateway...");
        return true;
    }
}

// ================================
// Child class 2
// ================================
class UpiProcessor extends PaymentProcessor {

    UpiProcessor(String merchantId) {
        super(merchantId);
    }

    @Override
    boolean processPayment(double amount) {
        System.out.println("Processing Rs." + amount + " via UPI...");
        return true;
    }
}

// ================================
// Main class
// ================================
public class PaymentDemo {
    public static void main(String[] args) {

        CreditCardProcessor ccProcessor = new CreditCardProcessor("MERCH001");
        UpiProcessor upiProcessor = new UpiProcessor("MERCH002");

        System.out.println("---- Credit Card Payment ----");
        boolean ccResult = ccProcessor.processPayment(1500.0);   // overridden version runs
        ccProcessor.logTransaction(1500.0);                       // inherited version runs
        System.out.println("Payment Success: " + ccResult);

        System.out.println("\n---- UPI Payment ----");
        boolean upiResult = upiProcessor.processPayment(499.0);  // overridden version runs
        upiProcessor.logTransaction(499.0);                       // inherited version runs
        System.out.println("Payment Success: " + upiResult);

        // PaymentProcessor pp = new PaymentProcessor("X"); // ❌ ERROR: cannot instantiate abstract class
    }
}

/*
Output:-

---- Credit Card Payment ----
Processing Rs.1500.0 via Credit Card Gateway...
[LOG] Merchant: MERCH001 | Amount Logged: Rs.1500.0
Payment Success: true

---- UPI Payment ----
Processing Rs.499.0 via UPI...
[LOG] Merchant: MERCH002 | Amount Logged: Rs.499.0
Payment Success: true
*/


/*
# Line by Line Explanation 

abstract class PaymentProcessor — declared abstract because it has one method (processPayment) with no meaningful default implementation. You cannot do new PaymentProcessor(...) — that line is commented out on purpose to show it would fail.

abstract boolean processPayment(double amount); — no body, ends with ;. This is a contract: any concrete (non-abstract) subclass is forced to implement this method, or the code won't compile.

void logTransaction(double amount) — this one has a full body. It's a shared, reusable method. Both CreditCardProcessor and UpiProcessor use this exact same version without rewriting it — that's the benefit of putting common logic in the parent.

CreditCardProcessor extends PaymentProcessor and UpiProcessor extends PaymentProcessor — both are forced to override processPayment() with @Override, and each does it differently (Credit Card logic vs UPI logic), because that's exactly the point of abstraction — same method name, different behavior per class.

In main(), when you call ccProcessor.processPayment(1500.0), Java runs CreditCardProcessor's version (not PaymentProcessor's, since it has none). When you call ccProcessor.logTransaction(1500.0), Java runs the inherited version straight from PaymentProcessor, since CreditCardProcessor never overrode it.

This demonstrates the core idea cleanly: abstract method → mandatory, different per class. Concrete method → optional to override, shared by default.

*/