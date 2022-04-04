package Pirogova.Lesson6_8.com.company.details;

public class Engine {
    private int power;//мощность
    private int company;//производительность

    public Engine(){
    }

    public Engine(int power, int company) {
        this.power = power;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company=" + company +
                '}';
    }
}
