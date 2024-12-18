package parkingLot.model;

public class ParkingSpot {
    int id;
    Vehicle parkedVehicle;

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return (parkedVehicle == null);
    }

    public void parkVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
    }

    public void freeVehicle() {
        this.parkedVehicle = null;
    }
}
