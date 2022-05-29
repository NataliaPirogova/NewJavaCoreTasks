package Pirogova.Lesson16_XML;
//com.fasterxml.jackson.core
//jackson-databind
//jackson-datatype-jsr310

//@XmlRootElement(name = "Book")
public class Book {

    private int article;
    private String name;
    private int year;

    public Book() {
    }

    public Book(int article, String name, int year) {
        this.article = article;
        this.name = name;
        this.year = year;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "article=" + article +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public void marshallBook(){

    }
}
