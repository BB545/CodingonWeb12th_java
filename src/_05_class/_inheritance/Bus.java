package _05_class._inheritance;

public class Bus extends Vehicle{
    public Bus(String brand, String name, String model, int year, String info) {
        setBrand(brand);
        setName(name);
        setModel(model);
        setYear(year);
        setInfo(info);
    }

    void bus() {
        System.out.println("승객을 운송합니다.");
    }
}
