package Pirogova.Lesson17_Conurrency;
//            4. Параллельные целочисленные массивы в потоках
//    Условие задачи. Пользователь вводит с клавиатуры значение в массив. После чего запускаются два потока.
//    Первый поток находит максимум в массиве, второй — минимум.
//    Результаты вычислений возвращаются в метод main().
//
//    Решение. Данная задача решается с объявлением одного класса,
//    в котором реализованы одновременно поиск минимального и максимального элемента массива.
//    По желанию, можно реализовать два отдельных класса, которые будут определять соответствующие потоки.
//

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        int num = sc.nextInt();
        int[] mass = new int[num];
        System.out.println("Введите числа для массива: ");
        for (int i = 0; i < num; i++) {
            mass[i] = sc.nextInt();
        }

        MinMaxClass m1 = new MinMaxClass("MaxFind", num);
        m1.start();
    }
}
