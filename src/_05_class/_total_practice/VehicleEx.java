package _05_class._total_practice;

import java.util.ArrayList;
import java.util.List;

public class VehicleEx {

    public static void main(String[] args) {
        List<Vehicle> v = new ArrayList<>();
        Car c = new Car();
        Airplane a = new Airplane();

        v.add(c);
        v.add(a);

        for (Vehicle vi: v) {
            vi.move();

            if(vi instanceof Flyable) {
                ((Flyable) vi).fly();
            }
        }
    }

}
