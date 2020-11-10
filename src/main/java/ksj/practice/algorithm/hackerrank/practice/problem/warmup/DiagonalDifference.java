package ksj.practice.algorithm.hackerrank.practice.problem.warmup;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
diagonalDifference

N x N 크기의 정사각형에서 각각의 대각선의 합 차이를 구하는 문제이다

left to right 대각선 합은 반복문의 조건값을 그대로 거치면 구할 수 있다.
right to left 대각선 합은 N 크기에서 반복문의 조건값을 뺀 값들의 합으로 구할 수 있다.

Math.abs함수로 절대값만을 구하여 표현할 수 있다.

 */
public class DiagonalDifference {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

//      Example Data)

//        List<List<Integer>> arr = new ArrayList<>();
//        Integer[] data1 = {11,2,4};
//        Integer[] data2 = {4,5,6};
//        Integer[] data3 = {10,8,-12};
//        List<Integer> data1List = Arrays.asList(data1);
//        List<Integer> data2List = Arrays.asList(data2);
//        List<Integer> data3List = Arrays.asList(data3);
//        arr.add(data1List);
//        arr.add(data2List);
//        arr.add(data3List);

        int result = Result.diagonalDifference(arr);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
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
