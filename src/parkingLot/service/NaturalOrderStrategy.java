package parkingLot.service;

import java.util.TreeSet;

public class NaturalOrderStrategy implements ParkingLotStrategy {

    TreeSet<Integer> treeSet;

    public NaturalOrderStrategy() {
        treeSet = new TreeSet<>();
    }
    @Override
    public int getNextFreeSlot() {
        return treeSet.first();
    }

    @Override
    public void removeSlot(int nextFreeSlot) {
        treeSet.remove(nextFreeSlot);
    }

    @Override
    public void addSlot(int slotNumber) {
        treeSet.add(slotNumber);
    }

}
