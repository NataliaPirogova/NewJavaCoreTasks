package Pirogova.Lesson14.Task6;

import Pirogova.Lesson14.Task2.People;
import Pirogova.Lesson14.Task2.Sex;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Collection coll = Arrays.asList("a1","a4","a3","a2","a1","a4");
        Collection<People> peopleAll = Arrays.asList(new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));

        coll.stream().sorted().forEach(System.out::println);

        coll.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        coll.stream().distinct().sorted().forEach(System.out::println);

        coll.stream().distinct().sorted(Comparator.reverseOrder()).forEach(p->System.out.println(p));

        peopleAll.stream().sorted(new ComparatorName().reversed()).forEach(p-> System.out.println(p.getName()));

        peopleAll.stream().sorted(new ComparatorSex().thenComparing(new ComparatorAgePeople())).forEach(System.out::println);
    }
}
