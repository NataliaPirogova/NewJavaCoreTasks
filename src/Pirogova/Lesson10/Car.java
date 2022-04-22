package Pirogova.Lesson10;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int price;

    public Car (){}

    public Car (String brand){
        this.brand=brand;
    }

    public Car (String brand, int speed){
        this(brand);
        this.speed=speed;
    }

    public Car(String brand,int speed,int price){
        this(brand,speed);
        this.price=price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start ()  throws MyException{
        Random r = new Random();
        int a = r.nextInt(20);
        System.out.println(a);
        if (a%2==0){
            throw new MyException (a);
        }
        else {
            StringBuilder SB = new StringBuilder("Автомобиль марки ");
            SB.append(this.brand);
            SB.append(" завелся.");
            System.out.println(SB);
        }
    }
}
