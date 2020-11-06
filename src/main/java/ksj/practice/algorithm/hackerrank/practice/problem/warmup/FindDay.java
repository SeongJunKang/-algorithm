package ksj.practice.algorithm.hackerrank.practice.problem.warmup;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FindDay {

    public static String findDay(int month, int day, int year) {

        LocalDate myDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = myDate.getDayOfWeek();
        String result =
                dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        return result.toUpperCase();
    }

    public static void main(String[] args) {

        findDay(8,5,2015);

    }
}
