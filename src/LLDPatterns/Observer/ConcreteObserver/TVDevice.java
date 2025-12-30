package LLDPatterns.Observer.ConcreteObserver;

import LLDPatterns.Observer.Observer;

public class TVDevice implements Observer {
    public void update(float temperature){
        System.out.println("TV device is updated with " + temperature);
    }
}
