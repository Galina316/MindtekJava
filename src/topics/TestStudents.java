package topics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class TestStudents {
    public static void main(String[] args) {


        Student student1 = new Student(105, "John", "New York");
        Student student2 = new Student(102, "Patel", "Chicago");
        Student student3 = new Student(106, "John", "Miami");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println(studentList);


    }
}