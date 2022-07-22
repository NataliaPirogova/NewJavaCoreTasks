package Pirogova.Lesson4;

public class Task8_v1 {
    public static void main(String[] args) {
        //version1
        char[][] a = {{' ', ' ', ' ', '*'}, {' ', ' ', '*', '*'}, {' ', '*', '*', '*'}, {'*', '*', '*', '*'}};
        for (int i = 0; i < 4; i++) {
            int j;
            for (j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //version2
        char s = '*';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
