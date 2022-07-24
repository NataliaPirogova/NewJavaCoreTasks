package Pirogova.Lesson6_8.Animal;

public class Animal {
    private String food;
    private String location;

    public Animal() {
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Такое-то животное производит звук");
    }

    public void eat() {
        System.out.println("Такое-то животное ест");
    }

    public void sleep() {
        System.out.println("Такое-то животное спит");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
