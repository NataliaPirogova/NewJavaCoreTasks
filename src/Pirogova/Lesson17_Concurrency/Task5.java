package Pirogova.Lesson17_Concurrency;
//            5. Запись массивов чисел в файлы в разных потоках. Реализация интерфейса Runnable
//    Условие задачи. Заданы три целочисленных массива. Записать эти массивы в файл в паралельних потоках.
//    Создать класс SaveAsThread для представления потока, который записывает целочисленный массив в файл.

import java.io.IOException;

public class Task5 {
    public static void main(String[] args) throws IOException {
        int[] mass1 = new int[]{2,13,4};
        int[] mass2 = new int[]{92,149,57577};
        int[] mass3 = new int[]{447,6,131};

        Thread t1 = new Thread(new SaveAsThread(mass1));
        t1.start();
        Thread t2 = new Thread(new SaveAsThread(mass2));
        t2.start();
        Thread t3 = new Thread(new SaveAsThread(mass3));
        t3.start();
    }
}


