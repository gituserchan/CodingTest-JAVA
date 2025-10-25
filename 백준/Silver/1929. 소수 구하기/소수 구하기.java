import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken()); 
        int N = Integer.parseInt(st.nextToken());

        boolean[] isNotPrime = new boolean[N + 1];
        if (N >= 0) isNotPrime[0] = true;
        if (N >= 1) isNotPrime[1] = true;

        for (int i = 2; i * i <= N; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int x = M; x <= N; x++) {
            if (!isNotPrime[x]) {
                sb.append(x).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}