package Pirogova.Lesson14.Task6;

import Pirogova.Lesson14.Task2.People;

import java.util.Comparator;

public class ComparatorSex implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return o1.getSex().compareTo(o2.getSex());
    }
}
