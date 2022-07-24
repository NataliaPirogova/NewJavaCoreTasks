package Pirogova.Lesson5;

import java.util.Random;

public class Extra4 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(20);//кол-во элементов массива
        int[] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = r.nextInt(50);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int min = mass[1];
        for (int i = 1; i < n; i = i + 2) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println("Наименьший нечетный элемент: " + min);
    }
}
