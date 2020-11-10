package ksj.practice.algorithm.hackerrank.practice.interviewprepare.warmup;

import java.io.*;

/*
Valleys가 얼마나 나타나는지 체크하는 문제

골짜기가 지면 아래로 내려가면 협곡이라고 한다.
협곡의 갯수를 세는 문제

지면의 단계에서 U일때, 지면의 레벨이 0인 갯수를 체크하면 된다.
 */
public class CountingValleys {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());
        String path = bufferedReader.readLine();
//        int steps = 12;
//        String path = "DDUUDDUDUUUD";
        int result = Result_CountingValleys.countingValleys(steps, path);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}

class Result_CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int result = 0;
        int seaLevel = 0;
        for (char c : path.toCharArray()) {
            seaLevel += (c == 'U') ? 1: -1;
            if (seaLevel == 0 && c == 'U') result++;

        }
        return result;
    }


}