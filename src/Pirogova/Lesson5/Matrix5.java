package Pirogova.Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Matrix5 {
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
        int value;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                value = mass[i][j];
                mass[i][j] = mass[j][i];
                mass[j][i] = value;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
