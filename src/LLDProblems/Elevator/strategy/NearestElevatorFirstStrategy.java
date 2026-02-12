package LLDProblems.Elevator.strategy;

import LLDProblems.Elevator.entities.Elevator;
import LLDProblems.Elevator.entities.Request;

import java.util.List;

public class NearestElevatorFirstStrategy implements SchedulingReqToElevatorStrategy {

    @Override
    public Elevator scheduleRequestToElevator(List<Elevator> elevators, Request request){
        System.out.println("Scheduling requests as per nearest first");
        return elevators.get(0);
    }
}