import java.io.*;
import java.util.*;

public class Main {
    static char[][] board;

    static void draw(int y, int x, int n) {
        if (n == 1) {
            board[y][x] = '*';
            return;
        }
        int t = n / 3;
        for (int dy = 0; dy < 3; dy++) {
            for (int dx = 0; dx < 3; dx++) {
                if (dy == 1 && dx == 1) continue;
                draw(y + dy * t, x + dx * t, t);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        board = new char[N][N];
        for (int i = 0; i < N; i++) Arrays.fill(board[i], ' ');

        draw(0, 0, N);

        StringBuilder sb = new StringBuilder(N * (N + 1));
        for (int i = 0; i < N; i++) {
            sb.append(board[i]).append('\n');
        }
        System.out.print(sb);
    }
}