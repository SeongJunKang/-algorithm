package ksj.practice.algorithm.hackerrank.practice.java;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*
String에 들어온 Pattern을 체크하는 문제
try catch를 이용하여 해당 pattern에 문제가 없는지 확인한다.
 */
public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for (;testCases > 0; testCases--) {
            String patternString = in.nextLine();
            //Write your code
            try {
                Pattern pattern = Pattern.compile(patternString);
                System.out.println("Valid");
            } catch(PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}
