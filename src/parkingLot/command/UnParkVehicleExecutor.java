package parkingLot.command;

import parkingLot.service.ParkingLotService;

public class UnParkVehicleExecutor extends CommandExecutor{
    public static final String COMMAND_NAME="UN_PARK_PARKING_LOT";

    public UnParkVehicleExecutor(ParkingLotService parkingLotService) {
        super(parkingLotService);
    }

    @Override
    public void validate() {

    }

    @Override
    public void execute() {
        int slotNumber = 0;
        parkingLotService.unParkVehicle(slotNumber);
    }
}
