package LLDpatterns.Strategy;

import LLDpatterns.Strategy.ConcreteStrategy.CreditCardPayment;
import LLDpatterns.Strategy.ConcreteStrategy.NetBankingPayment;
import LLDpatterns.Strategy.ConcreteStrategy.UPIPayment;

public class Strategy {
    public static void execute(){
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234 5678 9012"));
        context.makePayment(1000);

        context.setPaymentStrategy(new UPIPayment("sdkjfh@upi"));
        context.makePayment(1000);

        context.setPaymentStrategy(new NetBankingPayment("HDFC Bank"));
        context.makePayment(1000);
    }
}


/*

Definition
-Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 The algorithm is very independently of the clients that use it.

Problem It Solves
When you have:
Multiple ways to perform an operation
Many if-else or switch statements
Frequent addition of new behaviors

❌ Bad Design (Anti-pattern)
if (paymentType == CARD) {
    // card logic
} else if (paymentType == UPI) {
    // upi logic
} else if (paymentType == NET_BANKING) {
    // net banking logic
}
Problems:
❌ Violates Open/Closed Principle
❌ Hard to maintain
❌ Business logic tightly coupled

🔹 Core Idea
👉 Extract each algorithm into its own class
👉 Program to an interface, not an implementation

 */
