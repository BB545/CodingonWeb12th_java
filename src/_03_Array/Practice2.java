package _03_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("문자를 입력해주세요.");
            String std = scanner.nextLine();
            if (std.equals("exit")) break;
            arr.add(std);
        }
        for (String std: arr) {
            System.out.println(std);
        }
    }

}
