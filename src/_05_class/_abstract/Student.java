package _05_class._abstract;

public abstract class Student {
    String name;
    String school;
    int age;
    int number;

    public Student(String name, String school, int age, int number) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.number = number;
    }

    abstract void todo();

    void info() {
        System.out.println("==== " + name + " 학생의 정보 ====");
        System.out.println("학교: " + school);
        System.out.println("나이: " + age);
        System.out.println("학번: " + number);
    }

    String getName() {
        return this.name;
    }

    String getSchool() {
        return this.school;
    }

    int getAge() {
        return this.age;
    }

    int getNumber() {
        return this.number;
    }
}
