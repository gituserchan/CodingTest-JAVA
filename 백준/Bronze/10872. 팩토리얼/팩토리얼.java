import java.util.*;
import java.io.*;

public class Main{
    public static void main(String agrs[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int total = 1;
        for(int i = 1; i<=N; i++){
            total *= i;
        }
        
        System.out.println(total);
    }
}