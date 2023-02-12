import jscode4.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("제이슨", 87, 92));
        studentList.add(new Student("레이첼", 82, 92));
        studentList.add(new Student("리사", 92, 88));

        for (Student student : studentList) {
            student.printInfo();
        }
    }
}