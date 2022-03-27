package Pirogova.Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Extra7 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random r = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(10);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение, которое будем искать в массиве:");
        int value = sc.nextInt();
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]==value){
                System.out.println("Значение " + value + " находится в массиве под индексом " + i);
            }
        }
    }
}
