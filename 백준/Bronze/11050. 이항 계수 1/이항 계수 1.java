import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int answer = 0;
        int total =1;
        int total2 = 1;
        int total3 = 1;
        for(int i = 1; i<=N; i++){
            total *= i;
        }
        
        for(int i = 1; i<=K; i++){
            total2 *= i;
        }
        
        int minus = N-K;
        for(int i = 1; i<=minus; i++){
            total3 *= i;
        }
        
        total2 *= total3;
        
        total = total/total2;
        
        System.out.print(total);
        
    }
}