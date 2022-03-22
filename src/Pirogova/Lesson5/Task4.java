package Pirogova.Lesson5;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[]a = new int[20];
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            a[i] = r.nextInt(21);
            System.out.print(a[i] + " ");
        }
    }
}
