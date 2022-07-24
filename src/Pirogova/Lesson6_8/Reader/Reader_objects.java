package Pirogova.Lesson6_8.Reader;

public class Reader_objects {
    public static void main(String[] args) {
        Reader Petya = new Reader("Петров Петр Васильевич", "Химический факультет", "17.02.1994", 1442988);
        Petya.takeBook();
        Petya.returnBook();
        Petya.takeBook("Приключения", "Словарь", "Энциклопедия");
    }
}
