package Pirogova.Lesson17_Concurrency;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class SaveAsThread implements Runnable{
    int[]massive;

    public SaveAsThread() {
    }

    public SaveAsThread(int[] mass) {
        this.massive = mass;
    }

    @Override
    public void run() {
        FileWriter fos = null;
        try {
            fos = new FileWriter("D:\\NewJavaCoreTasks\\src\\Pirogova\\Lesson17_Concurrency\\massives.txt", true);
            fos.write(Arrays.toString(massive)+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%s write its massive\n", Thread.currentThread().getName());

    }
}
