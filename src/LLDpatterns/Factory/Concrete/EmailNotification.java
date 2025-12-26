package LLDpatterns.Factory.Concrete;

import LLDpatterns.Factory.Notification;

public class EmailNotification implements Notification {

    @Override
    public void send(){
        System.out.println("Notification sent via EMAIL");
    }
}
