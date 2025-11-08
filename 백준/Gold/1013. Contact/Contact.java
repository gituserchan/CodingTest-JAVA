import java.io.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        Pattern p = Pattern.compile("^(100+1+|01)+$"); 

        for (int i = 0; i < T; i++) {
            String s = br.readLine().trim();
            sb.append(p.matcher(s).matches() ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }
}