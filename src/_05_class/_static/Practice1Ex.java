package _05_class._static;

import java.util.ArrayList;
import java.util.List;

public class Practice1Ex {

    public static void main(String[] args) {
        List<Practice1> student = new ArrayList<>();
        student.add(new Practice1("김새싹", 20231001, 1));
        student.add(new Practice1("박지은", 20231002, 2));
        student.add(new Practice1("이은지", 20231003, 3));

        Practice1.displayInfo(student);
    }

}
