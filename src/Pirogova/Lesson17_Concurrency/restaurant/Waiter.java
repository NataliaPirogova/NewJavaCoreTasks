package Pirogova.Lesson17_Concurrency.restaurant;

public class Waiter implements Runnable{
    Restaurant restaurant;

    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            restaurant.releaseTable();
        }
    }
}
