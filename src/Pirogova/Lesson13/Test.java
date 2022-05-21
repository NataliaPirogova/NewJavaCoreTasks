package Pirogova.Lesson13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Test {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата: "+today);

        int year = today.getYear();
        int month = today.getMonthValue();
        Month monthAsEnum = today.getMonth(); // как перечисление
        int dayYear = today.getDayOfYear();
        int dayMonth = today.getDayOfMonth();
        DayOfWeek dayWeekEnum = today.getDayOfWeek(); // как перечисление

        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("Название месяца: " + monthAsEnum);
        System.out.println("День в году: " + dayYear);
        System.out.println("День месяца: " + dayMonth);
        System.out.println("День недели: " + dayWeekEnum);

        LocalTime time = LocalTime.now();
        System.out.println("Время: "+time);
        int hours = time.getHour();
        System.out.println(hours);
    }
}
