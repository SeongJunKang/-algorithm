package ksj.practice.algorithm.hackerrank.practice.problem.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/***
 * 여왕의 공격 가능 한 범위 계산
 *
 * 첫줄 n은 체스판의 크기, k는 장애물의 수
 * 두번째 줄은 퀸의 위치
 * 세번째 줄부터는 장애물의 위치
 */
public class QueensAttackII {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int up = n - r_q;
        int down = r_q - 1;
        int right = n - c_q;
        int left = c_q -1;
        int right_up = Math.min(up,right);
        int right_down = Math.min(down, right);
        int left_up = Math.min(up, left);
        int left_down = Math.min(down,left);
        for(int i = 0 ; i < k; i++) {
            int row = obstacles[i][0];
            int col = obstacles[i][1];
            // 장애물의 행과 퀸의 행이 같으면
            if (row == r_q) {
                // 좌 / 우 값 비교
                if (col < c_q) {
                   left = Math.min(left,c_q -1 - col);
                } else {
                   right = Math.min(right, col - c_q -1);
                }
            } else if(col == c_q) {
                // 장애물의 열과 퀸의 열이 같으면
                // 위아래 비교
                if (row < r_q) {
                    down = Math.min(down,r_q -1 - row);
                } else {
                    up = Math.min(up, row - r_q -1);
                }
            } else if (Math.abs(row - r_q) == Math.abs((col - c_q))) {
                // 대각선에 있는지 절대값으로 비교
                // 우측 대각선 확인
                // 맨처음에는 right_up = col - c_q -1;로 했으나, 같은 대각선의 장애물 로직 오류로 인해 min으로 변경
                if (col > c_q) {
                    if (row > r_q) {
                    // RIGHT_UP
                        right_up = Math.min(right_up, col - c_q -1);
                    } else {
                    // RIGHT_DOWN
                        right_down = Math.min(right_down, col - c_q -1);
                    }
                } else if (col < c_q) {
                    // 좌측대각선 확인
                    if (row > r_q) {
                        // LEFT_UP
                        left_up = Math.min(left_up, c_q - col - 1);
                    } else {
                        // LEFT_DOWN
                        left_down = Math.min(left_down, c_q - col - 1);
                    }
                }
            }
        }
        int canMoveCount = up+down+right+left+right_up+right_down+left_up+left_down;
        return canMoveCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
        */
        int n = 5;
        int k = 3;
        int r_q = 4;
        int c_q = 3;
        int[][] obstacles =  new int[k][2];
        obstacles[0][0]=5;
        obstacles[0][1]=5;
        obstacles[1][0]=4;
        obstacles[1][1]=2;
        obstacles[2][0]=2;
        obstacles[2][1]=3;
        int result = queensAttack(n, k, r_q, c_q, obstacles);
        System.out.println(result);
    }

}
