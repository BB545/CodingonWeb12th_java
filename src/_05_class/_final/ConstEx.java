package _05_class._final;

public class ConstEx {

    public static void main(String[] args) {
        // 상수 읽기
        // static field 이므로 객체 생성 없이 접근
        System.out.println(Const.GREETING);
        System.out.println(Const.MAX_VALUE);

        // 상수이므로 값 변경 불가
        // Const.GREETING = "Hi";
        // Const.MAX_VALUE = 200;
    }

}
