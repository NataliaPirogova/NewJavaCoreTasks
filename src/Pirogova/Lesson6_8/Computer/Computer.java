package Pirogova.Lesson6_8.Computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String Processor;//процессор
    private int operational;//оперативка
    private int hsd;//жесткий диск
    private int resourse;//ресурс полных циклов работы
    private int count;//количество включений-выключений

    public Computer(){

    }

    public Computer(String Processor){
        this.Processor = Processor;
    }

    public Computer(String Processor, int operational){
        this (Processor);
        this.operational = operational;
    }

    public Computer(String Processor, int operational, int hsd){
        this(Processor, operational);
        this.hsd = hsd;
    }

    public Computer(String Processor, int operational, int hsd, int resourse){
        this(Processor, operational, hsd);
        this.resourse = resourse;
    }

    public void displayInfo(){
        System.out.println("Характеристики компьютера : процессор - " + Processor + ", оперативная память - " + operational + ", жесткий диск - " + hsd + ", ресурс работы циклов - " + resourse);
    }

    Random r = new Random();
    int a = r.nextInt(2);
    Scanner sc = new Scanner(System.in);

    public void turnON(){
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
