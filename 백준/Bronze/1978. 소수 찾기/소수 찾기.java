import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count2 = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            int count = 0;

            for (int j = 1; j <= a; j++) {
                if (a % j == 0) {
                    count++;
                }
            }

            if (count == 2) count2++;
        }

        System.out.println(count2);
    }
}