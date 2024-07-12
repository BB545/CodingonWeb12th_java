package _05_class._abstract;

// 추상 클래스
// - 클래스의 공통적인 필드와 메소드를 추출해서 선언한 클래스
// - 실제 클래스: 객체를 직접 생성할 수 있는 클래스
// - 추상 클래스: 공통적인 특성을 추출해서 선언한 클래스

// abstract 키워드 사용
// new 연산자를 이용해 객체 생성 불가능
// -> 직접 생성자 호출이 불가능한 것이지, 자긱 개체 생성자에서 super(..) 호출 추상 클래스 객체 생성 가능
// 상속을 통해 자식 클래스만 만들 수 있음
// - 자식 클래스에서 부모 호출은 가능, 직접 생성자 호출이 불가능한 것
public abstract class Shape {
    // 필드
    String color;
    String type;

    // 생성자
    public Shape(String color, String type) {
        this.color = color;
        this.type = type;
    }

    // 추상 메서드
    // - 메소드 선언부분만 있는 메소드
    // - 자식 클래스에서 재정의 (@Override)
    // - 모든 실체들이 갖는 메소드 실행 내용이 동일하다면, 추상클래스에서 메소드를 구현하는 게 나음
    // - 메소드의 선언만 동일하고 실제 내용이 달라져야 한다면, 추상 메서드를 사용
    // - 자식 클래스는 추상 메소드를 재정의하지 않으면, 컴파일 에러
    // abstract void draw();

    // 일반 메서드
    /* void start() {
        System.out.println("도형을 그려보자~");
    }

    String getColor() {
        return this.color;
    } */

    abstract void calculateArea();

    void getColor() {
        System.out.println("==== " + type + " 도형의 정보 ====");
        System.out.println("도형의 색상: " + color);
    }
}
