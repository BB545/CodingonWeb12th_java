package _05_class._static;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    private String name;
    private int student_Id;
    private int grade;

    static int totalStudents = 0;
    public Practice1(String name, int student_Id, int grade) {
        this.name = name;
        this.student_Id = student_Id;
        this.grade = grade;
        totalStudents++;
    }

    public String getName() {
        return this.name;
    }

    public int getStudent_Id() {
        return this.student_Id;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    static void displayInfo(List<Practice1> student){
        for(Practice1 std : student) {
            System.out.println("==== 학생 정보 ====");
            System.out.println("이름: " +std.name);
            System.out.println("학번: " + std.student_Id);
            System.out.println("학년: " + std.grade);
        }
        System.out.println("총 학생 수는 "+totalStudents +"명 입니다.");
    }

}
