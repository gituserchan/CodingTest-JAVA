import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int tmp = 0;
        
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
  
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N-1; j++){
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i<N; i++){
            System.out.println(arr[i]);
        }
        
    }
}