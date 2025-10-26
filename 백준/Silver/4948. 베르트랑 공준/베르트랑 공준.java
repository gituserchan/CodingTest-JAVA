import java.util.*;
import java.io.*;

public class Main {
    public static boolean isPrime(int a) {
        if (a == 1) return false;
        if (a == 2 || a == 3) return true;
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;

            int count = 0;
            for (int i = N + 1; i <= 2 * N; i++) {
                if (isPrime(i)) count++;
            }
            sb.append(count).append('\n');
        }

        System.out.print(sb.toString());
    }
}