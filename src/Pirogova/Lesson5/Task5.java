package Pirogova.Lesson5;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int []mass1 =new int[5];
        int []mass2 =new int[5];
        Random r = new Random();
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = r.nextInt(15);
            System.out.print(mass1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = r.nextInt(15);
            System.out.print(mass2[i] + " ");
        }

    }
}
