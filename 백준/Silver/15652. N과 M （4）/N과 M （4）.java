import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] picked;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int depth, int start) {
        if (depth == M) {
            for (int i = 0; i < M; i++) sb.append(picked[i]).append(' ');
            sb.append('\n');
            return;
        }
     
        for (int i = start; i <= N; i++) {
            picked[depth] = i;
            dfs(depth + 1, i);   
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        picked = new int[M];
        dfs(0, 1);
        System.out.print(sb);
    }
}