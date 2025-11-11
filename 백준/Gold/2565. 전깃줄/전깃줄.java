import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[][] wires = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            wires[i][0] = Integer.parseInt(st.nextToken()); 
            wires[i][1] = Integer.parseInt(st.nextToken()); 
        }

        Arrays.sort(wires, (x, y) -> x[0] == y[0] ? Integer.compare(x[1], y[1]) : Integer.compare(x[0], y[0]));

        int[] tails = new int[N];
        int len = 0;
        for (int i = 0; i < N; i++) {
            int b = wires[i][1];
            int pos = Arrays.binarySearch(tails, 0, len, b);
            if (pos < 0) pos = -(pos + 1);     
            tails[pos] = b;
            if (pos == len) len++;
        }

        System.out.println(N - len);
    }
}