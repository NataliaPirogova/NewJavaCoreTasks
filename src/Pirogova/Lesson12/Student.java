package Pirogova.Lesson12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Student {
private int id;
private String name;
private int age;
private String faculty;
private int course;

Random r = new Random();

    public Student() {
        this.id = r.nextInt(1000);
        this.name = Fio.get(r.nextInt(20));
        this.age = r.nextInt(17, 23);
        this.faculty = facult.get(r.nextInt(5));
        this.course = r.nextInt(1, 6);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                '}';
    }

    List<String> Fio = new ArrayList<>();

    BufferedReader bfS;

    {
        try {
            bfS = new BufferedReader(new FileReader("D:\\NewJavaCoreTasks\\src\\Pirogova\\Lesson12\\Students.txt"));
            String s;
            while ((s=bfS.readLine())!=null){
                Fio.add(s);}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    List<String> facult = new ArrayList<>();

    BufferedReader bfF;

    {
        try {
            bfF = new BufferedReader(new FileReader("D:\\NewJavaCoreTasks\\src\\Pirogova\\Lesson12\\Faculties.txt"));
            String f;
            while ((f=bfF.readLine())!=null){
                facult.add(f);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    //    public void correct(){
//        System.out.println("Выберите действие со списком студентов: \n 1 - добавление нового студента в список\n удаление студента из списка по id\n3 - редактирование студента по id\n4 - получить всех студентов в отсортированном виде по имени и возрасту\n5 - получить все уникальные факультеты и имена студентов и их возраст на этомфакультете");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        switch (a){
//            case 1:
//                students.add
//        }
//
//    }
}
