package Pirogova.Lesson5;

import java.util.Random;

public class Extra8 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random r = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(40);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]>max){
                max = mass[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
        int max2 = 0;
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]>max2 && mass[i]<max){
                max2 = mass[i];
            }
        }
        System.out.println("Второе значение по величине: " + max2);
    }
}
