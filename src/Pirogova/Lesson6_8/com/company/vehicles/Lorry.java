package Pirogova.Lesson6_8.com.company.vehicles;

import Pirogova.Lesson6_8.com.company.details.Engine;
import Pirogova.Lesson6_8.com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;//грузоподъемность

    public Lorry() {
    }

    public Lorry(String Type, String Grade, int weight, Driver driver, Engine engine, String type, String aClass, int weight1, Driver driver1, Engine engine1, int carrying) {
        super(Type, Grade, weight, driver, engine);
        this.carrying = carrying;
    }

    @Override
    public void printInfo(){
        System.out.println("Марка авто "+this.getType()+", класс авто "+this.getGrade()+", вес авто "+this.getWeight()+", "+this.getDriver()+", "+this.getEngine()+", грузоподъемность "+carrying);
    }
}
