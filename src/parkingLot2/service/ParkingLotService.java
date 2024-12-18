package parkingLot2.service;

import parkingLot2.exception.BizException;
import parkingLot2.model.ParkingLot;
import parkingLot2.model.Vehicle;

public class ParkingLotService {
    ParkingLot parkingLot;

    public ParkingLotService(int capacity) {
        parkingLot = new ParkingLot(capacity);
    }

    public int parkVehicle(Vehicle vehicle) {
        try {
            return this.parkingLot.parkVehicle(vehicle);
        }
        catch(BizException be) {
            System.out.println(be.getMsg());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;

    }

    public void unParkVehicle(int slotNumber) {
        try {
            this.parkingLot.unParkVehicle(slotNumber);
        }
        catch(BizException be) {
            System.out.println(be.getMsg());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
