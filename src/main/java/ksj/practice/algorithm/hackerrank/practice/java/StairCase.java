package ksj.practice.algorithm.hackerrank.practice.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 계단을 표시하는 문제
 들어온 숫자에서 공백과 #으로 계단을 표현한다
 ex) 6
      #
     ##
    ###
   ####
  #####
 ######

 */
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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        staircase(n);
        scanner.close();
    }
}
