import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); 
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken()); 
            String S = st.nextToken();            

            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                for (int j = 0; j < R; j++) {
                    sb.append(c);
                }
            }
            sb.append('\n'); 
        }

        System.out.print(sb.toString());
    }
}