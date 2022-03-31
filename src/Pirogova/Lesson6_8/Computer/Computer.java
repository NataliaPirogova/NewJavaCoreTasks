package Pirogova.Lesson6_8.Computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String Processor;//процессор
    private int operational;//оперативка
    private int hsd;//жесткий диск
    private int resourse;//ресурс полных циклов работы
    private int count;//количество включений-выключений

    public void displayInfo(){
        System.out.println("Характеристики компьютера: процессор - " + Processor + ", оперативная память - " + operational + ", жесткий диск - " + hsd + ", ресурс работы циклов - " + resourse);
    }

    public void turnON(){
        Random r = new Random();
        int a = r.nextInt(2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: 0 либо 1");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Вы ввели верное число, происходит загрузка компьютера");
            count++;
            if(count>resourse){
                System.out.println("Превышен ресурс работы, компьютер сгорел");
            }
        }
        else{
            System.out.println("Ошибка!! Компьютер сгорел!");
        }
    }

    public void turnOFF(){
        Random r = new Random();
        int a = r.nextInt(2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: 0 либо 1");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Вы ввели верное число, происходит загрузка компьютера");
            count++;
            if(count>resourse){
                System.out.println("Превышен ресурс работы, компьютер сгорел");
            }
        }
        else{
            System.out.println("Ошибка!! Компьютер сгорел!");
        }
    }


}
