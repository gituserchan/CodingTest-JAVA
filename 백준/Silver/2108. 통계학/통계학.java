import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] freq = new int[8001]; 

        long sum = 0;              
        int minVal = 4001, maxVal = -4001;

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            arr[i] = x;
            sum += x;
            freq[x + 4000]++;

            if (x < minVal) minVal = x;
            if (x > maxVal) maxVal = x;
        }

        int mean = (int) Math.round((double) sum / N);
        if (mean == -0) mean = 0; 

        Arrays.sort(arr);
        int median = arr[N / 2]; 

        int maxFreq = 0;
        for (int f : freq) if (f > maxFreq) maxFreq = f;

        int mode = 0;
        int seen = 0; 
        for (int i = 0; i <= 8000; i++) {
            if (freq[i] == maxFreq) {
                seen++;
                mode = i - 4000;
                if (seen == 2) break; 
            }
        }

        int range = maxVal - minVal;

        StringBuilder sb = new StringBuilder();
        sb.append(mean).append('\n')
          .append(median).append('\n')
          .append(mode).append('\n')
          .append(range);

        System.out.print(sb);
    }
}