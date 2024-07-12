package _05_class._inheritance;

public class Vehicle {
    private String brand;
    private String name;
    private String model;
    private int year;
    private String info;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("==== " + name + " 정보 ====");
        System.out.println(name);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    void start() {
        System.out.println("차량 시동을 걸었습니다.");
    }

    void end() {
        System.out.println("차량을 정지했습니다.");
    }

    @Override
    public String toString() {
        return name + "{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", " + info +
                '}';
    }
}
