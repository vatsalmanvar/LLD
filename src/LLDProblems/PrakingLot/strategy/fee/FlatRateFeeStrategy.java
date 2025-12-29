package LLDProblems.PrakingLot.strategy.fee;

import LLDProblems.PrakingLot.entities.ParkingTicket;

public class FlatRateFeeStrategy implements FeeStrategy {

    @Override
    public float calculateFee(ParkingTicket parkingTicket){
        System.out.println("Calculated fee by Flat rate strategy");
        return 100F;
    }
}
