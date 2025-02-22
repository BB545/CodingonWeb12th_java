package _05_class._access_modifier._pack2;

// A (default) 는 다른 패키지에서 접근 불가
// import _05_class._access_modifier._pack1.A;

// B (public) 은 모든 클래스에서 사용 가능
import _05_class._access_modifier._pack1.B;

public class C {
    // A a; // 컴파일 에러
    B b;

    // C 클래스(pack2) A, B 클래스(pack1)와 패키지가 다르므로
    // default 제한자를 갖는 A 클래스는 에러 발생
    // public 제한자를 갖는 B 클래스는 가능 (단, import 구문 작성하면)
}
