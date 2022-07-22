package Pirogova.Lesson4;

public class Task1 {
    public static void main(String[] args) {
        int d = 1; //количество дней
        double l = 10; //расстояние в первый день
        double s = 0; //суммарное расстояние
        do {
            s += l;
            l = l + 0.1 * l;
            d++;
        } while (d <= 7);
        System.out.println("За 7 дней спортсмен пробежал " + s + " км");
    }
}
