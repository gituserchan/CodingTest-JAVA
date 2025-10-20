import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(st.nextToken());
        }
        
       
        
        int[] sorted = Arrays.copyOf(arr, N);
        Arrays.sort(sorted);
        
        Map<Integer, Integer> rank = new HashMap<>();
        int idx = 0;
        for (int v : sorted) {
            if (!rank.containsKey(v)) {
                rank.put(v, idx++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int v : arr) {
            sb.append(rank.get(v)).append(' ');
        }
        System.out.print(sb.toString());
    }
}