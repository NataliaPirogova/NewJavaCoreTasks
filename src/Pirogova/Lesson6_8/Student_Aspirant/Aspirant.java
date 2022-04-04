package Pirogova.Lesson6_8.Student_Aspirant;

public class Aspirant extends Student{
    private String firstName;
    private String lastName;
    private String group;
    double averageMark;
    private String scientificWork;

    public Aspirant(){
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
        this.scientificWork =scientificWork;
    }
    public void getScholarship(){
    if (averageMark==5){
        System.out.println("Сумма стипендии 200 р");
    }
    else{
        System.out.println("Сумма стипендии 180р");
    }
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }
}
