package Pirogova.Lesson6_8.Student_Aspirant;

public class All {
    public static void main(String[] args) {
        Student S1 = new Aspirant();
        Student[] students = new Student[3];
        students[0] = new Student("Igor", "Ivanov", "group17", 3);
        students[1] = new Student("Oksana", "Vaskina", "group7", 5);
        students[2] = new Student("Kirill", "Teterev", "group21", 3.9);


        for (Student student: students) {
            student.getScholarship(student);
        }
    }
}
