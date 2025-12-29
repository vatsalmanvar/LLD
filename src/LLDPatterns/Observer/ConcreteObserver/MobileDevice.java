package LLDPatterns.Observer.ConcreteObserver;

import LLDPatterns.Observer.Observer;

public class MobileDevice implements Observer {
    public void update(float temperature){
        System.out.println("Mobile device updated with " + temperature);
    }
}
