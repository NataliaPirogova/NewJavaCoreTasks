package Pirogova.Lesson6_8.InternetShop;

public class Product {
    private String name;
    private int price;
    private int rank;//рейтинг

    public Product(){};

    public Product(String name, int price, int rank){
        this.name = name;
        this.price = price;
        this.rank = rank;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
