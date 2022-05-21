package Pirogova.Lesson6_8.InternetShop;

public class Category {
    private String Name;
    Product []goods;

    public Category() {
    }

    public Category(String name) {
        Name = name;
    }

    public Category(String name, Product[] goods) {
        Name = name;
        this.goods = goods;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
