package LLDpatterns.Observer;

import LLDpatterns.Observer.ConcreteObserver.MobileDevice;
import LLDpatterns.Observer.ConcreteObserver.TVDevice;
import LLDpatterns.Observer.ConcreteSubject.WeatherStation;

public class ObserverExecute {

    public static void execute(){
        WeatherStation weatherStation = new WeatherStation();

        Observer mobile = new MobileDevice();
        Observer tv = new TVDevice();

        weatherStation.registerObserver(mobile);
        weatherStation.registerObserver(tv);

        weatherStation.setTemparature(37.5f);
        weatherStation.setTemparature(67.5f);
    }
}
