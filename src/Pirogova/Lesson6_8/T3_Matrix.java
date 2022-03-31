package Pirogova.Lesson6_8;

public class T3_Matrix {
    int a;//количество столбцов
    int b;//количество строк
    double[][] mass = new double[a][b];

public void umnozh (int value){
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
