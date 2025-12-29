package LLDPatterns.State;

public class State {

    public static void execute(){
        TrafficLightContext context = new TrafficLightContext();
        context.nextState();
        context.nextState();
        context.nextState();
        context.nextState();
        context.nextState();
        context.nextState();
    }
}
