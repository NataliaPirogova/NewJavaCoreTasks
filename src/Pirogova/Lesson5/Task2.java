package Pirogova.Lesson5;

public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (int a = 1; a <= 99; a+=2){
            count++;
        }
        int []mass = new int[count];
        int b = 1;
        for (int i = 0; i < count; i++) {
            mass[i] = b;
            b+=2;
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int c = 99;
        for (int i = 0; i < count; i++) {
            mass[i] = c;
            c-=2;
            System.out.print(mass[i] + " ");
        }
    }
}
