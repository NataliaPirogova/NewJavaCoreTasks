package Pirogova.Lesson6_8.Transport;

public class Overgorund extends Transport{
    private int wheel;//количество колес
    private int fuelFlow;//расход топлива л/100 км

    public Overgorund() {
    }

    public Overgorund(int power, int maxSpeed, int mass, String brand, int wheel, int fuelFlow) {
        super(power, maxSpeed, mass, brand);
        this.wheel = wheel;
        this.fuelFlow = fuelFlow;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getFuelFlow() {
        return fuelFlow;
    }

    public void setFuelFlow(int fuelFlow) {
        this.fuelFlow = fuelFlow;
    }
}
