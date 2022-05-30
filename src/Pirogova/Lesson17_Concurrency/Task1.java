package Pirogova.Lesson17_Concurrency;
//    1. Создать класс расширяющий Thread
//    Создать класс NewThread расширяющий Thread.
//    Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
//    Создать экземпляр класса и запустить новый поток.

public class Task1 {
    public static void main(String[] args) {
        NewThread th1 = new NewThread("Symbol");
        System.out.println("Main thread start");
        th1.start();
        System.out.println("Main thread finish");
    }
}
