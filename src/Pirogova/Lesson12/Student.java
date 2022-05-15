package Pirogova.Lesson12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
private int id=1;
private String name;
private int age;
private String faculty;
private int course;

public Student(){}

Random r = new Random();

    public Student(String name, String faculty) {
        this.id = id++;
        this.name = Fio.get(r.nextInt(21));
        this.age = r.nextInt(23);
        this.faculty = faculty;
        this.course = r.nextInt(6);
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

}
