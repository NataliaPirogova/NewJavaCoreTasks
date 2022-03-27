package Pirogova.Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Matrix4 {
    public static void main(String[] args) {
        int n;//размер стороны матрицы
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны размер матрицы");
        n = sc.nextInt();
        int[][] mass = new int[n][n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = r.nextInt(50);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int summ = 0;
        for (int i = 0; i < mass.length-1; i++) {
            for (int j = mass.length-2-i; j >= 0; j--) {
            summ+=mass[i][j];
            break;
            }
        }
        System.out.println("Сумма элементов над побочной диагональю: " + summ);
    }
}
