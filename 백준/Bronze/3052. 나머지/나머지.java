import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a % 42;
        }
        boolean[] seen = new boolean[42];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (!seen[arr[i]]) {
                seen[arr[i]] = true;
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}