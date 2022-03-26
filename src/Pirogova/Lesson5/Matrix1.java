package Pirogova.Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        int n;//размер стороны матрицы
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны размер матрицы");
        n = sc.nextInt();
        int[][] mass = new int[n][n];
        Random r = new Random();
        int sum = 0;//сумма четных элементов на главной диагонали
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = r.nextInt(50);
                System.out.print(mass[i][j] + " ");
                if (i==j && mass[i][j]%2 == 0){
                    sum+=mass[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Сумма четных элементов на главной диагонали: " + sum);
    }
}
