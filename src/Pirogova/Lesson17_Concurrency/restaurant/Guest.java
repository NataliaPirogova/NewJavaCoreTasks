package Pirogova.Lesson17_Concurrency.restaurant;

public class Guest implements Runnable{
    Restaurant restaurant;

    public Guest(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            restaurant.reserveTable();

        }
    }
}
