package parkingLot2.model;

import parkingLot.model.ParkingSpot;
import parkingLot2.exception.BizException;

import java.util.HashMap;
import java.util.List;

public class ParkingLot {
    public static final double NUMBER_OF_BIKES = 0.3;
    public static final double NUMBER_OF_CARS = 0.4;
    public static final double NUMBER_OF_TRUCKS = 0.3;

    HashMap<Integer, Spot> parkingSpots;
    int capacity = 0;
    public ParkingLot(int capacity) {
        parkingSpots = new HashMap<>();
        int no_of_bikes = (int) (capacity*NUMBER_OF_BIKES);
        int no_of_cars = (int) (capacity*NUMBER_OF_CARS);
        int no_of_trucks = (int) (capacity*NUMBER_OF_TRUCKS);
        this.capacity = capacity;

        for(int i=0;i<no_of_bikes;i++) {
            Spot parkingSpot = new Spot(i, VehicleType.BIKE, null);
            parkingSpots.put(i, parkingSpot);
        }
        for(int i=no_of_bikes;i<no_of_bikes+no_of_cars;i++) {
            System.out.println("=====" + i);
            Spot parkingSpot = new Spot(i, VehicleType.CAR, null);
            parkingSpots.put(i, parkingSpot);
        }
        for(int i=no_of_bikes+no_of_cars;i<capacity;i++) {
            Spot parkingSpot = new Spot(i, VehicleType.TRUCK, null);
            parkingSpots.put(i, parkingSpot);
        }
    }

    public int parkVehicle(Vehicle vehicle) throws BizException {
        Spot availableSpot = null;
        System.out.println("Parking Vehicle with vehicle number - " + vehicle.getVehicleNumber() + " and type - " + vehicle.getVehicleType());
        for(Spot spot : parkingSpots.values()) {
            if(spot.isAvailable() && spot.getVehicleType() == vehicle.getVehicleType()) {
                spot.setAssignedVehicle(vehicle);
                availableSpot = spot;
                break;
            }
        }

        if(availableSpot == null) {
            throw new BizException("Free Spot not available !!!");
        }
        parkingSpots.put(availableSpot.getId(), availableSpot);
        System.out.println("Parked Vehicle with vehicle number - " + vehicle.getVehicleNumber() + " and type - " + vehicle.getVehicleType());
        return availableSpot.getId();
    }

    public void unParkVehicle(int slotNumber) throws BizException {
        if(parkingSpots.get(slotNumber) == null ) {
            throw new BizException("Vehicle with slot number not available - " + slotNumber);
        }

        Spot spot = parkingSpots.get(slotNumber);
        Vehicle vehicle = spot.getAssignedVehicle();
        spot.setAssignedVehicle(null);
        System.out.println("UnParking Vehicle " + vehicle.getVehicleNumber());
        System.out.println("Spot is available now " + spot.getId());
    }
}

