package _04_exception;

// 예외
// - 일반 예외 (Exception) : 컴파일러가 예외 처리 코드 여부를 검사하는 예외
//      => 개발자가 예외 처리를 해줘야함. 그렇지 않으면 컴파일 에러가 발생
// - 실행 예외 (Runtime Exception) : 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외
//      => 개발자가 예외 처리를 명시적으로 하지 않아도 컴파일 됨. 프로그램의 실행 시점에 발생하는 예외.
//      => 예외들을 처리하는 것이 권장됨

// Java는 예외가 발생하면 예외 클래스로부터 예외 객체를 생성하며, 해당 객체는 예외 처리 시 사용됨
// 예외 발생 시 프로그램으 갑작스런 종료를 막고 정상 실행할 수 있도록 처리하는 코드를 "예외 처리" 코드
// try-catch-finally 블록으로 구성됨

// try 블록에서 작성한 코드가 예외없이 정상 실행 -> catch 블록 실행 x &&& finally 블록 실행
// try 블록에서 작성한 코드에서 예외 발 -> catch 블록 실행 && finally 블록 실행
// -> 즉, finally 블록은 항상 실행
// -> try 블록과 catch 블록에서 return 문을 사용해도 finally 절은 하앙 실행되며, 옵션이므로 생략도 가능

// 다중 catch 블록 : 여러 유형의 예외를 처리할 수 있음

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

    public static void main(String[] args) {
        // case1. 예외 발생 코드
        // System.out.println(divide(6, 2));
        // System.out.println(divide(6, 0)); // ArithmeticException : 0으로 나눌 수 없음 예외

        // case1. 예외 처리 코드
        /*
        try {
            System.out.println("** 예외 처리 시작 **");
            System.out.println(divide(6, 0));
        } catch (ArithmeticException e) {
            // 1. e.getMessage(): 예외가 발생한 이유만 보여줌
            // System.out.println("나누기 연산 중 에러 발생 >> " + e.getMessage()); // => / by zero

            // 2. e.toString(): 예외 종류까지 보여줌
            // System.out.println("나누기 연산 중 에러 발생 >> " + e.toString());
            // => java.lang.ArithmeticException: / by zero
            
            // 3. e.printStackTrace(): 예외가 어디서 발생했는지 추적한 내용을 보여줌
            e.printStackTrace();
        } finally {
            System.out.println("** 연산 종료 **");
        }
         */

        // case2. 예외 발생 코드
        // System.out.println("단어 길이 = " + getLength(new String("Hello, World!")));
        // System.out.println("단어 길이 = " + getLength(new String("")));
        // System.out.println("단어 길이 = " + getLength(null)); // => NullPointerException: "str" is null

        // case2. 예외 처리 코드
        /*
        try {
            System.out.println("단어 길이 = " + getLength(null));
        } catch (NullPointerException e) {
            System.out.println("단어 길이 연산 중 에러 발생 >> " + e.toString());
        }
         */

        // case3. 예외 발생 코드
        // int[] numbers = { 10, 20, 30, 40, 50 };
        // System.out.println(getValueByIndex(numbers, 1));
        // System.out.println(getValueByIndex(numbers, numbers.length)); // => ArrayIndexOutOfBoundsException

        // case3. 예외 처리 코드
        /*
        try {
            System.out.println(getValueByIndex(numbers, numbers.length));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱싱 중 에러 발생 >> " + e.toString());
        }
         */

        // case4.
        Scanner scanner = new Scanner(System.in);

        // System.out.println("정수를 입력해주세요: ");
        // int number = scanner.nextInt(); // 공백 이전의 정수형 받음
        // System.out.println("입력한 정수: " + number);
        // 정수를 입력해주세요: 코딩온 or 1.0 정수형 이외의 타입 입력 시 // => InputMismatchException

        try {
            System.out.println("정수를 입력해주세요: ");
            int number = scanner.nextInt();
            System.out.println("입력한 정수: " + number);
        } catch (InputMismatchException e) { // 이 에러는 import 해줘야함
            System.out.println("입력값을 다시 확인하고, 정수를 입력해주세요! " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static String divide(int x, int y) {
        return x+ " / " + y + " = " + (x / y);
    }

    public static int getLength(String str) {
        return str.length();
    }

    public static int getValueByIndex(int[] arr, int idx) {
        return arr[idx];
    }

}
