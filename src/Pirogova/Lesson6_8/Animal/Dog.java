package Pirogova.Lesson6_8.Animal;

public class Dog extends Animal {

    public Dog(){
    }

    public Dog(String food, String location){
        super(food, location);
    }

    @Override
    public void makeNoise(){
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat(){
        System.out.println("Собака ест");
    }

    @Override
    public void sleep(){
        System.out.println("Собака спит");
    }
}
