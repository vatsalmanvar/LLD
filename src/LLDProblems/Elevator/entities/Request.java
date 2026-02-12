package LLDProblems.Elevator.entities;

public class Request {
    int source;
    int destination;
    Direction dir;

    public Request(int source, int destination){
        this.source=source;
        this.destination=destination;
        this.dir = destination>source? Direction.UP : Direction.DOWN;
    }

}
