package Pirogova.Lesson6_8.Reader;

public class Reader {
    private String FIO;//ФИО
    int number = 100;//номер читательского билета
    private String Faculty;//факультет
    private String DoB;//дата рождения
    private long phone;//телефон

    public Reader(){
    }

    public Reader(String FIO, String Faculty, String DoB, long phone){
        this.FIO = FIO;
        this.number = ++number;
        this.Faculty = Faculty;
        this.DoB = DoB;
        this.phone = phone;
    }

    public int getNumber() {
        return number;
    }

    public void takeBook(){
        System.out.println(this.FIO + ", номер билета " + this.number + ", взял книгу");
    }

    public void takeBook(int amount){
        System.out.println(this.FIO + ", номер билета " + this.number + ", взял "+amount+" книг");
    }

    public void returnBook(){
        System.out.println(this.FIO + ", номер билета " + this.number + ", вернул книгу");
    }

    public void returnBook(int amount){
        System.out.println(this.FIO + ", номер билета " + this.number + ", вернул "+amount+" книг");
    }
}
