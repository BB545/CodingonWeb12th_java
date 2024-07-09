package _02_control_statement;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("덧셈 결과 : " + sum(num1, num2));
        System.out.println("뺄셈 결과 : " + minus(num1, num2));
        System.out.println("나눗셈 결과 : " + div(num1, num2));
        System.out.println("곱셈 결과 : " + mul(num1, num2));
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static double minus(double x, double y) {
        return x - y;
    }

    public static double div(double x, double y) {
        return x / y;
    }

    public static double mul(double x, double y) {
        return x * y;
    }

}
