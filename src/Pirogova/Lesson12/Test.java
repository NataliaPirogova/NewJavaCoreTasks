package Pirogova.Lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        Student S1 = new Student();
        students.add(String.valueOf(S1));
        Student S2 = new Student();
        students.add(String.valueOf(S2));
        Student S3 = new Student();
        students.add(String.valueOf(S3));
        Student S4 = new Student();
        students.add(String.valueOf(S4));
        Student S5 = new Student();
        students.add(String.valueOf(S5));

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        System.out.println(S4);
        System.out.println(S5);


            System.out.println("Выберите действие со списком студентов: \n1 - добавление нового студента в список\n2- удаление студента из списка по id\n3 - редактирование студента по id\n4 - получить всех студентов в отсортированном виде по имени и возрасту\n5 - получить все уникальные факультеты и имена студентов и их возраст на этомфакультете");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a){
                case 1:
                    Student newS = new Student();
                    students.add(String.valueOf(newS));
                    System.out.println(newS);
                    break;
                case 2:
                    System.out.println("По какому id будем удалять студента? Введите число:");
                    Scanner sc1 = new Scanner(System.in);
                    int b = sc1.nextInt();
                    if(students.contains("b")){

                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
    }
}
