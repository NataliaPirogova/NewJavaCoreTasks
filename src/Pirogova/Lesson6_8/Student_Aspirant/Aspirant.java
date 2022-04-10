package Pirogova.Lesson6_8.Student_Aspirant;

public class Aspirant extends Student{
    private String scientificWork;

    public Aspirant(){
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork =scientificWork;
    }

    public void getScholarship(){
    if (averageMark==5){
        System.out.println("Сумма стипендии "+this.getFirstName()+this.getLastName()+" 200 р");
    }
    else{
        System.out.println("Сумма стипендии "+this.getFirstName()+this.getLastName()+" 180р");
    }
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }
}
