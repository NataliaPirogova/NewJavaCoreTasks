package Pirogova.Lesson6_8.InternetShop;
//галстук
public class Tie extends Clothes implements ManClothes{
    @Override
    public void dressMan() {

    }

    public Tie(Sizes size, int price, String color) {
        super(size, price, color);
    }

    public Tie() {
    }
    @Override
    public String toString() {
        return "Tie{" +
                "size=" + super.getSize() +
                ", price=" + super.getPrice() +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
