package ksj.practice.algorithm.hackerrank.practice.java;

import java.util.*;
import java.util.stream.Collectors;

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
