package parkingLot2.model;

public class Car extends Vehicle{
    public static final double chargesPerHour = 20.0;


    public Car(VehicleType vehicleType, String vehicleNumber) {
        super(vehicleType, vehicleNumber);
    }
}
