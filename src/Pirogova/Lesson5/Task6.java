package Pirogova.Lesson5;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int []mass = new int[4];
        Random ra = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = ra.nextInt(10);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]<mass[i+1]){
               continue;
            }
            else{
                System.out.println("Нет строго возрастающей последовательности");
                break;
            }
        }
    }
}
