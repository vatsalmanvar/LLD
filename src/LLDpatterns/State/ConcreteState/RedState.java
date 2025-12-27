package LLDpatterns.State.ConcreteState;

import LLDpatterns.State.TrafficLightContext;
import LLDpatterns.State.TrafficLightState;

public class RedState implements TrafficLightState {

    public void next(TrafficLightContext context){
        context.setState(new GreenState());
    }

    public String getStateColor(){
        return "Red Light - Stop";
    }
}
