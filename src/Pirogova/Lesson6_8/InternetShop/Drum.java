package Pirogova.Lesson6_8.InternetShop;
//барабан
public class Drum implements Instrument{
    private int size;

    public Drum() {
    }

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан, размером "+size+", "+Drum.KEY);
    }
}
