package Pirogova.Lesson6_8;

public class T2_Person_objects {
    public static void main(String[] args) {
        T2_Person Person1 = new T2_Person();
        Person1.fullName = "Alexandra";
        Person1.age = 32;

        T2_Person Person2 = new T2_Person("Olga", 49);

        Person1.displayInfo();
        Person1.move();
        Person1.talk();
        Person2.displayInfo();

    }
}
