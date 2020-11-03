package ksj.practice.algorithm.hackerrank.warmup;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {


    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<List<Integer>> arr = new ArrayList<>();
//
//        IntStream.range(0, n).forEach(i -> {
//            try {
//                arr.add(
//                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                .map(Integer::parseInt)
//                                .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });

        List<List<Integer>> arr = new ArrayList<>();
        Integer[] data1 = {11,2,4};
        Integer[] data2 = {4,5,6};
        Integer[] data3 = {10,8,-12};
        List<Integer> data1List = Arrays.asList(data1);
        List<Integer> data2List = Arrays.asList(data2);
        List<Integer> data3List = Arrays.asList(data3);
        arr.add(data1List);
        arr.add(data2List);
        arr.add(data3List);

        int result = Result.diagonalDifference(arr);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int arrSize= arr.size();
        int l2r = 0;
        int r2l = 0;
        for (int i = 0 ; i < arrSize; i++) {
            l2r += arr.get(i).get(i);
        }
        for (int i = 0 ; i < arrSize; i++) {
            r2l += arr.get(i).get(arrSize -1 -i);
        }

        return Math.abs(l2r-r2l);

    }

}
