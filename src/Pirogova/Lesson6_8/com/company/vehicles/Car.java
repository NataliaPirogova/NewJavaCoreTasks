package Pirogova.Lesson6_8.com.company.vehicles;

import Pirogova.Lesson6_8.com.company.details.Engine;
import Pirogova.Lesson6_8.com.company.professions.Driver;

public class Car {
    private String Type;//марка авто
    private String Grade;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(){
    }

    public Car(String Type, String Grade, int weight, Driver driver, Engine engine) {
        this.Type = Type;
        this.Grade = Grade;
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

    public void printInfo(){
        System.out.println("Марка авто "+Type+", класс авто "+ Grade +", вес авто "+weight+", "+driver+", "+engine);
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
