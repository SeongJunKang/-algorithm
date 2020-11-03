package ksj.practice.algorithm.hackerrank.java;

import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int po = 0;
        int ne = 0;
        int zero = 0;
        int size = arr.length;
        for (int data: arr) {
            if (data == 0) {
                zero++;
            } else if(data > 0) {
                po++;
            } else {
                ne++;
            }
        }

        System.out.println((float)po/(float)size);
        System.out.println((float)ne/(float)size);
        System.out.println((float)zero/(float)size);

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
