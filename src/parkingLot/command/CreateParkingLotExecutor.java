package parkingLot.command;

import parkingLot.model.Vehicle;
import parkingLot.service.NaturalOrderStrategy;
import parkingLot.service.ParkingLotService;

public class CreateParkingLotExecutor extends CommandExecutor{
    public static final String COMMAND_NAME="CREATE_PARKING_LOT";

    CreateParkingLotExecutor(ParkingLotService parkingLotService) {
        super(parkingLotService);
    }

    @Override
    public void validate() {
        System.out.println("Validating Command");
    }

    @Override
    public void execute() {
        parkingLotService.createParkingLot(10, new NaturalOrderStrategy());
    }
}
