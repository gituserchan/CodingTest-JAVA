import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken()); 
        int B = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        do {
            int r = (int)(N % B);   
            N /= B;                

            if (r < 10) sb.append((char)('0' + r));      
            else        sb.append((char)('A' + (r - 10)));
        } while (N > 0);

        System.out.println(sb.reverse().toString());
    }
}