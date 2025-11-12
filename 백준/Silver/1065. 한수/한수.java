import java.io.*;

public class Main {
    static boolean isHan(int x) {
        if (x < 100) return true;        
        if (x == 1000) return false;      
        int a = x / 100;                 
        int b = (x / 10) % 10;            
        int c = x % 10;                 
        return (a - b) == (b - c);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        if (N < 100) {
            System.out.println(N);
            return;
        }
        if (N == 1000) N = 999;

        int cnt = 99;
        for (int i = 100; i <= N; i++) {
            if (isHan(i)) cnt++;
        }
        System.out.println(cnt);
    }
}