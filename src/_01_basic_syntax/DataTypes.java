package _01_basic_syntax;

// Primitive Types (기본형)
// - 사용되기 전에 선언되어야 함
// - OS에 따라 자료형 길이가 변하지 않음
// - "비객체" 타입 -> null 값 가질 수 없음 // js와의 차이점

// Reference Types (참조형)
// - java.lang.Object 상속 받음
// - 기본형이 아니면 모두 참조형

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("==== Primitive Type ====");

        // 정수형 변수 - 각각 데이터 크기가 다름
        int x = 10; // 32bit
        long y = 100000000000000L; // 64bit // long 타입은 뒤에 'L' 또는 'l'을 붙여야 함
        short z = 32767; // 16bit - 32767 : short가 가질 수 있는 최댓값
        byte b = 127; // 8bit - 127 : byte가 가질 수 있는 최댓값

        // 실수형 변수
        float a = 3.14f; // 32bit // float 타입은 'F' 또는 'f'를 붙여야 함
        double c = 2.71828; // 64bit

        // 문자형 변수
        char ch = 'A'; // 작은 따옴표 사용

        // 논리형 변수
        boolean bool = true; // false

        System.out.println("정수형 변수" + x + ", " + y + ", " + z + ", " + b);
        System.out.println("실수형 변수" + a + ", " + c);
        System.out.println("문자형 변수" + ch);
        System.out.println("논리형 변수" + bool);


        System.out.println("==== Reference Type ===="); // 메모리 주소의 값을 저장함

        // String (js에서는 기본형)
        // - Java 에서 String 타입은 특별한 자료형. 참조형인데 기본형처럼 사용함 (불변(immutable) 객체)
        // - 기본 자료형 "==" 으로 값을 비교하지만, String 객체 간 비교는 .equals() 메서드로 문자열 내용을 비교
        // - 참조형을 "=="을 사용해 비교하면 주소값을 비교하는 행위 - 메서드를 사용해 데이터 값을 비교해야함
        String greeting = "Hello, World!";

        System.out.println("greeting = " + greeting);
        
        // 배열 (Array) 참조형 변수와 선언 초기화
        // - js와 차이점 : js에서는 배열 안에 여러 자료형 있을 수 있음. Java에서는 하나의 자료형만 들어갈 수 있음.
        int[] numbers = {1, 2, 3, 4, 5}; // 배열을 중괄호로 표시

        System.out.println("numbers = " + numbers); // 메모리 주소
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        Person person = new Person("Jhon", 40);
        System.out.println("person = " + person);
        System.out.println("Person 객체: " + person.getName() + ", " + person.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
