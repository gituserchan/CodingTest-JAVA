import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int t = 0; t < N; t++) {
            String s = br.readLine();
            if (isGroupWord(s)) ans++;
        }

        System.out.println(ans);
    }

    private static boolean isGroupWord(String s) {
        boolean[] seen = new boolean[26];
        char prev = 0; 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != prev) {
                if (seen[c - 'a']) return false;
                if (prev != 0) seen[prev - 'a'] = true;
                prev = c;
            }
           
        }
        return true;
    }
}