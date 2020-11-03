package ksj.practice.algorithm.hackerrank.warmup;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);
        for (int i = 0 ; i < a.size(); i++) {
            int aIntValue = a.get(i);
            int bIntValue = b.get(i);
            if( aIntValue == bIntValue) continue;

            if( aIntValue > bIntValue) {
                result.set(0,result.get(0)+1);
            } else {
                result.set(1,result.get(1)+1);
            }
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
        Integer[] aArr = {5,6,7};
        Integer[] bArr = {3,6,10};
        List<Integer> a = Arrays.asList(aArr);
        List<Integer> b = Arrays.asList(bArr);

        List<Integer> result = compareTriplets(a, b);
        System.out.println(result.get(0));
        System.out.println(result.get(1));

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }

}
