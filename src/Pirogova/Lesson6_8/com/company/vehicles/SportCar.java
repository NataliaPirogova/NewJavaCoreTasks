package Pirogova.Lesson6_8.com.company.vehicles;

import Pirogova.Lesson6_8.com.company.details.Engine;
import Pirogova.Lesson6_8.com.company.professions.Driver;

public class SportCar extends Car {
    int speed;

    public SportCar() {
    }

    public SportCar(String Type, String Grade, int weight, Driver driver, Engine engine, int speed) {
        super(Type, Grade, weight, driver, engine);
        this.speed = speed;
    }

    @Override
    public void printInfo() {
        System.out.println("Марка авто " + this.getType() + ", класс авто " + this.getGrade() + ", вес авто " + this.getWeight() + ", " + this.getDriver() + ", " + this.getEngine() + ", предельная скорость " + speed);
    }
}
