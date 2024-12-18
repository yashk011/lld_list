package parkingLot.command;

import parkingLot.model.ParkingLot;
import parkingLot.service.ParkingLotService;

import java.util.HashMap;

public class CommandExecutorFactory {
    HashMap<String, CommandExecutor> commands = new HashMap<>();

    public CommandExecutorFactory(ParkingLotService parkingLotService) {
        commands.put(CreateParkingLotExecutor.COMMAND_NAME, new CreateParkingLotExecutor(parkingLotService));
        commands.put(ParkVehicleExecutor.COMMAND_NAME, new ParkVehicleExecutor(parkingLotService));
        commands.put(UnParkVehicleExecutor.COMMAND_NAME, new UnParkVehicleExecutor(parkingLotService));
    }

    public CommandExecutor getCommandExecutor(String command) {
        return this.commands.get(command);
    }
}
