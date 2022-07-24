package Pirogova.Lesson5;

public class Task2 {
    public static void main(String[] args) {
//        int count = 0;
//        for (int a = 1; a <= 99; a+=2){
//            count++;
//        }
//        int []mass = new int[count];
//        int b = 1;
//        for (int i = 0; i < count; i++) {
//            mass[i] = b;
//            b+=2;
//            System.out.print(mass[i] + " ");
//        }
//        System.out.println();
//        int c = 99;
//        for (int i = 0; i < count; i++) {
//            mass[i] = c;
//            c-=2;
//            System.out.print(mass[i] + " ");
//        }

        int count1 = 0;
        int[] mass = new int[99];
        int[] mass2 = new int[50];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + 1;
            if (mass[i] % 2 == 1) {
                System.out.println(mass[i]);
                mass2[count1] = mass[i];
                count1++;
            }
        }
        System.out.println(count1);

        for (int i = mass2.length - 1; i >= 0; i--) {
            System.out.println(mass2[i]);
        }
    }
}
