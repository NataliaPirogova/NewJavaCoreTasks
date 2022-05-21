package Pirogova.Lesson6_8.InternetShop;

public enum Season {
    WINTER(-6), SPRING(13), SUMMER(17), AUTUMN(8);

    private int averageT;

    Season() {
    }

    Season (int averageT){
        this.averageT=averageT;
    }
}
