package Pirogova.Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число - количество элементов в массиве");
        int n = sc.nextInt();
        int[] mass = new int[n];
        Random r = new Random();
        int proiz = 1;
        for (int i = 0; i < n; i++) {
            mass[i] = r.nextInt(20);
            System.out.print(mass[i] + " ");
            if(mass[i]%3==0 && mass[i]!=0){
                proiz*=mass[i];
            }
        }
        System.out.println();
        if(proiz==1){
            System.out.println("В массиве отсутствуют числа, кратные 3");
        }else {
            System.out.println("Произведение чисел кратных 3 равно: " + proiz);
        }
    }
}
