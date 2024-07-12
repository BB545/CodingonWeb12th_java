package _05_class._inheritance;

public class Motorcycle extends Vehicle{
    public Motorcycle(String brand, String name, String model, int year, String info) {
        setBrand(brand);
        setName(name);
        setModel(model);
        setYear(year);
        setInfo(info);
    }

    void moto() {
        System.out.println("올림통을 합니다.");
    }
}
