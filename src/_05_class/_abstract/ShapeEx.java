package _05_class._abstract;

import _05_class._access_modifier._pack2.C;

import java.util.ArrayList;
import java.util.List;

public class ShapeEx {

    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        List<Rectangle> rectangles = new ArrayList<>();

        circles.add(new Circle("Red", "Circle", 5));
        rectangles.add(new Rectangle("Blue", "Rectangle", 6, 4));

        // Shape 객체는 new 연산자로 직접 생성 불가능
        // 실제 클래스인 Circle, Square 은 new 연산자로 객체 생성 가능
        // Shape shape = new Shape("green"); // 컴파일 에러
        // Circle circle = new Circle("Red");
        // Square square = new Square("yellow");
        // Rectangle rectangle = new Rectangle("Blue", "Rectangle");

        // Circle, Square 는 메서드의 Shape 타입과 다르지만 Shape 을 상속받아 구현한 클래스이기에 문제 없음
        // 매개변수의 다형성
        // : go 메소드의 매개 타입이 Shape 이지만, 각각의 실제 클래스로 자동으로 타입 변경
        /* go(circle);
        go(square); */

        for (Circle c: circles) {
            areaResult(c);
        }

        for (Rectangle r: rectangles) {
            areaResult(r);
        }
    }

    /* public static void go(Shape shape) {
        shape.start();
        shape.draw();
        System.out.println("도형 색상은 " + shape.getColor() + "\n");
    } */

    public static void areaResult(Shape shape) {
        shape.getColor();
        shape.calculateArea();
    }

}
