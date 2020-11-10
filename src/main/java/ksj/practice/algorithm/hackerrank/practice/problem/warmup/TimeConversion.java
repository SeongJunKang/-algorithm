package ksj.practice.algorithm.hackerrank.practice.problem.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 AM/PM을 분리하여 12시간을 더함
 12시는 예외처리하여 시간을 나타내줌
 */

public class TimeConversion {

    static String timeConversion(String s) {
        String type = s.substring(s.length() - 2);
        String time = s.replace(type, "");
        int hourInt = Integer.parseInt(time.split(":")[0]);
        if (type.equalsIgnoreCase("AM")) {
            if(hourInt == 12) {
                hourInt = 0;
            }
        } else {
            hourInt += hourInt == 12? 0:12;
        }
        String hour = hourInt > 10 ? Integer.toString(hourInt) : "0"+hourInt;
        return hour+time.substring(2);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = scan.nextLine();
//        String s = "07:05:45PM";
        String result = timeConversion(s);
        System.out.println(result);
        bw.write(result);
        bw.newLine();
        bw.close();
    }
}
