import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            int total = 0;
            int n = Integer.parseInt(br.readLine());
            if(n == -1) break;
            int count = 0;
            int arr[] = new int[n];
            
            for(int i = 1; i < n; i++){
                if(n % i == 0){
                    total += i;
                    arr[count++] = i;
                }
            }
            
            if(total == n){
                System.out.print(n + " = ");
                for(int i = 0; i < count; i++){
                    if(i != count - 1){
                        System.out.print(arr[i] + " + ");
                    } else {
                        System.out.println(arr[i]);
                    }
                }
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}