package Pirogova.Lesson6_8.Animal;

public class Test {
    public static void main(String[] args) {
        Veterinar Polina = new Veterinar();
        Animal Jack = new Dog("Любит курицу", "живет в частном доме", "овчарка");
        Animal Tilda = new Cat("Любит крольчатину", "домашняя", "британская порода");
        Animal Margo = new Horse("Любит морковь", "содержится на ферме", "степной вид", "легкоупряжная");
        Animal West = new Horse("Любит сено", "содержится на конюшне", "степной вид", "верховая");
        Animal Poncho = new Dog("Любит мясо", "домашний", "пудель");
        Animal[] patients = new Animal[5];
        patients[0] = Jack;
        patients[1] = Tilda;
        patients[2] = Margo;
        patients[3] = West;
        patients[4] = Poncho;

        for (Animal patient : patients
        ) {
            Polina.treatAnimal(patient);
        }
    }
}
