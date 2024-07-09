package _02_control_statement;

// 오버 로딩
// - 하나의 클래스에서 동일한 이름의 메서드 여러개 정의
// - 즉, 이름이 갖고 매개변수 타입, 개수, 순서가 다름
// - 동작이 유사할 때 사용하면 편리

public class MethodOverloading {

    public static void main(String[] args) {
        // 객체 생성
        MethodOverloading ol = new MethodOverloading();

        // 객체 메서드 호출
        System.out.println(ol.add(1, 2));
        System.out.println(ol.add(2.2, 3.3));
        System.out.println(ol.add(1, 2, 3));
        System.out.println(ol.add(1.1, 2.2, 4.4)); // 결과 : 7.700000000000001

        // 7.700000000000001 뭐지? -> 부동 소수점의 한계 -> 소수가 이진수로 정확히 변환이 안된 케이스 -> 7.7 근삿값 표현
        // 우리가 작성하는 10진수는 컴퓨터가 이해하기 위해 2진수로 변환이 되어야 하는데,
        // 10진 소수가 이진수로 정확한 변환이 안되는 케이스가 있다.
        // ex. 2의 거듭제곱 역수 (1/2, 1/4, 1/8, 1/16, ...) -> 소수를 정확하게 이진수로 변환 가능
        // 0.1 같은 10진소수는 이진수로 표현하면 "무한 순환소수" 0.1(10) = 0.0001100110011001100...(2) -> 근삿값으로 계산
        // 10진법에서 1/3 = 0.33333....을 0.33이라고 표현하는 것과 유사한 케이스
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

}
