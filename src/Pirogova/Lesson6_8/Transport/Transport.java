package Pirogova.Lesson6_8.Transport;

public class Transport {
    private int power; //мощность в лошадиных силах
    private int maxSpeed;// км/ч
    private int mass; //кг
    private String brand;//марка

    public double powerKW() {
        return this.power * 0.74;
    }

    public Transport() {
    }

    public Transport(int power, int maxSpeed, int mass, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
