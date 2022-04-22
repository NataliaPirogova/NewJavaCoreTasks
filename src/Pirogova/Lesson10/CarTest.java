package Pirogova.Lesson10;

public class CarTest {
    public static void main(String[] args) {
        Car Car1 = new Car("Opel", 140, 19000);
        Car Car2 = new Car("BMW", 250, 63000);
        Car Car3 = new Car("Reno", 150, 23000);

        try{
            Car1.start();
        }
        catch (MyException e){
            StringBuilder StrB = new StringBuilder("caught ");
            StrB.append(e);
            System.out.println(StrB);
        }
        try{
            Car2.start();
            Car3.start();
        }
        catch (MyException e){
            StringBuilder StrB = new StringBuilder("caught ");
            StrB.append(e);
            System.out.println(StrB);
        }
        try{
            Car3.start();
        }
        catch (MyException e){
            StringBuilder StrB = new StringBuilder("caught ");
            StrB.append(e);
            System.out.println(StrB);
        }
    }
}
