package Pirogova.Lesson6_8.InternetShop;

public class Guitar implements Instrument{
    private int quantityStrings;

    public Guitar() {
    }

    public Guitar(int quantityStrings) {
        this.quantityStrings = quantityStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара, с количеством струн - "+quantityStrings+", "+Instrument.KEY);

    }
}
