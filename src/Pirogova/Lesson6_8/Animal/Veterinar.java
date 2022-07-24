package Pirogova.Lesson6_8.Animal;

public class Veterinar {
    public Veterinar() {
    }

    public void treatAnimal(Animal animal) {
        System.out.println("У ветеринара на приеме" + animal);
        System.out.println(animal.getFood());
        System.out.println(animal.getLocation());
        animal.makeNoise();
    }
}
