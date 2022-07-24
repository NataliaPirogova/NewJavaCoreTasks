package Pirogova.Lesson5;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] mass1 = new int[5];
        int[] mass2 = new int[5];
        Random r = new Random();
        double average1;//среднее арифметическое первого массива
        double average2;//среднее арифметическое второго массива
        double summ1 = 0;//сумма элементов первого массива
        double summ2 = 0;//сумма элементов первого массива
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = r.nextInt(15);
            summ1 += mass1[i];
            System.out.print(mass1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = r.nextInt(15);
            summ2 += mass2[i];
            System.out.print(mass2[i] + " ");
        }
        System.out.println();

        average1 = summ1 / mass1.length;
        System.out.println("Среднее арифметическое элементов первого массива: " + average1);

        average2 = summ2 / mass2.length;
        System.out.println("Среднее арифметическое элементов второго массива: " + average2);
        if (average1 > average2) {
            System.out.println("Среднее арифметическое первого массива больше");
        }
        if (average1 < average2) {
            System.out.println("Среднее арифметическое второго массива больше");
        }
        if (average1 == average2) {
            System.out.println("Средние арифметические массивов равны");
        }
    }
}
