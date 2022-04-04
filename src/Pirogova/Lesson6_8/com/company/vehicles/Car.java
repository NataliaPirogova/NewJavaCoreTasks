package Pirogova.Lesson6_8.com.company.vehicles;

import Pirogova.Lesson6_8.com.company.details.Engine;
import Pirogova.Lesson6_8.com.company.professions.Driver;

public class Car {
    private String Type;//марка авто
    private String Class;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(){
    }

    public Car(String Type, String Class, int weight, Driver driver, Engine engine) {
        this.Type = Type;
        this.Class = Class;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Car{" +
                "Type='" + Type + '\'' +
                ", Class='" + Class + '\'' +
                ", weight=" + weight +
                "}, driver=" + driver +
                "}, engine=" + engine +
                '}');
    }
}
