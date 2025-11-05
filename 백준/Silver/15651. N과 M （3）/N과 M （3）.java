import java.util.*;
import java.io.*;

public class Main{
    static int N;
    static int M;
    static int picked[];
    static StringBuilder sb = new StringBuilder();
    public static void a(int depth){
        if(depth == M){
            for(int i =0; i<M; i++){
                sb.append(picked[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
 
        for(int i = 1; i<=N; i++){
            picked[depth] = i; 
            a(depth + 1);
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        picked = new int[M];
        
        a(0);
        
        System.out.println(sb);
       
    }
}