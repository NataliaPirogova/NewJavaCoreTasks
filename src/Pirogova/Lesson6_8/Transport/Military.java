package Pirogova.Lesson6_8.Transport;

public class Military extends Air{
    private boolean ejectionSystem;//Наличие системы катапультирования
    private int rocket;//Кол-во ракет на борту

    public Military() {
    }

    public Military(int power, int maxSpeed, int mass, String brand, int wingspan, int minLength, boolean ejectionSystem, int rocket) {
        super(power, maxSpeed, mass, brand, wingspan, minLength);
        this.ejectionSystem = ejectionSystem;
        this.rocket = rocket;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getRocket() {
        return rocket;
    }

    public void setRocket(int rocket) {
        this.rocket = rocket;
    }
}
