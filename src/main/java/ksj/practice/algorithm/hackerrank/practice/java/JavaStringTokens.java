package ksj.practice.algorithm.hackerrank.practice.java;

import java.util.Scanner;

/*
특정 문자로 정규식을 만들어 문자열을 split하는 문제
공백 ! , ? _ ' @ 로 문자열을 분리
 */
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if (s.length()==0 || s.length()>400000) {
            System.out.println(0);
        } else {
            String[] split = s.split("[ !,?.\\_'@]+");
            System.out.println(split.length);
            for (String word : split) {
                System.out.println(word);
            }
        }
        scan.close();
    }
}
