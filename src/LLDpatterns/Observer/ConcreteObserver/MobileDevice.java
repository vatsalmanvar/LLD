package LLDpatterns.Observer.ConcreteObserver;

import LLDpatterns.Observer.Observer;

public class MobileDevice implements Observer {
    public void update(float temperature){
        System.out.println("Mobile device updated with " + temperature);
    }
}
