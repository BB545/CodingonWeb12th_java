package _05_class._final;

public class StudentEx {

    public static void main(String[] args) {
        Student std1 = new Student("s001", "김철수");
        System.out.println(std1);

        // final field 값은 변경 불가 (읽기 전용)
        // std1.campus = "도화";
        // std1.sId = "s002";

        std1.name = "홍길동"; // 인스턴스 필드이므로 변경 가능
        System.out.println(std1);

        Student std2 = new Student("s002", "김영희");
        System.out.println(std2);
        // 결과 - Student{campus='염리', sId='s002', name='김영희'}
    }

}
