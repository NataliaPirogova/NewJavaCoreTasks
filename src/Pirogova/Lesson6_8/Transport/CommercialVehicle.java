package Pirogova.Lesson6_8.Transport;

public class CommercialVehicle extends Overgorund{
    private int capacity;//грузоподъемность, тонны

    public CommercialVehicle() {
    }

    public CommercialVehicle(int power, int maxSpeed, int mass, String brand, int wheel, int fuelFlow, int capacity) {
        super(power, maxSpeed, mass, brand, wheel, fuelFlow);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
