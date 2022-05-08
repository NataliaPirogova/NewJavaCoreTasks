package Pirogova.Lesson10;

public class MyException extends Exception{
    private int detail;
    MyException(int a){
        detail=a;
    }
    public String toString(){
        StringBuilder SB = new StringBuilder("Число ");
        SB.append(detail);
        SB.append(" является исключением, т.к. четное. Невозможно завести автомобиль");
        return SB.toString();
    }
}
