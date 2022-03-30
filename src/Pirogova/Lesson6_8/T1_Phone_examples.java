package Pirogova.Lesson6_8;

public class T1_Phone_examples {
    public static void main(String[] args) {
        T1_Phone t1Phone1 = new T1_Phone(911, "SOS", 432);
        T1_Phone t1Phone2 = new T1_Phone();
        T1_Phone t1Phone3 = new T1_Phone();

        t1Phone1.displayInfo();
        t1Phone1.recieveCall("Mary");
        t1Phone1.getNumber();
        t1Phone2.displayInfo();
        t1Phone2.recieveCall("John");
        t1Phone2.getNumber();
        t1Phone3.displayInfo();
        t1Phone3.recieveCall("Oleg");
        t1Phone3.getNumber();
    }
}
