package Pirogova.Lesson6_8.InternetShop;

public class Book implements Printable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    @Override
    public void print() {
        System.out.println("Это книга");

    }

    @Override
    public String toString() {
        return "Книга{" +
                "название='" + name + '\'' +
                '}';
    }
}
