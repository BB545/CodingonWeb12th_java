package _05_class._abstract;

public class Square extends Shape{
    /* public Square(String color) {
        super(color);
    } */

    public Square(String color, String type) {
        super(color, type);
    }

    @Override
    void calculateArea() {
        /* int area = 0;
        area = width * height;
        System.out.println("도형의 넓이: " + area); */
    }

    /* @Override
    void draw() {
        System.out.println("사각형을 그려보자~");
    } */
}
