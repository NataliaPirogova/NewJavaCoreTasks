package Pirogova.Lesson14.Lesson;

import java.util.List;

public class People {
    private String name;
    private int age;
    private Gender gender;
    private List<Hobby> hobbies;

    public People() {
    }

    public People(String name, int age, Gender gender, List<Hobby> hobbies) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobbies=" + hobbies +
                '}';
    }
}
