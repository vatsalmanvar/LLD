package LLDProblems.TrafficSIgnalControlSystem;

import LLDProblems.TrafficSIgnalControlSystem.entities.SignalStateType;
import LLDProblems.TrafficSIgnalControlSystem.state.GreenState;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SignalScheduler {

    private ScheduledExecutorService executor;

    private final Intersection intersection;
    private final SignalConfig signalConfig;

    public SignalScheduler(Intersection intersection,
                           SignalConfig signalConfig) {
        this.intersection = intersection;
        this.signalConfig = signalConfig;
        createExecutor();
    }

    private void createExecutor() {
        this.executor = Executors.newSingleThreadScheduledExecutor();
    }

    public synchronized void start() {
        if (executor.isShutdown() || executor.isTerminated()) {
            createExecutor(); // 🔥 KEY FIX
        }

        TrafficLight current = intersection.getCurrentGreenTrafficLight();
        current.changeState(new GreenState());
        scheduleNext(current);
    }

    private void scheduleNext(TrafficLight light) {
        int duration = signalConfig.getDuration(
                light.getDirection(),
                light.getSignalState().getSignalStateType()
        );

        executor.schedule(() -> {

            light.next();

            if (light.getSignalState().getSignalStateType() == SignalStateType.RED) {
                intersection.moveToNextDirection();
                TrafficLight next = intersection.getCurrentGreenTrafficLight();
                next.changeState(new GreenState());
                scheduleNext(next);
            } else {
                scheduleNext(light);
            }

        }, duration, TimeUnit.SECONDS);
    }

    public synchronized void stop() {
        executor.shutdownNow();
    }
}
