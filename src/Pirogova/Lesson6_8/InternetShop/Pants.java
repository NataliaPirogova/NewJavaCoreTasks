package Pirogova.Lesson6_8.InternetShop;
//штаны
public class Pants extends Clothes implements ManClothes, WomanClothes{
    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }

    public Pants() {
    }

    public Pants(Sizes size, int price, String color) {
        super(size, price, color);
    }
    @Override
    public String toString() {
        return "Pants{" +
                "size=" + super.getSize() +
                ", price=" + super.getPrice() +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
