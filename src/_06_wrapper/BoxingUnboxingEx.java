package _06_wrapper;

// Wrapper 객체
// - 기본 타입(byte, char, short, int, long, float, double, boolean) 값을 갖는 객체를 생성
public class BoxingUnboxingEx {

    public static void main(String[] args) {
        // Boxing
        // - 기본 타입 값을 포장 객체로 만드는 과정
        // - 포장 클래스 변수에 값이 대입될 때 발생
        Integer obj1 = 100;
        Double obj2 = 3.14;
        Character obj3 = 'A';

        // 자료형Value() : 명시적 언박싱
        // - 코드의 명확성과 특정 상황에서의 안전성을 위해 사용하는 메서드
        // - 객체값이 null 일 때 자동 언박싱은 NullPointerException 을 발생시킬 수 있지만,
        //   자료형Value() 메서드 사용하면 더 명확한 처리 가능
        System.out.println("obj1 = " + obj1.intValue());
        System.out.println("obj2 = " + obj2.doubleValue());
        System.out.println("obj3 = " + obj3.charValue());

        // Unboxing
        // - 포장 객체에서 기본 타입 값을 얻는 과정
        // - 기본 타입 변수에 포장 객체가 대입될 때 발생
        int value1 = obj1;
        double value2 = obj2;
        char value3 = obj3;

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);
        
        // 연산 과정에서의 boxing
        int result1 = obj1 + 100;
        double result2 = obj2 + 1.5;
        char result3 = (char) (obj3 + 1); // char 는 숫자로 연산되므로 형변환 필요
        // 아래의 코드는 모두 같은 결과값을 나타냄
        // char c1 = 'A'; (문자 리터럴) // char c1 = 65; (아스키 코드) // char c1 = '\u0041'; (유니코드)

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }

}
