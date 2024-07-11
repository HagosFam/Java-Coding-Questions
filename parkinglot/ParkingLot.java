package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> spots;
    private int floorCount;

    public ParkingLot() {
        spots = new ArrayList<>();
    }

    public void parkVan(Van van) {

        for(int i=0; i<floorCount; i++) {
            for(int j=0; j< floorCount* spots.size() -3; j++) {
                if(!spots.get(i).isOccupied() &&
                        !spots.get(i+1).isOccupied() &&
                        !spots.get(i+2).isOccupied()
                ) {
                    spots.get(i).park(VehicleType.VAN);
                    spots.get(i).park(VehicleType.VAN);
                    spots.get(i).park(VehicleType.VAN);
                }
            }
        }
    }

}
