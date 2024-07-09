package _02_control_statement;

import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }

}
