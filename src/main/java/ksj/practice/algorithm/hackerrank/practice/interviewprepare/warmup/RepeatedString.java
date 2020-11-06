package ksj.practice.algorithm.hackerrank.practice.interviewprepare.warmup;

import java.io.IOException;


public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int length = s.length();
        long repeat = 1;
        long aCount = 0;
        for (char c : s.toCharArray()) {
            aCount += (c == 'a') ? 1:0;
        }

        repeat = n/length;
        aCount *= repeat;
        long repeatedLength  = n - (length * repeat);
        if (repeatedLength != 0) {
            String subs = s.substring(0, (int) repeatedLength);
            for (char c : subs.toCharArray()) {
                aCount += (c == 'a') ? 1 : 0;
            }
        }
        return aCount;
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scanner.nextLine();
//
//        long n = scanner.nextLong();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = "a";
        long n = (long)(1000000000000.0);
        long result = repeatedString(s, n);
        System.out.println(result);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
