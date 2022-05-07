package Pirogova.Lesson6_8.Transport;

public class CommercialVehicle extends Overgorund{
    private int capacity;//грузоподъемность, тонны

    public String Characteristic(){
        StringBuilder sb = new StringBuilder("Характеристика данного транспортного средства: ");
        sb.append("тип - легковой; мощность в лошадиных силах - ");
        sb.append(this.getPower());
        sb.append(" л.с., мощность в кВт - ");
        sb.append(this.powerKW());
        sb.append("; максимальная скорость - ");
        sb.append(this.getMaxSpeed());
        sb.append(" км/ч; масса - ");
        sb.append(this.getMass());
        sb.append(" кг; марка - ");
        sb.append(this.getBrand());
        sb.append("; количество колес - ");
        sb.append(this.getWheel());
        sb.append(" расход топлива - ");
        sb.append(this.getFuelFlow());
        sb.append(" л/100км; грузоподъемность - ");
        sb.append(this.getCapacity());
        sb.append(" тонн.");
        return sb.toString();
    }

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
