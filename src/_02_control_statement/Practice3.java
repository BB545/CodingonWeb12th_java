package _02_control_statement;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        System.out.println("3개의 정수를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("최댓값 : " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("최댓값 : " + num2);
        } else {
            System.out.println("최댓값 : " + num3);
        }

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("최소값 : " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("최소값 : " + num2);
        } else {
            System.out.println("최소값 : " + num3);
        }

        System.out.println("합계 : " + (num1 + num2 + num3));
        System.out.println("평균 : " + ((num1 + num2 + num3)/3));
    }

}
