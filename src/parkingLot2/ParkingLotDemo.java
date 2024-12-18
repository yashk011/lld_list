package parkingLot2;

import parkingLot2.model.Bike;
import parkingLot2.model.Car;
import parkingLot2.model.VehicleType;
import parkingLot2.service.ParkingLotService;

public class ParkingLotDemo {
    public static void main(String[] args) {

        Car car = new Car(VehicleType.CAR, "KA-01-1980");
        Car car2 = new Car(VehicleType.CAR, "KA-01-1000");
        Car car3 = new Car(VehicleType.CAR, "KA-01-1001");
        Car car4 = new Car(VehicleType.CAR, "KA-51-2001");
        Car car5 = new Car(VehicleType.CAR, "KA-51-3001");


        Bike bike1 = new Bike(VehicleType.BIKE, "KA-52-1080");

        ParkingLotService parkingLotService = new ParkingLotService(10);
        int id1 = parkingLotService.parkVehicle(car);
        int id2 = parkingLotService.parkVehicle(car2);
        int id3 =parkingLotService.parkVehicle(car3);

        int id4 = parkingLotService.parkVehicle(bike1);
        int id5 = parkingLotService.parkVehicle(car4);
        int id6 = parkingLotService.parkVehicle(car5);

        parkingLotService.unParkVehicle(id1);
        parkingLotService.unParkVehicle(id2);
        parkingLotService.unParkVehicle(id3);

        int id7 = parkingLotService.parkVehicle(car4);
        int id8 = parkingLotService.parkVehicle(car5);
    }
}
