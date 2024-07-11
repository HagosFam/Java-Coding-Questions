package parkinglot;

public class ParkingSpot {
    private VehicleType vehicle;
    private boolean isOccupied;

    public void park(VehicleType vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
    public void leave() {
        this.isOccupied = false;
    }

    public VehicleType getVehicle() {
        return this.vehicle;
    }






}
