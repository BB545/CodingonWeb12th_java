package _05_class._access_modifier.__pack5;

public class Person {
    // private field 선언
    private int age;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    // setter 에는 목적어가 필요, 반드시 매개변수 들어가야함
    // 외부에서 나이를 음수로 설정하고자 한다면, 0으로 변경
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age; // 매개변수로 들어온 값을 할당하겠다.
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
