package _05_class._final;

// final field
// - 최종적인 값이 되어 프로그램 실행 도중에 수정 불가능
// - 일반 final field 는 객체마다 저장되고, 생성자의 매개값을 통해서 여러 값을 가질 수 있으나 상수는 아님
public class Student {
    // final field
    final String campus = "염리"; // 1. 필드를 선언 시 초기화
    final String sId; // 2. 생성자 초기화 (생성자에 따라 초기화)

    // instance field
    String name;

    public Student(String sId, String name) {
        this.sId = sId; // 생성자에서 final field 인 sId 의 값을 초기화
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "campus='" + campus + '\'' +
                ", sId='" + sId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
