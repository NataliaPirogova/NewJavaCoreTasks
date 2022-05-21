package Pirogova.Lesson6_8.InternetShop;
//футболка
public class Tshirt extends Clothes implements ManClothes, WomanClothes{
    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }

    public Tshirt() {
    }

    public Tshirt(Sizes size, int price, String color) {
        super(size, price, color);
    }
    @Override
    public String toString() {
        return "T-shirt{" +
                "size=" + super.getSize() +
                ", price=" + super.getPrice() +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
