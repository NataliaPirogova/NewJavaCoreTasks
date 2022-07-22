package Pirogova.Lesson4;

public class Task2 {
    public static void main(String[] args) {
        int number = 1; //количество амеб
        int h = 0; //количество часов
        do {
            h += 3;
            number *= 2;
            System.out.println("Через " + h + " ч будет " + number + " амеб");
        } while (h < 24);
    }
}
