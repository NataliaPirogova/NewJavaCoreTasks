package Pirogova.Lesson6_8.Phone;

public class Phone_examples {
    public static void main(String[] args) {
        Phone Phone1 = new Phone(911, "SOS", 432);
        Phone Phone2 = new Phone(6772112,"Siemenes", 124);
        Phone Phone3 = new Phone(1341444, "Honor", 99);

        Phone1.displayInfo();
        Phone1.recieveCall("Mary");
        Phone1.getNumber();
        Phone2.displayInfo();
        Phone2.recieveCall("John");
        Phone2.getNumber();
        Phone3.displayInfo();
        Phone3.receiveCall("Oleg", 1723113);
        Phone3.getNumber();
    }
}
