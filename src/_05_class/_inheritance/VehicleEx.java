package _05_class._inheritance;

public class VehicleEx {

    public static void main(String[] args) {
        Bus bus = new Bus("Hyundai", "Bus", "City Bus", 2022, "passengerCapacity=30");
        System.out.println(bus);
        bus.start();
        bus.bus();
        bus.end();

        Car car = new Car("Toyota", "Car", "Camry", 2023, "convertible=true");
        System.out.println(car);
        car.start();
        car.car();
        car.end();

        Motorcycle moto = new Motorcycle("Harley-Davidson", "Motorcycle", "Sportster", 2021, "licenseType='A'");
        System.out.println(moto);
        moto.start();
        moto.moto();
        moto.end();
    }

}
