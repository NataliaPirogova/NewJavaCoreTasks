package Pirogova.Lesson6_8.Transport;

public class Civilian extends Air{
    private int passengers;//кол-во пассажиров
    private boolean businessCLass;

    public Civilian() {
    }

    public Civilian(int power, int maxSpeed, int mass, String brand, int wingspan, int minLength, int passengers, boolean businessCLass) {
        super(power, maxSpeed, mass, brand, wingspan, minLength);
        this.passengers = passengers;
        this.businessCLass = businessCLass;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean isBusinessCLass() {
        return businessCLass;
    }

    public void setBusinessCLass(boolean businessCLass) {
        this.businessCLass = businessCLass;
    }
}
