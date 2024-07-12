package _05_class._inheritance;

// 부모 클래스 (슈퍼 클래스): Person
// 자식 클래스 (서브 클래스): Student
public class Person {
    // 1) 필드가 public 인 경우
    /* public String name;
    public int age; */

    /* public void say() {
        System.out.println("안녕하세요");
    }

    public void eat(String food) {
        System.out.println(food + " 를(을) 먹고있다.");
    } */

    // case1. 부모 클래스가 "기본 생성자 (매개변수 없는)" 갖는 경우
    /* public Person() {
        System.out.println("부모 클래스 Person() 생성자가 실행되었습니다.");
    } */

    // case2. 부모 클래스가 "매개변수를 갖는 생성자"를 갖는 경우
    /* public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("부모 클래스의 public Person(String name, int age) 생성자가 실행되었습니다.");
    } */

    // 2) 필드가 private 인 경우
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("안녕하세요");
    }

    public void eat(String food) {
        System.out.println(food + " 를(을) 먹고있다.");
    }
}
