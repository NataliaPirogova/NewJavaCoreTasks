package Pirogova.Lesson5;

import java.util.Random;

public class Extra5 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random r = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(10);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if(i%2 == 0){
                System.out.print(mass[i] + " ");
                count++;
            }
        }
        for (int i = count; i < mass.length; i++) {
            System.out.print(0 + " ");
        }
    }
}
