import java.io.*;
import java.util.*;

public class Main {
    // 최대공약수 함수
    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); 
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] gap = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            gap[i] = arr[i + 1] - arr[i];
        }

        int g = gap[0];
        for (int i = 1; i < gap.length; i++) {
            g = gcd(g, gap[i]);
        }
        
        int totalLen = arr[N - 1] - arr[0];

        int idealTrees = totalLen / g + 1;

        int answer = idealTrees - N;

        System.out.println(answer);
    }
}