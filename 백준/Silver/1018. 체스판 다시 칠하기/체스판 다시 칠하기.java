import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine().trim(); 
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int answer = Integer.MAX_VALUE;

        for (int si = 0; si <= N - 8; si++) {
            for (int sj = 0; sj <= M - 8; sj++) {
                int repaintB = 0; 
                int repaintW = 0;
                for (int r = 0; r < 8; r++) {
                    for (int c = 0; c < 8; c++) {
                        char cur = board[si + r][sj + c];
                        char expB = ((r + c) % 2 == 0) ? 'B' : 'W'; 
                        if (cur != expB) repaintB++;
                        
                        char expW = ((r + c) % 2 == 0) ? 'W' : 'B';
                        if (cur != expW) repaintW++;
                    }
                }
                answer = Math.min(answer, Math.min(repaintB, repaintW));
            }
        }

        System.out.println(answer);
    }
}