import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   
        int M = Integer.parseInt(st.nextToken());  

        int[] prefix = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            prefix[i] = prefix[i - 1] + num;
        }

        StringBuilder sb = new StringBuilder();

        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int sum = prefix[b] - prefix[a - 1];
            sb.append(sum).append('\n');
        }

        System.out.print(sb.toString());
    }
}