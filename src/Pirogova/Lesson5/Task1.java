package Pirogova.Lesson5;

public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        for(int b = 2; b <= 20; b+=2){
            count++;
        }

        int[]a = new int[count];
        int c = 2;
        for (int i = 0; i < count; i++) {
            a[i] = c;
            System.out.print(a[i] + " ");
            c+=2;
        }
        System.out.println();
        int d = 2;
        for (int i = 0; i < count; i++) {
            a[i] = d;
            System.out.println(a[i] + " ");
            d+=2;
        }

    }
}
