package Pirogova.Lesson6_8.InternetShop;

public class DemoShop {
    public static void main(String[] args) {
//        Category shoes = new Category("Shoes");
//        Category cosmetics = new Category("Cosmetics");
//        Category food = new Category("Food");
//        Category school = new Category("School");

        Printable tomSoyer = new Book("Том Сойер");
        Printable chemicalTest = new Book("Тесты по химии");
        Magazine cosmo = new Magazine("Космополитан");
        Printable[] booksAndMagazines = new Printable[]{tomSoyer,chemicalTest,cosmo};

        for (Printable item:booksAndMagazines) {
        item.print();
//        if (item instanceof Magazine){
//            Magazine.printMagazines(booksAndMagazines);
//        }
//        if(item instanceof Book){
//            Book.printBooks(booksAndMagazines);
//        }
        }
//
//        Instrument guitar1 = new Guitar(7);
//        Instrument drum1 = new Drum(2);
//        Instrument trumpet1 = new Trumpet(100);
//        Instrument[] instruments = new Instrument[]{guitar1,drum1,trumpet1};
//        for (Instrument i:
//             instruments) {
//            i.play();
//        }

//        Season season = Season.SPRING;
//        System.out.println(season);
//        season.test(season);
//        for (Season s:
//             Season.values()) {
//            System.out.println(s+", средняя температура "+s.getAverageT()+", "+s.getDescription());
//        }
    }
}
