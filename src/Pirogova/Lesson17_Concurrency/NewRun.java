package Pirogova.Lesson17_Concurrency;

public class NewRun implements Runnable{
    String name;

    public NewRun(String name) {
        this.name = name;
    }

    public NewRun() {
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i%10==0){
                System.out.println(i + " "+ Thread.currentThread().getName());
            }
        }
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
