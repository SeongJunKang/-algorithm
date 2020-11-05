package ksj.practice.algorithm.hackerrank.practice.problem.warmup;

import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
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
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String s = scan.nextLine();
        String s = "07:05:45PM";
        String result = timeConversion(s);
        System.out.println(result);
//        bw.write(result);
//        bw.newLine();

//        bw.close();
    }
}
