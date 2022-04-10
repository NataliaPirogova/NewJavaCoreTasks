package Pirogova.Lesson6_8.Animal;

public class Dog extends Animal {

    private String breed;//порода

    public Dog(){
    }

    public Dog(String food, String location, String breed){
        super(food, location);
        this.breed=breed;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
