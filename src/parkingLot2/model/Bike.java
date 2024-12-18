package parkingLot2.model;

public class Bike extends Vehicle{
    public static final double chargesPerHour = 10.0;


    public Bike(VehicleType vehicleType, String vehicleNumber) {
        super(vehicleType, vehicleNumber);
    }
}
