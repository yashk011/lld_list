package parkingLot.service;

public interface ParkingLotStrategy {

    public int getNextFreeSlot();

    public void removeSlot(int nextFreeSlot);

    public void addSlot(int slotNumber);
}
