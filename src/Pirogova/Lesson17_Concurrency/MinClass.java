package Pirogova.Lesson17_Concurrency;

public class MinClass extends Thread {
    int[]mass;
    int min;

    public MinClass(String name, int[] mass) {
        super(name);
        this.mass = mass;
    }

    @Override
    public void run() {
        min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]<min){
                min = mass[i];
            }
        }
        System.out.println("Минимальное значение"+min);
    }
}
