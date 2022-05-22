package Pirogova.Lesson14.Task4;

import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection collection = Arrays.asList("a1","a2","a3","a1");

        System.out.println(collection.stream().anyMatch(p->p.equals("a1")));

        System.out.println(collection.stream().anyMatch(p->p.equals("a8")));

        System.out.println(collection.stream().allMatch(p->p.toString().contains("1")));

        System.out.println(collection.stream().noneMatch(p->p.equals("a7")));
    }
}
