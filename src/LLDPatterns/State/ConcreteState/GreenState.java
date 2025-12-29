package LLDPatterns.State.ConcreteState;

import LLDPatterns.State.TrafficLightContext;
import LLDPatterns.State.TrafficLightState;

public class GreenState implements TrafficLightState {
    public void next(TrafficLightContext context){
        context.setState(new YellowState());
    }

    public String getStateColor(){
        return "Green Light - Go";
    }
}
