package Pirogova.Lesson6_8.InternetShop;

public class DemoShop {
    public static void main(String[] args) {
        Category shoes = new Category("Shoes");
        Category cosmetics = new Category("Cosmetics");
        Category food = new Category("Food");
        Category school = new Category("School");

        Printable[] booksAndMagazines = new Printable[3];
        Printable tomSoyer = new Book("Том Сойер");
        Printable chemicalTest = new Book("Тесты по химии");
        Magazine cosmo = new Magazine("Космополитан");
        booksAndMagazines[0] = tomSoyer;
        booksAndMagazines[1]=chemicalTest;
        booksAndMagazines[2]=cosmo;


        for (Printable item:booksAndMagazines) {
        item.print();
        }
    }
}
