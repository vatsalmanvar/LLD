package LLDProblems.TrafficSIgnalControlSystem.state;

import LLDProblems.TrafficSIgnalControlSystem.TrafficLight;
import LLDProblems.TrafficSIgnalControlSystem.entities.SignalStateType;

public class RedState implements SignalState{


    @Override
    public void enter(TrafficLight trafficLight){
        System.out.println("Signal turned green");
    }
    public SignalState nextState(){
        return new GreenState();
    }
    public SignalStateType getSignalStateType(){
        return SignalStateType.RED;
    }
}
