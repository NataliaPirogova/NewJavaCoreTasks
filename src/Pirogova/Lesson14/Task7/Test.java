package Pirogova.Lesson14.Task7;

import Pirogova.Lesson14.Task2.People;
import Pirogova.Lesson14.Task2.Sex;
import Pirogova.Lesson14.Task6.ComparatorAgePeople;
import Pirogova.Lesson14.Task6.ComparetorString;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Collection coll = Arrays.asList("a1","a2","a3","a1");
        Collection<People> peopleAll = Arrays.asList(new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));

        System.out.println(coll.stream().max(new ComparetorString()).get());

        System.out.println(coll.stream().min(new ComparetorString()).get());

        System.out.println(peopleAll.stream().max(new ComparatorAgePeople()).get());

        System.out.println(peopleAll.stream().min(new ComparatorAgePeople()).get());
    }
}
