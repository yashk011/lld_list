package parkingLot.service;

import parkingLot.model.ParkingLot;
import parkingLot.model.Vehicle;

public class ParkingLotService {
    ParkingLot parkingLot;

    public void createParkingLot(int capacity, ParkingLotStrategy parkingLotStrategy) {
        if(this.parkingLot != null) {
            System.out.println("Parking Lot Already exists !!");
            return;
        }
        System.out.println("Creating Parking Lot with Size  " + capacity);
        parkingLot = new ParkingLot(capacity, parkingLotStrategy);
        System.out.println("Created Parking Lot successfully");
    }

    public void parkVehicle(Vehicle vehicle) {
        parkingLot.park(vehicle);
    }

    public void unParkVehicle(Integer slotNumber) {
        parkingLot.unPark(slotNumber);
    }

}
