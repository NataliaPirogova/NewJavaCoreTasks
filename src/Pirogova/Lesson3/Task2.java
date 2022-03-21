package Pirogova.Lesson3;

public class Task2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 8;
        int c = 8;
        if(a+b<c || a+c<b || b+c<a){
            System.out.println("Треугольник не существует");
        }
        else{
            System.out.println("Треугольник существует");
        }
    }
}
