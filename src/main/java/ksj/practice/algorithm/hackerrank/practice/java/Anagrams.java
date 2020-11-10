package ksj.practice.algorithm.hackerrank.practice.java;

import java.util.*;
import java.util.stream.Collectors;

/*
해당 문자열들이 애너그램(anagrams)인지 확인하는 문제

애너그램(anagram)이란 해당 알파벳들을 재배치하여 다른 문자로 만드는 것을 의미

각각의 알파벳 수가 같으면 애너그램임
 */
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        List<Character> aList = new ArrayList<>(
                a.toLowerCase().chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.toList())
        );
        List<Character> bList = new ArrayList<>(
                b.toLowerCase().chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.toList())
        );

        if(aList.size() != bList.size()) return false;

        Collections.sort(aList);
        Collections.sort(bList);

        for(int i = 0 ; i < aList.size(); i++) {
            if(!aList.get(i).equals(bList.get(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
