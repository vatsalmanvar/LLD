package LLDProblems.Elevator;

import LLDProblems.Elevator.entities.Elevator;
import LLDProblems.Elevator.entities.Request;
import LLDProblems.Elevator.strategy.NearestElevatorFirstStrategy;
import LLDProblems.Elevator.strategy.SchedulingReqToElevatorStrategy;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    private static ElevatorSystem instance;
    List<Elevator> elevators;
    SchedulingReqToElevatorStrategy strategy;

    private ElevatorSystem(){
        this.elevators = new ArrayList<>();
        this.strategy = new NearestElevatorFirstStrategy();
    }

    public static ElevatorSystem getInstance(){
        if(instance == null){
            instance = new ElevatorSystem();
        }
        return instance;
    }

    public void addElevator(Elevator newEle){
        elevators.add(newEle);
    }

    public void request(Request req){
        Elevator bestEle = strategy.scheduleRequestToElevator(elevators, req);
        bestEle.addRequest(req);
    }

    public void setSchedular(SchedulingReqToElevatorStrategy strategy){
        this.strategy=strategy;
    }

    public void step(){
        for(Elevator ele : elevators){
            ele.step();
        }
    }

}


/*

Problem Statement
Design and implement an Elevator System that can handle multiple requests, move between floors, and manage direction and vendingMachineState efficiently.

Requirements
Multiple Elevator: The system manages multiple elevators.
Request Handling: The system can handle requests to move to specific floors in a given direction (UP/DOWN).
Direction Management: The elevator maintains and updates its current direction (UP, DOWN, IDLE).
State Management: The elevator tracks its current floor, direction, and pending requests.
Efficient Movement: The elevator processes requests in an efficient order (e.g., all UP requests, then all DOWN requests).
Extensibility: Easy to add more elevators or advanced scheduling algorithms.



Entities:

ElevatorSystem          will hold the strategy and bypass other function to server as a controller
Elevator                will have the logic to take request and server requests
Request                 will hold source and destination
Scheduling strategy     which elevator to choose for coming request
concrete strategies     concrete logic for strategy
Direction - enum        UP, DOWN, IDLE
ElevatorState - enum    MOVING, IDLE, STOPPED, MAINTENANCE





 */
