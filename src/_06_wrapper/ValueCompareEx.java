package _06_wrapper;

// 포장 값 비교
// - 포장 객체는 내부 값을 비교하기 위해 ==, != 연산자 사용 불가
// - 내부 값을 비교하는 게 아니라 포장 객체의 번지를 비교하기 때문
// - 따라서, .equals() 메서드로 내부 값을 비교해야함

// - byte, short, int : -128 ~ 127
// - boolean : true, false
// - char : \u0000 ~ \007f
// 위 범위에 포함되는 값은 같은 포장 객체를 공유 (같은 참조), 이외의 값을 갖는다면 다른 참조!
public class ValueCompareEx {

    public static void main(String[] args) {
        Integer obj1 = 10;
        Integer obj2 = 10;
        System.out.println(obj1 == obj2); // true -> int 범위 내에서 같은 참조값을 가지므로 true
        System.out.println(obj1.equals(obj2)); // true

        Integer obj3 = 1000;
        Integer obj4 = 1000;
        System.out.println(obj3 == obj4); // false -> 참조값을 비교하는 데 int가 같은 참조값을 갖는 범위를 벗어나므로 false
        System.out.println(obj3.equals(obj4)); // true -> 내용 비교 이므로 true

        Boolean bool1 = true;
        Boolean bool2 = true;
        System.out.println(bool1 == bool2); // true
        System.out.println(bool1.equals(bool2)); // true

        Character char1 = 'A';
        Character char2 = 'A';
        System.out.println(char1 == char2); // true
        System.out.println(char1.equals(char2)); // true

        Character char3 = '\u0101';
        Character char4 = '\u0101';
        System.out.println(char3 == char4); // false -> 같은 참조값을 같는 범위를 벗어남
        System.out.println(char3.equals(char4)); // true
    }

}
