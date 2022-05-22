package Pirogova.Lesson14.Task6;

import java.util.Comparator;

public class ComparetorString implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
