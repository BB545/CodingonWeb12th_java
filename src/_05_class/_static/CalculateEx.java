package _05_class._static;

public class CalculateEx {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        double circleArea = 10 * 10 * Calculate.pi;
        System.out.println("circleArea = " + circleArea);
        int plusResult = Calculate.plus(num1, num2);
        System.out.println("plusResult = " + plusResult);
        int minusResult = Calculate.minus(num1, num2);
        System.out.println("minusResult = " + minusResult);
    }

}
