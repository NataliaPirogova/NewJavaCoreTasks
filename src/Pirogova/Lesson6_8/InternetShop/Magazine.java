package Pirogova.Lesson6_8.InternetShop;

public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public Magazine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Это журнал");
    }

    @Override
    public String toString() {
        return "Журнал{" +
                "название='" + name + '\'' +
                '}';
    }
    public static void printMagazines (Printable[]printable){
        for (Printable p:
             printable) {
                System.out.println(((Magazine) p).getName());
        }
    }
}
