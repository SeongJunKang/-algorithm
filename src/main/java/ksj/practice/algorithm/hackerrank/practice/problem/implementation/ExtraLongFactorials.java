package ksj.practice.algorithm.hackerrank.practice.problem.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/***
 * 매우 큰 팩토리얼 값 계산
 */
public class ExtraLongFactorials {


    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger result = new BigInteger("1");
        for (int i = 1 ; i <= n ; i++) {
            BigInteger next = BigInteger.valueOf(i);
            result = result.multiply(next);
        }
        System.out.println(result);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
