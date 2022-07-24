package Pirogova.Lesson5;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] a = new int[15];
        Random r = new Random();
        int count = 0; //кол-во четных элементов
        for (int i = 0; i < 15; i++) {
            a[i] = r.nextInt(100);
            System.out.print(a[i] + " ");
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество четных элементов в массиве: " + count);
    }
}
