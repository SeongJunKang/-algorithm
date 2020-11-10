package ksj.practice.algorithm.hackerrank.practice.problem.warmup;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/*

 Java 8의 경우 LocalDate를 사용하여 연월일을 설정할 수 있다.
 (java.util.Date의 기능도 있지만 duplicate됨)
 해당 날짜로 설정하여. 그 날짜의 요일을 표시

 TextStyle을 설정하여 줄여서보여줄건지 전체를 보일건지 설정
 Locale.을 설정하여 해당하는 나라의 요일 내용을 설정

 */

public class FindDateAndTime {


    public static String findDay(int month, int day, int year) {
        LocalDate myDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = myDate.getDayOfWeek();
        String result =
                dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        return result.toUpperCase();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
