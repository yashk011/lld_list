package parkingLot;

import parkingLot.command.CommandExecutorFactory;
import parkingLot.command.CreateParkingLotExecutor;
import parkingLot.command.ParkVehicleExecutor;
import parkingLot.command.UnParkVehicleExecutor;
import parkingLot.model.ParkingLot;
import parkingLot.service.NaturalOrderStrategy;
import parkingLot.service.ParkingLotService;

public class ParkingLotDemo {
    public static void main(String[] args) {
        System.out.println("==== Parking Slot ===");

        ParkingLotService parkingLotService = new ParkingLotService();
        CommandExecutorFactory commandExecutorFactory = new CommandExecutorFactory(parkingLotService);

        commandExecutorFactory.getCommandExecutor(CreateParkingLotExecutor.COMMAND_NAME).execute();
        commandExecutorFactory.getCommandExecutor(ParkVehicleExecutor.COMMAND_NAME).execute();
        commandExecutorFactory.getCommandExecutor(UnParkVehicleExecutor.COMMAND_NAME).execute();
    }
}
