package LLDPatterns.State.ConcreteState;

import LLDPatterns.State.TrafficLightContext;
import LLDPatterns.State.TrafficLightState;

public class YellowState implements TrafficLightState {

    public void next(TrafficLightContext context){
        context.setState(new RedState());
    }

    public String getStateColor(){
        return "Yellow Light - Caution";
    }
}
