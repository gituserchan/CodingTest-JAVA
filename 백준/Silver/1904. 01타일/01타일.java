import java.io.*;

public class Main {
    static final int MOD = 15746;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        if (n == 1) { System.out.println(1); return; }
        if (n == 2) { System.out.println(2); return; }

        int a = 1;   
        int b = 2;
        for (int i = 3; i <= n; i++) {
            int c = (a + b) % MOD; 
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}