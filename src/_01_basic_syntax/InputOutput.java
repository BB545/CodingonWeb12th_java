package _01_basic_syntax;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        int amount = 3;
        String product = "코카콜라 제로";
        
        // 출력 (output)
        System.out.print("안녕하세요.");
        System.out.print("저는 Hyun 입니다!\n");
        // 결과 - 안녕하세요.저는 Hyun 입니다! -> 내용만 출력하는 기능. 여러개 print를 작성해도 모두 한줄로 표시됨.

        System.out.print("안녕하세요.");
        System.out.println("저는 Hyun 입니다!"); // 내용 출력 + 개행
        System.out.print("잘부탁드립니다!\n");
        // 결과 - 
        // 안녕하세요.저는 Hyun 입니다!
        // 잘부탁드립니다!


        System.out.printf("편의점에서 %s 제품을 %d 개 구매했습니다.", product, amount);
        // printf("출력 서식", 출력 내용);
        // %s (문자열), %d (정수형), %f (실수형), %c (문자형), %b (불리언형), %n (개행)
        // 결과 - 편의점에서 코카콜라 제로 제품을 3 개 구매했습니다.


        // 입력 (input)
        // - Scanner 클래스 이용
        System.out.println("\n공백으로 구분해서 이름, 나이, 키, 결혼여부 를 입력해주세요 >> ");
        Scanner scanner = new Scanner(System.in); // 이후로는 값을 입력받을 수 있음
        // 값 읿력 시 공백으로 구분 (ex. Hyun 25 163 true)
        String name = scanner.next(); // 공백 이전까지의 문자열
        int age = scanner.nextInt(); // 공백 이전까지의 정수
        double height = scanner.nextDouble(); // 공백 이전까지의 실수
        boolean single = scanner.nextBoolean(); // 공백 이전까지의 결혼 여부

        System.out.println("==== 입력 결과 출력 ====");
        System.out.printf("이름\t\t\t: %s(님)\n", name); // \t : tab
        System.out.printf("나이\t\t\t: %d(세)\n", age);
        System.out.printf("키\t\t\t: %.1fcm\n", height); // 소수점 자릿수 지정 - .숫자 : 소수점 아래 몇번째 숫자까지
        System.out.printf("결혼 여부\t: %b\n", single);
        // 결과 -
        // 이름			: Hyun(님)
        // 나이			: 25(세)
        // 키			: 163.0cm
        // 결혼 여부	    : false

        scanner.close();
    }

}
