package parkingLot.model;

import parkingLot.service.ParkingLotStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    ParkingLotStrategy parkingLotStrategy;
    Map<Integer, ParkingSpot> parkingSpotList;
    int capacity;

    public ParkingLotStrategy getParkingLotStrategy() {
        return parkingLotStrategy;
    }

    public void setParkingLotStrategy(ParkingLotStrategy parkingLotStrategy) {
        this.parkingLotStrategy = parkingLotStrategy;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingLot(int capacity, ParkingLotStrategy parkingLotStrategy) {
        this.parkingLotStrategy = parkingLotStrategy;
        this.parkingSpotList = new HashMap<>();
        this.capacity = capacity;

        for(int i=0;i<capacity;i++) {
            parkingSpotList.put(i, new ParkingSpot());
            parkingLotStrategy.addSlot(i);
        }
    }

    public void park(Vehicle vehicle) {
        int nextFreeSlot = this.parkingLotStrategy.getNextFreeSlot();
        ParkingSpot spot = this.parkingSpotList.get(nextFreeSlot);
        if(!spot.isAvailable()) {
            System.out.println("Parking Spot Not available");
            return;
        }
        System.out.println("Assigning Slot - " + nextFreeSlot);
        this.parkingLotStrategy.removeSlot(nextFreeSlot);
        spot.setParkedVehicle(vehicle);
        System.out.println("Successfully assigned Slot - " + nextFreeSlot);
        System.out.println(this.parkingSpotList.get(nextFreeSlot).getParkedVehicle().getVehicleNumber() + " Parked !!");

    }

    public ParkingSpot unPark(Integer slotNumber) {
        ParkingSpot assignedSlot = this.parkingSpotList.get(slotNumber);
        System.out.println("Freeing Slot - " + slotNumber);
        this.parkingLotStrategy.addSlot(slotNumber);
        assignedSlot.freeVehicle();
        System.out.println("Successfully freed Slot - " + assignedSlot.getId());

        return assignedSlot;
    }

}
