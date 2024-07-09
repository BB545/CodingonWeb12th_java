package _02_control_statement;

public class Practice6 {

    public static void main(String[] args) {
        Practice6 result = new Practice6();
        System.out.println("반지름이 5인 원의 넓이: " + result.calc(5));
        System.out.println("가로 4, 세로 7인 직사각형의 넓이: " + result.calc(4, 7));
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이: " + result.calc(6, 3));
    }

    public double calc(double x) {
        return Math.PI * x * x;
    }

    public double calc(double x, double y) {
        return x * y;
    }

    public int calc(int x, int y) {
        return (x * y) / 2;
    }
}
