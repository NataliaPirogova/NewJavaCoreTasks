package Pirogova.Lesson4;

public class Task4 {
    public static void main(String[] args) {
        int A = 4;
        int B = 8;
        int r = 0;//результат умножения
        int count = 1;
        while (count <= B) {
            r = r + A;
            count++;
        }
        System.out.println("Результат умножения - " + r);
    }
}
