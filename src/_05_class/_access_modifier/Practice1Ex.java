package _05_class._access_modifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice1Ex {

    public static void main(String[] args) {
        List<Practice1> Rectangle = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            if (width == 0 && height == 0) break;
            Practice1 p1 = new Practice1(width);
            p1.setHeight(height);
            Rectangle.add(p1);
        }

        while (!Rectangle.isEmpty()) {
            Practice1 p1 = Rectangle.get(0); // 첫번째 인덱스 가져오기
            System.out.println("가로 길이는: " + p1.getWidth());
            System.out.println("세로 길이는: " + p1.getHeight());
            System.out.println("넓이는: " + p1.area());
            System.out.println("-------------------------------");
            Rectangle.remove(0);
        }
    }

}
