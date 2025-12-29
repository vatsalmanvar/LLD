package LLDPatterns.Observer;

import LLDPatterns.Observer.ConcreteObserver.MobileDevice;
import LLDPatterns.Observer.ConcreteObserver.TVDevice;
import LLDPatterns.Observer.ConcreteSubject.WeatherStation;

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
