package Pirogova.Lesson6_8.Animal;

public class Horse extends Animal{

    private String climate;//Зонально-климатический признак:— лесные,— горные,— степные
    private String mission;//Назначение: верховые, верхово-упряжные, легкоупряжные, тяжелоупряжные, верхово-вьючные

    public Horse(){
    }

    public Horse(String food, String location, String climate, String mission){
        super(food, location);
        this.climate=climate;
        this.mission=mission;
    }

    @Override
    public void makeNoise(){
        System.out.println("Лошадь ржет");
    }

    @Override
    public void eat(){
        System.out.println("Лошадь ест");
    }

    @Override
    public void sleep(){
        System.out.println("Лошадь спит");
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
}
