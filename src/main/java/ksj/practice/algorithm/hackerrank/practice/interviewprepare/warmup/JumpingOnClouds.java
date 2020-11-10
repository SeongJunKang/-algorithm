package ksj.practice.algorithm.hackerrank.practice.interviewprepare.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumpCount = 0;
        for (int i = 0 ; i < c.length ; i++) {

            if (i < c.length - 2) {
                if (c[i+1] == 1) {
                    jumpCount++;
                    i++;
                } else if (c[i+1] == 0 && c[i+2] == 0) {
                    jumpCount++;
                    i++;
                } else if (c[i+1] == 0 && c[i+2] == 1) {
                    jumpCount+=2;
                    i+=2;
                }
            } else if( i == c.length - 2) {
                jumpCount++;
                i++;
            }
        }
        return  jumpCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

//        int[] c = {0, 0, 1, 0, 0, 1, 0};

        int result = jumpingOnClouds(c);
        System.out.println(result);


        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
