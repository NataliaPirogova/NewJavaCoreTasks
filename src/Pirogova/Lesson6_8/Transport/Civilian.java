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
        sb.append(" м; количество пассажиров - ");
        sb.append(this.getPassengers());
        if (businessCLass){sb.append("; есть бизнесс-класс.");}
        else {sb.append("; без бизнесс-класса");};
        return sb.toString();
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

    public void possibility(int load){  //кол-во пассажиров, которое пробуют посадить
        if (load>passengers){
            System.out.println("Вам нужен самолет побольше");
        }
        else {
            System.out.println("Все пассажиры посажены");
        }
    }
}
