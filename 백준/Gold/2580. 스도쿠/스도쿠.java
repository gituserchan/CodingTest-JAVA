import java.io.*;
import java.util.*;

public class Main {
    static int[][] board = new int[9][9];
    static boolean[][] row = new boolean[9][10];
    static boolean[][] col = new boolean[9][10];
    static boolean[][] box = new boolean[9][10];
    static List<int[]> blanks = new ArrayList<>();

    static void dfs(int idx) {
        if (idx == blanks.size()) {
            StringBuilder sb = new StringBuilder();
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    sb.append(board[r][c]).append(' ');
                }
                sb.append('\n');
            }
            System.out.print(sb);
            System.exit(0);
        }

        int r = blanks.get(idx)[0];
        int c = blanks.get(idx)[1];
        int b = (r / 3) * 3 + (c / 3);

        for (int d = 1; d <= 9; d++) {
            if (row[r][d] || col[c][d] || box[b][d]) continue;
            board[r][c] = d;
            row[r][d] = col[c][d] = box[b][d] = true;

            dfs(idx + 1);

            board[r][c] = 0;
            row[r][d] = col[c][d] = box[b][d] = false;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int r = 0; r < 9; r++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int c = 0; c < 9; c++) {
                int v = Integer.parseInt(st.nextToken());
                board[r][c] = v;
                if (v == 0) {
                    blanks.add(new int[]{r, c});
                } else {
                    int b = (r / 3) * 3 + (c / 3);
                    row[r][v] = col[c][v] = box[b][v] = true;
                }
            }
        }
        dfs(0);
    }
}