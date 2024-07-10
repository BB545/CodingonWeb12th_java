package _05_class;

public class StudentEx {

    public static void main(String[] args) {
        // new 키워드 이용해 s1 객체 생성
        Student s1 = new Student("김상수", 1); // s1 변수가 Student 객체 참조
        System.out.println(s1); // 메세지가 override 안되면 참조값이 나오고, override하면 override 형태대로 나옴

        // 메서드 호출
        s1.gotoSchool();
        s1.study("Java 프로그래밍");
        System.out.println(s1.getGrade() + "학년");
        System.out.println(s1.getTestResult(100));

        Student s2 = new Student("이찬혁", 2);
        System.out.println("s2 = " + s2);
    }

}
