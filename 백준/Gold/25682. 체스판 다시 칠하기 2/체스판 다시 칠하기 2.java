import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 
        int K = Integer.parseInt(st.nextToken()); 

        char[][] board = new char[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            for (int j = 1; j <= M; j++) {
                board[i][j] = line.charAt(j - 1);
            }
        }

        int[][] preW = new int[N + 1][M + 1];
        int[][] preB = new int[N + 1][M + 1];

        //다시 칠하게 되는 누적합 구하기
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                char cur = board[i][j];

                char expectedW = ((i + j) % 2 == 0) ? 'W' : 'B'; 
                char expectedB = ((i + j) % 2 == 0) ? 'B' : 'W'; 

                int wDiff = (cur == expectedW) ? 0 : 1;
                int bDiff = (cur == expectedB) ? 0 : 1;

                preW[i][j] = wDiff
                           + preW[i - 1][j]
                           + preW[i][j - 1]
                           - preW[i - 1][j - 1];

                preB[i][j] = bDiff
                           + preB[i - 1][j]
                           + preB[i][j - 1]
                           - preB[i - 1][j - 1];
            }
        }

        int answer = Integer.MAX_VALUE;

        //모든 K*K 판의 경우의 수를 찾으면서 구간 사이에 누적합끼리 빼기
        //검은색과 흰색간의 최솟값이 정답
        for (int i = K; i <= N; i++) {
            for (int j = K; j <= M; j++) {
                int x1 = i - K + 1;
                int y1 = j - K + 1;
                int x2 = i;
                int y2 = j;

                int repaintW = preW[x2][y2]
                             - preW[x1 - 1][y2]
                             - preW[x2][y1 - 1]
                             + preW[x1 - 1][y1 - 1];

                int repaintB = preB[x2][y2]
                             - preB[x1 - 1][y2]
                             - preB[x2][y1 - 1]
                             + preB[x1 - 1][y1 - 1];

                int repaint = Math.min(repaintW, repaintB);
                if (repaint < answer) answer = repaint;
            }
        }

        System.out.println(answer);
    }
}