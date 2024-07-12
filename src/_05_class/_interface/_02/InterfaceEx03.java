package _05_class._interface._02;

// 상수 인스턴스 패턴
interface Constants {
    // final 키워드
    // - 클래스에서 사용하면 상속될 수 없음 ex. final class MyClass {...}
    // - 메소드에서 사용하면 오버라이드 할 수 없음
    // - 매개변수에서 사용하면 매개변수 값을 변경할 수 없음 ex. void func(final int x) {...}

    public final int MAX_VALUE = 100;
    double PI = 3.14; // final 키워드 생략 가능
}

class ConstantsEx implements Constants {
    void display() {
        System.out.println("MAX_VALUE: " + MAX_VALUE);
        System.out.println("PI: " + PI);
    }
}

public class InterfaceEx03 {

    public static void main(String[] args) {
        ConstantsEx obj = new ConstantsEx();
        obj.display();
    }

}
