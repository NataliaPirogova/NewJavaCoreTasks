package Pirogova.Lesson5;

import java.util.Random;

public class Extra2 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random r = new Random();
        int sum = 0;//сумма нечетных элементов
        double average;//среднее арифметическое
        int count = 0;//количество нечетных элементов
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(10);
            System.out.print(mass[i] + " ");
            if (i % 2 != 0) {
                count++;
                sum += mass[i];
            }
        }
        System.out.println();
        average = (double) sum / count;
        System.out.println("Среднее арифметическое нечетных элементов: " + average);
    }
}
