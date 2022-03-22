package Pirogova.Lesson5;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int []a = new int[15];
        Random r = new Random();
        for (int i = 0; i < 15; i++) {
            a[i] = r.nextInt(99);
            System.out.print(a[i] + " ");
        }
    }
}
