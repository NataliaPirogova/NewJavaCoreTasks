package Pirogova.Lesson6_8.com.company.vehicles;

import Pirogova.Lesson6_8.com.company.details.Engine;
import Pirogova.Lesson6_8.com.company.professions.Driver;

public class SportCar extends Car{
    private String Type;//марка авто
    private String Class;
    private int weight;
    private Driver driver;
    private Engine engine;
    int speed;

    public SportCar(){
    }

    public SportCar(String Type, String Class, int weight, Driver driver, Engine engine, int speed) {
        super(Type, Class, weight, driver, engine);
        this.speed = speed;
    }
}
