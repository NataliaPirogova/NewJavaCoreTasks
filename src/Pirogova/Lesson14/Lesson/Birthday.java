package Pirogova.Lesson14.Lesson;

import java.time.LocalDate;

public final class Birthday {
    public static boolean is(int age){
        return LocalDate.now().minusYears(age).isLeapYear();
    }
}
