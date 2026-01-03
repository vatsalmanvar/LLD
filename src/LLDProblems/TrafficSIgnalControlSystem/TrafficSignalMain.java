package LLDProblems.TrafficSIgnalControlSystem;

import LLDProblems.TrafficSIgnalControlSystem.entities.Direction;

import java.util.List;

public class TrafficSignalMain {

    private final Intersection intersection;
    private final SignalConfig signalConfig;
    private final SignalScheduler scheduler;
    private final ManualOverrideController overrideController;

    public TrafficSignalMain(List<Direction> directions) {

        this.intersection = new Intersection(directions);
        this.signalConfig = new SignalConfig();
        this.scheduler = new SignalScheduler(intersection, signalConfig);
        this.overrideController =
                new ManualOverrideController(intersection, scheduler);
    }

    public void start() {
        scheduler.start();
        System.out.println("Traffic Signal System started");
    }

    public void stop() {
        scheduler.stop();
        System.out.println("Traffic Signal System stopped");
    }

    public void manualOverride(Direction direction) {
        overrideController.overrideToGreen(direction);
    }

    public void resumeAutomatic() {
        overrideController.resumeAutomatic();
    }
}



/*

Problem Statement
Design and implement a Traffic Signal System to manage the traffic lights at an intersection. The system should support configurable signal durations for each direction and vendingMachineState, automatic cycling of signals using the State design pattern, and the ability to manually override signals as needed.

Requirements
Multiple Directions: The intersection supports multiple directions (e.g., NORTH, SOUTH, EAST, WEST).
Traffic Light States: Each direction has a traffic light with states: GREEN, YELLOW, RED.
Configurable Durations: Each direction and vendingMachineState can have its own configurable duration.
Automatic Cycling: The system automatically cycles through the states for each direction in a round-robin fashion.
Manual Override: The system allows manual override to set a specific direction to GREEN at any time.
Extensibility: Easy to add new directions or states if needed.
State Pattern: Use the State design pattern to encapsulate vendingMachineState-specific behavior and transitions.


| Class                               | Responsibility                   |
| ----------------------------------- | -------------------------------- |
| TrafficSignalSystem                 | Public API, start/stop, override |
| Intersection                        | Direction order & coordination   |
| TrafficLight                        | State holder (Context)           |
| SignalState                         | State interface                  |
| GreenState / YellowState / RedState | State behavior & transitions     |
| SignalScheduler                     | Time-based execution             |
| ManualOverrideController            | Emergency/manual control         |
| SignalConfig                        | Duration configuration           |



 */