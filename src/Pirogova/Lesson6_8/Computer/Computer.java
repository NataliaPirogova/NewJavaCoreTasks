package Pirogova.Lesson6_8.Computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String Processor;//процессор
    private int operational;//оперативка
    private int hsd;//жесткий диск
    private int resource;//ресурс полных циклов работы
    private int count;//количество включений-выключений
    private boolean fail = false;//сгорели ли комп??

    public Computer() {

    }

    public Computer(String Processor) {
        this.Processor = Processor;
    }

    public Computer(String Processor, int operational) {
        this(Processor);
        this.operational = operational;
    }

    public Computer(String Processor, int operational, int hsd) {
        this(Processor, operational);
        this.hsd = hsd;
    }

    public Computer(String Processor, int operational, int hsd, int resource) {
        this(Processor, operational, hsd);
        this.resource = resource;
    }

    public void displayInfo() {
        System.out.println("Характеристики компьютера : процессор - " + Processor + ", оперативная память - " + operational + ", жесткий диск - " + hsd + ", ресурс работы циклов - " + resource);
    }

    Random r = new Random();
    int a = r.nextInt(2);
    Scanner sc = new Scanner(System.in);

    public void turnON() {
        while (!fail) {
            System.out.println("Пробуем включить компьютер...");
            System.out.println("Введите число: 0 либо 1");
            int b = sc.nextInt();
            if (a == b) {
                System.out.println("Вы ввели верное число, происходит загрузка компьютера. Было загадано " + b);
                count++;
                if (count > resource) {
                    System.out.println("Превышен ресурс работы, компьютер сгорел");
                    fail = true;
                }
            } else {
                System.out.println("Ошибка!! Компьютер сгорел!");
                fail = true;
            }
        }
    }

    public void turnOFF() {
        while (!fail) {
            System.out.println("Пробуем выключить компьютер...");
            System.out.println("Введите число: 0 либо 1");
            int b = sc.nextInt();
            if (a == b) {
                System.out.println("Вы ввели верное число, происходит загрузка компьютера");
                count++;
                if (count > resource) {
                    System.out.println("Превышен ресурс работы, компьютер сгорел");
                    fail = true;
                }
            }
        }
    }


}
