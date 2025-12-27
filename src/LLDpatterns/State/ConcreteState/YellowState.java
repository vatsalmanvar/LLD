package LLDpatterns.State.ConcreteState;

import LLDpatterns.State.TrafficLightContext;
import LLDpatterns.State.TrafficLightState;

public class YellowState implements TrafficLightState {

    public void next(TrafficLightContext context){
        context.setState(new RedState());
    }

    public String getStateColor(){
        return "Yellow Light - Caution";
    }
}
