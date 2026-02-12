package LLDProblems.Elevator;

import LLDProblems.Elevator.entities.Elevator;
import LLDProblems.Elevator.entities.Request;
import LLDProblems.Elevator.strategy.NearestElevatorFirstStrategy;

public class ElevatorMainClass {

    public static void main(String args[]){
        ElevatorSystem instance = ElevatorSystem.getInstance();
        instance.addElevator(new Elevator("Ele1"));
        instance.addElevator(new Elevator("Ele2"));
        instance.addElevator(new Elevator("Ele3"));


        instance.setSchedular(new NearestElevatorFirstStrategy());

        instance.request(new Request(1, 5));
        instance.request(new Request(2, 7));
        instance.request(new Request(10, 0));
        instance.request(new Request(15, 8));
        instance.request(new Request(1, 5));

        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();
        instance.step();

    }
}
