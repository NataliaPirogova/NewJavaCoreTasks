package Pirogova.Lesson17_Concurrency;

public class MinMaxClass extends Thread {
    public int num; //количество чисел в массиве
    private int max;
    private int min;
    int []massive;

    public int getMax(){
        for (int i = 0; i < massive.length; i++) {
            max = massive[0];
            if (massive[i]>max){
                max = massive[i];
            }
        }
        System.out.println("Максимальное число из массива: "+max);
        return max;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public MinMaxClass(String name, int []mass) {
        super(name);
        this.massive = mass;
    }

    @Override
    public void run() {
        this.getMax();
    }
}
