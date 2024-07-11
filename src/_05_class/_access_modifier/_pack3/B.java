package _05_class._access_modifier._pack3;

public class B {
    public void method() {
        A a = new A(); // 서로 같은 패키지이므로 import 안해도 사용 가능

        // 필드 변경
        a.field1 = 11;
        a.field2 = 22;
        // a.field3 = 33; // private field 이므로 변경 불가, 컴파일 에러

        // 메서드 호출
        a.method1();
        a.method2();
        // a.method3(); // private method 이므로 해당 클래스 외부에서 사용 불가, 컴파일 에러
    }
}
