package Pirogova.Lesson5;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int []mass = new int[12];
        Random r = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(15);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int max = 0;
        for (int j : mass) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Максимальное число: " + max);
        for (int i = mass.length-1; i >= 0; i--) {
            if(mass[i]==max){
                System.out.println("Последний индекс максимального числа: " + i);
                break;
            }

        }
    }
}
