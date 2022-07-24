package Pirogova.Lesson6_8.Reader;

public class Reader {
    private String FIO;//ФИО
    int number = 100;//номер читательского билета
    private String Faculty;//факультет
    private String DoB;//дата рождения
    private long phone;//телефон

    public Reader() {
    }

    public Reader(String FIO, String Faculty, String DoB, long phone) {
        this.FIO = FIO;
        this.number = ++number;
        this.Faculty = Faculty;
        this.DoB = DoB;
        this.phone = phone;
    }

    public int getNumber() {
        return number;
    }

    public void takeBook() {
        System.out.println(this.getFIO() + ", номер билета " + this.getNumber() + ", взял книгу");
    }

    public void takeBook(int amount) {
        System.out.println(this.FIO + ", номер билета " + this.number + ", взял " + amount + " книг");
    }

    public void takeBook(String... books) {
        System.out.print(this.FIO + " взял книги: ");
        for (String book : books) {
            System.out.print(book + ", ");
        }
    }

    public void returnBook() {
        System.out.println(this.FIO + ", номер билета " + this.number + ", вернул книгу");
    }

    public void returnBook(int amount) {
        System.out.println(this.FIO + ", номер билета " + this.number + ", вернул " + amount + " книг");
    }

    public void returnBook(String... books) {
        System.out.print(this.FIO + " вернул книги: ");
        for (String book : books) {
            System.out.print(book + ", ");
        }
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        DoB = doB;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
