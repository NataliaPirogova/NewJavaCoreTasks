package Pirogova.Lesson4;

public class Task8_v1 {
    public static void main(String[] args) {
        char[][]a = {{' ',' ',' ','*'},{' ',' ','*','*'},{' ','*','*','*'},{'*','*','*','*'}};
        for(int i=0; i<4; i++){
            int j;
            for (j=0; j<4; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
