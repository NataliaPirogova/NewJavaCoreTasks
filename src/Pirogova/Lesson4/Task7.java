package Pirogova.Lesson4;

public class Task7 {
    public static void main(String[] args) {
        int a = 0;
        int s = 0;//сумма
        while (a < 100) {
            a++;
            if (a % 2 == 0) {
                continue;
            }
            s = s + a;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99 равна: " + s);
    }
}
