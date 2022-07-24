package Pirogova.Lesson5;

import java.util.Random;

public class Extra10 {
    public static void main(String[] args) {
        int[] mass = new int[26];
        Random r = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(1995);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
        int value = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == max) {
                mass[i] = value;
            }
            mass[0] = max;
            System.out.print(mass[i] + " ");
        }
    }
}
