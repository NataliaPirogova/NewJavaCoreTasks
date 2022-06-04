package Pirogova.Lesson17_Concurrency.restaurant;

public class Test {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant(2);

        for (int i = 0; i < 100000; i++) {
            Thread thread1 = new Thread(new Guest(restaurant1));
            thread1.start();
        }


        for (int i = 0; i < 500; i++) {
            Thread thread2 = new Thread(new Waiter(restaurant1));
            thread2.start();
        }

    }
}


//    К задаче на уроке:
//        Добавить кассу и считать по 50р. за каждый столик. Когда наберется 1000, приезжает инкассация, идет процесс примерно 5 сек, в этот момент нельзя букать столики. Касса обнуляется и продолжается работа.
//        - Когда будет обслужено 100 столиков завершается работа ресторана.

//Доп. задание: реализовать блокирующую очередь. Т.е. создать класс, внутри которого есть массив, конструктором задается capacity, добавить два метода:addItem, poll. И потом в main написать добавление в цикле и удаление.