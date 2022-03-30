package Pirogova.Lesson6_8;

public class T1_Phone {
private long number;
private String model;
private int weight;



public T1_Phone(){
}

    public T1_Phone(long number, String model){
        this.number = number;
        this.model = model;
    }

    public T1_Phone(long number, String model, int weight){
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