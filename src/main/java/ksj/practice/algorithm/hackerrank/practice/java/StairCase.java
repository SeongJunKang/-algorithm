package ksj.practice.algorithm.hackerrank.practice.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StairCase {

    // Complete the staircase function below.
    static void staircase(int n) {
        for(int j = 0; j < n; j++) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < n- j -1; i++) {
                line.append(" ");
            }
            for (int i = 0; i < j+1; i++) {
                line.append("#");
            }
            System.out.println(line.toString());
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int n = 6;
        staircase(n);

//        scanner.close();
    }
}
