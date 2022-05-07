package Pirogova.Lesson6_8.Transport;

public class PassengerVehicle extends Overgorund{
    private String typeOfBody;//тип кузова
    private int passengers;//кол-во пассажиров

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
        sb.append(" л/100км; тип кузова - ");
        sb.append(this.getTypeOfBody());
        sb.append("; количество пассажиров - ");
        sb.append(this.getPassengers());
        return sb.toString();
    }

    public PassengerVehicle() {
    }

    public PassengerVehicle(int power, int maxSpeed, int mass, String brand, int wheel, int fuelFlow, String typeOfBody, int passengers) {
        super(power, maxSpeed, mass, brand, wheel, fuelFlow);
        this.typeOfBody = typeOfBody;
        this.passengers = passengers;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
