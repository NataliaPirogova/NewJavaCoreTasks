package Pirogova.Lesson14.Task5;

import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection collection1 = Arrays.asList("a1","a2","a3","a1");
        Collection collection2 = Arrays.asList("1,2,0","4,5");

        collection1.stream().map(p->p+"_1").forEach(System.out::println);

        //второе задание?

    }
}
