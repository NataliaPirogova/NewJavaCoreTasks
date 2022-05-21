package Pirogova.Lesson6_8.InternetShop;

public enum Season {
    WINTER(-6), SPRING(13), SUMMER(17){
        @Override
        public String getDescription(){
            return "Теплое время года";
        }
    }, AUTUMN(8);

    public int getAverageT() {
        return averageT;
    }

    private int averageT;

    Season() {
    }

    Season (int averageT){
        this.averageT=averageT;
    }

    public String getDescription(){
        return "Холодное время года";
    }


    public void test(Season season){
        switch (season){
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("Такого времени года не существует");
        }
    }
}
