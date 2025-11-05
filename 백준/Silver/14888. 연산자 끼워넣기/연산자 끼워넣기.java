import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] A;         
    static int[] op = new int[4]; 
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    // 계산한 값을 넘겨주면서 max, min 갱신하고 백트래킹으로 값 찾기
    static void dfs(int idx, int val) {
        if (idx == N) {
            max = Math.max(max, val);
            min = Math.min(min, val);
            return;
        }
        
        if (op[0] > 0) {
            op[0]--;
            dfs(idx + 1, val + A[idx]);
            op[0]++;
        }
        
        if (op[1] > 0) {
            op[1]--;
            dfs(idx + 1, val - A[idx]);
            op[1]++;
        }
        
        if (op[2] > 0) {
            op[2]--;
            dfs(idx + 1, val * A[idx]);
            op[2]++;
        }
        
        if (op[3] > 0) {
            op[3]--;
            dfs(idx + 1, val / A[idx]);
            op[3]++;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine().trim());

        A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) op[i] = Integer.parseInt(st.nextToken());

        dfs(1, A[0]);

        System.out.println(max);
        System.out.println(min);
    }
}