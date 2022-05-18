package Pirogova.Lesson12.Task2;

import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private double mark;

    public Student(String name, int group, int course, double mark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mark = mark;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", mark=" + mark +
                '}';
    }

    public String printStudents(List<Student> students, int course){
        return "Студент"+name+", курс "+course;
    }
}
