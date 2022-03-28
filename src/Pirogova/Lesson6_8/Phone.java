package Pirogova.Lesson6_8;

public class Phone {
    private long number;
    private String model;
    private int weight;

    public Phone() {
    }

    public static String receiveCall(String name) {
        System.out.println("Звонит " + name);
        return name;
    }

    public static void main(String[] args) {
        Phone P1 = new Phone();
        P1.number = 100;
        P1.model = "Lenovo";
        P1.weight = 120;
        System.out.println("Телефон номер " + P1.number + " модели " + P1.model + " и весом " + P1.weight);
        P1.receiveCall("James");

        Phone P2 = new Phone();
        P2.number = 200;
        P2.model = "Samsung";
        P2.weight = 127;
        System.out.println("Телефон номер " + P2.number + " модели " + P2.model + " и весом " + P2.weight);

        Phone P3 = new Phone();
        P3.number = 300;
        P3.model = "Oppo";
        P3.weight = 99;
        System.out.println("Телефон номер " + P3.number + " модели " + P3.model + " и весом " + P3.weight);
    }

    }


