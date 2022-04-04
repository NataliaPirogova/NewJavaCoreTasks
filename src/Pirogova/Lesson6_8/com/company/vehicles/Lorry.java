package Pirogova.Lesson6_8.com.company.vehicles;

import Pirogova.Lesson6_8.com.company.details.Engine;
import Pirogova.Lesson6_8.com.company.professions.Driver;

public class Lorry extends Car {
    private String Type;//марка авто
    private String Class;
    private int weight;
    private Driver driver;
    private Engine engine;
    private int carrying;

    public Lorry() {
    }

    public Lorry(String Type, String Class, int weight, Driver driver, Engine engine, String type, String aClass, int weight1, Driver driver1, Engine engine1, int carrying) {
        super(Type, Class, weight, driver, engine);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "Type='" + Type + '\'' +
                ", Class='" + Class + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", carrying=" + carrying +
                '}';
    }
}
