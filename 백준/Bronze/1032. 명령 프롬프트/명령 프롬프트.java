import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String base = br.readLine();
        char[] ans = base.toCharArray();

        for (int i = 1; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < ans.length; j++) {
                if (ans[j] != s.charAt(j)) ans[j] = '?';
            }
        }

        System.out.println(new String(ans));
    }
}