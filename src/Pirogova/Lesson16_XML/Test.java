package Pirogova.Lesson16_XML;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(4110, "Little prince", 1943));
        books.add(new Book(9001, "War and piece", 1867));
        books.add(new Book(1823, "100 years of loneliness", 1967));

        books.forEach(System.out::println);
    }
}
