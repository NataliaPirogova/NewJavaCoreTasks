package Pirogova.Lesson4;

public class Task5 {
    public static void main(String[] args) {
        double inch = 2.54;
        double sm;
        int i;
        for (i = 1; i <= 20; i++) {
            sm = i * inch;
            System.out.println(i + " дюйм равен " + sm + " см");
        }
    }
}
