package Pirogova.Lesson3;

public class Task5 {
    public static void main(String[] args) {
        int a = -1;
        int b = 0;
        int c = -214;
        int p = 0; //количество положительных чисел; 0 считали положительным
        int n = 0; //количество отрицательных чисел; число 0 не учитывалось за положительное
        if (a >= 0) {
            p++;
        } else {
            n++;
        }
        if (b >= 0) {
            p++;
        } else {
            n++;
        }
        if (c >= 0) {
            p++;
        } else {
            n++;
        }
        System.out.println("Количество положительных чисел " + p);
        System.out.println("Количество отрицательных чисел " + n);

    }
}
