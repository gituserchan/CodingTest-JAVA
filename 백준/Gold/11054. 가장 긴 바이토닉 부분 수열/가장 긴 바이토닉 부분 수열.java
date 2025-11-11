import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) a[i] = Integer.parseInt(st.nextToken());

        int[] L = new int[N]; 
        int[] R = new int[N]; 
        
        Arrays.fill(L, 1);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]) L[i] = Math.max(L[i], L[j] + 1);
            }
        }

        Arrays.fill(R, 1);
        for (int i = N - 1; i >= 0; i--) {
            for (int j = N - 1; j > i; j--) {
                if (a[j] < a[i]) R[i] = Math.max(R[i], R[j] + 1);
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) ans = Math.max(ans, L[i] + R[i] - 1);
        System.out.println(ans);
    }
}