package LLDProblems.TrafficSIgnalControlSystem;

import LLDProblems.TrafficSIgnalControlSystem.entities.Direction;

import java.util.List;

public class TrafficSignalApplication {
    public static void main(String args[]){
        TrafficSignalMain system = new TrafficSignalMain(List.of(Direction.values()));

        system.start();
        system.manualOverride(Direction.NORTH);
        system.resumeAutomatic();
        system.stop();
    }
}
