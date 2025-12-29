package LLDPatterns.State.ConcreteState;

import LLDPatterns.State.TrafficLightContext;
import LLDPatterns.State.TrafficLightState;

public class RedState implements TrafficLightState {

    public void next(TrafficLightContext context){
        context.setState(new GreenState());
    }

    public String getStateColor(){
        return "Red Light - Stop";
    }
}
