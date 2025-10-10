import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] v = new int[3][2];  
        
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            v[i][0] = Integer.parseInt(st.nextToken()); 
            v[i][1] = Integer.parseInt(st.nextToken()); 
        }

        int x, y;
        
        x = v[0][0] ^ v[1][0] ^ v[2][0];
        y = v[0][1] ^ v[1][1] ^ v[2][1];
        
        System.out.println(x + " " + y);
    }
}