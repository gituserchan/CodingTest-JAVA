import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static long FULL;     
    static long count = 0;

    static void dfs(long cols, long d1, long d2) {
        if (cols == FULL) { 
            count++;
            return;
        }

        long avail = FULL & ~(cols | d1 | d2); 

        while (avail != 0) {
            long p = avail & -avail;   
            avail -= p;               
            dfs(cols | p,
                (d1 | p) << 1 & FULL, 
                (d2 | p) >> 1);       
        }
    }

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());
        FULL = (1L << N) - 1; 
        dfs(0, 0, 0);
        System.out.println(count);
    }
}