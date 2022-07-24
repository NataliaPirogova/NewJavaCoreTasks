package Pirogova.Lesson6_8.com.company.details;

public class Engine {
    private int power;//мощность
    private int capacity;//производительность

    public Engine() {
    }

    public Engine(int power, int capacity) {
        this.power = power;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Двигатель{" +
                "мощность=" + power +
                ", производительность=" + capacity +
                '}';
    }
}
