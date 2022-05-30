package Pirogova.Lesson17_Concurrency;

public class NewThread extends Thread{
    public NewThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        System.out.printf("%s start", NewThread.currentThread().getName());
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.println("n"+(i+1));
        }
        System.out.printf("%s finish",NewThread.currentThread().getName());
    }
}
