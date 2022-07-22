package Pirogova.Lesson4;

public class Task8_v2 {
    public static void main(String[] args) {
        //version1
        char[][] stars = {{'*', '*', '*', '*'}, {' ', '*', '*', '*'}, {' ', ' ', '*', '*'}, {' ', ' ', ' ', '*'}};
        int a, b;
        for (a = 0; a < 4; a++) {
            for (b = 0; b < 4; b++) {
                System.out.print(" " + stars[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //version2
        char s = '*';
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 4 - i; j > 0; j--) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
