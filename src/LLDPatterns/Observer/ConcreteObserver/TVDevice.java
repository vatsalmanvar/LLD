package LLDPatterns.Observer.ConcreteObserver;

import LLDPatterns.Observer.Observer;

public class TVDevice implements Observer {
    public void update(float temparature){
        System.out.println("TV device is updated with " + temparature);
    }
}
