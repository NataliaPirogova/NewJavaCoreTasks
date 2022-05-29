package Pirogova.Lesson17_Conurrency;

public class MinMaxClass extends Thread {
    public int num; //количество чисел в массиве
    private int max;
    private int min;
    int []mass;

    public int getMax(){
        for (int i = 0; i < mass.length; i++) {
            max = mass[0];
            if (mass[i]>max){
                max = mass[i];
            }
        }
        return max;
    }

    public int getMin (){
        for (int i = 0; i < mass.length; i++) {
            min = mass[0];
            if (mass[i]<min){
                min = mass[i];
            }
        }
        return min;
    }

    @Override
    public void run() {
        System.out.println("Максимальное значение");
        System.out.println(getMax());
    }

    public void setNum(int num) {
        this.num = num;
    }

    public MinMaxClass(String name, int num) {
        super(name);
        int[] mass = new int[num];
    }
}
