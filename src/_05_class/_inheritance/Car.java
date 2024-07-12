package _05_class._inheritance;

public class Car extends Vehicle{
    public Car(String brand, String name, String model, int year, String info) {
        setBrand(brand);
        setName(name);
        setModel(model);
        setYear(year);
        setInfo(info);
    }

    void car() {
        System.out.println("주차했습니다.");
    }
}
