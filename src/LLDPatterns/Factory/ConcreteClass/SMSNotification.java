package LLDPatterns.Factory.ConcreteClass;

import LLDPatterns.Factory.Notification;

public class SMSNotification implements Notification {
    public void send(){
        System.out.println("Notification sent via SMS");
    }
}
