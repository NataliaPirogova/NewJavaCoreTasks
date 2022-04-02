package Pirogova.Lesson6_8.Person;

public class Person_objects {
    public static void main(String[] args) {
        Person Person1 = new Person();
        Person1.fullName = "Alexandra";
        Person1.age = 35;

        Person Person2 = new Person("Olga", 24);

        Person1.displayInfo();
        Person1.move();
        Person1.talk();
        Person2.displayInfo();

    }
}
