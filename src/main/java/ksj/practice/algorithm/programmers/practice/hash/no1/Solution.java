package ksj.practice.algorithm.programmers.practice.hash.no1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completeion = {"marina", "josipa", "nikola", "filipa"};

        System.out.println(solution.solution(participant,completeion));

    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();

        for (String person : participant) {
            Integer count = map.getOrDefault(person,1);
            map.put(person, count);
        }
        for (String person : completion) {
            Integer count = map.get(person) - 1;
            map.put(person, count);
        }
        answer = map.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), 1))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()).get(0);
        return answer;
    }

}
