package Pirogova.Lesson6_8.Transport;

public class Air extends Transport{
    private int wingspan;//размах крыльев
    private int minLength;//Минимальная длина взлётно-посадочной полосы для взлёта

    public Air() {
    }

    public Air(int power, int maxSpeed, int mass, String brand, int wingspan, int minLength) {
        super(power, maxSpeed, mass, brand);
        this.wingspan = wingspan;
        this.minLength = minLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }
}
