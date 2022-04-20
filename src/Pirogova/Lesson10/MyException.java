package Pirogova.Lesson10;

public class MyException extends Exception{
    private int detail;
    MyException(int a){
        detail=a;
    }
    public String toString(){
        return "Число "+detail+" является исключением, т.к. четное";
    }
}
