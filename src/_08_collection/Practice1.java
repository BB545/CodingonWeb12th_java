package _08_collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");
        Set<Integer> set = new HashSet<>();

        while (true) {
            System.out.print("정수 입력: ");
            int num = scanner.nextInt();

            if(num == -1) break;

            set.add(num);
        }
        System.out.println("중복 제거된 정수 목록: " + set);
    }
}
