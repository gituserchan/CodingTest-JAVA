import java.io.*;
import java.util.*;

public class Main {
    static final int MAX = 1000000;
    static boolean[] isPrime = new boolean[MAX + 1];

    static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    static int countGold(int n) {
        int cnt = 0;
        for (int p = 2; p <= n / 2; p++) {
            if (isPrime[p] && isPrime[n - p]) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        sieve();

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(countGold(n)).append('\n');
        }

        System.out.print(sb.toString());
    }
}