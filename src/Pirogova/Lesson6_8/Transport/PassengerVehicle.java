package Pirogova.Lesson6_8.Transport;

public class PassengerVehicle extends Overgorund{
    private String typeOfBody;//тип кузова
    private int passengers;//кол-во пассажиров

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
