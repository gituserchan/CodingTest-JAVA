import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        if((w-x <= x-0)&&(w-x <= y-0) && (w-x <= h-y)){
            System.out.println(w-x);
        }
        else if((w-x >= x-0)&&(x-0 <= y-0) && (x-0 <= h-y)){
            System.out.println(x-0);
        }
        else if((y-0 <= h-y)&&(y-0 <= x-0) && (y-0 <= w-x)){
            System.out.println(y-0);
        }
        else if((y-0 >= h-y)&&(h-y <= x-0) && (h-y <= w-x)){
            System.out.println(h-y);
        }
        
    }
}