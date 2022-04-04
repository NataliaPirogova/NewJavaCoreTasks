package Pirogova.Lesson6_8.com.company.professions;

import Pirogova.Lesson6_8.Person.Person;

public class Driver extends Person {
    private String FIO;
    private int experience;//стаж вождения

    public Driver(){
    }

    public Driver(String fullName, int age, String FIO, int experience) {
        super(fullName, age);
        this.FIO = FIO;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "FIO='" + FIO + '\'' +
                ", experience=" + experience +
                '}';
    }
}
