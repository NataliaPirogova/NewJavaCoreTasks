package Pirogova.Lesson6_8.Transport;

public class Military extends Air{
    private boolean ejectionSystem;//Наличие системы катапультирования
    private int rocket;//Кол-во ракет на борту

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
        sb.append("; размах крыльев - ");
        sb.append(this.getWingspan());
        sb.append(" м; минимальная длина взлётно-посадочной полосы для взлёта - ");
        sb.append(this.getMinLength());
        if (ejectionSystem){sb.append("; есть система катапультирования; количество ракет на борту - ");}
        else {sb.append("; нет системы катапультирования; количество ракет на борту - ");}
        sb.append(this.getRocket());
        return sb.toString();
    }

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
