package LLDPatterns.Factory.ConcreteClass;

import LLDPatterns.Factory.Notification;

public class EmailNotification implements Notification {

    @Override
    public void send(){
        System.out.println("Notification sent via EMAIL");
    }
}
