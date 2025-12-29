package LLDPatterns.State;

import LLDPatterns.State.ConcreteState.RedState;

public class TrafficLightContext {

    TrafficLightState trafficLightState;

    public TrafficLightContext(){
        trafficLightState = new RedState();
    }

    public void setState(TrafficLightState trafficLightState){
        this.trafficLightState = trafficLightState;
    }

    public void nextState(){
        trafficLightState.next(this);
        System.out.println(trafficLightState.getStateColor());
    }

}
