import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashSet<String> heard = new HashSet<>();
        for(int i = 0; i < N; i++){
            heard.add(br.readLine());
        }
        
        int count = 0;
        for(int i = 0; i < M; i++){
            String name = br.readLine();
            if(heard.contains(name)){
                count++;
            }
        }
        
        System.out.println(count);
        
    }
}