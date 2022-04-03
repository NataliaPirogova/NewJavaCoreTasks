package Pirogova.Lesson6_8.Matrix;

import java.util.Random;

public class Matrix {
    private int a;//количество строк
    private int b;//количество столбцов
    private int[][] mass;

    public Matrix() {
    }

    public Matrix(int a, int b){
        int [][]mass = new int[a][b];
        Random r = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mass[i][j]=r.nextInt(10);
            }
        }
    }

    public void multiply (int value){//value - значение, на которое умножаем
    for (int i = 0; i < this.a; i++) {
        for (int j = 0; j < this.b; j++) {
            this.mass[i][j]=value*this.mass[i][j];
            System.out.println(this.mass[i][j] + " ");
        }
        System.out.println();
    }
}

public void print(){
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
            System.out.print(mass[i][j] + " ");
        }
        System.out.println();
    }
}
}
