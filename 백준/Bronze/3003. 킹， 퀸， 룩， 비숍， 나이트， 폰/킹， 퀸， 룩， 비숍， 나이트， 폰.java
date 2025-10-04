import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] correct = {1, 1, 2, 2, 2, 8};

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(correct[i] - num).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}