import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 
        int K = Integer.parseInt(st.nextToken()); 

        int[] W = new int[N + 1];
        int[] V = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            W[i] = Integer.parseInt(st.nextToken()); 
            V[i] = Integer.parseInt(st.nextToken()); 
        }

        int[] dp = new int[K + 1]; 

        for (int i = 1; i <= N; i++) {
            int w = W[i];
            int v = V[i];

            for (int weight = K; weight >= w; weight--) {
                dp[weight] = Math.max(dp[weight],
                                      dp[weight - w] + v);
            }
        }

        System.out.println(dp[K]);
    }
}