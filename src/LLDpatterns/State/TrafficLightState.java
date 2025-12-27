package LLDpatterns.State;

public interface TrafficLightState {
    void next(TrafficLightContext context);
    String getStateColor();
}
