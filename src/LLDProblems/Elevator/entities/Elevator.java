package LLDProblems.Elevator.entities;

import java.util.Collections;
import java.util.PriorityQueue;

public class Elevator {

    private final String id;
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;

    // Min heap → closest higher floor first
    private final PriorityQueue<Integer> upQueue;

    // Max heap → closest lower floor first
    private final PriorityQueue<Integer> downQueue;

    public Elevator(String id) {
        this.id = id;
        this.currentFloor = 0;
        this.direction = Direction.IDLE;
        this.state = ElevatorState.IDLE;

        this.upQueue = new PriorityQueue<>();
        this.downQueue = new PriorityQueue<>(Collections.reverseOrder());
    }

    // External or internal request
    public void addRequest(Request request) {
        System.out.println("Adding request : "+request.source+" -> "+request.destination);
        int source = request.source;
        int destination = request.destination;

        // Always go pickup passenger first
        enqueueFloor(source);
        enqueueFloor(destination);

        decideDirection();
    }

    private void enqueueFloor(int floor) {

        if (floor > currentFloor) {
            upQueue.offer(floor);
        } else if (floor < currentFloor) {
            downQueue.offer(floor);
        }
        // ignore if same floor
    }

    private void decideDirection() {

        if (direction != Direction.IDLE) return;

        if (!upQueue.isEmpty()) {
            direction = Direction.UP;
            state = ElevatorState.MOVING;
        }
        else if (!downQueue.isEmpty()) {
            direction = Direction.DOWN;
            state = ElevatorState.MOVING;
        }
    }

    /**
     * Simulates ONE step.
     * Scheduler / System should call this repeatedly.
     */
    public void step() {

        if (direction == Direction.IDLE) {
            decideDirection();
            return;
        }

        state = ElevatorState.MOVING;

        if (direction == Direction.UP) {
            currentFloor++;
            System.out.println("Elevator " + id + " passing floor " + currentFloor);

            if (upQueue.contains(currentFloor)) {
                upQueue.remove(currentFloor);
                System.out.println("Elevator " + id + " stopping at floor " + currentFloor);
            }

            // Finished UP sweep
            if (upQueue.isEmpty()) {
                direction = !downQueue.isEmpty() ? Direction.DOWN : Direction.IDLE;
            }

        } else if (direction == Direction.DOWN) {

            currentFloor--;
            System.out.println("Elevator " + id + " passing floor " + currentFloor);

            if (downQueue.contains(currentFloor)) {
                downQueue.remove(currentFloor);
                System.out.println("Elevator " + id + " stopping at floor " + currentFloor);
            }

            // Finished DOWN sweep
            if (downQueue.isEmpty()) {
                direction = !upQueue.isEmpty() ? Direction.UP : Direction.IDLE;
            }
        }

        if (direction == Direction.IDLE) {
            state = ElevatorState.IDLE;
            System.out.println("Elevator " + id + " is now IDLE at floor " + currentFloor);
        }
    }

    // Getters (needed for scheduler)

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public ElevatorState getState() {
        return state;
    }

    public String getId() {
        return id;
    }
}
