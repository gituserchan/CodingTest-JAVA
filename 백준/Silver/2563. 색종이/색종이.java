import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[][] paper = new boolean[100][100]; 
        int area = 0;

        for (int k = 0; k < n; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); 
            int y = Integer.parseInt(st.nextToken()); 

            for (int r = y; r < y + 10; r++) {
                for (int c = x; c < x + 10; c++) {
                    if (!paper[r][c]) { 
                        paper[r][c] = true;
                        area++;
                    }
                }
            }
        }

        System.out.println(area);
    }
}