package LLDProblems.TrafficSIgnalControlSystem;

import LLDProblems.TrafficSIgnalControlSystem.entities.Direction;
import LLDProblems.TrafficSIgnalControlSystem.state.RedState;
import LLDProblems.TrafficSIgnalControlSystem.state.SignalState;

//works like context class for state design pattern
public class TrafficLight {

    private Direction direction;
    private SignalState currentState;

    public TrafficLight(Direction direction){
        this.direction = direction;
        currentState = new RedState();
        this.currentState.enter(this);
    }

    public void next(){
        SignalState nextState = currentState.nextState();
        this.currentState = nextState;
        this.currentState.enter(this);
    }

    public void changeState(SignalState newState){
        this.currentState = newState;
        this.currentState.enter(this);
    }

    public Direction getDirection(){
        return this.direction;
    }

    public SignalState getSignalState(){
        return this.currentState;
    }
}
