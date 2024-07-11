package _05_class._access_modifier.__pack5;

public class PersonEx {

    public static void main(String[] args) {
        // 객체 생성
        Person p1 = new Person("minion");
        Person p2 = new Person("pooh");

        // p1.age = 4; // private field -> 컴파일 에러
        p1.setAge(4); // public method 인 setter 이용해 간접적으로 field 변경
        System.out.println(p1.getName() + " 의 나이는 " + p1.getAge());

        p2.setAge(-4); // 결과 - pooh 의 나이는 0 // setAge 로직에 의해 음수값은 0으로 변경됨
        System.out.println(p2.getName() + " 의 나이는 " + p2.getAge());
    }

}
