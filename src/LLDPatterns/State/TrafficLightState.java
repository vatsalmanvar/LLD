package LLDPatterns.State;

public interface TrafficLightState {
    void next(TrafficLightContext context);
    String getStateColor();
}
