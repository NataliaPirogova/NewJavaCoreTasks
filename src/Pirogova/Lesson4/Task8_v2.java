package Pirogova.Lesson4;

import java.util.Arrays;

public class Task8_v2 {
    public static void main(String[] args) {
        char[][]stars = {{'*','*','*','*'},{' ','*','*','*'},{' ',' ','*','*'},{' ',' ',' ','*'}};
        int a,b;
        for(a=0; a<4; a++){
            for(b=0; b<4; b++){
                System.out.print(" " + stars[a][b] + " ");
            }
            System.out.println();
        }
    }
}
