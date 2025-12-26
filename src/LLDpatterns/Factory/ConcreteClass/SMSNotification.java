package LLDpatterns.Factory.ConcreteClass;

import LLDpatterns.Factory.Notification;

public class SMSNotification implements Notification {
    public void send(){
        System.out.println("Notification sent via SMS");
    }
}
