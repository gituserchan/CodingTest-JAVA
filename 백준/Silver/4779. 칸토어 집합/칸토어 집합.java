import java.io.*;
import java.util.*;

public class Main {
    static char[] arr;

    static void cantor(int start, int len) {
        if (len == 1) return;             
        int third = len / 3;

        for (int i = start + third; i < start + 2 * third; i++) {
            arr[i] = ' ';
        }

        cantor(start, third);
        cantor(start + 2 * third, third);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int N = Integer.parseInt(line.trim());
            int len = 1;
            for (int i = 0; i < N; i++) len *= 3;

            arr = new char[len];
            Arrays.fill(arr, '-');

            cantor(0, len);
            System.out.println(arr);
        }
    }
}