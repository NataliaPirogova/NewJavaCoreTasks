package Pirogova.Lesson17_Concurrency.restaurant;

public class Test {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant(2);

        for (int i = 0; i < 100; i++) {
            Thread thread1 = new Thread(new Guest(restaurant1));
            thread1.start();
        }

        for (int i = 0; i < 5; i++) {
            Thread thread2 = new Thread(new Waiter(restaurant1));
            thread2.start();
        }

    }
}
