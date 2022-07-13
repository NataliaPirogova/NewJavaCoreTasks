package Pirogova.Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task6_Scanner {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        int value1 = random.nextInt((b - a) + a);
        int value2 = random.nextInt(a, b);

        int maxValue = value1 > value2 ? value1 : value2;

        System.out.println("Первое число " + value1);
        System.out.println("Второе число " + value2);
        System.out.println("Максимальное число: " + maxValue);


    }
}
