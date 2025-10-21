import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<N; i++){
            a.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        for(int j = 0; j<M; j++){
            b.add(Integer.parseInt(st.nextToken()));
        }
        
        int sum = 0;
        int total = 0;
        
        for(int a_count : a){
            if(b.contains(a_count)) total++;
        }
        
        sum+= M- total;
        total=0;
        for(int b_count : b){
            if(a.contains(b_count)) total++;
        }
        sum += N-total;
        
        System.out.println(sum);
        
    }
}