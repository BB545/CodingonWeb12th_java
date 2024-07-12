package _05_class._abstract;

public class Circle extends Shape{
    double radius;

    public Circle(String color, String type, double radius) {
        super(color, type);
        this.radius = radius;
    }

    // 추상 메서드 구현, 재정의
    /* @Override
    void draw() {
        System.out.println("원을 그려보자~");
    } */

    @Override
    void calculateArea() {
        double area = 0;
        area = radius * radius * Math.PI;
        System.out.println("도형의 넓이: " + area);
    }
}
