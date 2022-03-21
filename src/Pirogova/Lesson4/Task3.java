package Pirogova.Lesson4;

public class Task3 {
    public static void main(String[] args) {
        int n; // первое число
        int s = 0; //сумма чисел
        for(n=1; n<=256; n*=2){
            s = s + n;
        }
        System.out.println("Сумма равна " + s);
    }
}
