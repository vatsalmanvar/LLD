package LLDpatterns.Factory.ConcreteClass;

import LLDpatterns.Factory.Notification;

public class EmailNotification implements Notification {

    @Override
    public void send(){
        System.out.println("Notification sent via EMAIL");
    }
}
