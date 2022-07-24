package Pirogova.Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число для определения размера массива");
        int size = sc.nextInt();
//        int s_left = 0;
//        int s_right = 0;
        if (size <= 0) {
            System.out.println("Неподходящее значение!");
        } else {
            System.out.println("Размер массива: " + size);
            int[] a = new int[size];
            Random r = new Random();
            for (int i = 0; i < size; i++) {
                a[i] = r.nextInt(16);
                System.out.print(a[i] + " ");
            }
            System.out.println();
            int summ = 0;
            for (int i = 0; i < (size / 2); i++) {
                summ = summ + a[size - 1 - i] - a[i];
            }
            if (summ < 0) {
                System.out.println("Сумма левой половины больше");
            } else if (summ > 0) {
                System.out.println("Сумма правой половины больше");
            } else {
                System.out.println("Обе половины равны");
            }

            //            for (int i = 0; i <(size/2) ; i++) {
//                s_left = s_left + a[i];
//            }
//            for (int i = (size/2); i <size; i++) {
//                s_right = s_right + a[i];
//            }
//            if(s_left > s_right){
//                System.out.println("Сумма левой половины больше");
//            }else if(s_left < s_right){
//                System.out.println("Сумма правой половины больше");
//            }else{
//                System.out.println("Обе половины равны");
//            }
        }
    }
}
