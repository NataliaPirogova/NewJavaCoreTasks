package Pirogova.Lesson6_8;

import java.util.Scanner;
import java.lang.StringBuilder;

public class AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число A:");
        int a = sc.nextInt();
        StringBuilder sb = new StringBuilder("Число А равно ");
        sb.append(a);
        System.out.println("Введите число B: ");
        int b=sc.nextInt();
        sb.append(". Число B равно ");
        sb.append(b);
        System.out.println(sb);
    }
}
