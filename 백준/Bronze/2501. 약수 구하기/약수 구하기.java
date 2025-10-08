import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                arr[count++] = i;
            }
        }

        if (count >= K) {
            System.out.println(arr[K - 1]);
        } else {
            System.out.println(0);
        }
    }
}