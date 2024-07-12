package _05_class._inheritance;

public class StudentEx {

    public static void main(String[] args) {
        Student std1 = new Student("김철수", 5);

        // 1) 필드가 public 인 경우
        // Person 으로부터 상속받은 필드
        /* System.out.println(std1.name);
        System.out.println(std1.age);
        // Student 필드
        System.out.println(std1.campus); // null -> setter 전(값을 부여한 적 없으므로)

        // Person 으로부터 상속 받은 메소드
        std1.say();
        std1.eat("바나나");

        // Student 메소드 호출
        std1.setCampus("염리");
        System.out.println(std1.campus); */


        // 2) 필드가 private 인 경우
        // Person 으로부터 상속 받은 필드 읽기
        System.out.println(std1.getName());
        System.out.println(std1.getAge());

        // Student 필드 읽기
        System.out.println(std1.getCampus());
        
        // Person 으로부터 상속 받은 메소드 호출
        std1.say();
        std1.eat("사과");
        
        // Student 메소드 호출
        std1.setCampus("염리");
    }
    
}
