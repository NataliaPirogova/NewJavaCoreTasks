package Pirogova.Lesson6_8.Computer;

public class Computer_objects {
    public static void main(String[] args) {
        Computer HP = new Computer("AMD", 8, 512, 99);

        HP.displayInfo();

        for (int i = 0; i < 15; i++) {
            HP.turnON();
            HP.turnOFF();
        }
    }
}
