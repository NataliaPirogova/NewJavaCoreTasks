package Pirogova.Lesson14.Task3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        Collection ordered = Arrays.asList("a1","a2","a2","a3","a1","a2","a2");
        ordered.stream().distinct().forEach(System.out::println);
        Collection nonordered = new HashSet<>(ordered);
        nonordered.stream().distinct().forEach(System.out::println);
    }
}
