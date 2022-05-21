package Pirogova.Lesson6_8.InternetShop;
//труба
public class Trumpet implements Instrument{
    private int diameter;

    public Trumpet() {
    }

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.printf("Играет труба, диаметром %d мм, %s",diameter,Trumpet.KEY);
    }
}
