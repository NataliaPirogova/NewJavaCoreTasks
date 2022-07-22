package Pirogova.Lesson4;

public class Task9 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int a = i * j;
                System.out.print(i + "*" + j + "=" + a + "   ");
            }
            System.out.println();
        }
    }
}
