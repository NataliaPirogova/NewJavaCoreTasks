package Pirogova.Lesson6_8.InternetShop;
//юбка
public class Skirt extends Clothes implements WomanClothes{
    @Override
    public void dressWoman() {

    }

    public Skirt() {
    }

    public Skirt(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size=" + super.getSize() +
                ", price=" + super.getPrice() +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
