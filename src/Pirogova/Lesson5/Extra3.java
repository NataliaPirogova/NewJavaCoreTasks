package Pirogova.Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int n = sca.nextInt();
        int[] mass = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            mass[i] = r.nextInt(20);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число C");
        int C = sc.nextInt();
        int count = 0;
        double sum = 0;
        double average;
        for (int i = 0; i < n; i++) {
           if(mass[i]>C){
               count++;
               sum+=mass[i];
           }
        }
        average = sum/count;
        if(sum==0){
            System.out.println("В массиве нет чисел больше " + C);
        }else
        {
            System.out.println("Среднее арифметическое чисел, которые больше " + C + " равно: " + average);
        }
    }
}
