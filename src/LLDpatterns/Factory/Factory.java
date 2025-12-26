package LLDpatterns.Factory;

public class Factory {
    public static void execute() {
        Notification notification = NotificationFactory.createNotification("SMS");
        notification.send();

        notification = NotificationFactory.createNotification("EMAIL");
        notification.send();
    }
}

/*
Definition
-Encapsulates object creation logic and hides the concrete class from the client.

Problem Without Factory (Why We Need It)
❌ Bad Design (Tight Coupling)
class NotificationService {

    public void sendNotification(String type) {
        if (type.equals("EMAIL")) {
            EmailNotification email = new EmailNotification();
            email.send();
        } else if (type.equals("SMS")) {
            SmsNotification sms = new SmsNotification();
            sms.send();
        }
    }
}

🚨 Problems:
Violates Open/Closed Principle
Every new notification → modify this class
Business logic + object creation mixed
Hard to test and maintain


Participants:
Component	                Responsibility
Product (Interface)     	Common behavior
Concrete Products	        Actual implementations
Factory	                    Creates objects
Client	                    Uses the product


------------------

8️⃣ Factory Pattern Variants (Very Important)
🔹 1. Simple Factory (What we just did)

Not officially a GoF pattern
Centralized creation logic
Uses conditionals

2. Factory Method Pattern (GoF Pattern)

Instead of one factory class, each subclass decides object creation.

Example:
Product
interface Transport {
    void deliver();
}

Concrete Products
class Truck implements Transport {
    public void deliver() {
        System.out.println("Deliver by road");
    }
}

class Ship implements Transport {
    public void deliver() {
        System.out.println("Deliver by sea");
    }
}

Creator (Abstract Factory Method)
abstract class Logistics {

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

    protected abstract Transport createTransport();
}

Concrete Creators
class RoadLogistics extends Logistics {
    protected Transport createTransport() {
        return new Truck();
    }
}

class SeaLogistics extends Logistics {
    protected Transport createTransport() {
        return new Ship();
    }
}

Client
public class Client {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();
    }
}

✔ Advantage:
No if-else
True polymorphism
Highly extensible
 */