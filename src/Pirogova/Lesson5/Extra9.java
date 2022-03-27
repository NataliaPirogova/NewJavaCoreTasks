package Pirogova.Lesson5;

import java.util.Random;

public class Extra9 {
    public static void main(String[] args) {
        int[] mass = new int[20];
        Random r = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(30);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]<min && i%2==0){
                min = mass[i];
            }
        }
        System.out.println("Минимальный элемент с четным индексом массива:  " + min);
    }
}
