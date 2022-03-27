package Pirogova.Lesson5;

import java.util.Random;

public class Extra6 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random r = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(10);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            int value = mass[i];
            int j = i;
            while(j < mass.length-1){
                j++;
                if(value == mass[j]){
                    System.out.println("Есть повторяющиеся значения: " + value);
                    break;
                }

            }
        }
    }
}
