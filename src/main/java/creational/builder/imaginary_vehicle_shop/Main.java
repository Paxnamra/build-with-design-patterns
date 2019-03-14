package creational.builder.imaginary_vehicle_shop;

public class Main {
    public static void main(String[] args) {

        VehicleShop.Vehicle aircraftCar = new VehicleShop.Vehicle("Car");
        VehicleShop.Vehicle powerTank = new VehicleShop.Vehicle("Tank");

        aircraftCar.colour("Blue").engine("aircraft build in").wheels(4).doors(2).createVehicle();
        powerTank.colour("Military greens").engine("too powerful for numbers").doors(1).createVehicle();

        System.out.println(aircraftCar);
        System.out.println(powerTank);

    }
}
