package _07_generic;

// 사람 관련 객체 사이의 상속 관계
// Person
// ㄴ Teacher
// ㄴ Student
//    ㄴ WebStudent
//    ㄴ MobileStudent
class Person {}
class Teacher extends Person {}
class Student extends Person {}
class WebStudent extends Student {}
class MobileStudent extends Student {}

// 등록: 특정 종류(T)의 Applicant 를 나타내는 클래스
class Applicant<T> {
    public T kind;
    public Applicant(T kind) {
        this.kind = kind;
    }
}

// 과정
class Course {
    // ? : 모든 사람이면 등록 가능
    public static void registerA(Applicant<?> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course A 를 등록함");
    }

    // ? extends Student : Student 객체만 등록 가능
    public static void registerB(Applicant<? extends Student> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course B 를 등록함");
    }

    // ? super Teacher : Student 가 아닌 Person 혹은 Teacher 만 등록 가능
    public static void registerC(Applicant<? super Teacher> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course C 를 등록함");
    }

    // 참고) getClass(), getSimpleName() 메서드
    // - Object 클래스에서 제공되는 메서드
    // - getClass() : 객체 클래스 정보 반환, 반환값이 클래스 객체 (ex. class java.lang.String)
    // - getSimpleName() : Class 클래스의 메소드 클래스의 간결한 이름 반환, 패키지 정보를 제외한 클래스 이름만 얻어올 떄 사용
    //                     (ex. class java.lang.String -> String)
}

public class GenericEx03 {

    public static void main(String[] args) {
        // A : 모든 사람이 등록 가능
        Course.registerA(new Applicant<Person>(new Person())); // 등록 완료
        // registerA 의 매개변수 : new Applicant<Person>(new Person())
        // new Applicant<Person> 의 매개변수 : new Person()
        Course.registerA(new Applicant<Teacher>(new Teacher())); // 등록 완료
        Course.registerA(new Applicant<Student>(new Student())); // 등록 완료
        Course.registerA(new Applicant<WebStudent>(new WebStudent())); // 등록 완료
        Course.registerA(new Applicant<MobileStudent>(new MobileStudent())); // 등록 완료
        System.out.println();

        // B : Student 객체만 등록 가능
        // Course.registerB(new Applicant<Person>(new Person())); // 등록 불가, 컴파일 에러
        // Course.registerB(new Applicant<Teacher>(new Teacher())); // 등록 불가, 컴파일 에러
        Course.registerB(new Applicant<Student>(new Student())); // 등록 완료
        Course.registerB(new Applicant<WebStudent>(new WebStudent())); // 등록 완료
        Course.registerB(new Applicant<MobileStudent>(new MobileStudent())); // 등록 완료

        // C : Student 객체가 아닌 Person 만 등록 가능
        Course.registerC(new Applicant<Person>(new Person())); // 등록 완료
        Course.registerC(new Applicant<Teacher>(new Teacher())); // 등록 완료
        // Course.registerC(new Applicant<Student>(new Student())); // 등록 불가, 컴파일 에러
        // Course.registerC(new Applicant<WebStudent>(new WebStudent())); // 등록 불가, 컴파일 에러
        // Course.registerC(new Applicant<MobileStudent>(new MobileStudent())); // 등록 불가, 컴파일 에러
    }

}
