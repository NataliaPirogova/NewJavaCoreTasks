package Pirogova.Lesson6_8.Transport;

public class Test {
    public static void main(String[] args) {
        PassengerVehicle Porsche = new PassengerVehicle(2000, 270, 3000, "Porsche", 4, 11, "хэтчбек", 4);
        CommercialVehicle MAZ = new CommercialVehicle(2000, 140, 6000, "МАЗ", 8, 19, 15);
        Civilian Boeing = new Civilian(9000, 850, 41140, "Boeing 737", 34, 5000, 160, false);
        Military SU57 = new Military(2000, 900, 18500, "Су-57", 14, 350, true, 0);

        Porsche.Characteristic();
        Porsche.timeAndFuel(14);
//        MAZ.Characteristic();
//        MAZ.possibility(9);
//        MAZ.possibility(27);
//        Boeing.Characteristic();
//        Boeing.possibility(190);
//        Boeing.possibility(110);
//        SU57.Characteristic();
//        SU57.ejection();
//        SU57.shot();
    }
}
