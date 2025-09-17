import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int max = 0;
        int count = 0;

        for (int i = 0; i < 9; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
            if (max < a) {
                max = a;
                count = i;
            }
        }

        bw.write(max + "\n");
        bw.write((count + 1) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}