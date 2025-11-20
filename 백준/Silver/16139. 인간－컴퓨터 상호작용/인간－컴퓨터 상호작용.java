import java.util.*;
import java.io.*;

public class Main{
    static String S;
    public static int solution(char c, int lt, int rt){
        int answer = 0;
        for(int i = lt; i<=rt; i++){
            if(S.charAt(i) == c){
                answer++;
            }
        }
        return answer;
    }
    
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        int q = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<q; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int lt = Integer.parseInt(st.nextToken());
            int rt = Integer.parseInt(st.nextToken());
            int a = solution(c, lt, rt);
            sb.append(a).append("\n");
        }
        
        System.out.println(sb);
        
    }
}