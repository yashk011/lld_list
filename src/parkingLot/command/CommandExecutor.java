package parkingLot.command;

import parkingLot.service.ParkingLotService;

public abstract class CommandExecutor {
    ParkingLotService parkingLotService;

    CommandExecutor(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public abstract void validate();
    public abstract void execute();
}
