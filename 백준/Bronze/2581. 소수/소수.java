import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int total = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = N; i <= M; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 2) { 
                total += i;
                if (i < min) min = i;
            }
        }
        
        if (total != 0) {
            System.out.println(total);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}