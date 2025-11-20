import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long[] cnt = new long[M];
        long sum = 0;
        long answer = 0;

        cnt[0] = 1;

        for (int i = 0; i < N; i++) {
            sum += arr[i]; 
            int r = (int)(sum % M);

            answer += cnt[r];

            cnt[r]++;
        }

        System.out.println(answer);
    }
}