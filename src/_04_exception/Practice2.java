package _04_exception;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("배열의 크기를 입력해주세요");
            int number = scanner.nextInt();
            int[] arr = new int[number];
            for (int i = 0; i < number; i++) {
                arr[i] = i + 1;
            }
            System.out.println("arr = " + Arrays.toString(arr));

            int sum = 0;
            for (int i: arr) {
                sum += i;
            }
            System.out.println("평균: " + (sum/number));
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식 에러: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누기 불가능: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 범위 에러: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("알 수 없는 예외: " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
            scanner.close();
        }
        
    }

}
