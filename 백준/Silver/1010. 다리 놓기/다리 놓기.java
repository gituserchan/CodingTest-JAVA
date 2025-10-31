import java.io.*;
import java.util.*;

public class Main {
    private static long comb(int m, int n) {
        n = Math.min(n, m - n);
        long res = 1L;
        for (int i = 1; i <= n; i++) {
            res = res * (m - i + 1) / i; 
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); 
            int M = Integer.parseInt(st.nextToken()); 
            sb.append(comb(M, N)).append('\n');       
        }

        System.out.print(sb);
    }
}