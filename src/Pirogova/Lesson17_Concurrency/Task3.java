package Pirogova.Lesson17_Concurrency;
//            3. Вывод символа в трех потоках
//    Необходимо создать три потока, которые изменяют один и тот же объект. Каждый поток должен вывести на экран одну букву 100 раз, и затем увеличить значение символа на 1.
//
//    Создать класс расширяющий Thread.
//    Переопределить метод run() - здесь будет находиться синхронизированный блок кода.
//    Для того чтобы три объекта потока имели доступ к одному объекту, создаем конструктор принимающий на вход StringBuilder объект.
//    Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта 3.
//    Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз, а потом увеличьте значение символа на 1.
//    В методе main() создайте один объект класса StringBuilder, используя символ ‘a’.
//    Затем создайте три экземпляра объекта нашего класса и запустите потоки.

public class Task3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("a");
        NewThreadT3 t_1 = new NewThreadT3("Thread1", stringBuilder);
        NewThreadT3 t_2 = new NewThreadT3("Thread2", stringBuilder);
        NewThreadT3 t_3 = new NewThreadT3("Thread3", stringBuilder);

        t_1.start();
        t_2.start();
        t_3.start();
    }
}
