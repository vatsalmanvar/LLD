package LLDProblems.PrakingLot.strategy.fee;

import LLDProblems.PrakingLot.entities.ParkingTicket;

public interface FeeStrategy {
    public float calculateFee(ParkingTicket parkingTicket);
}
