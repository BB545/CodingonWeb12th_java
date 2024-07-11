package _05_class._access_modifier._pack4;

import _05_class._access_modifier._pack3.A;

public class C {
    public void method() {
        A a = new A(); // 서로 다른 패키지이므로 import 문 필요
        
        // 필드 변경
        a.field1 = 111;
        // a.field2 = 222; // default field 이므로 다른 패키지에서 사용 불가
        // a.field3 = 333; // private field

        // 메서드 호출
        a.method1();
        // a.method2(); // default method
        // a.method3(); // private method
    }
}
