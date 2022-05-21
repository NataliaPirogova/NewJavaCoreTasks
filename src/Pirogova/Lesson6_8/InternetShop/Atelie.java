package Pirogova.Lesson6_8.InternetShop;

public class Atelie implements ManClothes, WomanClothes{

    public void dressMan(Clothes[]clothes) {

        System.out.println("Одеваем мужчину");
    }

    @Override
    public void dressWoman() {
        System.out.println("Одеваем женщину");
    }

    @Override
    public void dressMan() {

    }
}
