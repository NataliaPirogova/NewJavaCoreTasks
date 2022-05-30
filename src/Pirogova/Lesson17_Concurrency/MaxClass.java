package Pirogova.Lesson17_Concurrency;

public class MaxClass extends Thread{
    int []mass;
    int max;

    public MaxClass(String name, int[]massive) {
        super(name);
        this.mass = massive;
    }

    @Override
    public void run() {
        max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]>max){
               max = mass[i];
           }
        }
        System.out.println("Максимальное значение "+max);
    }
}
