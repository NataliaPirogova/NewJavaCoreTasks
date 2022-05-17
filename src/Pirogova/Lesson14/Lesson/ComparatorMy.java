package Pirogova.Lesson14.Lesson;

import javax.swing.*;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ComparatorMy implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
