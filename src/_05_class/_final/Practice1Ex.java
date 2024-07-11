package _05_class._final;

import java.util.Scanner;

public class Practice1Ex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요: ");
        double radius = scanner.nextDouble();
        Practice1 a = new Practice1(radius);
        System.out.println("원의 반지름 : "+ radius);
        System.out.println("원의 넓이 : "+ a.circleArea());
    }

}
