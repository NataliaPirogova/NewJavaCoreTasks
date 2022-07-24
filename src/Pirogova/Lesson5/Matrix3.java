package Pirogova.Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Matrix3 {
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
        int pr1 = 1; //произведение главной диагонали
        int pr2 = 1; //произведение побочной диагонали
        for (int i = 0; i < n; i++) {
            pr1*=mass[i][i];
        }
        for (int i = mass.length-1; i >= 0; i--) {
            int j = mass.length-1-i;
                pr2*=mass[i][j];
        }
        double otn = (double) pr1/pr2;

        if (otn > 1) {
            System.out.println("Произведение главной диагонали больше");
        }
        else if(otn < 1) {
            System.out.println("Произведение побочной диагонали больше");
        }
        else{
                System.out.println("Произведения диагоналей равны");
        }
    }
}
