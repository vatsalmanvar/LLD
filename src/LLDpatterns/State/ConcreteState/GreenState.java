package LLDpatterns.State.ConcreteState;

import LLDpatterns.State.TrafficLightContext;
import LLDpatterns.State.TrafficLightState;

public class GreenState implements TrafficLightState {
    public void next(TrafficLightContext context){
        context.setState(new YellowState());
    }

    public String getStateColor(){
        return "Green Light - Go";
    }
}
