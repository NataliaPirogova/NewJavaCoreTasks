package Pirogova.Lesson3;

public class Task3 {
    public static void main(String[] args) {
        int a = -7;
        if(a>0){
            a=++a;
        }
        else if(a<0){
            a-=2;
        }
        else{
            a=10;
        }
        System.out.println(a);
    }
}
