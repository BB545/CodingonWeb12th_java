package _05_class._abstract;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(String color, String type, int width, int height) {
        super(color, type);
        this.width = width;
        this.height = height;
    }

    @Override
    void calculateArea() {
        int area = 0;
        area = width * height;
        System.out.println("도형의 넓이: " + area);
    }
}
