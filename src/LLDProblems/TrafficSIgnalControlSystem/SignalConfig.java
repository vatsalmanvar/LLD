package LLDProblems.TrafficSIgnalControlSystem;

import LLDProblems.TrafficSIgnalControlSystem.entities.Direction;
import LLDProblems.TrafficSIgnalControlSystem.entities.SignalStateType;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class SignalConfig {

    private final Map<Direction, Map<SignalStateType, Integer>> duration = new EnumMap<>(Direction.class);

    public SignalConfig(){
        for(Direction dir :  Direction.values()){
            Map<SignalStateType, Integer> mp = new HashMap<>();
            mp.put(SignalStateType.GREEN, 10000);
            mp.put(SignalStateType.RED, 0);
            mp.put(SignalStateType.YELLOW, 2000);
            duration.put(dir, mp);
        }
    }

    public void setDuration(Direction direction, SignalStateType signalStateType, int durationInSeconds){
        duration.get(direction).put(signalStateType, durationInSeconds);
    }

    public int getDuration(Direction direction, SignalStateType signalStateType){
        return duration.get(direction).get(signalStateType);
    }

}
