package Pirogova.Lesson14.Lesson;

import java.util.Comparator;

public class ComparingHobby implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
       return o1.getHobbies().size()-o2.getHobbies().size();
    }
}
