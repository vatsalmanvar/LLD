package LLDProblems.TrafficSIgnalControlSystem.state;

import LLDProblems.TrafficSIgnalControlSystem.TrafficLight;
import LLDProblems.TrafficSIgnalControlSystem.entities.SignalStateType;

public interface SignalState {
    void enter(TrafficLight trafficLight);
    SignalState nextState();
    SignalStateType getSignalStateType();
}
