package Pirogova.Lesson6_8.Phone;

public class Phone {
private long number;
private String model;
private int weight;



public Phone(){
}

    public Phone(long number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(long number, String model, int weight){
    this(number, model);
    this.weight = weight;
}

void displayInfo(){
    System.out.println("number: " + this.number + "; model: " + this.model + "; weight: " + this.weight);
}

public void recieveCall(String name){
    System.out.println("Звонит " + name);
}

    public long getNumber() {
        return number;
    }
}