package Pirogova.Lesson5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число больше 3");
        int n = sc.nextInt();
        if(n<=3){
            System.out.println("Введено неверное число");
        }
        else {
            int[] mass = new int[n];
            Random r = new Random();
            int count = 0;//кол-во четных элементов в первом массиве
            for (int i = 0; i < n; i++) {
                mass[i] = r.nextInt(n);
                System.out.print(mass[i] + " ");
                if (mass[i] % 2 == 0 && mass[i] != 0) {
                    count++;
                }
            }
            System.out.println();
            int[] mass2 = new int[count];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (mass[i] % 2 == 0 && mass[i] != 0) {
                    mass2[j] = mass[i];
                    System.out.print(mass2[j] + " ");
                }
            }
        }
    }
}
