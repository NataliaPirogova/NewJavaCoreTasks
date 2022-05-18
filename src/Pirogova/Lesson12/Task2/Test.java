package Pirogova.Lesson12.Task2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Tanya", 8, 3, 5.0);
        Student s2 = new Student("Maxim", 9, 1, 1.3);
        Student s3 = new Student("Roma", 5, 5, 3.0);
        Student s4 = new Student("Lena", 10, 2, 4.7);
        Student s5 = new Student("Julia", 7, 3, 4.2);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.forEach(System.out::println);
        System.out.println("--------------------");


    }
}
