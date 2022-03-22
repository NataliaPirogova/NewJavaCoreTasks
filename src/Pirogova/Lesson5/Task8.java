package Pirogova.Lesson5;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[]a = new int[10];
        int[]b =new int[10];
        double[]c = new double[10];
        Random r = new Random();
        for(int i=0;i<10;i++){
            a[i]=r.nextInt(9);
            b[i]=r.nextInt(9);
            if(b[i]==0){
                c[i]=0;
            }
            else{
                c[i]=a[i] / b[i];
            }
        }
        System.out.print("Первый массив: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");}
        System.out.println();
        System.out.print("Второй массив: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(b[i] + " ");}
        System.out.println();
        System.out.print("Третий массив: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");}
    }
}
