package parkingLot.command;

import parkingLot.model.Vehicle;
import parkingLot.service.ParkingLotService;

public class ParkVehicleExecutor extends CommandExecutor {
    public static final String COMMAND_NAME="PARK_PARKING_LOT";

    ParkVehicleExecutor(ParkingLotService parkingLotService) {
        super(parkingLotService);
    }

    @Override
    public void validate() {
    }

    @Override
    public void execute() {
        Vehicle car = new Vehicle("KA-01", "White");
        parkingLotService.parkVehicle(car);
    }
}
