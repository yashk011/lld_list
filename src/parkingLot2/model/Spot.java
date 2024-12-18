package parkingLot2.model;

public class Spot {
    int id;
    VehicleType vehicleType;
    Vehicle assignedVehicle;

    public Spot(int id, VehicleType vehicleType, Vehicle assignedVehicle) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.assignedVehicle = assignedVehicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle getAssignedVehicle() {
        return assignedVehicle;
    }

    public void setAssignedVehicle(Vehicle assignedVehicle) {
        this.assignedVehicle = assignedVehicle;
    }

    public boolean isAvailable() {
        return (assignedVehicle == null);
    }
}
