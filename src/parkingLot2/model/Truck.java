package parkingLot2.model;

public class Truck extends Vehicle{
    public static final double chargesPerHour = 20.0;


    public Truck(VehicleType vehicleType, String vehicleNumber) {
        super(vehicleType, vehicleNumber);
    }
}
