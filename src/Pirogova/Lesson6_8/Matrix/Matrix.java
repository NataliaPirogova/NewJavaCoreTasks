package Pirogova.Lesson6_8.Matrix;

import java.util.Random;

public class Matrix {
    protected int a;//количество строк
    protected int b;//количество столбцов
    protected int[][] mass;

    public Matrix() {
    }

    public Matrix(int[][]mass){
        this.mass = mass;
    }

    public Matrix(int a, int b){
        this.mass = new int[a][b];
        Random r = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mass[i][j]=r.nextInt(10);
//                System.out.print(mass[i][j] + " ");
            }
//            System.out.println();
        }
    }

    public void summ(int[][]matrix){
        if(this.mass.length==matrix.length && this.mass[0].length==matrix[0].length){
            for (int i = 0; i < this.mass.length; i++) {
                for (int j = 0; j < this.mass[0].length; j++) {
                    int newSumm = mass[i][j] + matrix[i][j];
                    System.out.print(newSumm+ " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Структура матриц различна, невозможно сложение");
        }
    }

    public void multiply (int value){//value - значение, на которое умножаем
        for (int[] mass: this.mass
             ) {
            for (int element: mass
                 ) {
                element = value*element;
                System.out.print(element+" ");
            }
            System.out.println();
    }
}

public void print(){
    for (int[] mass: this.mass
         ) {
        for (int element: mass
             ) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
}
