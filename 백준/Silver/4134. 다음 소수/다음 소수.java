import java.io.*;
import java.util.*;

public class Main {

    private static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;

        long limit = (long)Math.sqrt(n);
        for (long d = 3; d <= limit; d += 2) {
            if (n % d == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            long x = Long.parseLong(br.readLine());
            long cur = x;

            while (true) {
                if (isPrime(cur)) {
                    sb.append(cur).append('\n');
                    break;
                }
                cur++;
            }
        }

        System.out.print(sb.toString());
    }
}