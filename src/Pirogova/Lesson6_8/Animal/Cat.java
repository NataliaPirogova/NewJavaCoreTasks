package Pirogova.Lesson6_8.Animal;

public class Cat extends Animal {

    private String breed;//порода

    public Cat() {
    }

    public Cat(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мурлычет");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }

    @Override
    public void sleep() {
        System.out.println("Кошка спит");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
