package LLDProblems.Elevator.strategy;

import LLDProblems.Elevator.entities.Elevator;
import LLDProblems.Elevator.entities.Request;

import java.util.List;

public interface SchedulingReqToElevatorStrategy {
    Elevator scheduleRequestToElevator(List<Elevator> elevators, Request request);
}