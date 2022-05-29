package Pirogova.Lesson17_Conurrency;

public class NewThreadT3 extends Thread{
    StringBuilder sym;

    public NewThreadT3(String name, StringBuilder sym) {
        super(name);
        this.sym=sym;
    }

    @Override
    public void run() {
        synchronized (sym){
            for (int i = 1; i <= 100; i++) {
                System.out.println(sym+" "+Thread.currentThread().getName());
            }
        }
    }
}
