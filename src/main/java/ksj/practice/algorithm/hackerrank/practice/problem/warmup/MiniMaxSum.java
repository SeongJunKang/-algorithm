package ksj.practice.algorithm.hackerrank.practice.problem.warmup;

import java.util.Scanner;

/*
 5개중에 4개의 합의 최대값, 최소값을 구하는 내용이다
 5개 총합에서 배열안의 최대값, 최소값을 빼면 최소값, 최대값을 구할수 있다.
 */
public class MiniMaxSum {


    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        long sum = 0, min = arr[0], max = arr[0];
        for (int i = 0 ; i < arr.length; i++) {
            sum += arr[i];
            min = min > arr[i]? arr[i] : min;
            max = max > arr[i]? max : arr[i];
        }
        System.out.println( (sum - max) + " " + (sum - min) );
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        miniMaxSum(arr);
        scanner.close();
    }

}
