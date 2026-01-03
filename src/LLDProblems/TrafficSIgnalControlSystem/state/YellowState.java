package LLDProblems.TrafficSIgnalControlSystem.state;

import LLDProblems.TrafficSIgnalControlSystem.TrafficLight;
import LLDProblems.TrafficSIgnalControlSystem.entities.SignalStateType;

public class YellowState implements SignalState{


    @Override
    public void enter(TrafficLight trafficLight){
        System.out.println("Signal turned green");
    }
    public SignalState nextState(){
        return new RedState();
    }
    public SignalStateType getSignalStateType(){
        return SignalStateType.YELLOW;
    }
}
