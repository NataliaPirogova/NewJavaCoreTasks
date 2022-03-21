package Pirogova.Lesson3;

public class Task7 {
    public static void main(String[] args) {
        int n = 1001; //количество программистов
        if(n<=4){
            switch (n){
                case 1:
                    System.out.println(n + "  программист");
                    break;
                case 2, 3, 4:
                    System.out.println(n + " программиста");
                    break;
            }
        if(n>=5 && n<21){
            System.out.println(n + " программистов");}
        }
        if(n>=21){
            int d; //остаток от деления n на 10
            d = n%10;
            switch (d){
                case 1:
                    System.out.println(n + " программист");
                    break;
                case 2, 3, 4:
                    System.out.println(n + " программиста");
                    break;
                case 5, 6, 7, 8, 9, 0:
                    System.out.println(n + " программистов");
                    break;
            }
        }
    }
}
