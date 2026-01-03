package LLDProblems.TrafficSIgnalControlSystem;

import LLDProblems.TrafficSIgnalControlSystem.entities.Direction;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

    private List<TrafficLight> trafficLights = new ArrayList<>();
    private int currentIndex = 0;

    public Intersection(List<Direction> directions){
        for(Direction dir : directions){
            trafficLights.add(new TrafficLight(dir));
        }
    }

    public List<TrafficLight> getAllLights(){
        return trafficLights;
    }
    public TrafficLight getCurrentGreenTrafficLight(){
        return trafficLights.get(currentIndex);
    }
    public void moveToNextDirection(){
        currentIndex = (currentIndex+1)%trafficLights.size();
    }
}
