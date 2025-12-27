package LLDpatterns.Observer.ConcreteSubject;

import LLDpatterns.Observer.Observer;
import LLDpatterns.Observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private float temparature;

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyAllObserver(float temparature){
        for(Observer obv : observers){
            obv.update(temparature);
        }
    }

    public void setTemparature(float temparature){
        this.temparature = temparature;
        notifyAllObserver(temparature);
    }
}
