package Pirogova.Lesson17_Concurrency.restaurant;

public class Restaurant {
    private final int allTables = 10;
    private int reservedTables;

    public Restaurant(int reservedTables) {
        this.reservedTables = reservedTables;
    }

    public void reserveTable(){
        synchronized (this){
            while(reservedTables==allTables){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            reservedTables++;
            System.out.println("Столик зарезервирован, количество свободных столиков - "+(allTables-reservedTables));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            notify();
        }
    }

    public void releaseTable(){
        synchronized (this){
            while (reservedTables<5){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            reservedTables--;
            System.out.println("Официант убрал один столик, количество свободных столиков - "+(allTables-reservedTables));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            notify();
        }
    }
}
