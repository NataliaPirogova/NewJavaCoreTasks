package Pirogova.Lesson6_8.Matrix;

public class Matrix {
    private int a;//количество строк
    private int b;//количество столбцов
    private int[][] mass;

    public Matrix() {
    }

    public void multiply (int value){//value - значение, на которое умножаем
    for (int i = 0; i < this.mass.length; i++) {
        for (int j = 0; j < this.mass.length; j++) {
            this.mass[a][b]=value*this.mass[a][b];
            System.out.println(this.mass[a][b] + " ");
        }
        System.out.println();
    }
}

public void print(){
    for (int i = 0; i < this.mass.length; i++) {
        for (int j = 0; j < this.mass.length; j++) {
            System.out.println(this.mass[a][b] + " ");
        }
        System.out.println();
    }
}
}
