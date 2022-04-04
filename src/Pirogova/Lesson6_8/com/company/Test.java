package Pirogova.Lesson6_8.com.company;

import Pirogova.Lesson6_8.com.company.details.Engine;
import Pirogova.Lesson6_8.com.company.professions.Driver;
import Pirogova.Lesson6_8.com.company.vehicles.Car;
import Pirogova.Lesson6_8.com.company.vehicles.SportCar;

public class Test {
    public static void main(String[] args) {
        Driver Ted = new Driver("Ted", 43, "Teodor Ruzvelt", 19);
        Engine super8 = new Engine(20, 290);
        Car Ferrari = new SportCar("F1", "Premium", 540, Ted, super8, 370);
        Ferrari.start();
        Ferrari.turnLeft();
        Ferrari.stop();
        Ferrari.printInfo();
    }
}
