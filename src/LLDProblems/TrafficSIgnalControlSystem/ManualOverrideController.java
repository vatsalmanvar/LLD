package LLDProblems.TrafficSIgnalControlSystem;

import LLDProblems.TrafficSIgnalControlSystem.entities.Direction;
import LLDProblems.TrafficSIgnalControlSystem.state.GreenState;
import LLDProblems.TrafficSIgnalControlSystem.state.RedState;

public class ManualOverrideController {

    private final Intersection intersection;
    private final SignalScheduler scheduler;

    public ManualOverrideController(Intersection intersection,
                                    SignalScheduler scheduler) {
        this.intersection = intersection;
        this.scheduler = scheduler;
    }

    public synchronized void overrideToGreen(Direction direction) {

        // 1. Stop automatic cycling
        scheduler.stop();

        // 2. Set all lights to RED
        for (TrafficLight light : intersection.getAllLights()) {
            light.changeState(new RedState());
        }

        // 3. Force selected direction to GREEN
        for (TrafficLight light : intersection.getAllLights()) {
            if (light.getDirection() == direction) {
                light.changeState(new GreenState());
                break;
            }
        }

        System.out.println("Manual override applied for " + direction);
    }

    public synchronized void resumeAutomatic() {
        scheduler.start();
        System.out.println("Automatic cycling resumed");
    }
}
